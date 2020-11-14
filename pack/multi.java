package pack;
import java.util.Scanner;
public class multi {
    public static void main(String[] args) {
        int n, prod=1 , num; 
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        n = obj.nextInt();
        System.out.println("Enter "+n+" numbers : ");
        for(int i = 0; i<n; i++)
        {
            num= obj.nextInt();
            prod=prod*num;
        }
        System.out.println("Product = "+prod);
    }
}
