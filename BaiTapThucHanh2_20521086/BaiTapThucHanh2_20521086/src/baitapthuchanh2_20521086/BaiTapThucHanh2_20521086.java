/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapthuchanh2_20521086;

import static baitapthuchanh2_20521086.DienLucABC.NhapDSKH;
import static baitapthuchanh2_20521086.DienLucABC.XuatThanhTien;
import static baitapthuchanh2_20521086.HinhChuNhat.HCN;
import static baitapthuchanh2_20521086.Xe.NhapDSXe;
import static baitapthuchanh2_20521086.Xe.XuatDSXe;
import static baitapthuchanh2_20521086.Xe.XuatThue;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kyanh
 */
public class BaiTapThucHanh2_20521086 {
    
    static Scanner Nhap = new Scanner(System.in);
    
    public static void Bai1()
    {
        TaiKhoan taikhoan1 = new TaiKhoan(1, "Sarah", 1000000);
        taikhoan1.inTaiKhoan();
        
        if(taikhoan1.napTien(500000) == true)
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
    
    public static void Bai2()
    {
        Sach();
    }

    public static void Sach()
    {
        Sach tieuthuyet = new SachTieuThuyet(false, 2586, "Sách tiểu thuyết", 23500, 25, "Nhà xuất bản tiểu thuyết");
        Sach trinhtham = new SachTrinhTham(25400, 2356, "Sách trinh thám", 65800, 12, "Nhà xuất bản trinh thám");

        tieuthuyet.thongtinSach();
        System.out.println("Thành tiền tiểu thuyết: " + tieuthuyet.thanhTien());
        System.out.println("################################");
        System.out.println();

        trinhtham.thongtinSach();
        System.out.println("Thành tiền trinh thám: " + trinhtham.thanhTien());
        System.out.println("################################");
        System.out.println();
    }
    
    public static void Bai3()
    {
        System.out.println("-------------------------");
        System.out.println("Tọa độ điểm thứ nhất: ");
        System.out.println("-------------------------");
        Pointer diem1 = new Pointer();
        diem1.NhapTD();
        diem1.XuatTD();
        
        System.out.println("-------------------------");
        System.out.println("Tọa độ điểm thứ hai: ");
        System.out.println("-------------------------");
        Pointer diem2 = new Pointer();
        diem2.NhapTD();
        diem2.XuatTD();
        
        System.out.println("Khoảng cách giữa 2 điểm là: " + diem1.KhoangCach(diem2));
        System.out.println();
    }
    
    public static void Bai4()
    {
        HinhChuNhat hcn = new HinhChuNhat();
        HCN(hcn);
        System.out.println(hcn.toString());
    }
    
    public static void Bai5()
    {
        SinhVien sv1 = new SinhVien();
        System.out.println("-------------------------");
        System.out.println("Nhập thông tin sinh viên thứ nhất");
        System.out.println("-------------------------");
        sv1.Nhap();
        System.out.println();
        
        SinhVien sv2 = new SinhVien();
        System.out.println("-------------------------");
        System.out.println("Nhập thông tin sinh viên thứ hai");
        System.out.println("-------------------------");
        sv2.Nhap();
        System.out.println();
        
        SinhVien sv3 = new SinhVien();
        System.out.println("-------------------------");
        System.out.println("Nhập thông tin sinh viên thứ ba");
        System.out.println("-------------------------");
        sv3.Nhap();
        System.out.println();
        
        System.out.println("----------------------------------------------THÔNG TIN SINH VIÊN----------------------------------------------");
        System.out.printf("%20s %20s %20s %20s %20s", "Mã sinh viên", "Họ và Tên", "Điểm lý thuyết", "Điểm thực hành", "Điểm trung bình");
        System.out.println();
        sv1.Xuat();
        sv2.Xuat();
        sv3.Xuat();
    }
    
    public static void Bai6()
    {
        ArrayList <Xe> DSXe = new ArrayList<> ();
        NhapDSXe(DSXe);
        System.out.println();
        
        XuatDSXe(DSXe);
        
        XuatThue(DSXe);
    }
    
    public static void Bai7()
    {
        DienLucABC();
    }
    
    public static void DienLucABC()
    {
        ArrayList <DienLucABC> DSKH = new ArrayList<> ();
        NhapDSKH(DSKH);
        System.out.println();
        XuatThanhTien(DSKH);
    }
    public static void main(String[] args) {
        
        int n;
        
        System.out.println("############################");
        System.out.println("1. Bài 1: ");
        System.out.println("2. Bài 2: ");
        System.out.println("3. Bài 3: ");
        System.out.println("4. Bài 4: ");
        System.out.println("5. Bài 5: ");
        System.out.println("6. Bài 6: ");
        System.out.println("7. Bài 7: ");
        System.out.println("############################");
        
        do
        {
            System.out.print("Chọn bài: ");
            n = Nhap.nextInt();
        }
        while(n < 1 || n > 7);
        
        switch(n)
        {
            case 1:
            {
                Bai1();
                break;
            }
            case 2:
            {
                Bai2();
                break;
            }
            case 3:
            {
                Bai3();
                break;
            }
            case 4:
            {
                Bai4();
                break;
            }
            case 5:
            {
                Bai5();
                break;
            }
            case 6:
            {
                Bai6();
                break;
            }
            case 7:
            {
                Bai7();
                break;
            }
        }
    }
}
