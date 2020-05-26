package nguyentrinhan70.example.com;

public abstract class NhanVien {

		private String tenNV;
		private String cmnd;
		public abstract int xuatLuong();
		
		public NhanVien() {
			super();
		}


		public NhanVien(String tenNV, String cmnd) {
			super();
			this.tenNV = tenNV;
			this.cmnd = cmnd;
		}


		public String getTenNV() {
			return tenNV;
		}
		public void setTenNV(String tenNV) {
			this.tenNV = tenNV;
		}
		public String getCmnd() {
			return cmnd;
		}
		public void setCmnd(String cmnd) {
			this.cmnd = cmnd;
		}
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return "CMND: "+this.cmnd+"tên: "+this.tenNV +" ======>" + xuatLuong();
		}
}
