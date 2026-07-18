//count the no. of vowels in the string 
public class countingvowels {
    public static void main(String[] args) {
        String x="sharvari";
        int count=0;
        for (int i=0;i<=7;i++) {          //i<x.length()  for n number cal   
               char ch = x.charAt(i);
               if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')  
                // if(ch !='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')  print rather than vowels 
                  {
                    System.out.print(ch +" " );
                    count++;
                  }
             
                }

        System.out.print(" = " + count);
               }
    
    }


    
