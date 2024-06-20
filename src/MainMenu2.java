
public class MainMenu2 extends javax.swing.JFrame {

    public MainMenu2() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        orion = new javax.swing.JButton();
        dinalupihan = new javax.swing.JButton();
        orani = new javax.swing.JButton();
        mariveles = new javax.swing.JButton();
        balanga = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Sitka Text", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TO");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 50, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_2024-06-16_231705411-removebg-preview.png"))); // NOI18N
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -20, 410, 220));

        jLabel22.setFont(new java.awt.Font("Sitka Text", 3, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("ETERNAL TRANSIT");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 350, -1));

        jLabel23.setFont(new java.awt.Font("Sitka Text", 3, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("WELCOME");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 190, 50));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 570, -1));

        jPanel9.setBackground(new java.awt.Color(204, 255, 255));
        jPanel9.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(" ~MENU~ ");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jPanel9.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, 40));

        orion.setBackground(new java.awt.Color(153, 255, 255));
        orion.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        orion.setText("ORION");
        orion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orionActionPerformed(evt);
            }
        });
        jPanel9.add(orion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 160, 30));

        dinalupihan.setBackground(new java.awt.Color(153, 255, 255));
        dinalupihan.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        dinalupihan.setText("DINALUPIHAN");
        dinalupihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dinalupihanActionPerformed(evt);
            }
        });
        jPanel9.add(dinalupihan, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 160, 30));

        orani.setBackground(new java.awt.Color(153, 255, 255));
        orani.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        orani.setText("ORANI");
        orani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oraniActionPerformed(evt);
            }
        });
        jPanel9.add(orani, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 160, 30));

        mariveles.setBackground(new java.awt.Color(153, 255, 255));
        mariveles.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        mariveles.setText("MARIVELES");
        mariveles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marivelesActionPerformed(evt);
            }
        });
        jPanel9.add(mariveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 160, 30));

        balanga.setBackground(new java.awt.Color(153, 255, 255));
        balanga.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        balanga.setText("BALANGA");
        balanga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balangaActionPerformed(evt);
            }
        });
        jPanel9.add(balanga, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 160, 30));

        jLabel1.setFont(new java.awt.Font("Monospaced", 2, 12)); // NOI18N
        jLabel1.setText("NOTE: PRESS CURENT LOCATION");
        jPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 200, -1));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel2.setText("~~  ~~  ~~  ~~  ~~  ~~  ~~  ~~  ~~  ~~  ~~  ~~  ~~  ~~  ~~ ");
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 480, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel4.setText("~~  ~~  ~~  ~~  ~~  ~~  ~~  ~~  ~~  ~~  ~~  ~~  ~~  ~~  ~~ ");
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 480, -1));

        Exit.setBackground(new java.awt.Color(0, 153, 153));
        Exit.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Exit)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Exit)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dinalupihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dinalupihanActionPerformed
        new DinalupihanFrames().setVisible(true);
                dispose();
    }//GEN-LAST:event_dinalupihanActionPerformed

    private void oraniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oraniActionPerformed
        new OraniFrame().setVisible(true);
                dispose();
    }//GEN-LAST:event_oraniActionPerformed

    private void balangaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balangaActionPerformed
        new BalangaFrame().setVisible(true);
                dispose();
    }//GEN-LAST:event_balangaActionPerformed

    private void orionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orionActionPerformed
        new OrionFrame().setVisible(true);
                dispose();
    }//GEN-LAST:event_orionActionPerformed

    private void marivelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marivelesActionPerformed
        new MarivelesFrame().setVisible(true);
                dispose();
    }//GEN-LAST:event_marivelesActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton balanga;
    private javax.swing.JButton dinalupihan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton mariveles;
    private javax.swing.JButton orani;
    private javax.swing.JButton orion;
    // End of variables declaration//GEN-END:variables
}
