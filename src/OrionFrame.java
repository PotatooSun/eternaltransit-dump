import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OrionFrame extends JFrame {

   
    public OrionFrame() {
        initComponents();
         setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel124 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel125 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        balanga = new javax.swing.JCheckBox();
        orani = new javax.swing.JCheckBox();
        date = new javax.swing.JTextField();
        jLabel126 = new javax.swing.JLabel();
        mariveles = new javax.swing.JCheckBox();
        dinalupihan = new javax.swing.JCheckBox();
        min = new javax.swing.JButton();
        noPassenger = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        min1 = new javax.swing.JButton();
        add1 = new javax.swing.JButton();
        jLabel118 = new javax.swing.JLabel();
        Discount = new javax.swing.JTextField();
        payment = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        Booked = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();

        jLabel124.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel124.setText("~~ CURRENT LOCATION : ORANI ~~");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel97.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jPanel6.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 85, -1, -1));

        jLabel104.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(255, 255, 255));
        jLabel104.setText("DESTINATION : ");
        jPanel6.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 557, -1, -1));
        jPanel6.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 621, -1, -1));

        jLabel116.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(255, 255, 255));
        jLabel116.setText("PASSENGER'S NAME : ");
        jPanel6.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 515, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel96.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setText("DESTINATION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel96)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 440, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel125.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(255, 255, 255));
        jLabel125.setText(" CURRENT LOCATION : ORION ");
        jPanel2.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 20));

        jPanel6.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 410, 40));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel103.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setText("FARE");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 180, 40));

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel102.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setText("DESTINATION");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel102)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 180, 40));

        jPanel7.setBackground(new java.awt.Color(204, 255, 255));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel105.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel105.setText("Php 65.0");

        jLabel110.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel110.setText("Php 35.0");

        jLabel111.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel111.setText("Php 15.0");

        jLabel112.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel112.setText("Php 50.0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel111)
                        .addComponent(jLabel110)
                        .addComponent(jLabel105))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel112)
                        .addGap(1, 1, 1)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel105)
                .addGap(18, 18, 18)
                .addComponent(jLabel110)
                .addGap(18, 18, 18)
                .addComponent(jLabel111)
                .addGap(18, 18, 18)
                .addComponent(jLabel112)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 180, 180));

        jPanel8.setBackground(new java.awt.Color(204, 255, 255));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel106.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel106.setText("DINALUPIHAN");

        jLabel109.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel109.setText("ORANI");

        jLabel107.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel107.setText("BALANGA");

        jLabel108.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel108.setText("MARIVELES");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(jLabel106))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(jLabel109))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(jLabel107))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel106)
                .addGap(18, 18, 18)
                .addComponent(jLabel109)
                .addGap(21, 21, 21)
                .addComponent(jLabel107)
                .addGap(18, 18, 18)
                .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 180, 180));

        jPanel9.setBackground(new java.awt.Color(0, 153, 153));
        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel117.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(255, 255, 255));
        jLabel117.setText("20% DISCOUNT FOR SENIOR CITEZEN, PWD, and STUDENT");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel117)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel117)
                .addContainerGap())
        );

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 430, 40));

        jPanel10.setBackground(new java.awt.Color(0, 153, 153));

        jLabel114.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setText("Book Ticket");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel114)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(jLabel114))
        );

        jPanel6.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 120, 30));

        jPanel11.setBackground(new java.awt.Color(0, 153, 153));

        balanga.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        balanga.setText("Balanga");
        balanga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balangaActionPerformed(evt);
            }
        });

        orani.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        orani.setText("Orani");
        orani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oraniActionPerformed(evt);
            }
        });

        date.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        jLabel126.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(255, 255, 255));
        jLabel126.setText("DATE : ");

        mariveles.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        mariveles.setText("Mariveles");
        mariveles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marivelesActionPerformed(evt);
            }
        });

        dinalupihan.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        dinalupihan.setText("Dinalupihan");
        dinalupihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dinalupihanActionPerformed(evt);
            }
        });

        min.setText("-");
        min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minActionPerformed(evt);
            }
        });

        noPassenger.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        noPassenger.setText("0");
        noPassenger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noPassengerActionPerformed(evt);
            }
        });

        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        min1.setText("-");
        min1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                min1ActionPerformed(evt);
            }
        });

        add1.setText("+");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });

        jLabel118.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(255, 255, 255));
        jLabel118.setText("NO. OF PASSENGERS WITH DISCOUNT : ");

        Discount.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        Discount.setText("0");
        Discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscountActionPerformed(evt);
            }
        });

        payment.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel119.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(255, 255, 255));
        jLabel119.setText("NO. OF PASSENGERS : ");

        jLabel120.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(255, 255, 255));
        jLabel120.setText("PAYMENT: ");

        Booked.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        Booked.setText("Booked");
        Booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookedActionPerformed(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(balanga)
                                            .addComponent(orani))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(dinalupihan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(mariveles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel118)
                                    .addComponent(jLabel119))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(min1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Discount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(min)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(noPassenger, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(add1)
                                    .addComponent(add)))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(Clear)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Booked))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel120)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(61, 61, 61))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mariveles)
                    .addComponent(orani))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dinalupihan)
                    .addComponent(balanga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel126))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(min)
                        .addComponent(add)
                        .addComponent(jLabel119))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(noPassenger)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(min1)
                    .addComponent(add1)
                    .addComponent(jLabel118)
                    .addComponent(Discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel120))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Booked)
                    .addComponent(Clear))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 440, 290));

        jPanel12.setBackground(new java.awt.Color(204, 255, 255));
        jPanel12.setForeground(new java.awt.Color(204, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setBackground(new java.awt.Color(0, 153, 153));
        Exit.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel12.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jPanel6.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 790, 460, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void noPassengerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noPassengerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noPassengerActionPerformed

    private void DiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiscountActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        name.setText(" ");
        payment.setText(" ");
        noPassenger.setText("0");
        Discount.setText("0");
        date.setText(" ");
         mariveles.setSelected(false);
         balanga.setSelected(false);
          dinalupihan.setSelected(false);
          orani.setSelected(false);
    }//GEN-LAST:event_ClearActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu2().setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void BookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookedActionPerformed
        String passenger = name.getText().trim().toLowerCase();
        String datebook = date.getText().trim();
        String[] validChoices = {"Orani" , "orani", "Balanga", "balanga", "orion","Orion", "mariveles", "Mariveles"};

        String passWText = noPassenger.getText().trim();
        String passDText = Discount.getText().trim();
        String payText = payment.getText().trim();

       
        int passW = Integer.parseInt(passWText);
        int passD = Integer.parseInt(passDText);
        int pay = Integer.parseInt(payText);

        if (passenger.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill out Passenger's Name");
            return;
        } else if (passW == 0) {
            JOptionPane.showMessageDialog(null, "Please tell how many Passenger have Discount");
            return;
        } else if (passD == 0) {
            JOptionPane.showMessageDialog(null, "Please tell how many Passenger are you with");
            return;
        } else if (pay < 0) {
            JOptionPane.showMessageDialog(null, "Your payment please");
            return;
        }

         String location = "";
    if (mariveles.isSelected()) {
        location = "mariveles";
    } else if (balanga.isSelected()) {
        location = "balanga";
    } else if (orani.isSelected()) {
        location = "orani";
    } else if (dinalupihan.isSelected()) {
        location = "mariveles";
    } else {
        JOptionPane.showMessageDialog(null, "Please select a destination");
        return;
    } {
            int Pd = 0;
            int Ptotal = 0;
            int Ftotal = 0;
            int Dis = 0;
            int total = 0;
            int change = 0;

           
            int fare = 0;
            switch (location) {
                case "orani":
                fare = 35;
                break;
                case "dinalupihan":
                fare = 65;
                break;
                case "balanga":
                fare = 15;
                break;
                case "mariveles":
                fare = 50;
                break;
                default:
                
                break;
            }

            Pd = fare - (int) (fare * 0.20);
            Dis = passD * Pd;          
            Ptotal = passW - passD;
            Ftotal = Ptotal * fare; 
            total = Dis + Ftotal;      
            change = pay - total;     

           
            showResultsInPanel(passenger,datebook, location, fare, total, passW, passD, pay, change);
        }
        }

        private void showResultsInPanel(String passenger,String datebook, String location, int fare, int total, int passW, int passD, int pay, int change) {
            JPanel resultPanel = new JPanel();
            resultPanel.setLayout(new BoxLayout(resultPanel, BoxLayout.Y_AXIS));

            LocalDate date = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String formattedDate = date.format(formatter);
            resultPanel.add(new JLabel("Passenger's Name:  " + passenger.trim().toUpperCase()));
            resultPanel.add(new JLabel("          "));
            resultPanel.add(new JLabel("Passenger's Destination: " + location.trim().toUpperCase()));
            resultPanel.add(new JLabel("Booking Date: " + formattedDate));
            resultPanel.add(new JLabel("Date of trip: " + datebook));
            resultPanel.add(new JLabel("          "));
            resultPanel.add(new JLabel("Fare Price per Passenger: Php " + fare));
            resultPanel.add(new JLabel("No. of Passenger:  " + passW));
            resultPanel.add(new JLabel("No. of Passenger with Discount: " + passD));
            resultPanel.add(new JLabel("Total Fare Price:  Php " + total));
            resultPanel.add(new JLabel("PAY: Php " + pay));
            resultPanel.add(new JLabel("CHANGE: Php " + change));
            if (pay >= total) {
                resultPanel.add(new JLabel("STATUS:       PAID"));
                resultPanel.add(new JLabel("          "));
                resultPanel.add(new JLabel("          "));
                resultPanel.add(new JLabel("   THANK YOU FOR CHOOSING "));
                resultPanel.add(new JLabel("          "));
                resultPanel.add(new JLabel("          [ ETERNAL TRANSIT ]      "));
                resultPanel.add(new JLabel("          "));
                resultPanel.add(new JLabel("~~~~~~  SAVE TRAVEL!!!  ~~~~~~     "));
            } else {
                resultPanel.add(new JLabel("STATUS:       NOT PAID"));
                resultPanel.add(new JLabel("          "));
                resultPanel.add(new JLabel("          "));
                resultPanel.add(new JLabel("   THANK YOU FOR CHOOSING "));
                resultPanel.add(new JLabel("          "));
                resultPanel.add(new JLabel("          [ ETERNAL TRANSIT ]      "));
                resultPanel.add(new JLabel("          "));
                resultPanel.add(new JLabel("~~~~~~  SAVE TRAVEL!!!  ~~~~~~     "));
            }

            JOptionPane.showMessageDialog(null, resultPanel, "ETERNAL TRANSIT TICKET RECEIPT", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BookedActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
   
    }//GEN-LAST:event_dateActionPerformed

    private void balangaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balangaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balangaActionPerformed

    private void oraniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oraniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oraniActionPerformed

    private void marivelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marivelesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marivelesActionPerformed

    private void dinalupihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dinalupihanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dinalupihanActionPerformed

    private void minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minActionPerformed
        String passWText = noPassenger.getText().trim();
        int passW = Integer.parseInt(passWText);
        if (passW > 1) {
            int addpass = passW - 1;
            noPassenger.setText(String.valueOf(addpass));
        }
    }//GEN-LAST:event_minActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        String passWText = noPassenger.getText().trim();
        int passW = Integer.parseInt(passWText);
        int addpass = passW + 1;
        noPassenger.setText(String.valueOf(addpass));
    }//GEN-LAST:event_addActionPerformed

    private void min1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_min1ActionPerformed
        String passDText = Discount.getText().trim();
        int passD = Integer.parseInt(passDText);
        if (passD > 0) {
            int addpass = passD - 1;
            Discount.setText(String.valueOf(addpass));
        }
    }//GEN-LAST:event_min1ActionPerformed

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        String passDText = Discount.getText().trim();
        int passD = Integer.parseInt(passDText);
        int addpass = passD + 1;
        if (addpass <= Integer.parseInt(noPassenger.getText().trim())) {
            Discount.setText(String.valueOf(addpass));
        } else {
            JOptionPane.showMessageDialog(null, "Number of passengers with discount cannot be more than total number of passengers");
        }
    }//GEN-LAST:event_add1ActionPerformed

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
            java.util.logging.Logger.getLogger(OrionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Booked;
    private javax.swing.JButton Clear;
    private javax.swing.JTextField Discount;
    private javax.swing.JButton Exit;
    private javax.swing.JButton add;
    private javax.swing.JButton add1;
    private javax.swing.JCheckBox balanga;
    private javax.swing.JTextField date;
    private javax.swing.JCheckBox dinalupihan;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JCheckBox mariveles;
    private javax.swing.JButton min;
    private javax.swing.JButton min1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField noPassenger;
    private javax.swing.JCheckBox orani;
    private javax.swing.JTextField payment;
    // End of variables declaration//GEN-END:variables
}
