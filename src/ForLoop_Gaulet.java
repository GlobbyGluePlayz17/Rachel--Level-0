
public class ForLoop_Gaulet {
	public static void main(String[] args) {
		//0-100
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		System.out.println("\n\n\n");
		
		//100-0
		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}
		System.out.println("\n\n\n");

		//0-100/even
		for (int i = 0; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("\n\n\n");

		//0-100/odd
		for (int i = 0; i < 101; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		System.out.println("\n\n\n");

		//0-500/even_odd_label
		for (int i = 0; i < 501; i++) {
			System.out.print(i);
			
			if (i % 2 == 1) {
				System.out.println(" odd");
			}
			if (i % 2 == 0) {
				System.out.println(" even");
			}
		}
		System.out.println("\n\n\n");

		//0-777/multiples of 7 
		for (int i = 0; i < 778; i += 7) {
			System.out.println(i);
		}
		System.out.println("\n\n\n");

		//Years I was born w/ age
		int num = 2006;
		for (int i = num; i < 2018; i++) {
			System.out.println("In the year " + i + ", I was " + (i-num) + " years old.");
		}
		System.out.println("\n\n\n");

		//012012012
		//000111222
		for (int i = 0; i < 3; i++) {
			for (int i1 = 0; i1 < 3; i1++) {
				System.out.println("" + i + "" + i1);
			}
		}
		System.out.println("\n\n\n");

		//123/456/789
		for (int i = 1; i < 10; i++) {
			System.out.print(i);
			if (i%3 == 0) {
				System.out.print("\n");
			}
		}
		System.out.println("\n\n\n");

		//0-100/10x10
		for (int i = 1; i < 101; i++) {
			System.out.print(i);
			System.out.print(" ");
			if (i%10 == 0) {
				System.out.print("\n");
			}
		}
		System.out.println("\n\n\n");
		
		//*/**/***...
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
