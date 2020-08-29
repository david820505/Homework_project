package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many number of ticket do you need?");
        int tik_num = scanner.nextInt();
        System.out.println("How many they are round ticket?");
        int rod_num = scanner.nextInt();
        Ticket t = new Ticket(tik_num,rod_num);
        String result = String.valueOf(t.totalnum());
        String tik = Integer.toString(tik_num);
        String rod = Integer.toString(rod_num);
        System.out.println("Total tickets:" + tik);
        System.out.println("Round-trip:" + rod);
        System.out.println("Total amount of ticket is" + result);
    }
}
