public class primeno {
    public static void main(String[] args) {
        int no=100;
        int count=0;
        for( int i=2; i*i<= no; i++)
        {
            if(no%i==0)            //9%1==0 yes  count=1 
            {                      //9%2==0 no,  9%3==0 yess  count=2
                count++;           //upto 9 parynat check karnar 
            }
        }
        if(count==2)              //final count =3 
        {
            System.out.println("no. is prime");
        }
        else{
            System.out.println("no. is  not prime");      //not prime
        }
    }
    
}
