/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapthuchanh3_20521086;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author kyanh
 */
public class BaiTapThucHanh3_20521086 {

    /**
     * @param args the command line arguments
     */
    static Scanner Nhap = new Scanner(System.in);
    
    public static void Bai1()
    {
        int LoaiSach, SoLuongSach;          
        ArrayList<Sach> ListSach = new ArrayList<Sach>();
        
        do
        {
            System.out.print("Số lượng sách cần nhập: ");
            SoLuongSach = Integer.parseInt(Nhap.nextLine());
        }
        while(SoLuongSach < 0);
        
        for (int i = 0; i < SoLuongSach; i++)
        {
            do
            {
            System.out.println("Chọn loại sách cần nhập");
            System.out.println("1. Sách tiểu thuyết\n2. Sách trinh thám");
            LoaiSach = Integer.parseInt(Nhap.nextLine());
            }
            while (LoaiSach != 1 && LoaiSach != 2);
        
            if (LoaiSach == 1)
            {
                Sach tieuthuyet = new SachTieuThuyet();
                tieuthuyet.NhapSach();
                ListSach.add(tieuthuyet);
            }
            else
            {     
                Sach trinhtham = new SachTrinhTham(); 
                trinhtham.NhapSach();
                ListSach.add(trinhtham);
            }
        }
             
        for (Sach i: ListSach)
        {
            i.thongtinSach();
        }
    }
    
    public static <T> void XuatMang (T[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
    
    public static void Bai2()
    {
        Integer[] arrayInt = {0, 1, 2, 3, 4, 5};
        String[] arrayString = {"A", "B", "C", "D", "E"};
        Double[] arrayDouble = {0.1, 0.2, 0.3, 0.4, 0.5};
        XuatMang(arrayInt);
        XuatMang(arrayString);
        XuatMang(arrayDouble);
    }
    
    public static void Bai3()
    {
        int[] SoNguyen = new int[5];
        int so;
        int i = 0;
        try
        {
            while(true)
            {
                System.out.print("Nhập số nguyên: ");
                so = Nhap.nextInt();
                SoNguyen[i] = so;
                i++;
            }
        }
        catch(ArrayIndexOutOfBoundsException aie)
        {
            System.out.println("Bạn đã nhập quá số lượng phần tử");
        }
        catch(Exception ex)
        {
            System.out.println("Dữ liệu bạn nhập không phải số nguyên");
        }
    }
    
    public static double getAverage(List<? extends Number> numList)
    {
        double total = 0.0;
        for (Number num : numList)
        {
            total += num.doubleValue();
        }
        return total/numList.size();
    }
    
    public static void Bai4()
    {
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(15);
        integerList.add(50);
        integerList.add(11);
        integerList.add(39);
        integerList.add(47);
        System.out.println(getAverage(integerList));
        
        List<Double> doubleList = new ArrayList<Double>();
        doubleList.add(15.6);
        doubleList.add(27.3);
        doubleList.add(49.2);
        doubleList.add(11.9);
        doubleList.add(35.58);
        System.out.println(getAverage(doubleList));
    }
    
    public static void Bai5()
    {
        TaoBai Bai = new TaoBai();
        Bai.createTaoBai();
	Bai.XaoBai(2);
        for (int i = 0; i < Bai.getTaoBai().size(); i++) 
        {
            System.out.print(Bai.getTaoBai().get(i).getQuanBai() + " ");
            System.out.print(Bai.getTaoBai().get(i).getThuocTinh() + "\r\n");
        }
    }
    
    public static void main(String[] args) {
        int n;
        
        System.out.println("############################");
        System.out.println("1. Bài 1: ");
        System.out.println("2. Bài 2: ");
        System.out.println("3. Bài 3: ");
        System.out.println("4. Bài 4: ");
        System.out.println("5. Bài 5: ");
        System.out.println("############################");
        
        do
        {
            System.out.print("Chọn bài: ");
            n = Integer.parseInt(Nhap.nextLine());
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
        }
    }
}
