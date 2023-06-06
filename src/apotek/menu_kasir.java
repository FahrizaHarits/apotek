/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apotek;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fahri
 */
public class menu_kasir extends javax.swing.JFrame {
    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    /**
     * Creates new form menu_kasir
     */
    public menu_kasir() {
        initComponents();
        k.connect();
        refreshTable();
        refreshTable2();
        refreshCombo();
    }
    
    class kasir extends menu_kasir{
        int id_transaksi,id_barang,jumlah,total,uangBayar,kembalian,harga;
        String nama_barang;
        
        public kasir(){
            String combo = pilih_barang.getSelectedItem().toString();
            String [] arr = combo.split(":"); //memecah string jadi array berdasarkan :
            this.id_barang = Integer.parseInt(arr[0]);
            this.nama_barang = arr [1];
            this.jumlah = Integer.parseInt(kolom_jumlah.getText());
            this.harga = Integer.parseInt(arr[2]);
            this.total += this.harga * this.jumlah;
//            this.uangBayar = Integer.parseInt(total_bayar.getText());
//            this.kembalian = this.uangBayar - this.total;
            
        
            
        }
    }
    
    public void refreshTable(){
        model = new DefaultTableModel();
        model.addColumn("no.");
        model.addColumn("id barang");
        model.addColumn("nama barang");
        model.addColumn("harga");
        model.addColumn("stok");
        table_store.setModel(model);
        
        try {
            int counter = 1;
            this.stat = k.getCon().prepareStatement("select * from store");
            this.rs = this.stat.executeQuery();
            while (rs.next()){
                Object[] data={
                    counter++,rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)
                   /* rs.getInt("id_barang"),
                    rs.getString("nama_barang"),
                    rs.getInt("harga"),
                    rs.getInt("stok")*/
                };
                model.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
    
    public void refreshTable2(){
        model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("id barang");
        model.addColumn("nama barang");
        model.addColumn("jumlah");
        model.addColumn("harga");
        model.addColumn("total");
        tabel_kasir.setModel(model);
        
        try {
            int counter = 1;
            this.stat = k.getCon().prepareStatement("select * from kasir");
            this.rs = this.stat.executeQuery();
            while (rs.next()){
                Object[] data={
                    counter++,rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)
                };
                model.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        kolom_jumlah.setText("");
        //total_harga.setText("");
        //total_bayar.setText("");
        //kembalian.setText("");

    }
    
    public void refreshCombo(){
        try {
            this.stat = k.getCon().prepareStatement("select * from store");
            this.rs = this.stat.executeQuery();
            while (rs.next()){
                pilih_barang.addItem(rs.getString("id_barang")+":"+rs.getString("nama_barang")+":"+rs.getString("harga")+":"+
                rs.getString("stok"));
            }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dashboard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        main_menu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BtnHome = new javax.swing.JButton();
        BtnCashier = new javax.swing.JButton();
        BtnStore = new javax.swing.JButton();
        BtnLogout1 = new javax.swing.JButton();
        sub_menu = new javax.swing.JPanel();
        MenuHome = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        MenuCashier = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_kasir = new javax.swing.JTable();
        kolom_jumlah = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        total_harga = new javax.swing.JTextField();
        total_bayar = new javax.swing.JTextField();
        kembalian = new javax.swing.JTextField();
        tombol_input = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        pilih_barang = new javax.swing.JComboBox<>();
        tombol_bayar = new javax.swing.JButton();
        tombol_bersih = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        MenuStore = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_store = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg footer header.png"))); // NOI18N
        Dashboard.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 796, 60));

        main_menu.setBackground(new java.awt.Color(64, 175, 134));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" MY - APOTEK");

        BtnHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnHome.setForeground(new java.awt.Color(0, 153, 51));
        BtnHome.setText("HOME");
        BtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHomeActionPerformed(evt);
            }
        });

        BtnCashier.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnCashier.setForeground(new java.awt.Color(0, 153, 51));
        BtnCashier.setText("KASIR");
        BtnCashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCashierActionPerformed(evt);
            }
        });

        BtnStore.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnStore.setForeground(new java.awt.Color(0, 153, 51));
        BtnStore.setText("GUDANG");
        BtnStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStoreActionPerformed(evt);
            }
        });

        BtnLogout1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnLogout1.setForeground(new java.awt.Color(0, 153, 51));
        BtnLogout1.setText("LOGOUT");
        BtnLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogout1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main_menuLayout = new javax.swing.GroupLayout(main_menu);
        main_menu.setLayout(main_menuLayout);
        main_menuLayout.setHorizontalGroup(
            main_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(main_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnCashier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnStore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(main_menuLayout.createSequentialGroup()
                        .addComponent(BtnLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        main_menuLayout.setVerticalGroup(
            main_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_menuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addComponent(BtnHome)
                .addGap(18, 18, 18)
                .addComponent(BtnCashier)
                .addGap(18, 18, 18)
                .addComponent(BtnStore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnLogout1)
                .addContainerGap())
        );

        Dashboard.add(main_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 66, -1, 668));

        sub_menu.setLayout(new java.awt.CardLayout());

        MenuHome.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HOME.png"))); // NOI18N

        javax.swing.GroupLayout MenuHomeLayout = new javax.swing.GroupLayout(MenuHome);
        MenuHome.setLayout(MenuHomeLayout);
        MenuHomeLayout.setHorizontalGroup(
            MenuHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MenuHomeLayout.setVerticalGroup(
            MenuHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sub_menu.add(MenuHome, "card2");

        MenuCashier.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 102));
        jLabel6.setText("KASIR");

        jLabel5.setText("JUMLAH BARANG  ");

        tabel_kasir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Nama Barang", "Harga ", "Jumlah ", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabel_kasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_kasirMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_kasir);

        jLabel12.setText("TOTAL HARGA");

        jLabel13.setText("TOTAL BAYAR");

        jLabel14.setText("KEMBALIAN");

        total_harga.setEditable(false);

        kembalian.setEditable(false);

        tombol_input.setBackground(new java.awt.Color(64, 175, 134));
        tombol_input.setForeground(new java.awt.Color(255, 255, 255));
        tombol_input.setText("INPUT");
        tombol_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_inputActionPerformed(evt);
            }
        });

        jLabel7.setText("BARANG             ");

        tombol_bayar.setText("BAYAR");

        tombol_bersih.setText("BERSIH");

        jLabel10.setText(":");

        jLabel11.setText(":");

        jLabel15.setText(":");

        jLabel16.setText(":");

        jLabel18.setText(":");

        javax.swing.GroupLayout MenuCashierLayout = new javax.swing.GroupLayout(MenuCashier);
        MenuCashier.setLayout(MenuCashierLayout);
        MenuCashierLayout.setHorizontalGroup(
            MenuCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuCashierLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(MenuCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total_harga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MenuCashierLayout.createSequentialGroup()
                        .addComponent(total_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tombol_bayar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MenuCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tombol_bersih)
                    .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(MenuCashierLayout.createSequentialGroup()
                .addGroup(MenuCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuCashierLayout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel6))
                    .addGroup(MenuCashierLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuCashierLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(MenuCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuCashierLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(pilih_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuCashierLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(kolom_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(tombol_input, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        MenuCashierLayout.setVerticalGroup(
            MenuCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuCashierLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(52, 52, 52)
                .addGroup(MenuCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pilih_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(MenuCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuCashierLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kolom_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombol_input))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(MenuCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MenuCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombol_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombol_bersih, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        sub_menu.add(MenuCashier, "card3");

        MenuStore.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 102));
        jLabel8.setText("DATA BARANG");

        table_store.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(table_store);

        javax.swing.GroupLayout MenuStoreLayout = new javax.swing.GroupLayout(MenuStore);
        MenuStore.setLayout(MenuStoreLayout);
        MenuStoreLayout.setHorizontalGroup(
            MenuStoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuStoreLayout.createSequentialGroup()
                .addGroup(MenuStoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuStoreLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel8))
                    .addGroup(MenuStoreLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        MenuStoreLayout.setVerticalGroup(
            MenuStoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuStoreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        sub_menu.add(MenuStore, "card4");

        Dashboard.add(sub_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 66, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHomeActionPerformed
        // TODO add your handling code here:
        sub_menu.removeAll();
        sub_menu.repaint();
        sub_menu.revalidate();

        //add panel
        sub_menu.add(MenuHome);
        sub_menu.repaint();
        sub_menu.revalidate();
    }//GEN-LAST:event_BtnHomeActionPerformed

    private void BtnCashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCashierActionPerformed
        // TODO add your handling code here:
        sub_menu.removeAll();
        sub_menu.repaint();
        sub_menu.revalidate();

        //add panel
        sub_menu.add(MenuCashier);
        sub_menu.repaint();
        sub_menu.revalidate();
    }//GEN-LAST:event_BtnCashierActionPerformed

    private void BtnStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStoreActionPerformed
        // TODO add your handling code here:
        sub_menu.removeAll();
        sub_menu.repaint();
        sub_menu.revalidate();

        //add panel
        sub_menu.add(MenuStore);
        sub_menu.repaint();
        sub_menu.revalidate();
    }//GEN-LAST:event_BtnStoreActionPerformed

    private void BtnLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogout1ActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(null,"Apakah Anda Ingin Keluar ?","Perhatian",JOptionPane.YES_NO_OPTION);
        if (option == 0){
            //true condition
            Login A = new Login();
            A.setVisible(true);
            this.setVisible(false);
        } else {

        }
    }//GEN-LAST:event_BtnLogout1ActionPerformed

    private void tabel_kasirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_kasirMouseClicked
       int id = Integer.parseInt( model.getValueAt(tabel_kasir.getSelectedRow(),1).toString());
       String nama = model.getValueAt(tabel_kasir.getSelectedRow(),2).toString();
       int harga = Integer.parseInt( model.getValueAt(tabel_kasir.getSelectedRow(),4).toString());
       int stok = Integer.parseInt( model.getValueAt(tabel_kasir.getSelectedRow(),5).toString());
       
       pilih_barang.setSelectedItem(id+":"+nama+":"+harga+":"+stok);
       kolom_jumlah.setText(model.getValueAt(tabel_kasir.getSelectedRow(),3).toString());
//       total_harga.setText(model.getValueAt(tabel_kasir.getSelectedRow(),3).toString());
//       total_bayar.setText(model.getValueAt(tabel_kasir.getSelectedRow(),4).toString());
//       kembalian.setText(model.getValueAt(tabel_kasir.getSelectedRow(),5).toString());
    }//GEN-LAST:event_tabel_kasirMouseClicked

    private void tombol_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_inputActionPerformed
      try   {
              kasir ksr = new kasir();
              total_harga.setText(""+ksr.total);
              //kembalian.setText(""+ksr.kembalian);
              this.stat = k.getCon().prepareStatement("insert into kasir (id_transaksi,id_barang,nama_barang,jumlah,harga,total) values (?,?,?,?,?,?)");
              this.stat.setInt(1,0);
              this.stat.setInt(2,ksr.id_barang);
              this.stat.setString(3,ksr.nama_barang);
              this.stat.setInt(4,ksr.jumlah);
              this.stat.setInt(5,ksr.harga);
              this.stat.setInt(6,ksr.total);
              this.stat.executeUpdate();
              refreshTable2();
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());   
          }
    }//GEN-LAST:event_tombol_inputActionPerformed

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
            java.util.logging.Logger.getLogger(menu_store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_store().setVisible(true);
            }
        });
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCashier;
    private javax.swing.JButton BtnHome;
    private javax.swing.JButton BtnLogout1;
    private javax.swing.JButton BtnStore;
    private javax.swing.JPanel Dashboard;
    private javax.swing.JPanel MenuCashier;
    private javax.swing.JPanel MenuHome;
    private javax.swing.JPanel MenuStore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField kembalian;
    private javax.swing.JTextField kolom_jumlah;
    private javax.swing.JPanel main_menu;
    private javax.swing.JComboBox<String> pilih_barang;
    private javax.swing.JPanel sub_menu;
    private javax.swing.JTable tabel_kasir;
    private javax.swing.JTable table_store;
    private javax.swing.JButton tombol_bayar;
    private javax.swing.JButton tombol_bersih;
    private javax.swing.JButton tombol_input;
    private javax.swing.JTextField total_bayar;
    private javax.swing.JTextField total_harga;
    // End of variables declaration//GEN-END:variables
}
