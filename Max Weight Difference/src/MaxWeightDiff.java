
// program to calculate maximum weight difference

public class MaxWeightDiff {
	
	
	public static int maxWeightDiff(int arr[], int k) {
		
		int min=0; 
		int max=0;
		
		// for loops to sort the elements 
		for(int i=0; i < arr.length; i++) {
			int temp;
			
			for(int j=i+1; j < arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}	
			}
			
			if(k > 0) {
				min = min + arr[i]; // addition of minimum weights
				k--;
			}
			else {
				max = max + arr[i]; // addition of maximum weights
			}
		}
		
		return (max - min);
	}
	
	public static void main(String[] args) {
		
		//input
//		int arr[] = {8, 4, 5, 2, 10};
//		int k = 2;
//		
		int arr[] = {1,1,1,1,1,1,1,1};
		int k = 3;
		
//		int arr[] = {2, 8, 6, 10, 11, 7, 15, 5};
//		int k = 4;
		
		System.out.println("max possible difference between weights = " +maxWeightDiff(arr, k));
		
	}

}
