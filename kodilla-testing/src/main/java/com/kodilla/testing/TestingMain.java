package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {

        //Test user
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("user test OK");
        } else {
            System.out.println("user test FAIL");
        }

        //Test calculator
        Calculator calculator = new Calculator();

        int Sum = calculator.addAToB(1, 2);
        int Diff = calculator.subtractBFromA(10, 1);

        if(Sum==3 && Diff==9){
            System.out.println("calculator test OK");
        } else {
            System.out.println("calculator test FAIL");
        }
    }
}