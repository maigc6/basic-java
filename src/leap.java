import java.util.Scanner;
public class leap {
    public static void main(String args[]){
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("输入年份:");
        year = scan.nextInt();
        if((year%4==0 &year%400!=0) |year%400==0)
            System.out.println(year+"是闰年");
        else
            System.out.println(year+"是平年");
    }
}
