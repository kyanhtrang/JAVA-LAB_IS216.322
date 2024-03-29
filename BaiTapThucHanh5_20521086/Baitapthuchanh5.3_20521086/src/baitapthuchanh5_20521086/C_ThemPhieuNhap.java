/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package baitapthuchanh5_20521086;

import com.microsoft.sqlserver.jdbc.SQLServerStatement;
import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import javax.swing.DefaultCellEditor;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;


/**
 *
 * @author kyanh
 */
public class C_ThemPhieuNhap extends javax.swing.JFrame {

    /**
     * Creates new form C_ThemPhieuNhap_20520370
     */
    public C_ThemPhieuNhap() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboxTenNCC = new javax.swing.JComboBox<>();
        txtGhiChu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSanPham = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSL = new javax.swing.JTable();
        dateNgayLap = new com.toedter.calendar.JDateChooser();
        btnTaoPNhap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ngày lập:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Ghi chú");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Tên nhà cung cấp");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Danh sách sản phẩm nhập");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Danh sách sản phẩm");

        cboxTenNCC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboxTenNCC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboxTenNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxTenNCCActionPerformed(evt);
            }
        });

        txtGhiChu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tableSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSanPham);

        tableSL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tableSL);

        dateNgayLap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnTaoPNhap.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTaoPNhap.setText("Tạo phiếu nhập");
        btnTaoPNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoPNhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(btnTaoPNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboxTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(143, 143, 143))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnTaoPNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    DefaultTableModel dtmSanPham;
    DefaultTableModel dtmSL;
    
    private void TaoBangSanPham()
    {
        dtmSanPham = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
           return false;
        }};
        String TieuDe[] ={"Sản phẩm"}; 
        dtmSanPham.setColumnIdentifiers(TieuDe);
        tableSanPham.setModel(dtmSanPham);
    }
    
    private void TaoBangSL(){
        dtmSL = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
           return column==1;
        }};
        String TieuDe1[] ={"Sản phẩm","Số lượng"}; 
        dtmSL.setColumnIdentifiers(TieuDe1);
        tableSL.setModel(dtmSL);
    }
    
    public void KhoiTaoFrame()
    {
        TaoBangSanPham();
        TaoBangSL();
        dateNgayLap.setCalendar(null);
        txtGhiChu.setText(null);
        cboxTenNCC.removeAllItems();
        
        try{
            Connection con = null;
            con = SQLConnection.getSQLConnection();
            String SQL = "SELECT TENNCC FROM NHACC";
            SQLServerStatement state = (SQLServerStatement) con.createStatement(); 
            ResultSet rs = state.executeQuery(SQL);
            while(rs.next())
            {
                String ten = rs.getString(1);
                cboxTenNCC.addItem(ten);
            }
        }catch (Exception e){
            System.out.print("Lỗi " + e);
        }
        setVisible(true);
    }
    
    
    
    private void cboxTenNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxTenNCCActionPerformed
        String tenncc = cboxTenNCC.getItemAt(cboxTenNCC.getSelectedIndex());
        if (tenncc != null)
        {
            try{
                Connection con = null;
                con = SQLConnection.getSQLConnection();
                String sp[] = new String[1];
                String SQL = "SELECT TENSP FROM SANPHAM, NHACC " +
                             "WHERE SANPHAM.MANCC = NHACC.MANCC and TENNCC = N'"+tenncc+"'";
                SQLServerStatement state = (SQLServerStatement) con.createStatement(); 
                ResultSet rs = state.executeQuery(SQL);

                TaoBangSanPham();
                while(rs.next())
                {
                    sp[0] = rs.getNString(1);
                    dtmSanPham.addRow(sp);
                }
            }catch (Exception e){
                System.out.print("Lỗi " + e);
            }
        }
        
    }//GEN-LAST:event_cboxTenNCCActionPerformed

    
    private int TenSPisExist(DefaultTableModel table, String tensp)
    {
        //System.out.print("bảng sl có số dòng là "+table.getRowCount());
        for (int i=0;i<table.getRowCount();i++)
        {
            if (table.getDataVector().elementAt(i).elementAt(0).equals(tensp))
                return i;
        }
            
        return -1;
    }
    
    private void tableSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSanPhamMouseClicked
        int index = tableSanPham.getSelectedRow();
        if (index <= dtmSanPham.getRowCount() && index >= 0)
        {
            String tensp = dtmSanPham.getValueAt(index,0).toString();
            int vitri=TenSPisExist(dtmSL, tensp);
            if(vitri == -1)
            {
                String row[]={tensp,"1"};
                dtmSL.addRow(row);
            }
            else
            {
                try{
                    int soluong;
                    if(dtmSL.getValueAt(vitri, 1).toString()=="")
                        soluong=0;
                    else
                        soluong = Integer.parseInt(dtmSL.getValueAt(vitri, 1).toString());
                    soluong++;
                    dtmSL.setValueAt(soluong, vitri, 1);
                }catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(this,"Số lượng của sản phẩm đang có không phải số","Thêm sản phẩm không thành công",JOptionPane.ERROR_MESSAGE);
                    SuaSL();
                }
                
            }
        }
        tableSanPham.getSelectionModel().clearSelection();
    }//GEN-LAST:event_tableSanPhamMouseClicked
    
    //kiểm tra dữ liệu số lượng nhập bào bảng danh sách sản phẩm nhập tại dòng row có phải là số hay không
    private Boolean KiemTraSL(int row)
    {
        try{
            Integer.parseInt(dtmSL.getValueAt(row, 1).toString());
            return true;
        }catch(Exception ex)
        {
            return false;
        }
    }
    
    private void SuaSL()
    {
        for (int i=0;i<dtmSL.getRowCount();i++)
            if(KiemTraSL(i)==false)
                dtmSL.setValueAt("", i, 1);
    }
    
    private Boolean KiemTraNhap(JDateChooser date, JTable bangSLSP)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            String ngayNhap = sdf.format(date.getDate());
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,"Chưa nhập ngày tạo phiếu","Tạo phiếu nhập không thành công",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(bangSLSP.getRowCount()==0){
            JOptionPane.showMessageDialog(this,"Chưa chọn sản phẩm nào","Tạo phiếu nhập không thành công",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        for (int i=0;i<dtmSL.getRowCount();i++)
            if(KiemTraSL(i)==false){
                JOptionPane.showMessageDialog(this,"Nhập số lượng phải là số!","Tạo phiếu nhập không thành công",JOptionPane.ERROR_MESSAGE);
                SuaSL();
                return false;
            }
        
        return true;
    }
    
    private int LayMaSP(String tensp)
    {
        int masp=-1;
        try{
            Connection con = null;
            con = SQLConnection.getSQLConnection();
            String SQL = "SELECT MASP FROM SANPHAM WHERE TENSP=?";
            PreparedStatement State = con.prepareStatement(SQL); 
            State.setString(1,tensp);
            ResultSet rs = State.executeQuery();   
            
            while(rs.next())
            {
                masp = rs.getInt(1);
            }
            return masp;
        }catch (Exception ex){
            System.out.print("Lỗi " + ex);
            return -1;
        }
    }
    
    private int LayMaPN()
    {
        int mapn=-1;
        try{
            Connection con = null;
            con = SQLConnection.getSQLConnection();
            String SQL = "SELECT MAX(MAPN) FROM PHIEUNHAP";
            PreparedStatement State = con.prepareStatement(SQL); 
            ResultSet rs = State.executeQuery();   
            
            while(rs.next())
            {
                mapn = rs.getInt(1);
            }
            return mapn;
        }catch (Exception e){
            System.out.print("Lỗi " + e);
            return -1;
        }
    }
    
    private void TaoCT_Nhap()
    {
        int mapn=LayMaPN();
        if(mapn!=-1)
        {
            for (int i=0;i<tableSL.getRowCount();i++)
            {
                String tensp = dtmSL.getValueAt(i,0).toString();
                int masp = LayMaSP(tensp);
                int sl = Integer.parseInt(dtmSL.getValueAt(i,1).toString());
                if(masp!=-1)
                {
                    try{
                        Connection con = null;
                        con = SQLConnection.getSQLConnection();
                        String SQL = "INSERT INTO CT_NHAP(MAPN,MASP,SL) VALUES(?,?,?)";
                        PreparedStatement State = con.prepareStatement(SQL); 
                        State.setInt(1, mapn);
                        State.setInt(2, masp);
                        State.setInt(3, sl);
                        State.executeUpdate();   
                    }catch(Exception ex)
                    {
                        System.out.print("Lỗi tại tạo ct_nhap");
                    }
                }
            }
        }
    }
    private void btnTaoPNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoPNhapActionPerformed
        

        if (KiemTraNhap(dateNgayLap,tableSL) == true)
        {
            try{
                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                String ngayNhap = sdf.format(dateNgayLap.getDate());
                
                Connection con = null;
                con = SQLConnection.getSQLConnection();
                String SQL = "INSERT INTO PHIEUNHAP(NGAYLAP,GHICHU,TONGTIEN) VALUES(?,?,0)";
                PreparedStatement State = con.prepareStatement(SQL); 
                State.setString(1,ngayNhap);
                State.setString(2,txtGhiChu.getText());

                int result = State.executeUpdate();
                TaoCT_Nhap();
                JOptionPane.showMessageDialog(this,"Tạo phiếu nhập thành công"); 
                KhoiTaoFrame();
            }catch (Exception ex){
                JOptionPane.showMessageDialog(this,"Lỗi "+ex,"Tạo phiếu nhập không thành công",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnTaoPNhapActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(C_ThemPhieuNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C_ThemPhieuNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C_ThemPhieuNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C_ThemPhieuNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C_ThemPhieuNhap().KhoiTaoFrame();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaoPNhap;
    private javax.swing.JComboBox<String> cboxTenNCC;
    private com.toedter.calendar.JDateChooser dateNgayLap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    javax.swing.JTable tableSL;
    private javax.swing.JTable tableSanPham;
    private javax.swing.JTextField txtGhiChu;
    // End of variables declaration//GEN-END:variables
}
