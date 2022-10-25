import java.util.Scanner;

public class FahrenheittoCelsius
{
    public static void main(String arg[])
    {
        double a,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter temperature in fahrenheit");
        a=sc.nextDouble();
        System.out.println("The temperature in celcius is"+celcius(a));

    }
    static double celcius(double f)
    {
        return(f-32)*5/9;
    }
}
