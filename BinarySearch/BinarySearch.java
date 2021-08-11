package BinarySearch;
// thuat toan binarySearch can sap xep truoc khi thuc hien
// b1 con phan tu dau va cuoi / 2. lay phan tu do so sanh vs key
// chon nhanh trai hay phai dua vao viec so sanh voi key
//tiep theo chon phan tu giua = cach phan tu dau + phan tu cuoi /2
// lay pt giua so sanh voi key
// khi nao key = pt giua => vi tri can tim 
public class BinarySearch {
	
	public static int binanySearch(int[] arr, int key) {
		int n = arr.length;
		int iLeft = 0;
		int iRight = n - 1;
		
		while(iLeft <= iRight) {
			int iMid = (iLeft + iRight) / 2;
			if (arr[iMid] == key) {
				return iMid;
			}else{
				if(arr[iMid] < key) {
					iLeft = iMid + 1;
					
				}else {
					iRight = iMid - 1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,15,20,50,62,100};
		System.out.println(binanySearch(arr, 100));
	}
}
