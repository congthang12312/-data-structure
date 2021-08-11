package Sort;

import java.util.Iterator;
// 2 vong for
// vong for 1 duyet tu i -> n
//vong for 2 duyen tu i+1 ->n
// neu a[] gia tri for 1 > gia tri vong for 2 => hoan vi tri
public class SelectionSort {
	
	public static int[] selectionSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < n; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"-");
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,1,2,4,6,3,2};
		selectionSort(arr);
		printArr(arr);
	}
}
