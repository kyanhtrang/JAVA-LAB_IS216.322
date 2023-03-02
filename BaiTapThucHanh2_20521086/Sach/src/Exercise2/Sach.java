/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise2;

/**
 *
 * @author kyanh
 */
public class Sach {
    private long maSach;
    private String tenSach;
    private double donGia;
    private int soLuong;
    private String nxb;
    
    public Sach(){};

    public Sach(long maSach, String tenSach, double donGia, int soLuong, String nxb) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nxb = nxb;
    }
    
    public long getMaSach() {
        return maSach;
    }

    public void setMaSach(long maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }
    
    public void thongtinSach()
    {
        System.out.println("################################");
        System.out.println("Thông tin sách: ");
        System.out.println("Mã sách: :" + this.maSach);
        System.out.println("Tên sách: " + this.tenSach);
        System.out.println("Đơn giá: " + this.donGia);
        System.out.println("Số lượng: " + this.soLuong);
        System.out.println("Nhà xuất bản: " + this.nxb);
    }
    
    public double thanhTien()
    {
        return 0;
    }
    
}
