/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapthuchanh1_20521086;

import static java.lang.Math.pow;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class BaiTapThucHanh1_20521086 {
    static Scanner Nhap = new Scanner(System.in);
    
    static void Bai1()
    {
        int BanKinh;
        
        
        do
        {
            System.out. print("Nhập bán kính: ");
            BanKinh = Nhap.nextInt();
        }
        while(BanKinh <= 0);
        
        System.out.println("Chu vi đường tròn là: " + (double)(2*Math.PI*BanKinh));
        System.out.println("Diện tích hình tròn là: " + (double)(Math.PI*pow(BanKinh,2)));
    }  
    
    static void Bai2()
    {
        Scanner Nhap = new Scanner(System.in);
        
        System.out.print("Nhập vào chuỗi x: ");
        String x = Nhap.nextLine();
        
        System.out.print("Nhập vào chuỗi y: ");
        String y = Nhap.nextLine();
        
        System.out.println("Tổng chiều dài chuỗi x là: " + x.length());
        System.out.println("3 kí tự đầu của chuỗi x là: " + x.substring(0, 3));
        System.out.println("3 kí tự cuối của chuỗi x là: " + x.substring(x.length() - 3));
        System.out.println("Kí tự thứ 6 của chuỗi x là: " + x.charAt(6));
        System.out.println("Chuỗi mới là: " + x.substring(0, 3) + y.substring(y.length() - 3));
        
        if(x.equals(y))
        {
            System.out.println("Chuỗi x và chuỗi y bằng nhau (phân biệt chữ hoa, thường)");
        }
        else
        {
            System.out.println("Chuỗi x và chuỗi y không bằng nhau (phân biệt chữ hoa, thường)");
        }
        
        if(x.equalsIgnoreCase(y))
        {
            System.out.println("Chuỗi x và chuỗi y bằng nhau (không phân biệt chữ hoa, thường)");
        }
        else
        {
            System.out.println("Chuỗi x và chuỗi y không bằng nhau (không phân biệt chữ hoa, thường)");
        }
        
        int index = x.indexOf(y);
        ArrayList<Integer> array = new ArrayList<Integer>();
        
        while (index >= 0)
        {
            array.add(index);
            index = x.indexOf(y, index +y.length());
        }
        
        if(array.isEmpty())
        {
            System.out.println("Không tìm thấy");
        }
        else
        {
            System.out.print("Tất cả vị trí của y xuất hiện trong x là: ");
            for(int i: array)
            {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }
    
    static void Bai3()
    {
        int SoDien;
        long TienDien = 0;
        
        do
        {
            System.out.print("Nhập vào số điện của tháng: ");
            SoDien = Nhap.nextInt(); 
        }
        while(SoDien < 0);
        
        if(SoDien <= 50)
        {
            TienDien = SoDien*2000;
        }
        
        if (SoDien > 50 && SoDien <= 100)
        {
            TienDien = 2000*50 + (SoDien - 50)*2500;
        }
        
        if(SoDien > 100)
        {
            TienDien = 50*2000 + (SoDien - 50)*3500;
        }
        
        System.out.println("Số tiền điện phải trả là: " + TienDien);
    }
    
    static void Bai4()
    {
        int n;
        do
        {
            System.out.print("Nhập vào số n: ");
            n = Nhap.nextInt();
        }
        while (n<1 && n > 19);
        
        for(int i = 1; i<= n; i++)
        {
            for(int j =1; j <= n; j++)
            {
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
    
    static int UCLN(int a, int b) {
    if (b == 0) return a;
    return UCLN(b, a % b);
    }
    
    static void Bai5()
    {
        int a, b;
        do
        {
            System.out. print("Nhập số a: ");
            a = Nhap.nextInt();
        }
        while(a < 0);
        
        do
        {
            System.out. print("Nhập số b: ");
            b = Nhap.nextInt();
        }
        while(b < 0);
        
        System.out.println("Ước chung lớn nhất của " + a + " " + b + " là: " + UCLN (a, b));
    }
    
    static void Bai6()
    {
        int n;
        do
        {
            System.out.print("Nhập số nguyên dương: ");
            n = Nhap.nextInt();
        }
        while(n <= 0);
        
        for (int i = 1; i <= n; i++)
        {
            if(n%i == 0)
            {
                System.out.print(i + "\t");
            }
        }
    }
    
    static void Bai7()
    {        
        int n, m;
        
        do
        {
            System.out.print("Nhập n: ");
            n = Nhap.nextInt();
        }
        while(n < 0);
        
        int A[] = new int [n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("A[" + i + "]: ");
            A[i] = Nhap.nextInt();
        }
        
        System.out.println("Các phần tử của mảng A là: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(A[i] + "\t");
        }
        System.out.println();
        
        do
        {
            System.out.print("Nhập m: ");
            m = Nhap.nextInt();
        }
        while(m < 0);
        
        int B[] = new int [m];
        System.out.println("Các phần tử của mảng B là: ");
        for (int i = 0; i < m ; i++)
        {
            B[i] = (int)(Math.random()*100)/1;
            System.out.print(B[i] + "\t");
        }

        int[] C = Arrays.copyOfRange(A, 0, A.length);
        System.out.println("Các phần tử của mảng C là: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(C[i] + "\t");
        }
        System.out.println();
        
        System.arraycopy(B, m - 3, C, 0, 3);
        System.out.println("Các phần tử của mảng C sau khi thay thế là: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(C[i] + "\t");
        }
        System.out.println();
        
        Arrays.sort(C);
        System.out.println("Các phần tử của mảng C sau khi sắp xếp là: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(C[i] + "\t");
        }
        System.out.println();
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
