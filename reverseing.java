public class reverseing {
    public static void main(String[] args) {
        int x =342;
        int rev=0;
        int rem;
        while(x>0){

            rem=x%10;                //347%10 =7 ithe apan last digit store krto            
            rev=rev*10+rem;          //0*10+2=7
            x=x/10;                  //342/10=34 when we divide by 10 last no. will get cut  
        }                            //same continue hotha ani end no. reverse bhetto
         System.out.print(rev);
    }
    
}
