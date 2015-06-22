package com.bbh.config.datasource;

import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.bbh.common.constant.ConstantsConfig;
import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataSourceConfiguration implements ApplicationContextAware, ConstantsConfig {
    private ApplicationContext applicationContext;

    @Bean(name = {"dataSource"}, destroyMethod = "close", initMethod = "init")
    public DataSource dataSource() throws SQLException {

        Environment env = getEnv();

        DruidDataSource druidDataSource = new DruidDataSource(false);

        druidDataSource.setUsername(env.getProperty("druid.datasource.username"));

        druidDataSource.setUrl(env.getProperty("druid.datasource.url"));

        druidDataSource.setPassword(env.getProperty("druid.datasource.password"));

        druidDataSource.setFilters(env.getProperty("druid.datasource.filters"));

        druidDataSource.setMaxActive(((Integer) env.getProperty("druid.datasource.maxActive", Integer.class)).intValue());

        druidDataSource.setInitialSize(((Integer) env.getProperty("druid.datasource.initialSize", Integer.class)).intValue());

        druidDataSource.setMaxWait(((Integer) env.getProperty("druid.datasource.maxWait", Integer.class)).intValue());

        druidDataSource.setMinIdle(((Integer) env.getProperty("druid.datasource.minIdle", Integer.class)).intValue());

        druidDataSource.setTimeBetweenEvictionRunsMillis(((Integer) env.getProperty("druid.datasource.timeBetweenEvictionRunsMillis", Integer.class)).intValue());

        druidDataSource.setMinEvictableIdleTimeMillis(((Integer) env.getProperty("druid.datasource.minEvictableIdleTimeMillis", Integer.class)).intValue());

        druidDataSource.setValidationQuery(env.getProperty("druid.datasource.validationQuery"));

        druidDataSource.setTestWhileIdle(((Boolean) env.getProperty("druid.datasource.testWhileIdle", Boolean.class)).booleanValue());

        druidDataSource.setTestOnBorrow(((Boolean) env.getProperty("druid.datasource.testOnBorrow", Boolean.class)).booleanValue());

        druidDataSource.setTestOnReturn(((Boolean) env.getProperty("druid.datasource.testOnReturn", Boolean.class)).booleanValue());

        druidDataSource.setPoolPreparedStatements(((Boolean) env.getProperty("druid.datasource.poolPreparedStatements", Boolean.class)).booleanValue());

        druidDataSource.setMaxOpenPreparedStatements(((Integer) env.getRequiredProperty("druid.datasource.maxOpenPreparedStatements", Integer.class)).intValue());

        return druidDataSource;
    }

    @Bean(name = {"stat-filter"})
    public StatFilter statFilter() {

        Environment env = getEnv();

        StatFilter statFilter = new StatFilter();

        statFilter.setSlowSqlMillis(((Integer) env.getProperty("druid.datasource.slowSqlMillis", Integer.class)).intValue());

        statFilter.setLogSlowSql(((Boolean) env.getProperty("druid.datasource.isLogSlowSql", Boolean.class)).booleanValue());

        return statFilter;
    }

    @Bean(name = {"druidWebStatFilter"})
    public FilterRegistrationBean druidWebStatFilter() {

        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();

        filterRegistrationBean.setFilter(new WebStatFilter());

        Map initParameters = new HashMap(1);

        initParameters.put("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico");

        filterRegistrationBean.setInitParameters(initParameters);

        return filterRegistrationBean;
    }

    @Bean(name = {"charsetEncodingFilter"})
    @ConditionalOnMissingBean
    public FilterRegistrationBean charsetEncodingFilter() {

        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();

        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();

        characterEncodingFilter.setEncoding("UTF-8");

        filterRegistrationBean.setFilter(characterEncodingFilter);

        return filterRegistrationBean;
    }

    @Bean
    public ServletRegistrationBean druid() throws SQLException {

        return new ServletRegistrationBean(new StatViewServlet(), new String[]{"/druid/*"});
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        this.applicationContext = applicationContext;
    }

    private Environment getEnv() {

        return this.applicationContext.getEnvironment();
    }

}

