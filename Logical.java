class Logical{
public static void main(String[] args)
{
  boolean a=true;
  boolean b=false;
  System.out.println("!a = " +!a);
  if(a|b) { System.out.println("a|b = true") ; }
  else
{ System.out.println("a|b = false");} 
  if((!a & b) | (a & !b)) { System.out.println("(!a & b) | (a & !b) = true"); }
else
{System.out.println("(!a & b) | (a & !b) = false");}
}
}