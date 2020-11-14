import java.util.Scanner;
public class CheckPalindrome {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        str= sc.nextLine();
        palindrome obj =new palindrome();
        if(obj.isPalindrome(str))
            System.out.println(str+" is palindrome");
        else
            System.out.println(str+" is not palindrome"); 
    }
}
class palindrome 
{
    static boolean isPalindrome(String st)
    {
        int i =0,l;
        l=st.length()-1;
        while(i<l)
        {
            if(st.charAt(i)!=st.charAt(l))
                return false;
            i++;
            l--;
        }
        return true;
    }
}