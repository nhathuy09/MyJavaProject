package application;
	
import javafx.application.Application;
import javafx.stage.Stage;



public class KiemThu extends Application { 
	
	public void start(Stage sanKhau) {
		GiaoDien giaoDien=new GiaoDien(sanKhau);
		giaoDien.hienThi();
		giaoDien.xuLyGiaoDien();
	
	}


	

	public static void main(String[] args) {
		launch(args);
	}

	                           
	
	
	
}
