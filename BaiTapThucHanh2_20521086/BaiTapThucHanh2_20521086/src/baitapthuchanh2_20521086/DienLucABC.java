/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh2_20521086;

import static baitapthuchanh2_20521086.SinhVien.Nhap;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kyanh
 */
public abstract class DienLucABC {
    private int MaKH;
    private String TenKH;
    private String NgayHD;
    int SoLuongDien;
    int DonGia;
    double ThanhTien;

    public DienLucABC() {}

    public DienLucABC(int MaKH, String TenKH, String NgayHD, int SoLuongDien, int DonGia) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.NgayHD = NgayHD;
        this.SoLuongDien = SoLuongDien;
        this.DonGia = DonGia;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getNgayHD() {
        return NgayHD;
    }

    public void setNgayHD(String NgayHD) {
        this.NgayHD = NgayHD;
    }

    public int getSoLuongDien() {
        return SoLuongDien;
    }

    public void setSoLuongDien(int SoLuongDien) {
        this.SoLuongDien = SoLuongDien;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }
    
    public double ThanhTien()
    {
        return 0;
    }
    
    public void InThongTin(){
        System.out.println("Mã khách hàng: " + this.MaKH);
        System.out.println("Tên khách hàng: " + this.TenKH);
        System.out.println("Ngày hóa đơn: " + this.NgayHD);
        System.out.println("Số lượng điện: " + this.SoLuongDien);
        System.out.println("Đơn giá: " + this.DonGia);
    }
    
        public static void NhapDSKH(ArrayList<DienLucABC> DSKH)
    {
        Scanner scNhap = new Scanner(System.in);
        String tenkh;
        int makh;
        String ngayhd;
        int loaikh;
        
        DienLucABC KH1 = null;
        do{
            do{
                System.out.println("\n\t=========================");
                System.out.println("\tChọn loại khách hàng");
                System.out.println("\t1.Khách hàng sinh hoạt");
                System.out.println("\t2.Khách hàng kinh doanh");
                System.out.println("\t3.Khách hàng sản xuất");
                System.out.println("\t=========================");
                System.out.print("\t Nhập lựa chọn: ");
                loaikh = scNhap.nextInt();
                
                switch(loaikh)
                {
                    case 1:
                        KH1 = new KhachHangSH();
                        break;
                        
                    case 2:
                        KH1 = new KhachHangKD();
                        break;
                        
                    case 3:
                        KH1 = new KhachHangSX();
                        break;    
                }
            } while(loaikh != 1 && loaikh != 2 && loaikh != 3);
            
            scNhap.nextLine();
            System.out.print("Nhập tên khách hàng (string): ");
            tenkh = scNhap.nextLine();
            if (tenkh=="")
                break;
            
            KH1.setTenKH(tenkh);
            System.out.print("Nhập mã khách hàng (int): ");
            makh = Nhap.nextInt();
            KH1.setMaKH(makh);
            
            System.out.print("Nhập ngày hóa đơn (string, phân biệt bởi dấu /): ");
            ngayhd = scNhap.nextLine();
            KH1.setNgayHD(ngayhd);
            
            System.out.print("Nhập số lượng điện (int): ");
            KH1.setSoLuongDien(scNhap.nextInt());
            
            System.out.print("Nhập đơn giá (int): ");
            KH1.setDonGia(scNhap.nextInt());
            
            DSKH.add(KH1);
            scNhap.nextLine();
            
        }while(true);
    }
    
    public static void XuatThanhTien(ArrayList<DienLucABC> DSKH)
    {
        Scanner scNhap = new Scanner(System.in);
        System.out.println("Tra cứu");
        System.out.print("Nhập tháng(int): ");
        int thang = scNhap.nextInt();
        System.out.print("Nhập năm: ");
        int nam = scNhap.nextInt();
        
        int demKH=0;
        
        System.out.print("Thông tin khách hàng");
        for (int i=0;i<DSKH.size();i++)
        {
            String[] Thoigian = DSKH.get(i).getNgayHD().split("/");
            if (thang == Integer.parseInt(Thoigian[1]) && nam == Integer.parseInt(Thoigian[2]))
            {
                System.out.println();
                System.out.println("Mã khách hàng: " + DSKH.get(i).getMaKH());
                System.out.println("Tên khách hàng: " + DSKH.get(i).getTenKH());
                System.out.println("Số lượng điện: " + DSKH.get(i).getSoLuongDien());
                System.out.println("Thành tiền: " + DSKH.get(i).ThanhTien());
                demKH++;
            }    
        }
        
        if(demKH==0)
            System.out.println(": không có khách hàng");
    }        
}
