import java.util.Scanner;

//import java.util.Scanner;

public class JAVATEST {
	public static void main(String[] args) {
		int i = 0;
		System.out.print("请输入号码");
		Scanner scan = new Scanner(System.in);
		String id = scan.nextLine();
		int n = id.length();
		scan.close();
		if (n == 18) {
			if (id.charAt(17) == 'x' || id.charAt(17) == 'X') {
				if (xIdentify(id)) {
					System.out.print("验证成功");
				}else
				System.ott.print("验证失败")；
			} else if (nIdentify(id)) {
				System.out.print("验证成功");
			}else
			System.out.print("验证失败")；
		} else
			System.out.print("验证失败");
	}

	public static boolean xIdentify(String id) {
		int i = 0;
		int sum = 0;
		char[] wi = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
		for (int j = 0; j < 17; j++) {
			char ch = id.charAt(i);
			int nid = ch - '0';
			sum = sum + nid * wi[i];
		}
		int sub = sum % 11;
		if (sub == 2) {
			return true;
		} else
			return false;
	}

	public static Boolean nIdentify(String id) {
		int i = 0;
		int sum = 0;
		char[] wi = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
		if ((id.charAt(i) < '0') && (id.charAt(i) > '9')) {
			System.out.print("错误");
		}
		for (i = 0; i < 17; i++) {
			char ch = id.charAt(i);
			int nid = ch - '0';
			sum = sum + nid * wi[i];
		}
		int sub = sum % 11;
		switch (sub) {
		case 0:
			if (id.charAt(17) == '1') {
				return true;
			}

			break;
		case 1:
			if (id.charAt(17) == '0') {
				return true;
			}
			break;
		case 2:
			if (id.charAt(17) == 'x') {
				return true;
			}
			break;
		case 3:
			if (id.charAt(17) == '9') {
				return true;
			}
			break;
		case 4:
			if (id.charAt(17) == '8') {
				return true;
			}
			break;
		case 5:
			if (id.charAt(17) == '7') {
				return true;
			}
			break;
		case 6:
			if (id.charAt(17) == '6') {
				return true;
			}
			break;
		case 7:
			if (id.charAt(17) == '5') {
				return true;
			}
			break;
		case 8:
			if (id.charAt(17) == '4') {
				return true;
			}
			break;
		case 9:
			if (id.charAt(17) == '3') {
				return true;
			}
			break;
		case 10:
			if (id.charAt(17) == '2') {
				return true;
			}
			break;
		}
		return false;

	}

}
