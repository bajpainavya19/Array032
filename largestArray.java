package Core;

public class largestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {56,78,32,45,70};
		int max=0;
		
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]>max) {
				max = arr[i];
			}
			
		}
		
		System.out.println("Maximum value is " + max);

	}

}
