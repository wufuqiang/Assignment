//import java.io.IOException;
import java.util.Scanner;
//import java.lang.*;

public class Authentication {

	public static void main(String[] args) {
		long sum=0;
//		String id = "";
		System.out.print("please input your IDnumber");
		Scanner scan = new Scanner(System.in);
		String id = scan.nextLine();
//		id = System.in.toString();
		int n = id.length();
		scan.close();
		if (n != 18) {
			System.out.print("number error,your input is not 18 digital");
		}
		for (int i = 0; i < n; i++) {
			if ((id.charAt(i) < '0') && (id.charAt(i) > '9')) {
				System.out.print("input error,you limited input from 0 to 9");
			}
		}
	    String[] id1 = id.split(" ");
	    int nid[] = new int[4*n];
		for (int i = 0; i < n; i++ ){
		nid[i] =  Integer.parseInt(id1[i]);
	    nid[i] =  Integer.parseInt(id1[i]);
		}
		   sum=nid[0]*7+nid[1]*9+nid[2]*(10)+nid[3]*(5)+nid[4]*(8)+nid[5]*(4)+
				   nid[6]*(2)+nid[7]*(1)+nid[8]*(6)+nid[9]*(3)+nid[10]*(7)+
				   nid[11]*(9)+nid[12]*(10)+nid[13]*(5)+nid[14]*(8)+nid[15]*(4)+
				   nid[16]*(2);
		   int sub=(int)sum%11;
		   switch(sub){
		   case 0:
			   if(nid[17]==1){
				   System.out.print("sucessful");
			   }
			   break;
		   case 1:
			   if(nid[17]==0){
				   System.out.print("sucessful");
			   }
			   break;
		   case 2:
			   if(nid[17]=='x'){
				   System.out.print("sucessful");
			   }
			   break;
		   case 3:
			   if(nid[17]==9){
				   System.out.print("sucessful");
			   }
			   break;
		   case 4:
			   if(nid[17]==8){
				   System.out.print("sucessful");
			   }
			   break;
		   case 5:
			   if(nid[17]==7){
				   System.out.print("sucessful");
			   }
			   break;
		   case 6:
			   if(nid[17]==6){
				   System.out.print("sucessful");
			   }
			   break;
		   case 7:
			   if(nid[17]==5){
				   System.out.print("sucessful");
			   }
			   break;
		   case 8:
			   if(nid[17]==4){
				   System.out.print("sucessful");
			   }
			   break;
		   case 9:
			   if(nid[17]==3){
				   System.out.print("sucessful");
			   }
			   break;
		   case 10:
			   if(nid[17]==2){
				   System.out.print("sucessful");
			   }
			   break;
		   }
		}
	}
//}