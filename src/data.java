import java.util.Scanner;
public class data
{
    public static void main(String args[])
    {
        int year,month,data,s,flag;
        s = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("输入年份:");
        year = scan.nextInt();
        System.out.println("输入月份:");
        month = scan.nextInt();
        System.out.println("输入日期:");
        data = scan.nextInt();
        if((year%4==0 &year%400!=0) |year%400==0)
            flag = 0;
        else
            flag = 1;
        for(int i=2000;i<year;i++)
        {
            if((i%4==0 &i%400!=0) | i%400==0)
                s = s+366;
            else
                s = s+365;
        }
        for(int i=1;i<month;i++) {
            if (i == 1 | i == 3 | i == 5 | i == 7 | i == 8 | i == 10 | i == 12)
                s = s + 31;
            else if (i == 2 & flag == 0)
                s = s + 29;
            else if (i == 2 & flag == 1)
                s = s + 28;
            else
                s = s + 30;
        }
        s = s+data;
        System.out.println("输入的日期距离2000年1月1号有"+s+"天");
    }
}
