package application;

import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class XuLyGiaoDien {
	
	XuLy xuLy=new XuLy("danhSachNhanSuCongTy.dat");
	Scanner scanner=new Scanner(System.in);
	
	
	private MenuItem item1_1;
	private MenuItem item1_2;
	private MenuItem item1_3;
	private MenuItem item1_4;
	private MenuItem item1_5;
	
	private MenuItem item2_1;
	private MenuItem item2_2;
	private MenuItem item2_3;
	
	private MenuItem item3_1;
	private MenuItem item3_2;
	
	private MenuItem item4_1;
	private MenuItem item4_2;
	
	private MenuItem item5_1;

	

	
	
	
	
	//ObservableList<ConNguoi>danhSachNhanSu=FXCollections.observableArrayList();
	
	public XuLyGiaoDien(MenuItem item1_1, MenuItem item1_2,MenuItem item1_3,MenuItem item1_4,MenuItem item1_5,MenuItem item2_1,MenuItem item2_2,MenuItem item2_3,MenuItem item3_1,MenuItem item3_2,MenuItem item4_1,MenuItem item4_2,MenuItem item5_1 ) {
		
		this.item1_1=item1_1;
		this.item1_2=item1_2;
		this.item1_3=item1_3;
		this.item1_4=item1_4; 
		this.item1_5=item1_5;
		
		this.item2_1=item2_1;
		this.item2_2=item2_2;
		this.item2_3=item2_3;
		
		this.item3_1=item3_1;
		this.item3_2=item3_2;
		
		this.item4_1=item4_1;
		this.item4_2=item4_2;
		
		this.item5_1=item5_1;
		
		
		
	}
	
	
	
	
	

	public void xuLyItem1_1() {		
		item1_1.setOnAction(e->{
			hienThiThemNhanSuKySu();
			
			
		});
		
	}
	public void xuLyItem1_2() {
		item1_2.setOnAction(e->{
			hienThiThemNhanSuNhanVien();
		});
	}
	public void xuLyItem1_3() {
		item1_3.setOnAction(e->{
			hienThiThemNhanSuCongNhan();
			
		});
	}
		public void xuLyItem1_4() {
			item1_4.setOnAction(e->{
				hienThiThemNhanSuChuyenGiaNuocNgoai();
			});
		}	
		public void xuLyItem1_5() {
			item1_5.setOnAction(e->{
			hienThiThemThucTapSinh();
			});
		}

		
public void xuLyItem2_1() {
		item2_1.setOnAction(e->{
			hienThiLietKeNhanSu();
		});
}
public void xuLyItem2_2() {
		item2_2.setOnAction(e->{
			hienThiLietKeNhanSuTheoGioiTinh();
		});
}
public void xuLyItem2_3() {
		
		
		item2_3.setOnAction(e->{
			hienThiLietKeNhanSuTheoNamSinh();
		});
}
public void xuLyItem3_1() {
		item3_1.setOnAction(e->{
			hienThiTimKiemNhanSuTheoTen();
		});
}
public void xuLyItem3_2() {
		item3_2.setOnAction(e->{
			hienThiTimKiemNhanSuTheoSoDienThoai();
		});
}
public void xuLyItem4_1() {
		item4_1.setOnAction(e->{
			xoaThongTinNhanSuTheoTen();
		});
}
public void xuLyItem4_2() {
		item4_2.setOnAction(e->{
			hienThiXoaNhanSuTheoSoDienThoai();
		});
}
public void xuLyItem5_1() {
		item5_1.setOnAction(e->{
			hienThiPhanSuaNhanSu();
		});
}

		
	
	



//*************************************
//*                                   *
//*	  hiển thị thêm nhân sự kỹ sư	  *
//*	                                  *
//*************************************

public void hienThiThemNhanSuKySu() {
	Stage stage=new Stage();
	stage.setTitle("Thêm nhân sự kỹ sư");
	TextField tenField = new TextField(); 
	TextField namSinhField = new TextField(); 
	TextField gioiTinhField = new TextField(); 
	TextField soDienThoaiField = new TextField();
	TextField chuyenNganhField=new TextField();
	GridPane formPane = new GridPane(); 
	formPane.setHgap(10); 
	formPane.setVgap(10); 
	formPane.setPadding(new Insets(10)); 
	formPane.add(new Label("Tên:"), 0, 0); 
	formPane.add(tenField, 1, 0); 
	formPane.add(new Label("Năm sinh:"), 0, 1); 
	formPane.add(namSinhField, 1, 1); 
	formPane.add(new Label("Giới tính:"), 0, 2); 
	formPane.add(gioiTinhField, 1, 2); 
	formPane.add(new Label("Số điện thoại:"), 0, 3); 
	formPane.add(soDienThoaiField, 1, 3);
	formPane.add(new Label("Chuyên Ngành: "),0,4);
	formPane.add(chuyenNganhField,1,4);
	Button button=new Button("thêm");
	Button buttonOk=new Button("OK");
	
		button.setOnAction(e->{
		String hoTen = tenField.getText(); 
		int namSinh = Integer.parseInt(namSinhField.getText()); 
		String gioiTinh = gioiTinhField.getText(); 
		String soDienThoai = soDienThoaiField.getText();
		String chuyenNganh=chuyenNganhField.getText();
		ConNguoi kySu=new KySu(hoTen,namSinh,gioiTinh ,soDienThoai,chuyenNganh);
		
		
		formPane.add(new Label(kySu.toString()),1,7);
		
		if(xuLy.themMoiNhanSu(kySu)) 
			formPane.add(new Label("Thêm mới thành công và đã lưu vào tập tin "),1,8);
		
		else
			formPane.add(new Label("không thể thêm mới.Mã lỗi[02]. Hãy khỏi động và chạy lại"),1,8);
		

			});
		
		buttonOk.setOnAction(e->stage.close());
			
		
		
		formPane.add(button,1,5);
		formPane.add(buttonOk,1,6);
		
		
		VBox vBox=new VBox(10);
		vBox.setPadding(new Insets(10));
		vBox.getChildren().add(formPane);
		stage.setScene(new Scene(vBox,700,500));
		stage.show();
		
	
	
	}


//*************************************
//*                                   *
//*  hiển thị thêm nhân sự công nhân  *
//*	                                  *
//*************************************

public void hienThiThemNhanSuCongNhan() {
	Stage stage=new Stage();
	stage.setTitle("Thêm nhân sự công nhân");
	TextField tenField = new TextField(); 
	TextField namSinhField = new TextField(); 
	TextField gioiTinhField = new TextField(); 
	TextField soDienThoaiField = new TextField();
	TextField bacNgheField=new TextField();
	GridPane formPane = new GridPane(); 
	formPane.setHgap(10); 
	formPane.setVgap(10); 
	formPane.setPadding(new Insets(10)); 
	formPane.add(new Label("Tên:"), 0, 0); 
	formPane.add(tenField, 1, 0); 
	formPane.add(new Label("Năm sinh:"), 0, 1); 
	formPane.add(namSinhField, 1, 1); 
	formPane.add(new Label("Giới tính:"), 0, 2); 
	formPane.add(gioiTinhField, 1, 2); 
	formPane.add(new Label("Số điện thoại:"), 0, 3); 
	formPane.add(soDienThoaiField, 1, 3);
	formPane.add(new Label("Bậc nghề : "),0,4);
	formPane.add(bacNgheField,1,4);
	Button button=new Button("thêm");
	Button buttonOk=new Button("Ok");
	
		button.setOnAction(e->{
		String hoTen = tenField.getText(); 
		int namSinh = Integer.parseInt(namSinhField.getText()); 
		String gioiTinh = gioiTinhField.getText(); 
		String soDienThoai = soDienThoaiField.getText();
		int bacNghe=Integer.parseInt(bacNgheField.getText());
		ConNguoi congNhan=new CongNhan(hoTen,namSinh,gioiTinh ,soDienThoai,bacNghe);
		formPane.add(new Label(congNhan.toString()),1,7);
		if(xuLy.themMoiNhanSu(congNhan))
			formPane.add(new Label("Thêm mới thành công và đã lưu vào tập tin "),1,8);
		else
			formPane.add(new Label("không thể thêm mới.Mã lỗi[02]. Hãy khỏi động và chạy lại"),1,9);
		
		});
		
		buttonOk.setOnAction(e->stage.close());

		formPane.add(button,1,5);
		formPane.add(buttonOk,1,6);
		VBox vBox=new VBox(10);
		vBox.setPadding(new Insets(10));
		vBox.getChildren().add(formPane);
		stage.setScene(new Scene(vBox,700,500));
		stage.show();
}

//*************************************
//*                                   *
//*  hiển thị thêm nhân sự nhân viên  *
//*	                                  *
//*************************************

public void hienThiThemNhanSuNhanVien() {
	Stage stage=new Stage();
	stage.setTitle("Thêm nhân sự nhân viên");
	TextField tenField = new TextField(); 
	TextField namSinhField = new TextField(); 
	TextField gioiTinhField = new TextField(); 
	TextField soDienThoaiField = new TextField();
	TextField congViecChinhField=new TextField();
	GridPane formPane = new GridPane(); 
	formPane.setHgap(10); 
	formPane.setVgap(10); 
	formPane.setPadding(new Insets(10)); 
	formPane.add(new Label("Tên:"), 0, 0); 
	formPane.add(tenField, 1, 0); 
	formPane.add(new Label("Năm sinh:"), 0, 1); 
	formPane.add(namSinhField, 1, 1); 
	formPane.add(new Label("Giới tính:"), 0, 2); 
	formPane.add(gioiTinhField, 1, 2); 
	formPane.add(new Label("Số điện thoại:"), 0, 3); 
	formPane.add(soDienThoaiField, 1, 3);
	formPane.add(new Label("Công việc chính: "),0,4);
	formPane.add(congViecChinhField,1,4);
	Button button=new Button("thêm");
	Button buttonOk=new Button("Ok");
	
		button.setOnAction(e->{
		String hoTen = tenField.getText(); 
		int namSinh = Integer.parseInt(namSinhField.getText()); 
		String gioiTinh = gioiTinhField.getText(); 
		String soDienThoai = soDienThoaiField.getText();
		String congViecChinh=congViecChinhField.getText();
		ConNguoi nhanVien=new NhanVien(hoTen,namSinh,gioiTinh ,soDienThoai,congViecChinh);
		formPane.add(new Label(nhanVien.toString()),1,7);
		if(xuLy.themMoiNhanSu(nhanVien))
			formPane.add(new Label("Thêm mới thành công và đã lưu vào tập tin "),1,8);
		else
			formPane.add(new Label("không thể thêm mới.Mã lỗi[02]. Hãy khỏi động và chạy lại"),1,8);
		
		});
		buttonOk.setOnAction(e->stage.close());
		formPane.add(buttonOk,1,6);
		formPane.add(button,1,5);
		VBox vBox=new VBox(10);
		vBox.setPadding(new Insets(10));
		vBox.getChildren().add(formPane);
		stage.setScene(new Scene(vBox,900,500));
		stage.show();
}


//**********************************************
//*                                            *
//*hiển thị thêm nhân sự chuyên gia nước ngoài *
//*	                                  		   *
//**********************************************
public void hienThiThemNhanSuChuyenGiaNuocNgoai() {
	Stage stage=new Stage();
	stage.setTitle("Thêm nhân sự nhân viên");
	TextField tenField = new TextField(); 
	TextField namSinhField = new TextField(); 
	TextField gioiTinhField = new TextField(); 
	TextField soDienThoaiField = new TextField();
	TextField quocTichField=new TextField();
	TextField visaField=new TextField();
	TextField chuyenNganhField=new TextField();
	GridPane formPane = new GridPane(); 
	formPane.setHgap(10); 
	formPane.setVgap(10); 
	formPane.setPadding(new Insets(10)); 
	formPane.add(new Label("Tên:"), 0, 0); 
	formPane.add(tenField, 1, 0); 
	formPane.add(new Label("Năm sinh:"), 0, 1); 
	formPane.add(namSinhField, 1, 1); 
	formPane.add(new Label("Giới tính:"), 0, 2); 
	formPane.add(gioiTinhField, 1, 2); 
	formPane.add(new Label("Số điện thoại:"), 0, 3); 
	formPane.add(soDienThoaiField, 1, 3);
	formPane.add(new Label("Quốc Tịch: "),0,4);
	formPane.add(quocTichField,1,4);
	formPane.add(new Label("Ngày hết hạn visa: "),0,5);
	formPane.add(visaField,1,5);
	formPane.add(new Label("Chuyên ngành:"),0,6);
	formPane.add(chuyenNganhField,1,6);
	Button button=new Button("thêm");
	Button buttonOk=new Button("OK");
	
		button.setOnAction(e->{
		String hoTen = tenField.getText(); 
		int namSinh = Integer.parseInt(namSinhField.getText()); 
		String gioiTinh = gioiTinhField.getText(); 
		String soDienThoai = soDienThoaiField.getText();
		String quocTich=quocTichField.getText();
		String visa=visaField.getText();
		String chuyenNganh=chuyenNganhField.getText();
		
		ConNguoi chuyenGiaNuocNgoai = new ChuyenGiaNuocNgoai(hoTen,namSinh,gioiTinh ,soDienThoai,quocTich,chuyenNganh,visa);
		formPane.add(new Label(chuyenGiaNuocNgoai.toString()),1,9);
		if(xuLy.themMoiNhanSu(chuyenGiaNuocNgoai))
			formPane.add(new Label("Thêm mới thành công và đã lưu vào tập tin "),1,10);
		else
			formPane.add(new Label("không thể thêm mới.Mã lỗi[02]. Hãy khỏi động và chạy lại"),1,11);
		//danhSachNhanSu.add(chuyenGiaNuocNgoai);
		});
		buttonOk.setOnAction(e->stage.close());
		formPane.add(buttonOk,1,8);
		formPane.add(button,1,7);
		VBox vBox=new VBox(10);
		vBox.setPadding(new Insets(10));
		vBox.getChildren().add(formPane);
		stage.setScene(new Scene(vBox,900,500));
		stage.show();
}
//**************************************
//*                                    *
//*hiển thị thêm nhân sự thực tập sinh *
//*	                                   *
//**************************************

public void hienThiThemThucTapSinh() {
	Stage stage=new Stage();
	stage.setTitle("Thêm nhân sự thực tập sinh");
	TextField tenField = new TextField(); 
	TextField namSinhField = new TextField(); 
	TextField gioiTinhField = new TextField(); 
	TextField soDienThoaiField = new TextField();
	TextField viTriField=new TextField();
	GridPane formPane = new GridPane(); 
	formPane.setHgap(10); 
	formPane.setVgap(10); 
	formPane.setPadding(new Insets(10)); 
	formPane.add(new Label("Tên:"), 0, 0); 
	formPane.add(tenField, 1, 0); 
	formPane.add(new Label("Năm sinh:"), 0, 1); 
	formPane.add(namSinhField, 1, 1); 
	formPane.add(new Label("Giới tính:"), 0, 2); 
	formPane.add(gioiTinhField, 1, 2); 
	formPane.add(new Label("Số điện thoại:"), 0, 3); 
	formPane.add(soDienThoaiField, 1, 3);
	formPane.add(new Label("Vị trí thực tập: "),0,4);
	formPane.add(viTriField,1,4);
	Button button=new Button("thêm");
	Button buttonOk=new Button("Ok");
	
		button.setOnAction(e->{
		String hoTen = tenField.getText(); 
		int namSinh = Integer.parseInt(namSinhField.getText()); 
		String gioiTinh = gioiTinhField.getText(); 
		String soDienThoai = soDienThoaiField.getText();
		String viTri=viTriField.getText();
		ConNguoi thucTapSinh=new ThucTapSinh(hoTen,namSinh,gioiTinh ,soDienThoai,viTri);
		formPane.add(new Label(thucTapSinh.toString()),1,7);
		if(xuLy.themMoiNhanSu(thucTapSinh))
			formPane.add(new Label("Thêm mới thành công và đã lưu vào tập tin "),1,8);
		else
			formPane.add(new Label("không thể thêm mới.Mã lỗi[02]. Hãy khỏi động và chạy lại"),1,8);
		
		});
		buttonOk.setOnAction(e->stage.close());
		
		formPane.add(buttonOk,1,6);
		formPane.add(button,1,5);
		VBox vBox=new VBox(10);
		vBox.setPadding(new Insets(10));
		vBox.getChildren().add(formPane);
		stage.setScene(new Scene(vBox,800,500));
		stage.show();
}


//*************************************
//*                                   *
//*hiển thị liệt kê thông tin nhân sự *
//*	                                  *
//*************************************
public void hienThiLietKeNhanSu() {

	Stage stage =new Stage();
	stage.setTitle("liệt kê toàn bộ nhân sự ");

	ObservableList<ConNguoi>danhSachNhanSu=FXCollections.observableArrayList(xuLy.lietKeThongTinNhanSu());
	ListView<ConNguoi> listView=new ListView<ConNguoi>(danhSachNhanSu);
		

	
	VBox vBox=new VBox(10);
	vBox.setPadding(new Insets(10));
	vBox.getChildren().add(listView);
	stage.setScene(new Scene(vBox,700,500));
	stage.show();
	
}


//***************************************************
//*                                                 *
//*hiển thị liệt kê thông tin nhân sự theo giới tính*
//*	                                          	    *
//***************************************************

public void hienThiLietKeNhanSuTheoGioiTinh() {
	Stage stage=new Stage();
	stage.setTitle("liệt kê nhân sự theo giới tính");
	TextField gioiTinhField=new TextField();
	Button button=new Button("liệt kê");
	Button buttonOk=new Button("Ok");
	GridPane formPane=new GridPane();
	formPane.setHgap(10); 
	formPane.setVgap(10); 
	formPane.setPadding(new Insets(10)); 
	formPane.add(new Label("Vui lòng nhập vào giới tính :"),0,1);
	formPane.add(gioiTinhField,1,1);
	ListView<ConNguoi> listView=new ListView<>();
	
	button.setOnAction(e->{
		String gioiTinh=gioiTinhField.getText();

		ObservableList<ConNguoi>danhSachNhanSuTheoGioiTinh= FXCollections.observableArrayList(xuLy.lietKeNhanSuTheoGioiTinh(gioiTinh));
		if(danhSachNhanSuTheoGioiTinh.isEmpty()) {
			formPane.add(new Label("Danh sách rỗng "),1,4);
		}
		else
			listView.setItems(danhSachNhanSuTheoGioiTinh);
		
		

		
	});
	buttonOk.setOnAction(e->stage.close());
	formPane.add(buttonOk,1,3);
	formPane.add(button,1,2);
	VBox vBox=new VBox(10);
	vBox.setPadding(new Insets(10));
	vBox.getChildren().addAll(formPane,listView);
	stage.setScene(new Scene(vBox,700,500));
	stage.show();	
}

//***************************************************
//*                                  		        *
//*hiển thị liệt kê thông tin nhân sự theo năm sinh *
//*	                                 		        *
//***************************************************
public void hienThiLietKeNhanSuTheoNamSinh() {
	Stage stage=new Stage();
	stage.setTitle("liệt kê nhân sự theo thứ tự năm sinh");
	TextField nhapField=new TextField();
	Button button=new Button("Liệt kê");
	Button buttonOk=new Button("Ok");
	GridPane formPane=new GridPane();
	formPane.setHgap(10); 
	formPane.setVgap(10); 
	formPane.setPadding(new Insets(10)); 
	formPane.add(new Label("Nhập vào 1 để năm sinh tăng dần; nhập vào 0 để năm sinh giảm dần"),1,0);
	formPane.add(nhapField,1,1); 
	ListView<ConNguoi>listView=new ListView<>();
	button.setOnAction(e->{
		int namSinh=Integer.parseInt(nhapField.getText());
		ObservableList<ConNguoi>danhSachNhanSuTheoNamSinh= FXCollections.observableArrayList(xuLy.lietKeNhanSuTheoNamSinh(namSinh));
		
		if(namSinh!=1&&namSinh!=0) {
			formPane.add(new Label("Bạn nhập sai quy định "),1,4);
		}
		else
			listView.setItems(danhSachNhanSuTheoNamSinh);

		
	});
	
	buttonOk.setOnAction(e->stage.close());
	formPane.add(buttonOk,1,3);
	formPane.add(button,1,2);
	VBox vBox=new VBox(10);
	vBox.setPadding(new Insets(10));
	vBox.getChildren().addAll(formPane,listView);
	stage.setScene(new Scene(vBox,700,500));
	stage.show();	
}
		 	

//*************************************
//*                                   *
//*hiển thị tìm kiếm nhân sự theo tên *
//*	                                  *
//*************************************
public void hienThiTimKiemNhanSuTheoTen() {
	Stage stage =new Stage();
	stage.setTitle("Tìm kiếm nhân sư theo tên ");
	TextField tenField=new TextField();
	Button button=new Button("Tìm kiếm");
	Button buttonOk=new Button("Ok");
	GridPane formPane=new GridPane();
	formPane.setHgap(10); 
	formPane.setVgap(10); 
	formPane.setPadding(new Insets(10));
	formPane.add(new Label("vui lòng nhập vào tên cần tìm: "),0,1);
	formPane.add(tenField,1,1);
	ListView<ConNguoi> listView=new ListView<>();
	
	button.setOnAction(e->{
		String hoten=tenField.getText();
		ObservableList<ConNguoi>ketQua=FXCollections.observableArrayList(xuLy.timKiemTheoHoTen(hoten)); 
	
		listView.setItems(ketQua);
		if (ketQua.isEmpty()) {
			formPane.add(new Label("Không tồn tại thông tin nhân sự này"),1,4);
		}
		
		else {
			listView.setItems(ketQua);
		}
		
		
		
	});
	
	buttonOk.setOnAction(e->stage.close());
	formPane.add(buttonOk,1,3);
	formPane.add(button,1,2);
	VBox vBox=new VBox(10);
	vBox.setPadding(new Insets(10));
	vBox.getChildren().addAll(formPane,listView);
	stage.setScene(new Scene(vBox,700,500));
	stage.show();	
}

//***********************************************
//*                                		        *
//*hiển thị tìm kiếm nhân sự theo số điện thoại *
//*	                                 		    *
//***********************************************
public void hienThiTimKiemNhanSuTheoSoDienThoai() {
	Stage stage =new Stage();
	stage.setTitle("Tìm kiếm nhân sư theo số điện thoại ");
	TextField soDienThoaiField=new TextField();
	Button button=new Button("Tìm kiếm");
	Button buttonOk=new Button("OK");
	GridPane formPane=new GridPane();
	formPane.setHgap(10); 
	formPane.setVgap(10); 
	formPane.setPadding(new Insets(10));
	formPane.add(new Label("vui lòng nhập vào số điện thoại cần tìm: "),0,1);
	formPane.add(soDienThoaiField,1,1);
	ListView<ConNguoi> listView=new ListView<>();
	button.setOnAction(e->{
		String soDienThoai=soDienThoaiField.getText();
		
		ObservableList<ConNguoi>ketQua=FXCollections.observableArrayList(xuLy.timKiemTheoSDT(soDienThoai));
		if(ketQua.isEmpty()) {
			formPane.add(new Label("Kết quả tìm kiếm không có trong danh sách"),1,4);
		}
		else
			listView.setItems(ketQua);
	});
	buttonOk.setOnAction(e->stage.close());
	formPane.add(buttonOk,1,3);
	formPane.add(button,1,2);
	VBox vBox=new VBox(10);
	vBox.setPadding(new Insets(10));
	vBox.getChildren().addAll(formPane,listView);
	stage.setScene(new Scene(vBox,700,500));
	stage.show();	
}

//******************************************
//*                                        *
//*hiển thị xóa thông tin nhân sự theo tên *
//*	                                       *
//******************************************
public void xoaThongTinNhanSuTheoTen() {
	Stage stage=new Stage();
	stage.setTitle("xóa nhân sự theo tên");
	TextField tenField=new TextField();
	Button button=new Button("Xóa");
	Button buttonOk=new Button("Ok");
	GridPane formPane=new GridPane();
	formPane.setHgap(10); 
	formPane.setVgap(10); 
	formPane.setPadding(new Insets(10));
	formPane.add(new Label("Vui lòng nhập vào tên cần xóa: "),0,1);
	formPane.add(tenField,1,1);
	button.setOnAction(e->{
		String hoten=tenField.getText();
		if(xuLy.xoaNhanSuTheoTen(hoten)) {
			formPane.add(new Label("Xóa thành công thông tin nhân sự"),1,4);
		}
		else 
			formPane.add(new Label("Xóa không thành công thông tin nhân sự do không có nhân sự này hoặc nhập sai"),1,5);
		
		
	});
	buttonOk.setOnAction(e-> stage.close());
	formPane.add(buttonOk,1,3);
	formPane.add(button,1,2);
	VBox vBox=new VBox(10);
	vBox.setPadding(new Insets(10));
	vBox.getChildren().add(formPane);
	stage.setScene(new Scene(vBox,700,500));
	stage.show();	
}
//******************************************
//*                                  	   *
//*hiển thị xóa nhân sự theo số điện thoại *
//*	                                 	   *
//******************************************
public void hienThiXoaNhanSuTheoSoDienThoai() {
	Stage stage=new Stage();
	stage.setTitle("xóa nhân sự theo số điện thoại");
	TextField soDienThoaiField=new TextField();
	Button button=new Button("Xóa");
	Button buttonOk=new Button("Ok");
	GridPane formPane=new GridPane();
	formPane.setHgap(10); 
	formPane.setVgap(10); 
	formPane.setPadding(new Insets(10));
	formPane.add(new Label("Vui lòng nhập vào số điện thoại cần xóa: "),0,1);
	formPane.add(soDienThoaiField,1,1);
	button.setOnAction(e->{
		String soDienThoai=soDienThoaiField.getText();
		if (xuLy.xoaHoSoNhanSuTheoSoDienThoai(soDienThoai)) 
			formPane.add(new Label("Xóa thành công thông tin nhân sự"),1,4);
		else
			formPane.add(new Label("Xóa nhân sự không thành công \"+\"do không tồn tại số điện thoại hoặc bị lỗi"),1,5);
		
		
	});
	
	buttonOk.setOnAction(e->stage.close());
	formPane.add(buttonOk,1,3);
	formPane.add(button,1,2);
	VBox vBox=new VBox(10);
	vBox.setPadding(new Insets(10));
	vBox.getChildren().add(formPane);
	stage.setScene(new Scene(vBox,700,500));
	stage.show();	
}
//******************************************
//*                                  	   *
//*hiển thị phần sửa nhân sự			   *
//*	                                 	   *
//******************************************

public void hienThiPhanSuaNhanSu() {
    Stage stage = new Stage();
    stage.setTitle("Sửa Nhân Sự");

    TextField soDienThoaiField = new TextField();
    TextField tenField = new TextField();
    TextField namSinhField = new TextField();
    TextField gioiTinhField = new TextField();

    GridPane formPane = new GridPane();
    formPane.setHgap(10);
    formPane.setVgap(10);
    formPane.setPadding(new Insets(10));

    formPane.add(new Label("Số điện thoại cần sửa:"), 0, 0);
    formPane.add(soDienThoaiField, 1, 0);
    formPane.add(new Label("Tên mới:"), 0, 1);
    formPane.add(tenField, 1, 1);
    formPane.add(new Label("Năm sinh mới:"), 0, 2);
    formPane.add(namSinhField, 1, 2);
    formPane.add(new Label("Giới tính mới:"), 0, 3);
    formPane.add(gioiTinhField, 1, 3);
    Button button=new Button("Sửa");
    Button buttonOk=new Button("OK");
    button.setOnAction(e->{
    	String soDienThoai=soDienThoaiField.getText();
    	String tenMoi=tenField.getText();
    	int namSinhMoi=Integer.parseInt(namSinhField.getText());
    	String gioiTinhMoi=gioiTinhField.getText();
    	
    	if(xuLy.suaThongTinNhanSu(soDienThoai,tenMoi,gioiTinhMoi,namSinhMoi)) {
    		formPane.add(new Label("sửa thành công thông tin nhân sự"),1,6);
    	}
    	else 
    		formPane.add(new Label("Không có nhân sự này trong công ty"),1,7);
    	
    		
    	
    	
    });
    buttonOk.setOnAction(e->stage.close());
    formPane.add(buttonOk,1,5);
    formPane.add(button,1,4);
    VBox vBox=new VBox(10);
	vBox.setPadding(new Insets(10));
	vBox.getChildren().add(formPane);
	stage.setScene(new Scene(vBox,700,500));
	stage.show();

}





}



