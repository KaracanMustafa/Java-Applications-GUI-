/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package musicsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author karac
 */
public class settingPromotion extends javax.swing.JFrame {
    double[] numbers;
searchMusic sc=new searchMusic();
    /**
     * Creates new form settingPromotion
     */
    public settingPromotion() {
       
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
        newPriceField = new javax.swing.JTextField();
        setPromoButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        tunesComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tune :");

        jLabel2.setText("New Price :");

        setPromoButton.setText("Set Promotion");
        setPromoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPromoButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        tunesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tune 1", "Tune 2", "Tune 3", "Tune 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tunesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setPromoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tunesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(newPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(setPromoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setPromoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPromoButtonActionPerformed
        readNumbersFromFile();
        setPromo();
    }//GEN-LAST:event_setPromoButtonActionPerformed
 private void readNumbersFromFile() {
     String fileName="src\\musicsystem\\prices.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            String[] numberStrings = sb.toString().trim().split("\n");
            numbers = new double[numberStrings.length];
            for (int i = 0; i < numberStrings.length; i++) {
                numbers[i] = Double.parseDouble(numberStrings[i]);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Dosya okuma hatası: " + e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Geçersiz sayı formatı: " + e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void setPromo(){
        String lastPrices;
    double sayi;
    String filePath = "src\\musicsystem\\prices.txt"; 

            if((String) tunesComboBox.getSelectedItem()=="Tune 1"){
                   sayi=Double.parseDouble(newPriceField.getText());
                   numbers[0]=sayi;
        }
        if( (String) tunesComboBox.getSelectedItem()=="Tune 2"){
            sayi=Double.parseDouble(newPriceField.getText());
                   numbers[1]=sayi;
        }
        if((String) tunesComboBox.getSelectedItem()=="Tune 3"){
            sayi=Double.parseDouble(newPriceField.getText());
                   numbers[2]=sayi;
        }
        if((String) tunesComboBox.getSelectedItem()=="Tune 4"){
            sayi=Double.parseDouble(newPriceField.getText());
                   numbers[3]=sayi;
        }  
        
        
           
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            for (double a : numbers) {
                bw.write(String.valueOf(a)); 
                bw.newLine(); 
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Promotion Set Successfully!");
    }
    

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();

    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(settingPromotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(settingPromotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(settingPromotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(settingPromotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new settingPromotion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField newPriceField;
    private javax.swing.JButton setPromoButton;
    public javax.swing.JComboBox<String> tunesComboBox;
    // End of variables declaration//GEN-END:variables
}
