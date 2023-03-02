/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh3_20521086;

/**
 *
 * @author kyanh
 */
public class SachTrinhTham extends Sach{
    private float thue;

    public SachTrinhTham() {}
    
    public SachTrinhTham(float thue) {
        this.thue = thue;
    }

    public SachTrinhTham(float thue, long maSach, String tenSach, double donGia, int soLuong, String nxb) {
        super(maSach, tenSach, donGia, soLuong, nxb);
        this.thue = thue;
    }

    public void NhapSach()
    {
        super.NhapSach();
        System.out.print("Nhập thuế: ");
        this.thue = Float.parseFloat(Nhap.nextLine());
        System.out.println();
    }
    public void thongtinSach()
    {
        super.thongtinSach();
        System.out.println("Thuế: " + this.thue);
        System.out.println();
    }
    
    public double thanhTien()
    {
        return super.getSoLuong() * super.getDonGia() + this.thue;
    }
}
