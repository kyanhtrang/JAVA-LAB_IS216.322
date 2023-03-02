/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3_toado;

/**
 *
 * @author kyanh
 */
public class Bai3_ToaDo extends Pointer{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        
        System.out.print("Khoảng cách giữa 2 điểm là: " + diem1.KhoangCach(diem2));
        System.out.println();
    }
    
}
