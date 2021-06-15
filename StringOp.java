public class StringOp
{
	public static void main(String[] args) {
		String s1="Aman";;
		String s2="preet";
		System.out.println(s2.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.charAt(2));
		System.out.println(s1.concat(s2));
		System.out.println(s1.length());
		String s3=s1.replace("n","m");
		System.out.println(s3);
	}
}