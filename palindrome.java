/*121 no ulte kele tri ans same ala hav called palindrome eg:121 121 , 2321 not palindrome*/
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number:");
        int x = sc.nextInt();
        int n=x;
        int rev=0;
        int rem;
        while(x>0){

            rem=x%10;                //347%10 =7 ithe apan last digit store krto            
            rev=rev*10+rem;          //0*10+2=7
            x=x/10;                  //342/10=34 when we divide by 10 last no. will get cut  
        }                           //same continue hotha ani end no. reverse bhetto
        if(n== rev)                 /*want to compare with original value so we initilize (n) to
                                      compare with old with new rev value */
            {
               System.out.println("number is palindrome: "+rev);
            }
        else{
         System.out.println("number is not palindrome: "+rev);
        }
}
}
   
