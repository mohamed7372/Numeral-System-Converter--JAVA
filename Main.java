package numeralSystemConverter;

import java.util.Scanner;

public class Main {
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int nbr = sc.nextInt();
		int system = sc.nextInt();
		
		convertToSys(nbr, system);
	}
	
	static String convertDecToBin(int val) {
		return Integer.toBinaryString(val);
	}
	static String convertDecToOctal(int val) {
		return Integer.toOctalString(val);
	}
	static String convertDecToHex(int val) {
		return Integer.toHexString(val);
	}

	static void convertToSys(int val, int system) {
		String cal;
		switch (system) {
		case 2:
			cal = convertDecToBin(val);
			System.out.printf("0b%s", cal);
			break;
		case 8: 
			cal = convertDecToOctal(val);
			System.out.printf("0%s", cal);
			break;
		case 16: 
			cal = convertDecToHex(val);
			System.out.printf("0x%s", cal);
			break;
		default:
			System.out.println("error");
		}
	}
}
