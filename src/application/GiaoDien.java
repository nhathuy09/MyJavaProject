package application;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GiaoDien {

	private Stage sanKhau;

	private MenuBar menuBar;
	private Menu menu1;
	private MenuItem item1_1;
	private MenuItem item1_2;
	private MenuItem item1_3;
	private MenuItem item1_4;
	private MenuItem item1_5;
	
	private Menu menu2;
	private MenuItem item2_1;
	private MenuItem item2_2;
	private MenuItem item2_3;
	

	private Menu menu3;
	private MenuItem item3_1;
	private MenuItem item3_2;
	private Menu menu4;
	private MenuItem item4_1;
	private MenuItem item4_2;
	private Menu menu5;
	private MenuItem item5_1;
	
	
	private Group group;
	
	XuLy xuLy=new XuLy("danhSachNhanSuCongTy.dat");
	public GiaoDien(Stage sanKhau) {
		this.sanKhau=sanKhau;
	}
	
	public void hienThi() {
		menuBar=new MenuBar();
		menu1 =new Menu("Thêm nhân sự");
	
		item1_1=new MenuItem("Thêm kỹ sư");
		item1_2=new MenuItem("Thêm nhân viên");
		item1_3=new MenuItem("Thêm công nhân");
		item1_4=new MenuItem("Thêm chuyên gia nước ngoài");
		item1_5=new MenuItem("Thêm thực tập sinh");
		menu1.getItems().addAll(item1_1,item1_2,item1_3,item1_4,item1_5);
		
		menu2=new Menu("Liệt kê nhân sự ");
		item2_1=new MenuItem("Liệt kê tất cả nhân sự ");
		item2_2=new MenuItem("Liệt kê nhân sự theo giói tính");
		item2_3=new MenuItem("Liệt kê nhân sụ theo năm sinh ");
		menu2.getItems().addAll(item2_1,item2_2,item2_3);
		
		menu3=new Menu("Tìm kiếm thông tin nhân sự ");
		item3_1=new MenuItem("Tìm kiếm nhân sự theo tên");
		item3_2=new MenuItem("Tìm Kiếm nhân sự theo số điện thoại ");
		menu3.getItems().addAll(item3_1,item3_2);
		
		menu4=new Menu("Xóa thông tin nhân sự ");
		item4_1=new MenuItem("Xóa thông tin nhân sự theo tên ");
		item4_2=new MenuItem("Xóa thông tin nhân sự theo số điện thoại ");
		menu4.getItems().addAll(item4_1,item4_2);
		
		menu5=new Menu("sửa thông tin nhân sự  ");
		item5_1=new MenuItem("Sửa toàn bộ thông tin nhân sự");
		menu5.getItems().add(item5_1);
		
		
		//Thêm tên đồ án
		Text tenDoAn=new Text(100,90,"QUẢN LÝ NHÂN SỰ");
		tenDoAn.setStroke(Color.BLACK);
		tenDoAn.setFill(Color.BLACK);
		tenDoAn.setStrokeWidth(2);
		tenDoAn.setFont(Font.font("Serif",FontWeight.BOLD,FontPosture.REGULAR,47));	
		
		
		//Đưa tất cả cảnh dựng vào nhóm
		group=new Group();
		menuBar.getMenus().addAll(menu1,menu2,menu3,menu4,menu5);
		group.getChildren().addAll(menuBar,tenDoAn);
	
		
		Scene canhVat=new Scene(group,660,600);
		
		sanKhau.setTitle("Quản Lý Nhân Sự");
		sanKhau.setScene(canhVat);
		sanKhau.setResizable(true);
		sanKhau.show();
		
		
	}

 	
	
 	
	
	public void xuLyGiaoDien() {
	XuLyGiaoDien xuLy=new XuLyGiaoDien(item1_1,item1_2,item1_3,item1_4,item1_5,item2_1,item2_2,item2_3,item3_1,item3_2,item4_1,item4_2,item5_1);
	xuLy.xuLyItem1_1();
	xuLy.xuLyItem1_2();
	xuLy.xuLyItem1_3();
	xuLy.xuLyItem1_4();
	xuLy.xuLyItem1_5();
	xuLy.xuLyItem2_1();
	xuLy.xuLyItem2_2();
	xuLy.xuLyItem2_3();
	xuLy.xuLyItem3_1();
	xuLy.xuLyItem3_2();
	xuLy.xuLyItem4_1();
	xuLy.xuLyItem4_2();
	xuLy.xuLyItem5_1();
	
	}
	
	
	
}
