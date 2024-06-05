package Core;

public class secondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {56,34,23,67,89,32,89};
		int max1 = 0;
		int max2 = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i]>max2 && arr[i]!=max1) {
				max2=arr[i];
			}
		}
		
System.out.println(max2);
	}

}
