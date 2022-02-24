package com.aditya;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String notes = sc.next();
        sc.close();
        int removalsCount = new GoodPlayConverter(notes).calculateRemovalsCount();
        System.out.println(removalsCount);
    }
}
