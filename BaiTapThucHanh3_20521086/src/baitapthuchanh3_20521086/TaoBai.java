/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthuchanh3_20521086;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author kyanh
 */
public class TaoBai {
    private static final String[] QuanBai = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" }; // 2->A
    private static final String[] ThuocTnh = { "Cơ", "Rô", "Chuồn", "Bích" };
    private List<MoTa> taoBai = new ArrayList<MoTa>();

    public TaoBai (){
        this.createTaoBai();
    }
 
    public List<MoTa> getTaoBai() {
        return taoBai;
    }

    public void setTaoBai(List<MoTa> taoBai) {
        this.taoBai = taoBai;
    }
    
    public void createTaoBai() 
    {
        MoTa Bai;
            for (int j = 0; j < QuanBai.length; j++) 
            {
                for (int k = 0; k < ThuocTnh.length; k++) 
                {
                        Bai = new MoTa();
                        Bai.setQuanBai(QuanBai[j]);
                        Bai.setThuocTinh(ThuocTnh[k]);
                        taoBai.add(Bai);
                }
            }
    }
    
    public void XaoBai(int time)
    {
        for(int i =0;i<time;i++) {
            Collections.shuffle(this.getTaoBai());
        }
    }
}
