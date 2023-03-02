/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh3_20521086;

/**
 *
 * @author kyanh
 */

public class SachTieuThuyet extends Sach{
    private boolean tinhTrang;

    public SachTieuThuyet() {}
    
    public SachTieuThuyet(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public SachTieuThuyet(boolean tinhTrang, long maSach, String tenSach, double donGia, int soLuong, String nxb) {
        super(maSach, tenSach, donGia, soLuong, nxb);
        this.tinhTrang = tinhTrang;
    }

    public void NhapSach()
    {
        super.NhapSach();
        
        int tt;
        do
        {
            System.out.print("Nhập tình trạng: ");
            tt = Integer.parseInt(Nhap.nextLine());
        }    
        while (tt != 0 && tt != 1);
        
        if(tt == 0)
        {
            this.tinhTrang = false;
        }
        else
        {
            this.tinhTrang = true;
        }
        System.out.println();
    }
    public void thongtinSach()
    {
        super.thongtinSach();
        System.out.println("Tình trạng: " + this.tinhTrang);
        System.out.println();
    }
    
    public double thanhTien()
    {
        if(this.tinhTrang == true)
            return super.getSoLuong() * super.getDonGia();
        else
            return super.getSoLuong() * super.getDonGia() * 0.2;
    }
}
