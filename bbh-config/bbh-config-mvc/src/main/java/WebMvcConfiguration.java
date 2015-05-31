import com.bbh.common.constant.ConstantsConfig;
import com.bbh.common.utils.ConvertUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Locale;

/**
 * Created by tancheng on 2015/5/30.
 */
@Configuration
@EnableWebMvc
@AutoConfigureBefore(FreeMarkerAutoConfiguration.class)
public class WebMvcConfiguration implements ConstantsConfig {
    @Autowired
    private Environment environment;

    @Bean
    public LocalValidatorFactoryBean validator() {
        LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
        return localValidatorFactoryBean;
    }

    /**
     * mvc 识别国际化
     * @return
     */
    @Bean
    public FixedLocaleResolver localeResolver(){
        FixedLocaleResolver localeResolver=new FixedLocaleResolver();
        localeResolver.setDefaultLocale(new Locale(environment.getProperty(SYSTEM_LOCALE)));
        return  localeResolver;
    }


    /**
     * 国际化文件位置
     *
     * @return
     */
    @Bean
    public ReloadableResourceBundleMessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setCacheSeconds(ConvertUtils.integerConvert(environment.getProperty(MVC_MESSAGE_CACHE_SECONDS)));
        messageSource.setUseCodeAsDefaultMessage(true);
        String baseNames = environment.getProperty(MVC_MESSAGE_PATH);
        if (StringUtils.isNotBlank(baseNames)) {
            messageSource.setBasenames(StringUtils.split(baseNames, ","));
        }
        return messageSource;
    }

    /**
     * 如果启用了freemarker配置,则该resolve不起作用
     *
     * @return
     */
    @Bean
    @ConditionalOnProperty(name = "spring.freemarker.enabled", matchIfMissing = false)
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix(environment.getProperty(MVC_VIEW_PREFIX));
        viewResolver.setSuffix(environment.getProperty(MVC_VIEW_SUFFIX));
        return viewResolver;
    }

    /**
     * spring 文件上传
     *
     * @return
     */
    @Bean
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setDefaultEncoding("utf-8");
        return multipartResolver;
    }

    /**
     * 异常处理
     *
     * @return
     */
    @Bean
    public SimpleMappingExceptionResolver exceptionResolver() {
        SimpleMappingExceptionResolver exceptionResolver = new SimpleMappingExceptionResolver();
        exceptionResolver.setDefaultErrorView(environment.getProperty(MVC_VIEW_ERROR));
        return exceptionResolver;
    }


}
