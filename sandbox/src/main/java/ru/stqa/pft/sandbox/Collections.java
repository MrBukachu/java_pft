package ru.stqa.pft.sandbox;

import com.sun.tools.internal.xjc.Language;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
	public static void main(String[] args) {
		String[] langs = {"Java", "C#", "Python", "PHP"};

		// interface List<>          / class ArrayList
		List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP");

		for (int i = 0; i < languages.size(); i++) {
			System.out.printf("Я хочу выучить " + languages.get(i));
		}

		for (String l : languages) {
			System.out.println("Я хочу выучить " + l);
		}

		for (String l : langs) {
			System.out.println("Я хочу выучить " + l);
		}

	}

}
