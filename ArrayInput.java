package Core;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int numbers[] = new int[size];
		
		for(int i = 0;i<size;i++) {
			numbers[i] = sc.nextInt();
		}
		
		for(int i =0;i<size;i++) {
			System.out.print(" " + numbers[i]);
		}

	}

}
