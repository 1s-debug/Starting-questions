import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("enter first no:");
        int x= sc.nextInt();
        System.out.print("enter second no:");
        int y= sc.nextInt();
        System.out.print("enter third no:");
        int z= sc.nextInt();
      
        if(x>y&&x>z){
            System.out.print("x is greater number");
        }
        else if(y>x&&y>z)
        {
             System.out.print(" y is greater number");
        }
        else
        {
             System.out.print("z is greater number");
        }

        }
    }
    
