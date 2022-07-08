package main;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class CounterChoose extends javax.swing.JFrame {

    //ASSIGN CUSTOMER TO COUNTER LIST QUEUE FOR TEMPORARY LIST WITHOUT COUNTER NUMBER
    private ArrayList<CustomerInformation> customerList = new ArrayList();
    private ArrayList<String> listCustID = new ArrayList<String>();

    public CounterChoose() {
        initComponents();
        pack();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Counter Selector");

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HyperMarket");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 102, 51));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Counter 1");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Display Data");
        jButton1.setEnabled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 102, 51));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Counter 2");

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Display Data");
        jButton2.setEnabled(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 102, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Counter 3");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("for customer that have more than 5 items");

        jButton3.setBackground(new java.awt.Color(51, 0, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Display Data");
        jButton3.setEnabled(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(0, 158, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton4.setBackground(new java.awt.Color(255, 102, 51));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Import Data");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 102, 51));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Pay");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton5MouseReleased(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 102, 51));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("List Item");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton6MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        if (!jButton1.isEnabled()) {
            return;
        }
        System.out.println("Counter 1");
        displayCustomer(main.Main.getCounter1());
        System.out.println("\n\n");
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
        if (!jButton2.isEnabled()) {
            return;
        }
        System.out.println("Counter 2");
        displayCustomer(main.Main.getCounter2());
        System.out.println("\n\n");
    }//GEN-LAST:event_jButton2MouseReleased

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        if (!jButton3.isEnabled()) {
            return;
        }
        System.out.println("Counter 3");
        displayCustomer(main.Main.getCounter3());
        System.out.println("\n\n");
    }//GEN-LAST:event_jButton3MouseReleased

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased
        if (!jButton4.isEnabled()) {
            return;
        }
        //1. READ TEXTFILE AND ADD TO TEMPORARY ARRAY
        try {
            BufferedReader filetxtbr = new BufferedReader(new FileReader("CustomerDataInformation.txt"));
            String line = filetxtbr.readLine();

            String currentCustID = "";

            while (line != null) {
                //READ DATA EACH LINE
                StringTokenizer st = new StringTokenizer(line, ",");
                String customerID = st.nextToken();
                String customerIC = st.nextToken();
                String customerName = st.nextToken();
                String itemID = st.nextToken();
                String itemName = st.nextToken();
                double itemPrice = Double.parseDouble(st.nextToken());
                String datePurchase = st.nextToken();
                if (!customerID.equalsIgnoreCase(currentCustID)) {
                    listCustID.add(customerID);
                    currentCustID = customerID;
                }

                customerList.add(new CustomerInformation(customerID, customerIC, customerName, null, itemID, itemName, itemPrice, datePurchase));

                line = filetxtbr.readLine();
            }
            filetxtbr.close();

            //ADD CUSTOMER TO QUEUE
            int counterswitching = 1;
            for (int i = 0; i < listCustID.size(); i++) {
                List filtereditemcustomer = filteritemdatacust(listCustID.get(i));

                if (filtereditemcustomer.size() <= 5) {
                    if (counterswitching == 1) {
                        for (int j = 0; j < filtereditemcustomer.size(); j++) {
                            CustomerInformation itemdata = (CustomerInformation) filtereditemcustomer.get(j);
                            String custID = itemdata.getCustID();
                            String custIC = itemdata.getCustIC();
                            String custName = itemdata.getCustName();
                            String itemID = itemdata.getItemID();
                            String itemName = itemdata.getItemName();
                            Double itemPrice = itemdata.getitemPrice();
                            String datePurchased = itemdata.getDatePurchase();

                            main.Main.getCounter1().add(new CustomerInformation(custID, custIC, custName, "counter1", itemID, itemName, itemPrice, datePurchased));
                        }
                        counterswitching = 2;
                    } else if (counterswitching == 2) {
                        for (int j = 0; j < filtereditemcustomer.size(); j++) {
                            CustomerInformation itemdata = (CustomerInformation) filtereditemcustomer.get(j);
                            String custID = itemdata.getCustID();
                            String custIC = itemdata.getCustIC();
                            String custName = itemdata.getCustName();
                            String itemID = itemdata.getItemID();
                            String itemName = itemdata.getItemName();
                            Double itemPrice = itemdata.getitemPrice();
                            String datePurchased = itemdata.getDatePurchase();

                            main.Main.getCounter2().add(new CustomerInformation(custID, custIC, custName, "counter2", itemID, itemName, itemPrice, datePurchased));

                        }
                        counterswitching = 1;
                    }
                } else {
                    for (int j = 0; j < filtereditemcustomer.size(); j++) {
                        CustomerInformation itemdata = (CustomerInformation) filtereditemcustomer.get(j);
                        String custID = itemdata.getCustID();
                        String custIC = itemdata.getCustIC();
                        String custName = itemdata.getCustName();
                        String itemID = itemdata.getItemID();
                        String itemName = itemdata.getItemName();
                        Double itemPrice = itemdata.getitemPrice();
                        String datePurchased = itemdata.getDatePurchase();

                        main.Main.getCounter3().add(new CustomerInformation(custID, custIC, custName, "counter3", itemID, itemName, itemPrice, datePurchased));

                    }
                }
            }

            JOptionPane.showMessageDialog(null, "Successfully import data", "Done", JOptionPane.INFORMATION_MESSAGE);
            jButton1.setEnabled(true);
            jButton2.setEnabled(true);
            jButton3.setEnabled(true);
            jButton4.setEnabled(false);

        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4MouseReleased

    public List filteritemdatacust(String custID) {
        Predicate<CustomerInformation> itemSelectCondition = itemsCond -> itemsCond.getCustID().equalsIgnoreCase(custID);
        List itemsCustomer = customerList.stream().filter(itemSelectCondition).collect(Collectors.toList());
        return itemsCustomer;
    }

    private void displayCustomer(Queue counter) {
        String currentCustID = "";
        //TO CONVERT, NEED TO FILTER CUSTOMER ONLY AND ADD TO NEW LIST
        List<CustomerInformation> convertedCustList = (List<CustomerInformation>) counter.stream().collect(Collectors.toList());

        int custCount = 0;

        for (Iterator iterator = convertedCustList.iterator(); iterator.hasNext();) {
            CustomerInformation nextCustomerData = (CustomerInformation) iterator.next();
            if (!nextCustomerData.getCustID().equalsIgnoreCase(currentCustID)) {
                currentCustID = nextCustomerData.getCustID();
                custCount++;
                System.out.println("Name: " + nextCustomerData.getCustName() + "   IC: " + nextCustomerData.getCustIC() + "   ID: " + nextCustomerData.getCustID());
            }
        }
    }

    private void displayItem(int counterNumber, String custID) {
        double totalPayment = 0;
        //organize customer based on the items they bought
        List<CustomerInformation> convertedItemList = null;
        List<CustomerInformation> filteredItemListCust = null;
        if (counterNumber == 1) {
            convertedItemList = (List<CustomerInformation>) main.Main.getCounter1().stream().collect(Collectors.toList());
            filteredItemListCust = convertedItemList.stream().filter(items -> items.getCustID().equalsIgnoreCase(custID)).collect(Collectors.toList());
        } else if (counterNumber == 2) {
            convertedItemList = (List<CustomerInformation>) main.Main.getCounter2().stream().collect(Collectors.toList());
            filteredItemListCust = convertedItemList.stream().filter(items -> items.getCustID().equalsIgnoreCase(custID)).collect(Collectors.toList());
        } else if (counterNumber == 3) {
            convertedItemList = (List<CustomerInformation>) main.Main.getCounter3().stream().collect(Collectors.toList());
            filteredItemListCust = convertedItemList.stream().filter(items -> items.getCustID().equalsIgnoreCase(custID)).collect(Collectors.toList());
        }

        System.out.println("List Items For Customer: " + custID);
        for (Iterator iterator = filteredItemListCust.iterator(); iterator.hasNext();) {
            CustomerInformation nextItemData = (CustomerInformation) iterator.next();
            //ALSO CALCULATE TOTAL PAYMENT HERE
            totalPayment = totalPayment + nextItemData.getitemPrice();
            System.out.println("ID: " + nextItemData.getItemID() + "  Name: " + nextItemData.getItemName() + "  Price: " + "RM " + nextItemData.getitemPrice() + "  Date Purchased: " + nextItemData.getDatePurchase());
        }
        System.out.println("\n\n");
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private Pay paymentui;
    private void jButton5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseReleased
        //PAY PROCESS HERE
        Object[] options = {"Counter 1", "Counter 2", "Counter 3"};
        int CounterChoose = JOptionPane.showOptionDialog(null, "Select counter to pay", "Payment", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
        //PAY PROCESS HERE
        if (paymentui == null) {
            //GET WHO FIRST QUEUE OF CUSTOMER
            int counterNumber = (CounterChoose + 1);
            CustomerInformation datacust = null;
            if (counterNumber == 1) {
                datacust = (CustomerInformation) main.Main.getCounter1().peek();
            } else if (counterNumber == 2) {
                datacust = (CustomerInformation) main.Main.getCounter2().peek();
            } else if (counterNumber == 3) {
                datacust = (CustomerInformation) main.Main.getCounter3().peek();
            }
            if (datacust == null) {
                JOptionPane.showMessageDialog(null, "No customer queue to pay", "No customer", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String custIDPay = datacust.getCustID();
            double totalPayment = 0;

            List<CustomerInformation> convertedItemList = null;
            List<CustomerInformation> filteredItemListCust = null;
            if (counterNumber == 1) {
                convertedItemList = (List<CustomerInformation>) main.Main.getCounter1().stream().collect(Collectors.toList());
                filteredItemListCust = convertedItemList.stream().filter(items -> items.getCustID().equalsIgnoreCase(custIDPay)).collect(Collectors.toList());
            } else if (counterNumber == 2) {
                convertedItemList = (List<CustomerInformation>) main.Main.getCounter2().stream().collect(Collectors.toList());
                filteredItemListCust = convertedItemList.stream().filter(items -> items.getCustID().equalsIgnoreCase(custIDPay)).collect(Collectors.toList());
            } else if (counterNumber == 3) {
                convertedItemList = (List<CustomerInformation>) main.Main.getCounter3().stream().collect(Collectors.toList());
                filteredItemListCust = convertedItemList.stream().filter(items -> items.getCustID().equalsIgnoreCase(custIDPay)).collect(Collectors.toList());
            }

            int countitem = 0;
            for (Iterator iterator = filteredItemListCust.iterator(); iterator.hasNext();) {
                CustomerInformation nextItemData = (CustomerInformation) iterator.next();
                countitem++;
                //CALCULATE TOTAL PAYMENT HERE
                totalPayment = totalPayment + nextItemData.getitemPrice();
            }

            paymentui = new Pay(custIDPay, totalPayment, counterNumber, countitem);
            paymentui.setVisible(true);
            paymentui.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    paymentui = null;
                }

            });
        } else {
            paymentui.setVisible(true);
            JOptionPane.showMessageDialog(null, "Please complete this customer payment before make another payment", "Alert payment", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton5MouseReleased

    private void jButton6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseReleased
        //DISPLAY ITEM HERE
        Object[] options = {"Counter 1", "Counter 2", "Counter 3"};
        int CounterChoose = JOptionPane.showOptionDialog(null, "Select counter to pay", "show item", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
        String custID = JOptionPane.showInputDialog("ENTER CUSTOMER ID: ");
        displayItem((CounterChoose + 1), custID);
    }//GEN-LAST:event_jButton6MouseReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

}
