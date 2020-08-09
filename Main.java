package numeralSystemConverter;


public class Main {
	
	public static void main(String[] args) {
		int nbr = 2;
		String nbrBin = convertDecToBin(nbr);
		System.out.printf("%d is equal to 0b%s", nbr, nbrBin);
	}
	
	static String convertDecToBin(int val) {
		return Integer.toBinaryString(val);
	}
}
