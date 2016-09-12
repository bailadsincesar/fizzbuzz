package com.task;

public class Main {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int fizz = Integer.parseInt(args[0]);
        int buzz = Integer.parseInt(args[1]);
        int quantity = Integer.parseInt(args[2]);
        System.out.println(fizzBuzz.seriesOf(fizz, buzz, quantity));
    }
}
