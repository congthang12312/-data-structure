package Array;

public class MaximumWealt {
	// tim hang co tong lon nhat
	public int maximumWealth(int[][] accounts) {
		int soKhangHang = accounts.length;
		int soNganHang = accounts[0].length;
		int[] tongTaiSan = new int[soKhangHang];
		for (int i = 0; i < soKhangHang; i++) {
			int tinhTongTaiSanKhachHang = 0;
			for (int j = 0; j < soNganHang; j++) {
				tinhTongTaiSanKhachHang += accounts[i][j];
			}
			tongTaiSan[i] = tinhTongTaiSanKhachHang;
		}
		int max = 0;
		for (int i = 0; i < tongTaiSan.length; i++) {
			if (max < tongTaiSan[i]) {
				max = tongTaiSan[i];
			}
		}
		return max;

	}
	//c2
	public int maximumWealth2(int[][] accounts) {
		int soKhangHang = accounts.length;
		int soNganHang = accounts[0].length;
		int max = 0;
		for (int i = 0; i < soKhangHang; i++) {
			int tinhTongTaiSanKhachHang = 0;
			for (int j = 0; j < soNganHang; j++) {
				tinhTongTaiSanKhachHang += accounts[i][j];
			}
			if(max < tinhTongTaiSanKhachHang) {
				max = tinhTongTaiSanKhachHang;
			}
		}
		return max;

	}
}
