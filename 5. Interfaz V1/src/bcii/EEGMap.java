/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcii;

/**
 *
 * @author Lily
 */
public class EEGMap extends javax.swing.JFrame {

    /**
     * Creates new form EEGMap
     */    
    String def = "/Interfaz/boton_vacio.png";
    String[] bot = {"/Interfaz/boton_amarillo.png", "/Interfaz/boton_azul.png", "/Interfaz/boton_morado.png", "/Interfaz/boton_naranja.png", "/Interfaz/boton_rojo.png",
        "/Interfaz/boton_rosa.png", "/Interfaz/boton_verde.png"};
    int color = 7;
    int total = 21;
    int cont = 0;
    int[] botones = new int[total];
            
            
    public EEGMap() {
        initComponents();
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/boton_vacio.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(250, 170, 53, 60);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/boton_vacio.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(260, 90, 53, 60);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/boton_vacio.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(260, 90, 53, 60);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/boton_vacio.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(390, 90, 53, 60);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/boton_vacio.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(480, 160, 53, 60);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/boton_vacio.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(170, 160, 53, 60);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/boton_vacio.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(320, 170, 53, 60);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/boton_vacio.png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(400, 170, 53, 60);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/boton_vacio.png"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(60, 260, 53, 60);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/boton_vacio.png"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(130, 270, 53, 60);

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/boton_vacio.png"))); // NOI18N
        jButton13.setBorder(null);
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);
        jButton13.setBounds(230, 270, 53, 60);

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/boton_vacio.png"))); // NOI18N
        jButton14.setBorder(null);
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);
        jButton14.setBounds(320, 270, 53, 60);

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/boton_vacio.png"))); // NOI18N
        jButton15.setBorder(null);
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);
        jButton15.setBounds(420, 270, 53, 60);

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/boton_vacio.png"))); // NOI18N
        jButton16.setBorder(null);
        jButton16.setBorderPainted(false);
        jButton16.setContentAreaFilled(false);
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);
        jButton16.setBounds(510, 270, 53, 60);

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/boton_vacio.png"))); // NOI18N
        jButton17.setBorder(null);
        jButton17.setBorderPainted(false);
        jButton17.setContentAreaFilled(false);
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17);
        jButton17.setBounds(590, 260, 53, 60);

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/boton_vacio.png"))); // NOI18N
        jButton18.setBorder(null);
        jButton18.setBorderPainted(false);
        jButton18.setContentAreaFilled(false);
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18);
        jButton18.setBounds(170, 380, 53, 60);

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/boton_vacio.png"))); // NOI18N
        jButton19.setBorder(null);
        jButton19.setBorderPainted(false);
        jButton19.setContentAreaFilled(false);
        jButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19);
        jButton19.setBounds(250, 370, 53, 60);

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/boton_vacio.png"))); // NOI18N
        jButton20.setBorder(null);
        jButton20.setBorderPainted(false);
        jButton20.setContentAreaFilled(false);
        jButton20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton20);
        jButton20.setBounds(330, 370, 53, 60);

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/boton_vacio.png"))); // NOI18N
        jButton21.setBorder(null);
        jButton21.setBorderPainted(false);
        jButton21.setContentAreaFilled(false);
        jButton21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton21);
        jButton21.setBounds(400, 360, 53, 60);

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/boton_vacio.png"))); // NOI18N
        jButton22.setBorder(null);
        jButton22.setBorderPainted(false);
        jButton22.setContentAreaFilled(false);
        jButton22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton22);
        jButton22.setBounds(480, 380, 53, 60);

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/boton_vacio.png"))); // NOI18N
        jButton23.setBorder(null);
        jButton23.setBorderPainted(false);
        jButton23.setContentAreaFilled(false);
        jButton23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton23);
        jButton23.setBounds(260, 450, 53, 60);

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/boton_vacio.png"))); // NOI18N
        jButton24.setBorder(null);
        jButton24.setBorderPainted(false);
        jButton24.setContentAreaFilled(false);
        jButton24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton24);
        jButton24.setBounds(380, 450, 53, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/EggMap.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 20, 610, 550);

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ok");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(0, 36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int numId = 0;
        if(botones[numId] == 0)
        {
            botones[numId]++;
            String icon = bot[(int) (Math.random() * color)];
            jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon))); // NOI18N
        }      
        else
        {
            botones[numId] = 0;
            jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(def))); // NOI18N
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String id = "Fp1";
        int numId = 1;
        if(botones[numId] == 0)
        {
            botones[numId]++;
            String icon = bot[(int) (Math.random() * color)];
            jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon))); // NOI18N
        }      
        else
        {
            botones[numId] = 0;
            jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource(def))); // NOI18N
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int numId = 2;
        if(botones[numId] == 0)
        {
            botones[numId]++;
            String icon = bot[(int) (Math.random() * color)];
            jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon))); // NOI18N
        }      
        else
        {
            botones[numId] = 0;
            jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource(def))); // NOI18N
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int numId = 3;
        if(botones[numId] == 0)
        {
            botones[numId]++;
            String icon = bot[(int) (Math.random() * color)];
            jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon))); // NOI18N
        }      
        else
        {
            botones[numId] = 0;
            jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource(def))); // NOI18N
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int numId = 4;
        if(botones[numId] == 0)
        {
            botones[numId]++;
            String icon = bot[(int) (Math.random() * color)];
            jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon))); // NOI18N
        }      
        else
        {
            botones[numId] = 0;
            jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource(def))); // NOI18N
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int numId = 5;
        if(botones[numId] == 0)
        {
            botones[numId]++;
            String icon = bot[(int) (Math.random() * color)];
            jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon))); // NOI18N
        }      
        else
        {
            botones[numId] = 0;
            jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource(def))); // NOI18N
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int numId = 6;
        if(botones[numId] == 0)
        {
            botones[numId]++;
            String icon = bot[(int) (Math.random() * color)];
            jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon))); // NOI18N
        }      
        else
        {
            botones[numId] = 0;
            jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource(def))); // NOI18N
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int numId = 7;
        if(botones[numId] == 0)
        {
            botones[numId]++;
            String icon = bot[(int) (Math.random() * color)];
            jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon))); // NOI18N
        }      
        else
        {
            botones[numId] = 0;
            jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource(def))); // NOI18N
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        int numId = 8;
        if(botones[numId] == 0)
        {
            botones[numId]++;
            String icon = bot[(int) (Math.random() * color)];
            jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon))); // NOI18N
        }      
        else
        {
            botones[numId] = 0;
            jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource(def))); // NOI18N
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        int numId = 9;
        if(botones[numId] == 0)
        {
            botones[numId]++;
            String icon = bot[(int) (Math.random() * color)];
            jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon))); // NOI18N
        }      
        else
        {
            botones[numId] = 0;
            jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource(def))); // NOI18N
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        int numId = 10;
        if(botones[numId] == 0)
        {
            botones[numId]++;
            String icon = bot[(int) (Math.random() * color)];
            jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon))); // NOI18N
        }      
        else
        {
            botones[numId] = 0;
            jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource(def))); // NOI18N
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        int numId = 11;
        if(botones[numId] == 0)
        {
            botones[numId]++;
            String icon = bot[(int) (Math.random() * color)];
            jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon))); // NOI18N
        }      
        else
        {
            botones[numId] = 0;
            jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource(def))); // NOI18N
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        int numId = 12;
        if(botones[numId] == 0)
        {
            botones[numId]++;
            String icon = bot[(int) (Math.random() * color)];
            jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon))); // NOI18N
        }      
        else
        {
            botones[numId] = 0;
            jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource(def))); // NOI18N
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        int numId = 13;
        if(botones[numId] == 0)
        {
            botones[numId]++;
            String icon = bot[(int) (Math.random() * color)];
            jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon))); // NOI18N
        }      
        else
        {
            botones[numId] = 0;
            jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource(def))); // NOI18N
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        int numId = 14;
        if(botones[numId] == 0)
        {
            botones[numId]++;
            String icon = bot[(int) (Math.random() * color)];
            jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon))); // NOI18N
        }      
        else
        {
            botones[numId] = 0;
            jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource(def))); // NOI18N
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        int numId = 15;
        if(botones[numId] == 0)
        {
            botones[numId]++;
            String icon = bot[(int) (Math.random() * color)];
            jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon))); // NOI18N
        }      
        else
        {
            botones[numId] = 0;
            jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource(def))); // NOI18N
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        int numId = 15;
        if(botones[numId] == 0)
        {
            botones[numId]++;
            String icon = bot[(int) (Math.random() * color)];
            jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon))); // NOI18N
        }      
        else
        {
            botones[numId] = 0;
            jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource(def))); // NOI18N
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        int numId = 16;
        if(botones[numId] == 0)
        {
            botones[numId]++;
            String icon = bot[(int) (Math.random() * color)];
            jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon))); // NOI18N
        }      
        else
        {
            botones[numId] = 0;
            jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource(def))); // NOI18N
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        int numId = 17;
        if(botones[numId] == 0)
        {
            botones[numId]++;
            String icon = bot[(int) (Math.random() * color)];
            jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon))); // NOI18N
        }      
        else
        {
            botones[numId] = 0;
            jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource(def))); // NOI18N
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        int numId = 18;
        if(botones[numId] == 0)
        {
            botones[numId]++;
            String icon = bot[(int) (Math.random() * color)];
            jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon))); // NOI18N
        }      
        else
        {
            botones[numId] = 0;
            jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource(def))); // NOI18N
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        int numId = 19;
        if(botones[numId] == 0)
        {
            botones[numId]++;
            String icon = bot[(int) (Math.random() * color)];
            jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon))); // NOI18N
        }      
        else
        {
            botones[numId] = 0;
            jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource(def))); // NOI18N
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        int numId = 20;
        if(botones[numId] == 0)
        {
            botones[numId]++;
            String icon = bot[(int) (Math.random() * color)];
            jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource(icon))); // NOI18N
        }      
        else
        {
            botones[numId] = 0;
            jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource(def))); // NOI18N
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        obtenerCanales();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(EEGMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EEGMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EEGMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EEGMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EEGMap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    private void obtenerCanales() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
