import java.util.Scanner;
class prime{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Please insert any number");
int n = sc.nextInt();
if(n%2==0)
{
System.out.println(n + "is prime number");
}
else
{
System.out.println(n+" is not a prime number");
}
}
}
