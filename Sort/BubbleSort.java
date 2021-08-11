package Sort;

public class BubbleSort {
	// nguyen ly
	// chay tu dau den cuoi mangg
	// gap 2 phan tu dung canh nhau, sau be huong truoc => hoan doi vi tri
	//lap lien tuc la het
	public static int[] bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j]  = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"-");
		}
	}
	public static void main(String[] args) {
		int[] arr = {5,3,2,1,5,12,7,2};
		printArr(arr);
		System.out.println("-----------sort");
		bubbleSort(arr);
		printArr(arr);
	}
}
