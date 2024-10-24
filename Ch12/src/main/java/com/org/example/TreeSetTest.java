package com.org.example;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("A");

        for (String str : treeSet) {
            System.out.println(str);
        }
    }
}
