package Core;

public class pallindromeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,30,20,30,10};
		
		int i,j;
		for(i=0, j=arr.length-1;i<=j;i++,j--) {
				if(arr[i]!=arr[j]) {
					System.out.println("Array is not a pallindrome");
					break;
				}
			}
			if(i>j) {
				System.out.println("Array is pallindrome");
			}
	}
}
	
