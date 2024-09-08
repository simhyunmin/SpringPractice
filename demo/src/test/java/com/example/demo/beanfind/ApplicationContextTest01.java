package com.example.demo.beanfind;

import com.example.demo.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextTest01 {
   AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

   @Test
   @DisplayName("내부에서 사용하는 빈만 출력")
   public void findApplication(){
       String[] beanDefinitionNames = ac.getBeanDefinitionNames();
       for (String beanDefinitionName : beanDefinitionNames) {
           BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);

           if(beanDefinition.getRole() == BeanDefinition.ROLE_INFRASTRUCTURE){
               Object bean = ac.getBean(beanDefinitionName);
               System.out.println("name = " + beanDefinitionName + " object = "+ bean);
           }



       }
   }


}
