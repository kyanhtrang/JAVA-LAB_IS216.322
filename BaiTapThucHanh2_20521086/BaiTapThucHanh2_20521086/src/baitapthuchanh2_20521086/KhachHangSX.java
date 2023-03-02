/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh2_20521086;

/**
 *
 * @author kyanh
 */
public class KhachHangSX extends DienLucABC{
    private int LoaiDien;

    public KhachHangSX() {
    }

    public KhachHangSX(int MaKH, String TenKH, String NgayHD, int SoLuongDien, int DonGia, int LoaiDien) {
        super(MaKH, TenKH, NgayHD, SoLuongDien, DonGia);
        this.LoaiDien = LoaiDien;
    }

    public int getLoaiDien() {
        return LoaiDien;
    }

    public void setLoaiDien(int LoaiDien) {
        this.LoaiDien = LoaiDien;
    }
    
    public double ThanhTien(){
        if(this.LoaiDien == 2)
        {
            if(this.SoLuongDien > 200)
                return this.SoLuongDien*this.DonGia*0.98;
            else
                return this.SoLuongDien*this.DonGia;
        }
            
        if(this.LoaiDien == 3)
        {
            if(this.SoLuongDien > 150)
                return this.SoLuongDien*this.DonGia*0.97;
            else
                return this.SoLuongDien*this.DonGia;
        }            
        return 0;
    }
    
    public void InThongTin(){
        super.InThongTin();
        System.out.println("Loại điện: " + this.LoaiDien + " pha");
        System.out.println("Số tiền: " + this.ThanhTien);
    }
}
