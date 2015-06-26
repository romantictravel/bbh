/* * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.*/

package com.bbh.shop.provider;
import com.bbh.common.utils.spring.SpringContextUtils;
import com.bbh.shop.api.entity.Admin;
import com.bbh.shop.provider.repository.AdminMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.mapper.common.Mapper;

@Configuration
@EnableAutoConfiguration(exclude = {JacksonAutoConfiguration.class})
@ComponentScan(basePackages = "com.bbh")
@ImportResource({"classpath:dubbo.xml"})
@EnableTransactionManagement(proxyTargetClass=true)
public class Application {
	public static void main(String[] args) throws Exception {
		ApplicationContext application=SpringApplication.run(Application.class, args);
		//打印bing
		AdminMapper mapper=application.getBean(AdminMapper.class);
		System.out.println(mapper.toString()+"################");
		String[] names=application.getBeanDefinitionNames();
		for(String s:names){
			System.out.println(s);
		}


	}
}
