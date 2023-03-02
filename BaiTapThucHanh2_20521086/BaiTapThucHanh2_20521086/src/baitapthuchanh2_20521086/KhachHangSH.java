/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh2_20521086;

/**
 *
 * @author kyanh
 */
public class KhachHangSH extends DienLucABC{
    private int DinhMuc;

    public KhachHangSH() {}

    public KhachHangSH(int MaKH, String TenKH, String NgayHD, int SoLuongDien, int DonGia, int DinhMuc) {
        super(MaKH, TenKH, NgayHD, SoLuongDien, DonGia);
        this.DinhMuc = DinhMuc;
    }

    public int getDinhMuc() {
        return DinhMuc;
    }

    public void setDinhMuc(int DinhMuc) {
        this.DinhMuc = DinhMuc;
    }
    
    public double ThanhTien(){
        if(this.SoLuongDien > this.DinhMuc)
            return this.DinhMuc * this.DinhMuc + (this.SoLuongDien - this.DinhMuc)*this.DonGia*2;
        else
            return this.SoLuongDien*this.DinhMuc;
    }
    
    public void InThongTin(){
        super.InThongTin();
        System.out.println("Đinh mức điện:" + this.DinhMuc);
        System.out.println("Số tiền: " +this.ThanhTien());
    }    
}
