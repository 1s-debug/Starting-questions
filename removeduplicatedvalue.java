public class removeduplicatedvalue {
public static void main(String[] args) {
    String s="bananats";
    int count=0;
    for(int i=0;i<s.length();i++)
    {
        boolean alreadyprinted=false;
        for(int j=0;j<i;j++)
        {
            if(s.charAt(i) == s.charAt(j)){
                alreadyprinted=true;
                break; 
            }
        }
        if(alreadyprinted){
            continue;
        }
     int count1=0;
    for(int k=0;k<s.length();k++){
        if(s.charAt(i)==s.charAt(k)){
             count1++;  
        } 
    }
        System.out.print(s.charAt(i));     
    }
}
}

