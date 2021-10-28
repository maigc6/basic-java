import java.util.Scanner;
public class sum {
    public static void main(String args[]){
        int one,two;
        Scanner scan =new Scanner(System.in);
        System.out.println("输入一个数:");
        one = scan.nextInt();
        System.out.println("输入另一个数:");
        two = scan.nextInt();
        System.out.println("两数之和:"+(one+two));

    }
}
