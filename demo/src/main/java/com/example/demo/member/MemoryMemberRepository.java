package com.example.demo.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepositoy{

    private static final Map<Long, Member> store = new HashMap<>();


    @Override
    public void save(Member member) {
        store.put(member.getId(), member);

    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
