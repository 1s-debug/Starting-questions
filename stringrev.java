public class stringrev {
    public static void main(String[] args) {
        String x ="madam";                //o/p yein pn pudhe ky kam bolle find 0th index value tr value kuthe store nhich ahe so find karta yenar nhi 
        String rev="";                   // bcoz kuthe tri value store hoila havi pudhe ky kam karycha asel tr
        for(int i=x.length()-1;i>=0;i--){
            rev=rev+x.charAt(i);              //rev = "" + "A";  ans rev="A" 
            
        }
        System.out.println(rev);             //o/p 
         if(x.equals(rev)){                  //check string both r equal or not
            System.out.println(true);
         }
         else{
            System.out.println(false);  
        }
        
         System.out.println(rev.charAt(0));       // 0th place ans
         System.out.println(rev.length());        //length of string 
        }
        
}

