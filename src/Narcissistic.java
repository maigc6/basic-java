import java.lang.Math;
public class Narcissistic
{
    public static void main(String args[])
    {
        int s;
        for(int i=100;i<999;i++)
        {
            s =(i/100)*(i/100)*(i/100)+(i/10%10)*(i/10%10)*(i/10%10)+(i%10)*(i%10)*(i%10);
            if(i==s)
                System.out.println(i);
        }

    }
}
