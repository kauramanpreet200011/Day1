import java.util.Scanner;
public class Factorial
{
    int factorial(int n){
        int f=1;
        for(int i=n;i>=1;i--){
            f=f*i;
        }return f;
    }
	public static void main(String[] args) {
		Factorial fac = new Factorial();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result=fac.factorial(n);
		System.out.println("Factorial  = " +result);
	}
}