import java.util.Scanner;
public class VowelCount
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		int l= s.length();
		int count=0;
		for(int i=0;i<l;i++)
		{
		    if(s.charAt(i)=='a'||s.charAt(i)=='A'||s.charAt(i)=='e'||s.charAt(i)=='E'||s.charAt(i)=='i'||s.charAt(i)=='I'||s.charAt(i)=='o'||s.charAt(i)=='O'||s.charAt(i)=='u'||s.charAt(i)=='U')
		    count++;
		}
		System.out.println("Total no. of vowels = " +count);
	}
}