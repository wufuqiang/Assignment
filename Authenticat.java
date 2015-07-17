import java.util.Scanner;

public class Authentication {

	public static void main(String[] args) {
		int sum = 0;
		char[] wi = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
		System.out.print("please input your IDnumber");
		Scanner scan = new Scanner(System.in);
		String id = scan.nextLine();
		int n = id.length();
		scan.close();
		if (n != 18) {
			System.out.print("number error,your input is not 18 digital");
		}
		for (int i = 0; i < n; i++) {
			if (id.charAt(17) == 'x' || id.charAt(17) == 'X') {
				for (int j = 0; j < 17; j++) {
					char ch = id.charAt(i);
					int nid = ch - '0';
					sum = sum + nid * wi[i];
					int sub = (int) sum % 11;
					if (sub != 2) {
						System.out.print("default");
					} else
						System.out.print("sucessful");
				}
			}
			if ((id.charAt(i) < '0') && (id.charAt(i) > '9')) {
				System.out.print("input error,you limited input from 0 to 9");
			}
		}

		for (int i = 0; i < 17; i++) {
			char ch = id.charAt(i);
			int nid = ch - '0';
			sum = sum + nid * wi[i];
			int sub = (int) sum % 11;
			switch (sub) {
			case 0:
				if (id.charAt(17) == '1') {
					System.out.print("sucessful");
				}
				
				break;
			case 1:
				if (id.charAt(17) == '0') {
					System.out.print("sucessful");
				}
				break;
			case 2:
				if (id.charAt(17) == 'x') {
					System.out.print("sucessful");
				}
				break;
			case 3:
				if (id.charAt(17) == '9') {
					System.out.print("sucessful");
				}
				break;
			case 4:
				if (id.charAt(17) == '8') {
					System.out.print("sucessful");
				}
				break;
			case 5:
				if (id.charAt(17) == '7') {
					System.out.print("sucessful");
				}
				break;
			case 6:
				if (id.charAt(17) == '6') {
					System.out.print("sucessful");
				}
				break;
			case 7:
				if (id.charAt(17) == '5') {
					System.out.print("sucessful");
				}
				break;
			case 8:
				if (id.charAt(17) == '4') {
					System.out.print("sucessful");
				}
				break;
			case 9:
				if (id.charAt(17) == '3') {
					System.out.print("sucessful");
				}
				break;
			case 10:
				if (id.charAt(17) == '2') {
					System.out.print("sucessful");
				}
				break;
			}
		}
	}
}