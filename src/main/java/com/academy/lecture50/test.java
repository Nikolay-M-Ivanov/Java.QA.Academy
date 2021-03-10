package com.academy.lecture50;


public class test {
    public static void main(String[] args) {
        String a = "my test";
        String b = "this is";
        String c;

        switch (a) {
            case "MY TEST":
                c = a + b;
                break;
            case "My Test":
                c = b + a;
                break;
            case "my_test":
                c = a + a;
                break;
            default:
                c = a + a;
        }
        System.out.println(c);
    }

}
