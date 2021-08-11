package Sort;

public class InsertionSort {
	public static int[] insertSort(int[] arr) {
		for (int i = 1; i < arr.length ; i++) {
			int key = arr[i];
			int j = i-1;
			while (j >= 0 && arr[j] > key) {
				// dich phan tu
				arr[j+1] = arr[j];
				j=j-1;
			}
			// phan tu dau tien
			arr[j + 1] = key;
		}
		return arr; 
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "-");
		}
	}

	public static void main(String[] args) {
		int[] arr = {2,1,1,2,4,6,3,2};
		System.out.println("hêlo");
		insertSort(arr);
		printArr(arr);
		System.out.println("hêlo");
	}
}
