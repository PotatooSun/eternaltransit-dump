import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BalangaFrame extends JFrame {

    
    public BalangaFrame() {
        initComponents();
         setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        jLabel115 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel181 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel182 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        Clear = new javax.swing.JButton();
        Booked = new javax.swing.JButton();
        payment = new javax.swing.JTextField();
        jLabel120 = new javax.swing.JLabel();
        Discount = new javax.swing.JTextField();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        noPassenger = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        jLabel125 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        dinalupihan = new javax.swing.JCheckBox();
        mariveles = new javax.swing.JCheckBox();
        orani = new javax.swing.JCheckBox();
        orion = new javax.swing.JCheckBox();
        min = new javax.swing.JButton();
        add = new javax.swing.JButton();
        min1 = new javax.swing.JButton();
        add1 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 625, -1, -1));

        jPanel17.setBackground(new java.awt.Color(204, 255, 255));

        jPanel18.setBackground(new java.awt.Color(0, 153, 153));
        jPanel18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel181.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel181.setForeground(new java.awt.Color(255, 255, 255));
        jLabel181.setText("DESTINATION");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel181)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel181, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, -1));

        jPanel19.setBackground(new java.awt.Color(0, 153, 153));
        jPanel19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel182.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel182.setForeground(new java.awt.Color(255, 255, 255));
        jLabel182.setText(" CURRENT LOCATION : BALANGA ");
        jPanel19.add(jLabel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 20));

        jPanel6.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 410, 40));

        jPanel20.setBackground(new java.awt.Color(0, 153, 153));
        jPanel20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel103.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setText("FARE");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 180, 40));

        jPanel21.setBackground(new java.awt.Color(0, 153, 153));
        jPanel21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel102.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setText("DESTINATION");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel102)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 180, 40));

        jPanel22.setBackground(new java.awt.Color(204, 255, 255));
        jPanel22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel105.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel105.setText("Php 45.0");

        jLabel110.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel110.setText("Php 25.0");

        jLabel111.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel111.setText("Php 15.0");

        jLabel112.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel112.setText("Php 80.0");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel111)
                        .addComponent(jLabel110)
                        .addComponent(jLabel105))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel112)
                        .addGap(1, 1, 1)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
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

        jPanel6.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 180, 180));

        jPanel23.setBackground(new java.awt.Color(204, 255, 255));
        jPanel23.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel106.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel106.setText("DINALUPIHAN");

        jLabel109.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel109.setText("ORANI");

        jLabel107.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel107.setText("ORION");

        jLabel108.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel108.setText("MARIVELES");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel23Layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(jLabel106))
                        .addGroup(jPanel23Layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel107)
                                .addComponent(jLabel109)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel106)
                .addGap(18, 18, 18)
                .addComponent(jLabel109)
                .addGap(21, 21, 21)
                .addComponent(jLabel107)
                .addGap(18, 18, 18)
                .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 180, 180));

        jPanel24.setBackground(new java.awt.Color(0, 153, 153));

        jLabel117.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(255, 255, 255));
        jLabel117.setText("Book Ticket");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel117)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(jLabel117))
        );

        jPanel6.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 120, 30));

        jPanel25.setBackground(new java.awt.Color(0, 153, 153));
        jPanel25.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel123.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(255, 255, 255));
        jLabel123.setText("20% DISCOUNT FOR SENIOR CITEZEN, PWD, and STUDENT");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel123)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel123)
                .addContainerGap())
        );

        jPanel6.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 400, 40));

        jPanel26.setBackground(new java.awt.Color(0, 153, 153));

        Clear.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Booked.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        Booked.setText("Booked");
        Booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookedActionPerformed(evt);
            }
        });

        payment.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });

        jLabel120.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(255, 255, 255));
        jLabel120.setText("PAYMENT: ");

        Discount.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        Discount.setText("0");
        Discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscountActionPerformed(evt);
            }
        });

        jLabel118.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(255, 255, 255));
        jLabel118.setText("NO. OF PASSENGERS WITH DISCOUNT : ");

        jLabel119.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(255, 255, 255));
        jLabel119.setText("NO. OF PASSENGERS : ");

        noPassenger.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        noPassenger.setText("0");
        noPassenger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noPassengerActionPerformed(evt);
            }
        });

        date.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        jLabel125.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(255, 255, 255));
        jLabel125.setText("DATE : ");

        jLabel104.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(255, 255, 255));
        jLabel104.setText("DESTINATION : ");

        jLabel116.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(255, 255, 255));
        jLabel116.setText("PASSENGER'S NAME : ");

        name.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        dinalupihan.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        dinalupihan.setText("Dinalupihan");
        dinalupihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dinalupihanActionPerformed(evt);
            }
        });

        mariveles.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        mariveles.setText("Mariveles");
        mariveles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marivelesActionPerformed(evt);
            }
        });

        orani.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        orani.setText("Orani");
        orani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oraniActionPerformed(evt);
            }
        });

        orion.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        orion.setText("Orion");
        orion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orionActionPerformed(evt);
            }
        });

        min.setText("-");
        min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                                .addComponent(Clear)
                                .addGap(18, 18, 18)
                                .addComponent(Booked))
                            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel26Layout.createSequentialGroup()
                                    .addComponent(jLabel120)
                                    .addGap(18, 18, 18)
                                    .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel26Layout.createSequentialGroup()
                                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel119)
                                        .addComponent(jLabel118))
                                    .addGap(11, 11, 11)
                                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(min)
                                        .addComponent(min1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel26Layout.createSequentialGroup()
                                            .addComponent(noPassenger, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(add))
                                        .addGroup(jPanel26Layout.createSequentialGroup()
                                            .addComponent(Discount, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(add1))))))
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel116)
                            .addComponent(jLabel125)
                            .addComponent(jLabel104))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(name)
                                .addGroup(jPanel26Layout.createSequentialGroup()
                                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dinalupihan)
                                        .addComponent(mariveles))
                                    .addGap(27, 27, 27)
                                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(orion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(orani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(93, 93, 93))))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dinalupihan)
                            .addComponent(orani))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mariveles)
                            .addComponent(orion))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel104)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel125))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noPassenger, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel119)
                    .addComponent(min)
                    .addComponent(add))
                .addGap(17, 17, 17)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel118)
                    .addComponent(Discount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(min1)
                    .addComponent(add1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel120))
                .addGap(18, 18, 18)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Booked)
                    .addComponent(Clear))
                .addGap(34, 34, 34))
        );

        jPanel6.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 440, 330));

        jPanel27.setBackground(new java.awt.Color(204, 255, 255));
        jPanel27.setForeground(new java.awt.Color(204, 255, 255));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setBackground(new java.awt.Color(0, 153, 153));
        Exit.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel27.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jPanel6.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 830, 440, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        orani.setSelected(false);
         dinalupihan.setSelected(false);
          mariveles.setSelected(false);
          orion.setSelected(false);
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
    if (orani.isSelected()) {
        location = "orani";
    } else if (dinalupihan.isSelected()) {
        location = "dinalupihan";
    } else if (orion.isSelected()) {
        location = "orion";
    } else if (mariveles.isSelected()) {
        location = "mariveles";
    } else {
        JOptionPane.showMessageDialog(null, "Please select a destination");
        return;
    }
        
            {
            int Pd = 0;
            int Ptotal = 0;
            int Ftotal = 0;
            int Dis = 0;
            int total = 0;
            int change = 0;

            
            int fare = 0;
            switch (location) {
                case "orani":
                fare = 25;
                break;
                case "dinalupihan":
                fare = 45;
                break;
                case "orion":
                fare = 15;
                break;
                case "mariveles":
                fare = 80;
                break;
                case "Orani":
                fare = 25;
                break;
                case "Dinalupihan":
                fare = 45;
                break;
                case "Orion":
                fare = 15;
                break;
                case "Mariveles":
                fare = 80;
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

        private void showResultsInPanel(String passenger, String datebook, String location, int fare, int total, int passW, int passD, int pay, int change) {
            JPanel resultPanel = new JPanel();
            resultPanel.setLayout(new BoxLayout(resultPanel, BoxLayout.Y_AXIS));

            LocalDate date = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String formattedDate = date.format(formatter);
            resultPanel.add(new JLabel("Passenger's Name:  " + passenger.trim().toUpperCase()));
            resultPanel.add(new JLabel("          "));
            resultPanel.add(new JLabel("Passenger's Destination: " + location.trim().toUpperCase()));
            resultPanel.add(new JLabel("Booking Date: " + formattedDate));
            resultPanel.add(new JLabel("Date of Trip: " + datebook));
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

    private void dinalupihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dinalupihanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dinalupihanActionPerformed

    private void marivelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marivelesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marivelesActionPerformed

    private void oraniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oraniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oraniActionPerformed

    private void orionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orionActionPerformed

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

    private void min1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_min1ActionPerformed
         String passDText = Discount.getText().trim();
    int passD = Integer.parseInt(passDText);
    if (passD > 0) {
        int addpass = passD - 1;
        Discount.setText(String.valueOf(addpass));
    }
    }//GEN-LAST:event_min1ActionPerformed

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
            java.util.logging.Logger.getLogger(BalangaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BalangaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BalangaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BalangaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BalangaFrame().setVisible(true);
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
    private javax.swing.ButtonGroup buttonGroup1;
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
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JCheckBox mariveles;
    private javax.swing.JButton min;
    private javax.swing.JButton min1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField noPassenger;
    private javax.swing.JCheckBox orani;
    private javax.swing.JCheckBox orion;
    private javax.swing.JTextField payment;
    // End of variables declaration//GEN-END:variables
}
