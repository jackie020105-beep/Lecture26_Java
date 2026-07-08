package kr.ac.kopo.day04;

public class DogMain {

    public static void main(String[] args) {

        Dog d = new Dog("똘똘이", 2);
        Dog d2 = new Dog("똘이", 5);

        d.show();
        d2.show();

//        d2.age = 7;
        d2.setAge(7);
        d2.show();

//        System.out.printf("이름 : %s 나이 : %d다\n", d.name, d.age);
//        System.out.println("이름 : " + d.name + " 나이 : " + d.age + "살");

    }

}