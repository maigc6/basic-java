import java.util.Scanner;
import java.lang.Math;
public class triangle {
    public static void main(String args[]) {
        double one, two,three,s,p,c;
        Scanner scan = new Scanner(System.in);
        System.out.println("输入一边:");
        one = scan.nextInt();
        System.out.println("输入另一个边:");
        two = scan.nextInt();
        System.out.println("输入对边:");
        three = scan.nextInt();
        c =one+two+three;
        System.out.println("周长:"+c);
        p =c/2;
        s = Math.sqrt(p*(p-one)*(p-two)*(p-three));
        System.out.println("面积:"+s);
        if (three*three==one*one+two*two)
            System.out.println("是直角三角形");
        else
            System.out.println("不是直角三角形");
    }
}
