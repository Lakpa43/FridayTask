package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type random letters. for eg: aaabbcddeeee");
        String string = input.next();

        for(int i = 0; i < string.length(); i++){
            int count = 1;
            while (i + 1 < string.length() && string.charAt(i) == string.charAt(i+1)) {
                i++;
                count++;
            }
                System.out.println(string.charAt(i) + "" + count + " ");
        }
    }
}
