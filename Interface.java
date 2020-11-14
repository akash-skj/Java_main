import java.util.Scanner;
interface inter_add_multi{
    public void add(int ar[], int n);
    public void multi(int ar[],int n);
}
class func implements inter_add_multi{
    public void add(int ar[], int n)
    {
        int sum=0;
        for(int i =0 ; i<n; i++)
        {
            sum= sum+ar[i];
        }
        System.out.println("Sum ="+sum);
    }
    public void multi(int ar[],int n)
    {
        int prod=1;
        for(int i =0 ; i<n; i++)
        {
            prod=prod*ar[i];
        }
        System.out.println("Product = "+prod);
    }
}
public class Interface 
{
    public static void main(String[] args) {
        int n;
        int[] ar= new int[100];
        func obj1 = new func();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        n = obj.nextInt();
        System.out.println("Enter "+n+" numbers : ");
        for(int i = 0; i<n; i++)
        {
            ar[i]= obj.nextInt();
        }
        obj1.add(ar, n);
        obj1.multi(ar, n);
    }
}
