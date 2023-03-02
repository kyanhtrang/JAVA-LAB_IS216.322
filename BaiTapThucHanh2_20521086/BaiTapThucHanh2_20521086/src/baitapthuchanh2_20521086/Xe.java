/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh2_20521086;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kyanh
 */
public class Xe {
    static Scanner Nhap = new Scanner(System.in);
    
    private String Ten, LoaiXe;
    private double TriGia;
    private int DungTich;

    public Xe() {}

    public Xe(String Ten, String LoaiXe, double TriGia, int DungTich) {
        this.Ten = Ten;
        this.LoaiXe = LoaiXe;
        this.TriGia = TriGia;
        this.DungTich = DungTich;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getLoaiXe() {
        return LoaiXe;
    }

    public void setLoaiXe(String LoaiXe) {
        this.LoaiXe = LoaiXe;
    }

    public double getTriGia() {
        return TriGia;
    }

    public void setTriGia(double TriGia) {
        this.TriGia = TriGia;
    }

    public int getDungTich() {
        return DungTich;
    }

    public void setDungTich(int DungTich) {
        this.DungTich = DungTich;
    }
    
    public double Thue()
    {
        if (this.DungTich < 100)
            return 0.01*this.TriGia;
        if (this.DungTich >= 100 && this.DungTich <= 175)
            return 0.03*this.TriGia;
        if (this.DungTich > 175)
            return 0.05*this.TriGia;
        return 0;
    }
    
    public static void NhapDSXe(ArrayList<Xe> DSXe)
    {
        Scanner scNhap = new Scanner(System.in);
        String TenChuxe;
        do{
            System.out.print("Nhập tên chủ xe: ");
            TenChuxe = scNhap.nextLine();
            if (TenChuxe == "")
                break;
            
            Xe Xe1 = new Xe();
            Xe1.setTen(TenChuxe);
            System.out.print("Nhập loại xe: ");
            Xe1.setLoaiXe(scNhap.nextLine());
            
            System.out.print("Nhập dung tích xylanh: ");
            Xe1.setDungTich(scNhap.nextInt());
            
            System.out.print("Nhập trị giá: ");
            Xe1.setTriGia(scNhap.nextDouble());
            
            DSXe.add(Xe1);
            scNhap.nextLine();
            
        }while(true);
    }
    
    public void InThongTin()
    {
        System.out.println("Tên chủ xe: " + this.Ten);
        System.out.println("Loại xe: " + this.LoaiXe);
        System.out.println("Trị giá: " + this.TriGia);
        System.out.println("Dung tích xylanh: " + this.DungTich);
        System.out.println("Thuế xe:" + this.Thue());
    }
    
    public static void XuatDSXe(ArrayList<Xe> DSXe)
    {
        System.out.println("Danh sách xe");
        for (int i=0;i<DSXe.size();i++)
        {
            DSXe.get(i).InThongTin();
            System.out.println();
        }
    }
    
    public static void XuatThue(ArrayList<Xe> DSXe)
    {
        Scanner scNhap = new Scanner(System.in);
        System.out.println("Tra cứu");
        System.out.print("Nhập tên chủ xe: ");
        String chuxe = scNhap.nextLine();
        System.out.print("Nhập loai xe: ");
        String loaixe = scNhap.nextLine();
        
        System.out.print("Các thuế của khách hàng " + chuxe +" với loại xe "+loaixe);
        int demXe = 0;
        for (int i=0;i<DSXe.size();i++)
        {
            if (DSXe.get(i).getTen() == chuxe && DSXe.get(i).getLoaiXe()==loaixe)
            {
                System.out.println();
                System.out.println("Thue");
            }    
        }     
    }
}
