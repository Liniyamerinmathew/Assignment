import java.util.Scanner;

public class Perfectsquare
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int firstnumb,lastnumb,i;
        System.out.println("Enter first number:" );
        firstnumb=sc.nextInt();
        System.out.println("Enter last number:");
        lastnumb=sc.nextInt();
        System.out.println("Perfect square numbers between "+firstnumb+" and "+ lastnumb+" are:");
        for(i=firstnumb;i<=lastnumb;i++)
        {
            double perfectsqr=Math.sqrt(i);
            if(perfectsqr-Math.floor(perfectsqr)==0)
                System.out.println(i+" ");
        }

    }
}
