package setdifference;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Set {

	public static void main(String args[]) {
		LinkedHashSet<String> name = new LinkedHashSet<String>();

		Scanner in = new Scanner(System.in);
		System.out.println("enter the size");
		int size = in.nextInt();
		for (int index = 0; index < size; index++) {

			System.out.println("enter the name");
			name.add(in.next());

		}

		System.out.println(" name list");

		System.out.println(name);
		System.out.println("Enter the remove string want to remove");
		System.out.println(name.remove(in.next()));
	}
}
