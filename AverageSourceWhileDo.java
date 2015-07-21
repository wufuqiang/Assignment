package AvergeSource;

import java.util.*;
import java.util.Scanner;

public class AverageSourceWhileDo {

public static void main(String[] args) {
   int sum = 0;
   int score = 0;
   int count= 0;
   Scanner sc = new Scanner(System.in);
   System.out.println("please input score and end with #");
   while (score!= '#'){
       System.out.print("please input score£º");
       score = sc.nextInt();
       sum += score;
       count ++;
      } 
   
      System.out.println( + --count + "students' total score:" + sum + "£¬and average score :23" + (double)sum / count);
   }

}
