package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> hello = new ArrayList<String>();
		//2. Add five Strings to your list
		hello.add("this land is your land");
		hello.add("this land is my land");
		hello.add("from california to new york island");
		hello.add("madagascar is a good movie");
		hello.add("africanized bees");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < hello.size(); i++) {
			System.out.println(hello.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for (String z: hello) {
			System.out.println(z);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < hello.size(); i++) {
			if (i%2 == 0) {
			System.out.println(hello.get(i));
			}
		}
		//6. Print all the Strings in reverse order.
		for (int i = hello.size()-1; i >= 0; i--) {
			System.out.println(hello.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (String z: hello) {
			if (z.contains("e")) {
			System.out.println(z);
			}
		}
	}
}
