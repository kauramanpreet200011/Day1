public class TwoDArray
{
	public static void main(String[] args) {
		double[][] arr= new double[3][3];
		for(int i=0;i<arr.length;i++){
		    for(int j=0;j<arr.length;j++)
		    {
		        arr[i][j]=10*Math.random();
		        System.out.print(arr[i][j]);
		    }
		    System.out.println(" ");
		}
	}
}