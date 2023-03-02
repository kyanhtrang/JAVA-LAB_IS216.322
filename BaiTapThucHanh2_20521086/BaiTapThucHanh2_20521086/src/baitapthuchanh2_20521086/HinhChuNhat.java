/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh2_20521086;

import java.util.Scanner;

/**
 *
 * @author kyanh
 */
public class HinhChuNhat {
    static Scanner Nhap = new Scanner(System.in);
    
    double ChieuRong;
    double ChieuDai;

    public HinhChuNhat() {}

    public HinhChuNhat(double ChieuRong, double ChieuDai) {
        this.ChieuRong = ChieuRong;
        this.ChieuDai = ChieuDai;
    }

    public double getChieuRong() {
        return ChieuRong;
    }

    public void setChieuRong(double ChieuRong) {
        this.ChieuRong = ChieuRong;
    }

    public double getChieuDai() {
        return ChieuDai;
    }

    public void setChieuDai(double ChieuDai) {
        this.ChieuDai = ChieuDai;
    }
    
    public double ChuVi()
    {
        return (this.ChieuDai + this.ChieuRong)*2;
    }
    
    public double DienTich()
    {
        return this.ChieuDai*this.ChieuRong;
    }
    
    public String toString(HinhChuNhat a)
    {
        return "Thông tin hình chữ nhật:\nChiều dài: " + a.ChieuDai + "\nChiều rộng: " + a.ChieuRong
        + "\nChu vi: " + a.ChuVi() + "\nDiệntích: " + a.DienTich();
    }
    
     public static void HCN(HinhChuNhat hcn)
    {
        do
        {
            System.out.print("Nhập chiều dài: ");
            hcn.ChieuDai = Nhap.nextDouble();
        }
        while (hcn.ChieuDai <= 0);
        
        do
        {
            System.out.print("Nhập chiều rộng: ");
            hcn.ChieuRong = Nhap.nextDouble();
        }
        while (hcn.ChieuRong <= 0 || hcn.ChieuRong > hcn.ChieuDai);
    }
}
