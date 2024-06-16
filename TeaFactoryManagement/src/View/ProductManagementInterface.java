/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ProductController;
import Model.Product;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KESTROY
 */
public class ProductManagementInterface extends javax.swing.JFrame {
      private ProductController controller;

    /**
     * Creates new form NewJFrame
     */
    public ProductManagementInterface() {
        initComponents();
        controller = new ProductController(this);
        loadProductData();
    }
     private void loadProductData() {
        try {
            List<Product> products = controller.getAllProducts();
            DefaultTableModel model = (DefaultTableModel) productTable.getModel();
            model.setRowCount(0);
            for (Product product : products) {
                model.addRow(new Object[]{
                    product.getId(),
                    product.getName(),
                    product.getCategory(),
                    product.getPrice(),
                    product.getQuantity(),
                    product.getDescription()
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading product data!");
        }
    }

    private void clearFields() {
        productnameTF.setText("");
        categoryTF.setText("");
        priceTF.setText("");
        quantityTF.setText("");
        descriptionTF.setText("");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        productnameTF = new javax.swing.JTextField();
        categoryTF = new javax.swing.JTextField();
        priceTF = new javax.swing.JTextField();
        quantityTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionTF = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        addBTN = new javax.swing.JButton();
        View = new javax.swing.JButton();
        updateBTN = new javax.swing.JButton();
        DeleteBTN = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(193, 10));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Product Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Category");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Price");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Quantity");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        productnameTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(productnameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 160, -1));

        categoryTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        categoryTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryTFActionPerformed(evt);
            }
        });
        getContentPane().add(categoryTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 160, -1));

        priceTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(priceTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 160, -1));

        quantityTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(quantityTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 160, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Description");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        descriptionTF.setColumns(20);
        descriptionTF.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        descriptionTF.setRows(5);
        jScrollPane2.setViewportView(descriptionTF);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 180, 140));

        productTable.setAutoCreateRowSorter(true);
        productTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Product Name", "Category", "Price", "Quantity", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 910, 180));

        jPanel1.setBackground(new java.awt.Color(255, 153, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        addBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addBTN.setForeground(new java.awt.Color(0, 0, 102));
        addBTN.setText("Add");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        View.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        View.setForeground(new java.awt.Color(0, 0, 102));
        View.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-view-30.png"))); // NOI18N
        View.setText("View");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });

        updateBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateBTN.setForeground(new java.awt.Color(0, 0, 102));
        updateBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-update-30.png"))); // NOI18N
        updateBTN.setText("Update");
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });

        DeleteBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DeleteBTN.setForeground(new java.awt.Color(0, 0, 102));
        DeleteBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-delete-30.png"))); // NOI18N
        DeleteBTN.setText("Delete");
        DeleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBTNActionPerformed(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Clear.setForeground(new java.awt.Color(0, 0, 102));
        Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-clear-30.png"))); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Close.setForeground(new java.awt.Color(0, 0, 102));
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-exit-30.png"))); // NOI18N
        Close.setText("Exit");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(0, 0, 102));
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-add-30.png"))); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(Close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(949, 949, 949)
                        .addComponent(addBTN))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(DeleteBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(View, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(addBTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(View)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Clear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Close)
                .addGap(58, 58, 58))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 160, 290));

        jLabel7.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel7.setText("Product  Details");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 970, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/backg.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = productTable.getSelectedRow();
        productnameTF.setText(productTable.getValueAt(selectedRow, 1).toString());
        categoryTF.setText(productTable.getValueAt(selectedRow, 2).toString());
        priceTF.setText(productTable.getValueAt(selectedRow, 3).toString());
        quantityTF.setText(productTable.getValueAt(selectedRow, 4).toString());
        descriptionTF.setText(productTable.getValueAt(selectedRow, 5).toString());
    }//GEN-LAST:event_productTableMouseClicked

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        // TODO add your handling code here:
        Product product = new Product();
        product.setName(productnameTF.getText());
        product.setCategory(categoryTF.getText());
        product.setPrice(Double.parseDouble(priceTF.getText()));
        product.setQuantity(Integer.parseInt(quantityTF.getText()));
        product.setDescription(descriptionTF.getText());

        try {
            controller.addProduct(product);
            loadProductData();
            clearFields();
            JOptionPane.showMessageDialog(this, "Product added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error adding product!");
        }
    }//GEN-LAST:event_addBTNActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRow = productTable.getSelectedRow();
            if (selectedRow != -1) {
                String details = "Product Details:\n";
                details += "Name: " + productTable.getValueAt(selectedRow, 1).toString() + "\n";
                details += "Category: " + productTable.getValueAt(selectedRow, 2).toString() + "\n";
                details += "Price: " + productTable.getValueAt(selectedRow, 3).toString() + "\n";
                details += "Quantity: " + productTable.getValueAt(selectedRow, 4).toString() + "\n";
                details += "Description: " + productTable.getValueAt(selectedRow, 5).toString();
                JOptionPane.showMessageDialog(this, details, "Product Details", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a product to view!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error viewing product!");
        }
    }//GEN-LAST:event_ViewActionPerformed

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
        // TODO add your handling code here:
        int selectedRow = productTable.getSelectedRow();
        if (selectedRow != -1) {
            Product product = new Product();
            product.setId((int) productTable.getValueAt(selectedRow, 0));
            product.setName(productnameTF.getText());
            product.setCategory(categoryTF.getText());
            product.setPrice(Double.parseDouble(priceTF.getText()));
            product.setQuantity(Integer.parseInt(quantityTF.getText()));
            product.setDescription(descriptionTF.getText());

            try {
                controller.updateProduct(product);
                loadProductData();
                clearFields();
                JOptionPane.showMessageDialog(this, "Product updated successfully!");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error updating product!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a product to update!");
        }
    }//GEN-LAST:event_updateBTNActionPerformed

    private void DeleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBTNActionPerformed
        // TODO add your handling code here:
        int selectedRow = productTable.getSelectedRow();
        if (selectedRow != -1) {
            int id = (int) productTable.getValueAt(selectedRow, 0);
            try {
                controller.deleteProduct(id);
                loadProductData();
                clearFields();
                JOptionPane.showMessageDialog(this, "Product deleted successfully!");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error deleting product!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a product to delete!");
        }

    }//GEN-LAST:event_DeleteBTNActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        clearFields();
    }//GEN-LAST:event_ClearActionPerformed

    private void categoryTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryTFActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
          setVisible(false);
    }//GEN-LAST:event_CloseActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        Product product = new Product();
        product.setName(productnameTF.getText());
        product.setCategory(categoryTF.getText());
        product.setPrice(Double.parseDouble(priceTF.getText()));
        product.setQuantity(Integer.parseInt(quantityTF.getText()));
        product.setDescription(descriptionTF.getText());

        try {
            controller.addProduct(product);
            loadProductData();
            clearFields();
            JOptionPane.showMessageDialog(this, "Product added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error adding product!");
        }
    }//GEN-LAST:event_addActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ensure GUI is created on the Event Dispatch Thread
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductManagementInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Close;
    private javax.swing.JButton DeleteBTN;
    private javax.swing.JButton View;
    private javax.swing.JButton add;
    private javax.swing.JButton addBTN;
    private javax.swing.JTextField categoryTF;
    private javax.swing.JTextArea descriptionTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField priceTF;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField productnameTF;
    private javax.swing.JTextField quantityTF;
    private javax.swing.JButton updateBTN;
    // End of variables declaration//GEN-END:variables
}
