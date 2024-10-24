package com.org.example;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {

    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap(TreeMap<Integer, Member> treeMap) {
        this.treeMap = treeMap;
    }

    public void addMember(Member member) {
        treeMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {
        if(treeMap.containsKey(memberId)) {
            treeMap.remove(memberId);
            return true;
        }
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> ir = treeMap.keySet().iterator();
        while(ir.hasNext()) {
            int key = ir.next();
            Member member = treeMap.get(key);
            System.out.println(member);
        }
    }
}
