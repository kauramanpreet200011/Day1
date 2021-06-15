class ClassOperations{
  void add(int x, int y)
{  System.out.println(x+y);}
  void subtract(int x,int y)
{ System.out.println(x-y);}
  void mul(int x, int y)
{ System.out.println(x*y);}
  void divide(int x, int y)
{ System.out.println(x/y);}
}
class ClassMain{
public static void main(String[] args){
  ClassMain m= new ClassMain();
  ClassOperations op = new ClassOperations();
  op.add(5,2);
 ClassOperations op1 = new ClassOperations();
  op1.subtract(5,2);
 ClassOperations op2 = new ClassOperations();
  op2.mul(5,2);
 ClassOperations op3 = new ClassOperations();
  op3.divide(5,2);
}
}