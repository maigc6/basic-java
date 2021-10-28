import java.util.Scanner;
public class number
{
    public static void main(String args[])
    {
        int a,n,s,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("输入数:");
        a = scan.nextInt();
        System.out.println("输入项数:");
        n = scan.nextInt();
        b = a;
        s = a;
        for(int i=1;i<n;i++)
        {
            if(n==1)
                break;
            b = b*10+a;
            s =b+s;
        }
        System.out.println(s);
    }
}

