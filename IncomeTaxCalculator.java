import java.util.*;

public class IncomeTaxCalculator{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        float income = sc.nextFloat();

        if(income < 500000){
            System.out.println("Your tax is 0 ruppees"); 
        }
        else if(500000 <= income && income < 1000000){
            System.out.println("Your tax is " + 0.2*income + " ruppees");
        }
        else{
            System.out.println("Your tax is " + 0.3*income + " ruppees");
        }
    
    
    
    
    
    
    }}