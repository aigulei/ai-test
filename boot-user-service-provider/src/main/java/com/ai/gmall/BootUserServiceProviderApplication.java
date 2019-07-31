package com.ai.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ImportResource;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

/**
 * SpringBoot与dubbo整合的三种方式：
 * 1）导入dubbo-starter,在application.properties配置属性，使用@Service暴露服务，使用@Reference引用服务
 * 2）保留dubbo xml配置文件；导入dubbo-starter，使用@ImportResource导入dubbo xml配置文件
 * 3）使用注解API的方式
 * 		将每一个组件手工创建到容器中,让dubbo来扫描其他组件
 *
 */
@EnableDubbo//开启基于注解的dubbo
//@ImportResource(locations="classpath:provider.xml")
//@EnableDubbo(scanBasePackages="com.ai.gmall")
@SpringBootApplication
@EnableHystrix
public class BootUserServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootUserServiceProviderApplication.class, args);
	}

}
