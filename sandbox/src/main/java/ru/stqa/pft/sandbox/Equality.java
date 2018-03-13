package ru.stqa.pft.sandbox;

public class Equality {
	public static void  main(String[] args){
		String s1 = "firefox";
		String s2 = new String(s1);


		// физическое сравнение
		System.out.println(String.valueOf(s1 == s2));
		// логическое сравненеие
		System.out.println(String.valueOf(s1.equals(s2)));


		String a1 = "firefox";
		String b2 = a1;


		// физическое сравнение
		System.out.println(String.valueOf(a1 == b2));
		// логическое сравненеие - испольховать для обьектов
		System.out.println(String.valueOf(a1.equals(b2)));


	}
}
