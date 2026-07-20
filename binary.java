public class binary{
    public static void main(String[] args)
    {
        int a[]={1,3,4,5,6,78,90};
        int key=78;
        int low=0; 
        int high=a.length-1;

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(a[mid]==key)
            {
                System.out.println("element found: " +a[mid]);
                return;
            }
            else if(key > a[mid])
            {
                low=low+1;
            }
            else
            {
                high=high+1;
            }
        }
        System.out.println("element not found");
             
    }
}