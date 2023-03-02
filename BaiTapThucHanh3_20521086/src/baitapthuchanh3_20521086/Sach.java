/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh3_20521086;

import java.util.Scanner;

/**
 *
 * @author kyanh
 */
public class Sach {
    static Scanner Nhap = new Scanner (System.in);
    
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
    
    public void NhapSach()
    {
        System.out.print("Nhập mã sách: ");
        this.maSach = Long.parseLong(Nhap.nextLine());
        
        System.out.print("Nhập tên sách: ");
        this.tenSach = Nhap.nextLine();
        
        System.out.print("Nhập đơn giá: ");
        this.donGia = Double.parseDouble(Nhap.nextLine());
        
        System.out.print("Nhập số lượng sách: ");
        this.soLuong = Integer.parseInt(Nhap.nextLine());
        
        System.out.print("Nhập tên nhà xuất bản: ");
        this.nxb = Nhap.nextLine();
    }
    
    public void thongtinSach()
    {
        System.out.println("################################");
        System.out.println("Thông tin sách: ");
        System.out.println("Mã sách: " + this.maSach);
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
