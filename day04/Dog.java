package kr.ac.kopo.day04;

public class Dog {

    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println("이름 : " + this.name + "나이 : " + this.age + "살");
    }

    void setAge(int age) {
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

}