package arrays;

import java.util.Scanner;

public class Ejercicio2 {

	final static int MAX =6;
	
	
	public static void main(String[] args) {
		
		//Declarar el lector
		Scanner sc = new Scanner(System.in);
		
		//Declarar el array
		int[] arr = new int[MAX];
		
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.print("valor["+i+"]: ");
				arr[i]=sc.nextInt();
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			sc.close();
		}
		
		
		for (int i = 0; i < arr.length/2; i++) {
			System.out.print(arr[i]+" - ");
			System.out.print(arr[MAX-i-1]+" - ");
		}
		
	}

}
