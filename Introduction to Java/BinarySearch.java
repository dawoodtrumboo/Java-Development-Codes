import java.util.Scanner;

public class BinarySearch {
	
	//Input Function
		public static int[] inputArray() {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int arr[] = new int [n];

			for(int i = 0; i<n; i++) {
				System.out.println("Enter " + i + "ith index");
				arr[i] = s.nextInt();
			}
			return arr;
		}

		// Binary Search Function
		
		public static int binarySearch(int arr[],int x) {
			int s = 0, e = arr.length - 1;
			int mid=0;
			
			while(s<=e) {
				mid = (s+e)/2;
				if(arr[mid]<x) {
					s = mid + 1;
				}
				else if(arr[mid]>x) {
					e = mid -1;
				}
				else {
					return mid;
				}
				
                }
			return -1;
				
			}
			
		

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int arr[] = inputArray();
		x = binarySearch(arr,x);
		System.out.println(x);

	}

}
