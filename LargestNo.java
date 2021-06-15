class LargestNo{
public static void main(String[] args){
int a=10,b=20,c=15,largest=0;
largest=(a>b && a>c ?a:b>c?b:c);
System.out.println("Largest among 3 no.s =" +largest);
}
}