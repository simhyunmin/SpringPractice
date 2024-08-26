package com.example.demo.order;

import com.example.demo.discount.DiscountPolicy;
import com.example.demo.discount.FixDiscountPolicy;
import com.example.demo.discount.RateDiscountPolicy;
import com.example.demo.member.Member;
import com.example.demo.member.MemberRepositoy;
import com.example.demo.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepositoy memberRepository;
    private DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepositoy memberRepositoy, DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
        this.memberRepository = memberRepositoy;
    }
    //생성자 주입 , AppConfig가 맡아서 한다.

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
