package com.example.demo.member;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepositoy;

    public MemberServiceImpl(MemberRepository memberRepositoy) {
        this.memberRepositoy = memberRepositoy;
    }
    //생성자 주입 , AppConfig가 대신 해준다.

    @Override
    public void join(Member member) {
        memberRepositoy.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepositoy.findById(memberId);
    }
}
