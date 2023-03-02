/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh2_20521086;

/**
 *
 * @author kyanh
 */
public class TaiKhoan {
    private long soTK;
    private String tenTK;
    private double soTien;

    public TaiKhoan() {}
    
    public TaiKhoan(long soTK, String tenTK, double soTien) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTien = soTien;
    }
    
    public void inTaiKhoan()
    {
        System.out.println("-------------------------");
        System.out.println("Thông tin tài khoản: ");
        System.out.println("-------------------------");
        System.out.println("Số tài khoản: " + soTK);
        System.out.println("Tên tài khoản: " + tenTK);
        System.out.println("Số tiền: " + soTien);
        System.out.println();
    }
    
    public boolean napTien(double st)
    {
        if(st > 0)
        {
            this.soTien = this.soTien + st;
            return true;
        }
        return false;
    }
    
    public boolean chuyenKhoan(TaiKhoan a, double st)
    {
        if (st > this.soTien)
            return false;
        if(a.soTK == this.soTK)
            return false;
        if(st <= 0)
            return false;
        
        a.soTien = a.soTien + st;
        this.soTien = this.soTien - st;
        return true;
    }
}
