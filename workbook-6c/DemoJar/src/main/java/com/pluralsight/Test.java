package com.pluralsight;

public class Test {
  private String name;
  private int age;

    public Test(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public Test setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Test setAge(int age) {
        this.age = age;
        return this;
    }
}

