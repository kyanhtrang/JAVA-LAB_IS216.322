package Exercise1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kyanh
 */
public class Bai1_TaiKhoan extends TaiKhoan{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TaiKhoan taikhoan1 = new TaiKhoan(1, "Sarah", 1000000);
        taikhoan1.inTaiKhoan();
        
        if(taikhoan1.napTien(-5) == true)
        {
            System.out.println("Nạp tiền thành công!");
            taikhoan1.inTaiKhoan();
        }
        else
            System.out.println("Nạp tiền thất bại!");
        System.out.println();
        
        TaiKhoan taikhoan2 = new TaiKhoan(2, "John", 200000);
        taikhoan2.inTaiKhoan();
        
        if(taikhoan1.chuyenKhoan(taikhoan2, 300000) == true)
        {
            System.out.println("Chuyển khoản thành công!");
            taikhoan1.inTaiKhoan();
        }
        else
            System.out.println("Chuyển tiền thất bại!");
        System.out.println();
    }
}
