package com.example.demo.order;

import com.example.demo.AppConfig;
import com.example.demo.member.Grade;
import com.example.demo.member.Member;
import com.example.demo.member.MemberService;
import com.example.demo.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class OrderApp {
    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
//        OrderService orderService = appConfig.orderService();

        ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = app.getBean("memberService", MemberService.class);
        OrderService orderService = app.getBean("orderService", OrderService.class);
        //getBean("찾고자 하는 함수 이름", BeanType.class)


        Long memberId = 1L;
       Member member = new Member(memberId, "memberA", Grade.VIP);

       memberService.join(member);

       Order order = orderService.createOrder(memberId, "itemA", 20000);
       System.out.println("order = " + order);


    }
}
