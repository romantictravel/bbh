package com.bbh.config.mybatis;

import com.bbh.common.constant.ConstantsConfig;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import tk.mybatis.mapper.mapperhelper.MapperInterceptor;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

@Configuration
public class MybatisConfiguration
        implements ApplicationContextAware, ConstantsConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(MybatisConfiguration.class);
    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        this.applicationContext = applicationContext;
    }

    private DataSource getDataSource() {
        return (DataSource) this.applicationContext.getBean(DataSource.class);
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory( PageHelper  pageHelper,MapperInterceptor mapperInterceptor) throws SQLException, IOException {
        LOGGER.info("init sqlSessionFactory");
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(getDataSource());
        sqlSessionFactoryBean.setTypeAliasesPackage(this.applicationContext.getEnvironment().getProperty("mybatis.config.typeAliasesPackage"));
        //mapper文件位置
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resources=resolver.getResources("classpath:"+this.applicationContext.getEnvironment().getProperty("mybatis.config.mapperLocations"));
        sqlSessionFactoryBean.setMapperLocations(resources);

        sqlSessionFactoryBean.setPlugins(new Interceptor[]{pageHelper,mapperInterceptor});
        return sqlSessionFactoryBean;
    }
    @Bean
    public  PageHelper  pageHelper(){
        PageHelper page=new PageHelper();
        Properties properties=new Properties();
        properties.put("dialect", "mysql");
        properties.put("reasonable",true);
        page.setProperties(properties);
        return page;
    }
    @Bean
    public  MapperInterceptor mapperInterceptor(){
        MapperInterceptor mapperInterceptor=new MapperInterceptor();
        Properties properties=new Properties();
        properties.put("mappers", "tk.mybatis.mapper.common.Mapper");
        properties.put("IDENTITY","MYSQL");
        properties.put("notEmpty",true);
        mapperInterceptor.setProperties(properties);
        return  mapperInterceptor;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        LOGGER.info("init mapperScannerConfigurer");
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setAnnotationClass(MyBatisRepository.class);
        mapperScannerConfigurer.setBasePackage(this.applicationContext.getEnvironment().getProperty("mybatis.config.basePackage"));
        return mapperScannerConfigurer;
    }

}
