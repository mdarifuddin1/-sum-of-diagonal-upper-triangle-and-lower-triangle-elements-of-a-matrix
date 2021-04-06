
package code;

import java.util.Scanner;


public class Matrix1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int [][] A = new int [3][3];
        int row,col,sum=0,upper=0,lower=0;
        
        // Input A Matrix
        for(row=0; row<3; row++)
        {
            for(col=0; col<3; col++)
            {
                A[row][col]= input.nextInt();
            }
        }
        
        
        // iagonal,upper,lower
        for(row=0; row<3; row++)
        {
            for(col=0; col<3; col++)
            {
               
                if(row==col){
                    
                    sum = sum +A[row][col];
                }
                
                if(row<col)
                {
                    upper = upper + A[row][col];
                }
                if(row>col)
                {
                    lower = lower + A[row][col];
            }
        }
        
        
    }
        
        System.out.println("The sum of diagonal element :"+sum);
        System.out.println("The sum of upper element :"+upper);
        System.out.println("The sum of lower element :"+lower);
}
}