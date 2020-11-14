package pack;
import java.util.Scanner;
class addition{
    public static void main(String[] args) {
        int n, sum=0 , num; 
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        n = obj.nextInt();
        System.out.println("Enter "+n+" numbers : ");
        for(int i = 0; i<n; i++)
        {
            num= obj.nextInt();
            sum=sum+num;
        }
        System.out.println("Sum = "+sum);
    }
}
