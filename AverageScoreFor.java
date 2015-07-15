package AvergeSource;

import java.util.Scanner;

public class AverageScoreFor {

public static void main(String[] args) {
   int sum = 0;
   int score = 0;
   int count=0;
   Scanner sc = new Scanner(System.in);
   System.out.println("please input score and end with #");
   for(;score!= '#';count++){
	   System.out.print("please input score£º");
       score = sc.nextInt();
       sum += score;
      } 
   
      System.out.println( + --count + "students' total score:" + sum + "£¬and average score :23" + (double)sum / count);
   }

}


