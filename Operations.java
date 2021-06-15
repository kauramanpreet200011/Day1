class Operations{
  int add(int x, int y)
{  return x+y;}
int subtract(int x,int y)
{ return x-y;}
int mul(int x, int y)
{ return x*y;}
int divide(int x, int y)
{ return x/y;}

public static void main(String[] args)
{
  Operations o = new Operations();
  System.out.println(o.add(5,9));
  System.out.println(o.subtract(10,6));
  System.out.println(o.mul(5,2));
  System.out.println(o.divide(8,4));
}
}