package com.company.wiproPracticeQuestion;

import java.util.ArrayList;
import java.util.List;

//Implement a method that takes a List as an argument and removes every second element from the list, then prints the resulting list.

public class RemoveElementUsingList {

    public static void main(String[] args) {
            List<String> srr = new ArrayList<>();
            srr.add("A");
            srr.add("B");
            srr.add("C");
            srr.add("D");
            srr.add("E");
            srr.add("F");

            System.out.println("Original list:");
            System.out.println(srr);
            for (int i = 1; i < srr.size(); i += 2) {
                srr.remove(i);
            }
            System.out.println("Resulting list after removing every second element:");
            System.out.println(srr);

        }


}
