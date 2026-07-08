package kr.ac.kopo.day04;

public class Car {

	Car(){
		System.out.println("Car() 생성자 호출...");
	}
	Car(String name){
		System.out.println("Car(String) 생성자 호출...");
	}
	Car(int price){
		System.out.println("Car(int) 생성자 호출...");
	}
	Car(double d){
		System.out.println("Car(double) 생성자 호출...");
	}
	Car(String name, int price){
		System.out.println("Car(String, int) 생성자 호출...");
	}
}
