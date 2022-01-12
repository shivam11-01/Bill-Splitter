package com.company;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total Amount");
        int amount = sc.nextInt();
        System.out.println("Enter the Total no of Peoples");
        int people = sc.nextInt();

        double splittedAmount = amount / people;
        System.out.println(splittedAmount);
    }
}

