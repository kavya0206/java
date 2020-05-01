package org.all;

import org.tamil.Tamil;

public class LanguageClass extends Tamil {
	private void allLanguage() {
		System.out.println("In India we speak multiple languages");
	}

	public static void main(String[] args) {
		LanguageClass lang = new LanguageClass();
		lang.allLanguage();
		lang.tamilLanguage();
		lang.englishLanguage();
		lang.teluguLanguage();
	}
}
