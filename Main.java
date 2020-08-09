package numeralSystemConverter;

import java.util.Scanner;

public class Main {
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int nbr = sc.nextInt();
		String nbrBin = convertDecToOctal(nbr);
		System.out.printf("%c", nbrBin.charAt(nbrBin.length() - 1));
	}
	
	static String convertDecToBin(int val) {
		return Integer.toBinaryString(val);
	}
	static String convertDecToOctal(int val) {
		return Integer.toOctalString(val);
	}
}
