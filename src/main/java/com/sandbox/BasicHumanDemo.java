package com.sandbox;

public class BasicHumanDemo {
    public static void main(String...args){
        Human alex = new Human("Alex", 40, 1.9f);
        alex.setName("Alex");
        alex.setAge(40);
        alex.setHeight(1.91f);
        int timeToLive = alex.getTimeToLive();

        System.out.println("name: " + alex.getName());
        System.out.println("age: " + alex.getAge());
        System.out.println("height: " + alex.getHeight());
        System.out.println("Time to live: " + timeToLive);
    }
}
