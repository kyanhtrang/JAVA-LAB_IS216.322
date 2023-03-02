/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise2;

/**
 *
 * @author kyanh
 */
public class SachTieuThuyet extends Sach{
    private boolean tinhTrang;

    public SachTieuThuyet(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public SachTieuThuyet(boolean tinhTrang, long maSach, String tenSach, double donGia, int soLuong, String nxb) {
        super(maSach, tenSach, donGia, soLuong, nxb);
        this.tinhTrang = tinhTrang;
    }

    public void thongtinSach()
    {
        super.thongtinSach();
        System.out.println("Tình trạng: " + this.tinhTrang);
    }
    
    public double thanhTien()
    {
        if(this.tinhTrang == true)
            return super.getSoLuong() * super.getDonGia();
        else
            return super.getSoLuong() * super.getDonGia() * 0.2;
    }
}
