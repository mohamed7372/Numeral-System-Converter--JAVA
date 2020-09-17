package numeralSystemConverter;

import java.util.Scanner;

public class Main {
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int source = sc.nextInt();
		String nbr = sc.next();
		int traget = sc.nextInt();
		
		int number = source == 1 ? nbr.length() : Integer.parseInt(nbr, source);
		if (traget == 10) {
			if (source != 1)
				System.out.println(number);
			else {
				int res = 0;
				for (int i = 0; i < number; i++)
					res++;
				System.out.println(res);
			}
		}
		else if (source == 10) {
			if (traget == 1) 
				for (int i = 0; i < Integer.valueOf(nbr); i++) 
					System.out.print(1);
			else
				System.out.println(Integer.toString(Integer.valueOf(nbr), traget));
		}
		else 
			System.out.println(Integer.toString(Integer.valueOf(number), traget));
		
	}
}