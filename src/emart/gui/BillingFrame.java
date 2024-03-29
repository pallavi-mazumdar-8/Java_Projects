/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emart.gui;

import emart.dao.OrderDAO;
import emart.dao.ProductsDAO;
import emart.pojo.ProductsPojo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 91708
 */
public class BillingFrame extends javax.swing.JFrame {

    /**
     * Creates new form BillingFrame
     */
    ArrayList <ProductsPojo> al= new ArrayList<>();
    DefaultTableModel tm;
    double grTotal=0.0;
    public BillingFrame() {
        initComponents();
        tm=(DefaultTableModel) jtProducts.getModel();
        txtProductId.requestFocus();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProducts = new javax.swing.JTable();
        btnGenerateBill = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtProductId = new javax.swing.JTextField();
        btnLogout3 = new javax.swing.JButton();
        btnBack3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jtProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Product Name", "Product Company", "Product Price", "Our Price", "Quantity", "Tax", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtProducts);

        btnGenerateBill.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGenerateBill.setText("Generate Bill");
        btnGenerateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateBillActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Billing Options");

        txtProductId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIdActionPerformed(evt);
            }
        });

        btnLogout3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout3.setText("Logout");
        btnLogout3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout3ActionPerformed(evt);
            }
        });

        btnBack3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack3.setText("Back");
        btnBack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Product Id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel2)
                                .addGap(46, 46, 46)
                                .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLogout3)))
                        .addGap(9, 9, 9)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addComponent(btnGenerateBill)
                .addContainerGap(408, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnLogout3)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGenerateBill)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductsMouseClicked

     

    }//GEN-LAST:event_jtProductsMouseClicked

    private void txtProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIdActionPerformed
       
        
        if(txtProductId.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter product id", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        loadItemList(txtProductId.getText().trim());
        
    }//GEN-LAST:event_txtProductIdActionPerformed

    private void btnGenerateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateBillActionPerformed

    try{
        String  ordId=OrderDAO.getNextOrderId();
        if(OrderDAO.addOrder(al, ordId)&& ProductsDAO.updateStocks(al)){
          JOptionPane.showMessageDialog(null, "Order of Rs"+grTotal+"/-created successfully" );
        ViewCurrectOrderFrame vs=new ViewCurrectOrderFrame();
        vs.setVisible(true);
        this.dispose();
        }
        else
        {
        JOptionPane.showMessageDialog(null, "Order not created");
        }
        
        
        
    }  
    catch(SQLException ex)
        {
              JOptionPane.showMessageDialog(null, "DB Error ", "Error", JOptionPane.ERROR_MESSAGE );
              ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BillingFrame.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_btnGenerateBillActionPerformed

    private void btnLogout3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout3ActionPerformed
        LoginFrame login=new LoginFrame();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogout3ActionPerformed

    private void btnBack3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack3ActionPerformed
        ReceptionistOptionsFrame recepOpt=new ReceptionistOptionsFrame();
        recepOpt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBack3ActionPerformed

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
            java.util.logging.Logger.getLogger(BillingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack3;
    private javax.swing.JButton btnGenerateBill;
    private javax.swing.JButton btnLogout3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtProducts;
    private javax.swing.JTextField txtProductId;
    // End of variables declaration//GEN-END:variables

    private void loadItemList(String pid) {
     
        
        try{
            
            ProductsPojo p=ProductsDAO.getProductDetails(pid);
            if(p.getProductId()==null)
            {
                 JOptionPane.showMessageDialog(null, "Please enter a valid product id", "Error", JOptionPane.ERROR_MESSAGE);
            return;  
            }
            int index=getProductId(pid);
            if(index==-1)
            {
                
                Object[] rows =new Object[8];
                int quan=1;
                double amt=quan*p.getOurPrice();
                p.setQuantity(quan);
                p.setTotal(amt + (amt *p.getTax()/100));
             rows[0]=p.getProductId();
             rows[1]=p.getProductName();
             rows[2]=p.getProductCompany();
             rows[3]=p.getProductPrice();
             rows[4]=p.getOurPrice();
             rows[5]=p.getQuantity();
             rows[6]=p.getTax();
             rows[7]=p.getTotal();
             tm.addRow(rows);
             al.add(p);
             grTotal+=p.getTotal();
                
            }
            else{
                ProductsPojo prd=al.get(index);
                int oldqu=(int)tm.getValueAt(index, 5);
                double amt=prd.getOurPrice();
                int tax=prd.getTax();
                amt=(amt + (amt *tax/100));
                double total=(double)tm.getValueAt(index, 7);
                tm.setValueAt(++oldqu, index,5);
                tm.setValueAt(total+amt, index,7);
                grTotal+=amt;
                prd.setQuantity(oldqu);
                prd.setTotal(total+amt);
                al.set(index, prd);
                
           }}
    catch(SQLException ex)
        {
              JOptionPane.showMessageDialog(null, "DB Error ", "Error", JOptionPane.ERROR_MESSAGE );
              ex.printStackTrace();
        }
    }
    
    private int getProductId(String pid)
    {
        int index =-1;
        for(int i=0;i<al.size();i++)
        {     ProductsPojo p= al.get(i);
            if(p.getProductId().equals(pid))
            {
                index=i;
                break;
            }
        }
        return index;
    }
}
