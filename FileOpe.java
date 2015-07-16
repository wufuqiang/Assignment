import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOpe {
	public static void main(String args[]) throws IOException {
		File file = new File("f.txt");
		boolean suc = file.createNewFile();
		if (suc) {
			System.out.print("sucessful creat file");
		}
		System.out.print("Failed to creat file");
		System.out.println("1:write,2:read,3:updaet,4:delete");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		switch (input) {
		case 1: {
			char c[] = new char[1024];
			byte b[] = new byte[1024];
			int n, i;
			try {
				FileWriter wf = new FileWriter("f.txt");
				n = System.in.read(b);
				for (i = 0; i < n; i++)
				c[i] = (char) b[i];
				wf.write(c);
				wf.close();
			} catch (IOException e) {
				System.out.print(e);
			}
			break;
		}
		case 2: {
			String s = "";
			try {
				FileReader rf = new FileReader("f.txt");
				BufferedReader brf = new BufferedReader(rf);
				String rs = "";
				while ((rs = brf.readLine()) != null)
				s = s + rs + "\n";
				// brf.close;
				rf.close();
			} catch (IOException e) {
				System.out.println(e);
			}
			System.out.print(s);
			break;
		}
		case 3: {
			System.out.print("please input the index");
			Scanner in = new Scanner(System.in);
			int index = in.nextInt();
			char c[] = new char[1024];
			byte b[] = new byte[1024];
			int n, i;
			try {
				FileWriter wf = new FileWriter("f.txt");
				n = System.in.read(b);
				for (i = index; i < n; i++)
				c[i] = (char) b[i];
				wf.write(c);
				wf.close();
			} catch (IOException e) {
				System.out.print(e);
			}
			break;
		}
		case 4: {
			System.out.print("please input the index");
			Scanner in = new Scanner(System.in);
			int index = in.nextInt();
			System.out.print("please input the length");
			Scanner l = new Scanner(System.in);
			int length = l.nextInt();
			char c[] = new char[1024];
			try {
				FileWriter wf = new FileWriter("f.txt");
				for (int i = index; i < length; i++)
				c[i] = ' ';
				wf.write(c);
				wf.close();
			} catch (IOException e) {
				System.out.print(e);
			}
			break;
		}
		}
	}

}
