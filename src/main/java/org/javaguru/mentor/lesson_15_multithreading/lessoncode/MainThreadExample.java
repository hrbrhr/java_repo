package org.javaguru.mentor.lesson_15_multithreading.lessoncode;

public class MainThreadExample {

	public static void main(String[] args) {

		int i = 1;

		String myName = new String("Viktor");

		a(myName);

		System.out.println(myName);

	}

	public static void a(String str) {
		int abc = 8;
		System.out.println(str);
	}

}
