import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         System.out.print("enter the number : ");
        int n= sc.nextInt();
        int a=0;
        int b=1; 
        System.out.print(a +" " );
        System.out.print(b+ " " );

        for(int i=3;i<n;i++){                   

            int  c= a+b;     
           /* if(c > 13); 
           break; print only upto num. not greater than      eg :01123513 not greater than that    */   
               System.out.print(c + " ");    // 
             a=b;
             b=c;
        }
    }
}
