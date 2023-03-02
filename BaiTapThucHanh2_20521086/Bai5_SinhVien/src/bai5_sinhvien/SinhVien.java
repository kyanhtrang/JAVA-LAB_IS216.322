/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5_sinhvien;

/**
 *
 * @author kyanh
 */
public class SinhVien {
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
    
}
