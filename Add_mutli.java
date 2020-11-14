import java.util.Scanner;
class Add_multi
{
    public static void main(String[] args) {
        int n;
        int[] ar= new int[100];
        function obj1 = new function();
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
class function
{
    void add(int ar[],int n)
    {
        int sum=0;
        for(int i =0 ; i<n; i++)
        {
            sum= sum+ar[i];
        }
        System.out.println("Sum ="+sum);
    }
    void multi(int ar[],int n)
    {
        int prod=1;
        for(int i =0 ; i<n; i++)
        {
            prod=prod*ar[i];
        }
        System.out.println("Product = "+prod);
    }
}