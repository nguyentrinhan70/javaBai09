package nguyentrinhan70.example.com;

public class TestNhanVien {

	public static void main(String[] args) {

		NhanVien teo = new NhanVienChinhThuc();
		teo.setTenNV("Lý Gia Teo");
		System.out.println(teo);
		
		NhanVienChinhThuc ty = new NhanVienChinhThuc();
		ty.setTenNV("Hồ Thị Tý");
		System.out.println(ty);
		
		teo = new NhanVienThoiVu();
		teo.setTenNV("Lý Gia Teo");
		System.out.println(teo);
	}
}
