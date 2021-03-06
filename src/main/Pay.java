package main;

import java.util.*;
import java.util.stream.*;
import javax.swing.*;

public class Pay extends javax.swing.JFrame {

    /**
     * Creates new form Pay
     */
    private double totalPayment = 0;
    private String custID = "";
    private int counterNumber = 0;
    private int countItem = 0;

    public Pay(String custID, double totalPayment, int counterNumber, int countItem) {
        this.totalPayment = totalPayment;
        this.custID = custID;
        this.counterNumber = counterNumber;
        this.countItem = countItem;
        initComponents();
        pack();
        setLocationRelativeTo(null);

        paymenttitle.setText("Pay for customer " + custID + " counter " + counterNumber);
        totalNeedPaylabel.setText("Total: RM " + totalPayment);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        paymenttitle = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        amountpayfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        totalNeedPaylabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PAYMENT");

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));

        paymenttitle.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        paymenttitle.setForeground(new java.awt.Color(255, 255, 255));
        paymenttitle.setText("Payment");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(paymenttitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paymenttitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 102, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter amount (RM):");

        amountpayfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amountpayfield)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 322, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amountpayfield, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(255, 102, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Pay");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 102, 51));

        totalNeedPaylabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        totalNeedPaylabel.setForeground(new java.awt.Color(255, 255, 255));
        totalNeedPaylabel.setText("Total: RM 0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(totalNeedPaylabel)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totalNeedPaylabel)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        //PAY PROCESS HERE AND DISPLAY RECEIPT
        double amountpay = 0;
        try {
            amountpay = Double.parseDouble(amountpayfield.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter valid amount", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (amountpay < totalPayment) {
            JOptionPane.showMessageDialog(null, "Insufficient amount", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double balance = amountpay - totalPayment;

        //FIND CUSTOMER DATA IN QUEUE
        List<CustomerInformation> convertedCustList = null;
        if (counterNumber == 1) {
            convertedCustList = (List<CustomerInformation>) main.Main.getCounter1().stream().collect(Collectors.toList());
        } else if (counterNumber == 2) {
            convertedCustList = (List<CustomerInformation>) main.Main.getCounter2().stream().collect(Collectors.toList());
        } else if (counterNumber == 3) {
            convertedCustList = (List<CustomerInformation>) main.Main.getCounter3().stream().collect(Collectors.toList());
        }
        String custIC = "";
        String custName = "";
        for (Iterator iterator = convertedCustList.iterator(); iterator.hasNext();) {
            CustomerInformation nextCustomerData = (CustomerInformation) iterator.next();
            if (nextCustomerData.getCustID().equalsIgnoreCase(custID)) {
                custIC = nextCustomerData.getCustIC();
                custName = nextCustomerData.getCustName();
                break;
            }
        }

        //REMOVE CUSTOMER AND ITEM AFTER PAYMENT MADE AND ALSO SAVE LIST ITEM FOR RECEIPT DISPLAY
        Queue listItem = new LinkedList();
        for (int i = 0; i < countItem; i++) {
            if (counterNumber == 1) {
                CustomerInformation itemCurrent = (CustomerInformation) main.Main.getCounter1().peek();
                listItem.add(itemCurrent);
                main.Main.getCounter1().remove();
            } else if (counterNumber == 2) {
                CustomerInformation itemCurrent = (CustomerInformation) main.Main.getCounter2().peek();
                listItem.add(itemCurrent);
                main.Main.getCounter2().remove();
            } else if (counterNumber == 3) {
                CustomerInformation itemCurrent = (CustomerInformation) main.Main.getCounter3().peek();
                listItem.add(itemCurrent);
                main.Main.getCounter3().remove();
            }
        }

        //DISPLAY RECEIPT HERE
        Receipt receipt = new Receipt(custID, custIC, custName, totalPayment, amountpay, balance, listItem);
        receipt.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountpayfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel paymenttitle;
    private javax.swing.JLabel totalNeedPaylabel;
    // End of variables declaration//GEN-END:variables

}
