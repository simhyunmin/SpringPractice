package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
        //스프링 빈 등록하는 것 중에 뺄 것이 있으면 빼주는 부분
        //AppConfig에서 @Configuration을 썼기 때문에 제외해주는 것이다. 중복 등록이 될 수 있기 때문에
)
public class AutoAppConfig {

}
