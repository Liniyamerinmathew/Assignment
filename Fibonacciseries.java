public class Fibonacciseries
{
    public static int fibnocciRecursion(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1||n==2)
        {
            return 1;
        }
        return fibnocciRecursion(n-2) + fibnocciRecursion(n-1);
    }
    public static void main (String args[])
    {
        int maxnumb=10;
        System.out.println("fibnocci series of"+maxnumb+"numbers:");
        for(int i=0;i<maxnumb;i++)
        {
            System.out.println(fibnocciRecursion(i)+" ");
        }
    }
}
