import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Link {
	public static void main(String[] args) {
		URLConnection uc = null;
		FileWriter fw;
		String str1 = "https://en.wikipedia.org/wiki/Regular_expression";
		URL url = null;
		try {
			url = new URL(str1);
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			uc = url.openConnection();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					uc.getInputStream()));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		File file = new File("x.txt");
		boolean is_succ = false;
		try {
			is_succ = file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (is_succ) {
			Scanner scan = new Scanner("x.txt");
			String str = scan.nextLine();
			while (true) {
				String regex = "(https://[a-zA-Z]*[@#$%?][A-Za-z]*)";
				Pattern patten = Pattern.compile(regex);
				String matches = "";
				Matcher m = patten.matcher(str);
				while (true) {

					matches += m.group(1);
					System.out.print("" + matches);
				}
			}
		}
	}
}