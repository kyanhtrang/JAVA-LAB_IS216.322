/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3_toado;

import java.util.Scanner;

/**
 *
 * @author kyanh
 */
public class Pointer {
    static Scanner Nhap = new Scanner(System.in);
    
    private int x, y;

    public Pointer() {}

    public Pointer(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void NhapTD()
    {
        System.out.print("Nhập hoành độ: ");
        this.x = Nhap.nextInt();
        
        System.out.print("Nhập tung độ: ");
        this.y = Nhap.nextInt();
    }
    
    public void XuatTD()
    {
        System.out.println("Tọa độ: (" + x + ";" + y + ")");
        System.out.println();
    }
    
    public double KhoangCach(Pointer a)
    {
        return(Math.sqrt(Math.pow((this.x - a.x), 2) + Math.pow((this.y - a.y), 2)));
    }
}
