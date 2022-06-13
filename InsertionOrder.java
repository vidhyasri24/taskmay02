 package setdifference;

import java.util.Set;
import java.util.*;

 class InsertionOrder {
	void hashSet() {
		Set<String> name = new HashSet<String>();
		
		System.out.println("HASHSET");
		System.out.println("Enter the size");
		
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		
		for (int index = 0; index < size; index++) {
			System.out.println("enter the name");
			name.add(scan.next());
		}

		System.out.println(" Name list : " + name);
		System.out.println();

	}

	void linkedhashSet() {
		LinkedHashSet<String> name = new LinkedHashSet<String>();
		
		System.out.println("LINKEDHASHSET");
		System.out.println("enter the size");
		
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		for (int index = 0; index < size; index++) {
			System.out.println("enter the name");
			name.add(scan.next());

		}

		System.out.println(" Name list : " + name);
		System.out.println();

	}

	void treeSet() {
		TreeSet<String> name = new TreeSet<>();
		
		System.out.println("TREESET");
		System.out.println("enter the size");
		
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		
		for (int index = 0; index < size; index++) {
			System.out.println("enter the name");
			name.add(scan.next());

		}

		System.out.println(" Name list : " + name);
		System.out.println();
		;
	}

}
