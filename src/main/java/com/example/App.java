package com.example;
public class App {
    public static void main(String[] args) {
        // 在这里创建 Greeter 对象（组合关系）
        Greeter greeter = new Greeter("Hello");
        String who = (args.length > 0) ? args[0] : "world";
        System.out.println(greeter.greet(who));
    }
}
