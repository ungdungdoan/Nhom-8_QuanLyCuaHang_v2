package sample;

public class Employee {
	public String ten;
	
	public int tuoi;
	public int maSV;
	public String Diachi;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getDiachi() {
		return Diachi;
	}
	public void setDiachi(String diachi) {
		Diachi = diachi;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String ten, int tuoi, int maSV, String diachi) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.maSV = maSV;
		Diachi = diachi;
	}
	

@Override
	public String toString() {
		return "Employee [ten=" + ten + ", tuoi=" + tuoi + ", maSV=" + maSV + ", Diachi=" + Diachi + "]";
	}
public String out (String ten,int tuoi, int maSV,String Diachi ){
	String s=ten+tuoi+maSV+Diachi;
	return s;
}
public Employee getSinhVienById(String ten,int tuoi, int maSV,String Diachi ){
	Employee e= new Employee(ten,tuoi,maSV,Diachi);
	return e;
}

}




