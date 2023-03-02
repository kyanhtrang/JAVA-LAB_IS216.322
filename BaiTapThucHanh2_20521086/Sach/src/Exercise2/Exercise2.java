/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercise2;

/**
 *
 * @author kyanh
 */
public class Exercise2 extends Sach
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
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
}
   