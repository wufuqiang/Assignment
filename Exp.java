import java.util.Scanner;

public class Exp{
public static void main(String[] args){
	System.out.print("please input phone number or postcode or mailbox");
	Scanner scaner=new Scanner(System.in);
	String str=scaner.nextLine();
	if(checkPhone(str)){
		System.out.print("This is phone number");
	}else
		if(checkPostCode(str)){
			System.out.print("this is post code");
		}else
			if(checkMail(str)){
				System.out.print("this is email address ");
			}else
				if(checkName(str)){
					System.out.print("this is name");
				}else
					System.out.println("error");
}

private static boolean checkName(String str) {
	if(str.matches("[a-zA-Z]+\\s*[a-zA-Z]*\\s+[a-zA-Z]+\\s*")){
	       return true;
	}else return false;
}

private static boolean checkMail(String str) {
	if(str.matches("^[A-Za-zd]+([-_.][A-Za-zd]+)*@([A-Za-zd]+[-.])+[A-Za-zd]{2,5}$")){
               return true;
	}else return false;
}

private static boolean checkPostCode(String str) {
	if(str.matches("[0-9]{6}")){
	     return true;
	}else return false;

}

private static boolean checkPhone(String str) {
	if(str.matches("[1][0-9]{10}")){
                return true;
          }else return false;
}
}
