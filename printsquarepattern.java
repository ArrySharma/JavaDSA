import java.util.*;

public class printsquarepattern {
    public static void main(String args[]){

        for(int row = 0; row <= 3; row++){
            for(int col = 0; col <= 3 - row; col++){
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }}