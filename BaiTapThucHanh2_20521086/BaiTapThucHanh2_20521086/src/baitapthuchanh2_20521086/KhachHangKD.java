/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh2_20521086;

/**
 *
 * @author kyanh
 */
public class KhachHangKD extends DienLucABC{
    
    public KhachHangKD() {  }

    public KhachHangKD(int MaKH, String TenKH, String NgayHD, int SoLuongDien, int DonGia) {
        super(MaKH, TenKH, NgayHD, SoLuongDien, DonGia);
    }
        
    public double ThanhTien(){
        if(this.SoLuongDien > 400)
            return this.SoLuongDien*this.DonGia*1.05;
        else
            return this.SoLuongDien*this.DonGia;
    }
    
    public void InThongTin(){
        super.InThongTin();
        System.out.println("Số tiền: " + this.ThanhTien());
    }
}
