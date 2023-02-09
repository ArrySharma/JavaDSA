import java.util.*;

public class ConditionalStatements{
    public static void main(String args[]){
        // odd even check

  
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);

        int input = sc.nextInt();
        if(input % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        
       int a = 1;
        int b = 5;

        if(a >= b){
            System.out.println("A is greater than equal to b");
        }
        else{
            System.out.println("B is greatert than A");
        }
    }}
 