package assign.java;

import java.util.Scanner;

public class assign10 {
		public static int sumOfElements(int[] arr) {
			int sum=0;
			
			
			for(int i=0;i<arr.length;i++) {
				sum += arr[i];
			}
			return sum;
		}
		public static void main(String[] args) {
			int[] arr = {1,2,3,4,5,6,7};
			int sum = assign10.sumOfElements(arr);
			System.out.println(sum);
		}

	}


