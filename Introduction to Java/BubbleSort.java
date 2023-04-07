import java.util.*;
public class BubbleSort {

	
	// Input Function
	
	public static int[] inputArray() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i<arr.length;i++) {
			System.out.println("Enter " + i + " th Element");
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	
	//Print Array Function
	
	public static void printArray(int arr[]) {
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	//Bubble Sort Function
	
	
	public static void bubbleSort(int arr[]) {
		int temp =0;
		for(int i=arr.length-1;i>=0;i--) {
		for(int j=0; j<i;j++) {
			if(arr[j]>arr[j+1]) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		}
	}
	
	
	
	
	//Main Function
	public static void main(String[] args) {
		int arr[] = inputArray();
		bubbleSort(arr);
		printArray(arr);

	}

}
