package arrays;

import java.util.Scanner;

public class Ejercicio1 {

	final static int MAX =5;
	
	public static int suma(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
		}
		return sum;
	}
	
	public static int mayor(int[] array) {
		int may = array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i]>may)
				may=array[i];
		}
		return may;
	}
	
	public static int menor(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i]<min)
				min=array[i];
		}
		return min;
	}
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
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("Media: "+suma(arr)/arr.length);
		System.out.println("Mayor: "+mayor(arr));
		System.out.println("Minor: "+menor(arr));
	}

}
