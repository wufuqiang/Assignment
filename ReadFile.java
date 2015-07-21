import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

public class ReadFile {
	public static void main(String args[]){
	String s="";
	try{
	FileReader rf=new FileReader("E:\\x.txt");
	BufferedReader brf=new BufferedReader(rf);
	String rs="";	
while((rs=brf.readLine())!=null)
	s=s+rs+"\n";
 //   brf.close;
        rf.close();
	}
	catch(IOException e){
		System.out.println(e);
		}
	System.out.print(s);
	}
}

