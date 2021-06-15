class OneDArray{
public static void main(String[] args){
int[] arr= new int[10];
for(int i=0;i<arr.length;i++)
{ arr[i]=5*i; }
for(int element : arr)
{ System.out.println(element); }
}
}