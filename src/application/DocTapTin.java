package application;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DocTapTin {
	
	// khai báo tenTapTin nơi lưu trữ tên tập tin mà bạn muốn đọc 
private String tenTapTin;
// khởi tạo  phương thức DocTapTin
public DocTapTin(String tenTapTin) {
	
	this.tenTapTin = tenTapTin;
}


// Định nghĩa phương thức docDSConNguoi
public ArrayList<ConNguoi> docDsConNguoi() {
	//khởi tạo biến danhSachConNguoi để lưu các đối tượng con người
	ArrayList<ConNguoi>danhSachConNguoi=null;
	try {
		// mở tệp tin với tên được lưu trong file tập tin 
		FileInputStream f=new FileInputStream(tenTapTin);
		// tạo một luồng đầu vào để đọc các đối tượng từ FileInputStream
		ObjectInputStream o=new ObjectInputStream(f);
		// đọc đối tượng từ tệp tin và ép kiểu về ArrayList<ConNguoi>
		danhSachConNguoi=(ArrayList<ConNguoi>)o.readObject();
		// đóng các luồng để giải phóng tài nguyên
		o.close();
		f.close();
		
	}catch(Exception e)	{
		// nếu có lỗi trả về giá trị rỗng
		return null;
		
	}
	// trả về danhSachConNguoi
	return danhSachConNguoi;
}
}

