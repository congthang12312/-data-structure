package Array;

public class ThirdMaximunNumber {
	// tim phan tu lon nhat trong mang
	// cach giai, sap xep mang tang dan
	// tao ra 1 mang 3 phhan tu
	// tim max 
	public static void printArr(long[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
	public static int thirdMax(int[] a) {
		long[] maxArr = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};
		
		for (int i = 0; i < a.length; i++) {
			insert(maxArr,a[i]);
		}
		if (maxArr[2] == Long.MIN_VALUE) {
			return (int)maxArr[0];
		}
		
		return (int)maxArr[2];
	}
	private static void insert(long[] maxArr, int val) {
		int i = 0;
		// duyet den khi nao het mang vao dua vao bien i
		while(i<maxArr.length) {
			if (val	== maxArr[i] ) {
				return;
			}
			// val > max arr
			else if(val > maxArr[i]) {
				break;
			}
			// val < maxArr
			else {
				i++;
			}
		}
		if(i < maxArr.length){
			for (int j = maxArr.length-2; j >= i; j--) {
				maxArr[j+1] = maxArr[j];
			}
			maxArr[i] = val;
			printArr(maxArr);
		}
	}
	public static void main(String[] args) {
		int[] arr = {2,2,0,1};
		System.out.println(thirdMax(arr));
		
	}
}
