#import java.util.*;
public class sum
{
public static void main(String[] args)
{
int n;
Scanner e=new Scanner(System.in);
n=e.nextInt();
if(n==0)
System.out.println(0);
else
{
int m=n*(n+1)/2;
System.out.println(m);
}
}
}
