public class secondlargest {
    public static void main(String[] args) {
        int a[]={323,45,3542,14,1};
        int largest=a[0];
        int secondlargest=a[0];
        for(int i=1;i<a.length;i++)       //i=1 bcoz already a[0] declared upper in largest and secondlargest
        {
            if(a[i]>largest)             //greater than check here
            {
            secondlargest=largest;         //old largest value adhi ya madhe jail
             largest=a[i];                  //then largest update honar
           }
            else if(a[i]>secondlargest && a[i]!=largest){
                secondlargest=a[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondlargest);
    }
}    

