package com.qf.spring_boot_user;

import com.qf.filter.MyFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.servlet.Filter;

@SpringBootApplication(scanBasePackages = "com.qf")
@MapperScan("com.qf.dao")
public class SpringBootUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootUserApplication.class, args);
    }

    @Bean
    public FilterRegistrationBean<Filter> myFilter(){

        FilterRegistrationBean<Filter> frb=new FilterRegistrationBean<>() ;
        frb.setName("MyFilter");
        frb.setFilter(new MyFilter());
        frb.addUrlPatterns("/*");
        return frb;
    }
}
