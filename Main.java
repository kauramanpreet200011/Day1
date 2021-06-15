public class Main{
void add(int ...x){
int s=0;
for(int i=0;i<x.length;i++){
s+=x[i];}
System.out.println("Sum = " +s);
}
public static void main(String[] args){
Main m = new Main();
m.add(4,5,6);
m.add(4,5,6,7,8);
}
}