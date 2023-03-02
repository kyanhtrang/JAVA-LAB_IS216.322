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

public class SinhVien {
    static Scanner Nhap = new Scanner(System.in);
    
    private int MSSV;
    private String Hoten;
    private float DiemLT, DiemTH;

    public SinhVien() {
        this.MSSV = 0;
        this.Hoten = "";
        this.DiemLT = 0;
        this.DiemTH = 0;
    }

    public SinhVien(int MSSV, String Hoten, float DiemLT, float DiemTH) {
        this.MSSV = MSSV;
        this.Hoten = Hoten;
        this.DiemLT = DiemLT;
        this.DiemTH = DiemTH;
    }

    public int getMSSV() {
        return MSSV;
    }

    public void setMSSV(int MSSV) {
        this.MSSV = MSSV;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public float getDiemLT() {
        return DiemLT;
    }

    public void setDiemLT(float DiemLT) {
        this.DiemLT = DiemLT;
    }

    public float getDiemTH() {
        return DiemTH;
    }

    public void setDiemTH(float DiemTH) {
        this.DiemTH = DiemTH;
    }
    
    public double DiemTB()
    {
        return (this.DiemLT + this.DiemTH)/2;
    }
    
    public void Nhap()
    {
        System.out.print("MSSV: ");
        this.MSSV = Integer.parseInt(Nhap.nextLine());
        System.out.print("Họ và Tên: ");
        this.Hoten = Nhap.nextLine();
        do
        {
            System.out.print("Điểm lý thuyết: ");
            this.DiemLT =  Float.parseFloat(Nhap.nextLine());
        }
        while(this.DiemLT < 0 || this.DiemLT > 10);
        
        do
        {
            System.out.print("Điểm thực hành: ");
            this.DiemTH = Float.parseFloat(Nhap.nextLine());
        }
        while(this.DiemTH < 0 || this.DiemTH > 10);
    }
    
    public String toString()
    {
        return this.MSSV + "\t" + this.Hoten + "\t" + this.DiemLT + "\t" + this.DiemTH + "\t" + this.DiemTB();
    }
    
    public void Xuat()
    {
        System.out.printf("%20s %20s %20s %20s %20s\n", this.MSSV, this.Hoten, this.DiemLT, this.DiemTH, this.DiemTB());
    }
}
