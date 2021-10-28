import java.util.Scanner;
public class prime
{
    public static void main(String args[])
    {
        int one,j;
        boolean flag;
        flag=true;
        Scanner scan = new Scanner(System.in);
        System.out.println("输入一个数:");
        one = scan.nextInt();
        for ( int i=2; i <one;i++)
        {
            if(one%i==0)
            {
                flag = false;
                System.out.println("false");
                break;
            }
        }
        if (flag)
            System.out.println("true");
    }
}
