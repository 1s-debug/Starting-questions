public class prime1to100 {
    public static void main(String[] args) {
      
        for(int i=1;i<=100;i++){        //one by one no ghenar
               int count=0;
            for(int j=1;j<=i;j++)    //compare each no. 
            {
                if(i%j==0)
                {
                    count++;
                }
            }
           if(count==2){
            System.out.print(i +" ");   
        }
         
         }   
    }
}

//print 1 no= one loop
//print 1 to n = two loop
