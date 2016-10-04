package sample;

public class test {
	public String out (String ten,int tuoi, int maSV,String Diachi ){
		String s=ten+tuoi+maSV+Diachi;
		return s;
	}
	public Employee sinhVien(String ten,int tuoi, int maSV,String Diachi ){
		Employee e= new Employee(ten,tuoi,maSV,Diachi);
		String s=ten+tuoi+maSV+Diachi;
		return e;
	}
}