package com.org.example;

import java.util.Comparator;

public class Member2 implements Comparator<Member2> {
    private int memberId;
    private String memberName;

    public Member2(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    @Override
    public int compare(Member2 o1, Member2 o2) {
        return o1.memberId - o2.memberId;
    }
}
