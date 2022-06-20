/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kalkulatori;

/**
 *
 * @author EndritG
 */
public class Kalkulatori extends javax.swing.JFrame {

    /**
     * Creates new form Kalkulatori
     */
    
    
    double num,ans;
    int calculation; 
           
                 
            
            
    public Kalkulatori() {
        initComponents();
        
        jBtn12.setEnabled(false);
    }
    public void arithmetic_operation()
    {
        switch (calculation)
        {
            case 1: //mbledhja
                ans= num + Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
                
                  case 2: //zbritja
                ans= num - Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
                
                       case 3: //shumezim
                ans= num * Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
                            case 4: //÷ Pjestimi
                ans= num / Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
                                 case 5: //%perqindja
                ans= num % Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                break;
                 
        }
    }
    public void enable()
    {
        jTextField1.setEnabled(true);
         jTextField2.setEnabled(true);
      
          jBtn12.setEnabled(false);
        jBtn1.setEnabled(true);
    
        
        
        jBtn2.setEnabled(true);
  
       jBtn5.setEnabled(true);
       jBtn6.setEnabled(true);
     
       jBtn8.setEnabled(true);
       
       
       jBtn11.setEnabled(true);
      
       jBtn13.setEnabled(true);
       jBtn14.setEnabled(true);
       jBtn15.setEnabled(true);
       jBtn16.setEnabled(true);
       jBtn17.setEnabled(true);
      
       jBtn19.setEnabled(true);
        jBtn20.setEnabled(true);
       jBtn21.setEnabled(true);
       jBtn22.setEnabled(true);
       jBtn23.setEnabled(true);
       jBtn24.setEnabled(true);
      
       jBtn26.setEnabled(true);
       jBtn27.setEnabled(true);
       
       jBtn29.setEnabled(true);
       jBtn30.setEnabled(true);
       jBtn31.setEnabled(true);
       
    }
   public void disable()
   {
        jTextField1.setEnabled(false);
    jTextField2.setEnabled(false);
        jBtn12.setEnabled(true);
        jBtn1.setEnabled(false);
      
        
        
        jBtn2.setEnabled(false);
    
    
       jBtn5.setEnabled(false);
       jBtn6.setEnabled(false);
     
       jBtn8.setEnabled(false);
       
       
       jBtn11.setEnabled(false);
       
       jBtn13.setEnabled(false);
       jBtn14.setEnabled(false);
       jBtn15.setEnabled(false);
       jBtn16.setEnabled(false);
       jBtn17.setEnabled(false);
      
       jBtn19.setEnabled(false);
        jBtn20.setEnabled(false);
       jBtn21.setEnabled(false);
       jBtn22.setEnabled(false);
       jBtn23.setEnabled(false);
       jBtn24.setEnabled(false);
      
       jBtn26.setEnabled(false);
       jBtn27.setEnabled(false);
       
       jBtn29.setEnabled(false);
       jBtn30.setEnabled(false);
       jBtn31.setEnabled(false);
       
     
       
   }
           
           
           
           
           
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jBtn1 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn11 = new javax.swing.JButton();
        jBtn12 = new javax.swing.JButton();
        jBtn13 = new javax.swing.JButton();
        jBtn14 = new javax.swing.JButton();
        jBtn15 = new javax.swing.JButton();
        jBtn16 = new javax.swing.JButton();
        jBtn21 = new javax.swing.JButton();
        jBtn22 = new javax.swing.JButton();
        jBtn17 = new javax.swing.JButton();
        jBtn19 = new javax.swing.JButton();
        jBtn20 = new javax.swing.JButton();
        jBtn23 = new javax.swing.JButton();
        jBtn26 = new javax.swing.JButton();
        jBtn27 = new javax.swing.JButton();
        jBtn29 = new javax.swing.JButton();
        jBtn30 = new javax.swing.JButton();
        jBtn31 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jBtn24 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jBtn1.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jBtn1.setText("OFF");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn2.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jBtn2.setText("2");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn5.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jBtn5.setText("5");
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn6.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jBtn6.setText("÷");
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtn8.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jBtn8.setText("0");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn11.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jBtn11.setText("C");
        jBtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn11ActionPerformed(evt);
            }
        });

        jBtn12.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jBtn12.setText("ON");
        jBtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn12ActionPerformed(evt);
            }
        });

        jBtn13.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jBtn13.setText("=");
        jBtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn13ActionPerformed(evt);
            }
        });

        jBtn14.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jBtn14.setText("+");
        jBtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn14ActionPerformed(evt);
            }
        });

        jBtn15.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jBtn15.setText("1");
        jBtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn15ActionPerformed(evt);
            }
        });

        jBtn16.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jBtn16.setText("3");
        jBtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn16ActionPerformed(evt);
            }
        });

        jBtn21.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jBtn21.setText(",");
        jBtn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn21ActionPerformed(evt);
            }
        });

        jBtn22.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jBtn22.setText("00");
        jBtn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn22ActionPerformed(evt);
            }
        });

        jBtn17.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jBtn17.setText("6");
        jBtn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn17ActionPerformed(evt);
            }
        });

        jBtn19.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jBtn19.setText("-");
        jBtn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn19ActionPerformed(evt);
            }
        });

        jBtn20.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jBtn20.setText("x");
        jBtn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn20ActionPerformed(evt);
            }
        });

        jBtn23.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jBtn23.setText("4");
        jBtn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn23ActionPerformed(evt);
            }
        });

        jBtn26.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jBtn26.setText("9");
        jBtn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn26ActionPerformed(evt);
            }
        });

        jBtn27.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jBtn27.setText("←");
        jBtn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn27ActionPerformed(evt);
            }
        });

        jBtn29.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jBtn29.setText("7");
        jBtn29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn29ActionPerformed(evt);
            }
        });

        jBtn30.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jBtn30.setText("%");
        jBtn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn30ActionPerformed(evt);
            }
        });

        jBtn31.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jBtn31.setText("8");
        jBtn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn31ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setText("CALCULATOR");
        jLabel1.setToolTipText("");

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jBtn24.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jBtn24.setText("000");
        jBtn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn21, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn23, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn29, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtn31, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtn26, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jBtn30, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtn27, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtn8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtn22, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtn17, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jBtn20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBtn24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jBtn19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(303, 303, 303)
                        .addComponent(jBtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtn26, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn31, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jBtn29, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtn27, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtn30, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtn23, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtn21, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtn17, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn19, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jBtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jBtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtn20, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jBtn22, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtn24, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        jTextField1.setText(jTextField1.getText() + "2");
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
      num = Double.parseDouble(jTextField1.getText());
       calculation =4;
       jTextField1.setText("");
       jTextField2.setText(num + "÷");
     
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn22ActionPerformed
        jTextField1.setText(jTextField1.getText() + "00");
    }//GEN-LAST:event_jBtn22ActionPerformed

    private void jBtn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn21ActionPerformed
        jTextField1.setText(jTextField1.getText() + ".");
    }//GEN-LAST:event_jBtn21ActionPerformed

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        disable();
        jTextField1.setText("");
        jTextField2.setText("");
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn23ActionPerformed
       jTextField1.setText(jTextField1.getText() + "4");
    }//GEN-LAST:event_jBtn23ActionPerformed

    private void jBtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn12ActionPerformed
        enable();
        jTextField1.setText(""); 
        jTextField2.setText("");   
    }//GEN-LAST:event_jBtn12ActionPerformed

    private void jBtn29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn29ActionPerformed
        jTextField1.setText(jTextField1.getText() + "7");
    }//GEN-LAST:event_jBtn29ActionPerformed

    private void jBtn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn30ActionPerformed
        num = Double.parseDouble(jTextField1.getText());
       calculation =5;
       jTextField1.setText("");
       jTextField2.setText(num + "%");
    }//GEN-LAST:event_jBtn30ActionPerformed

    private void jBtn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn31ActionPerformed
        jTextField1.setText(jTextField1.getText() + "8");
    }//GEN-LAST:event_jBtn31ActionPerformed

    private void jBtn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn15ActionPerformed
       jTextField1.setText(jTextField1.getText() + "1");
    }//GEN-LAST:event_jBtn15ActionPerformed

    private void jBtn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn16ActionPerformed
        jTextField1.setText(jTextField1.getText() + "3");
    }//GEN-LAST:event_jBtn16ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        jTextField1.setText(jTextField1.getText() + "5");
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn17ActionPerformed
       jTextField1.setText(jTextField1.getText() + "6");
    }//GEN-LAST:event_jBtn17ActionPerformed

    private void jBtn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn26ActionPerformed
        jTextField1.setText(jTextField1.getText() + "9");
    }//GEN-LAST:event_jBtn26ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        jTextField1.setText(jTextField1.getText() + "0");
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn14ActionPerformed
       num = Double.parseDouble(jTextField1.getText());
       calculation =1;
       jTextField1.setText("");
       jTextField2.setText(num + " +");
     
    }//GEN-LAST:event_jBtn14ActionPerformed

    private void jBtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn13ActionPerformed
        arithmetic_operation();
       jTextField2.setText("");
        
    }//GEN-LAST:event_jBtn13ActionPerformed

    private void jBtn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn19ActionPerformed
       
        num = Double.parseDouble(jTextField1.getText());
       calculation = 2 ;
       jTextField1.setText("");
       jTextField2.setText(num + " -");
    }//GEN-LAST:event_jBtn19ActionPerformed

    private void jBtn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn20ActionPerformed
      num = Double.parseDouble(jTextField1.getText());
       calculation = 3 ;
       jTextField1.setText("");
       jTextField2.setText(num + "*");
    }//GEN-LAST:event_jBtn20ActionPerformed

    private void jBtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn11ActionPerformed
        jTextField1.setText("");
       
    }//GEN-LAST:event_jBtn11ActionPerformed

    private void jBtn27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn27ActionPerformed
       
        int length= jTextField1.getText().length();
        int number= jTextField1.getText().length() -1;
        String store;
        if(length > 0 )
        
        {
            StringBuilder back= new StringBuilder(jTextField1.getText());
            back.deleteCharAt(number);
            store=back.toString();
                    jTextField1.setText(store);
        }
        
        
        
        
    }//GEN-LAST:event_jBtn27ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jBtn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn24ActionPerformed
         jTextField1.setText(jTextField1.getText() + "000");
    }//GEN-LAST:event_jBtn24ActionPerformed

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
            java.util.logging.Logger.getLogger(Kalkulatori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulatori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulatori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulatori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulatori().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn11;
    private javax.swing.JButton jBtn12;
    private javax.swing.JButton jBtn13;
    private javax.swing.JButton jBtn14;
    private javax.swing.JButton jBtn15;
    private javax.swing.JButton jBtn16;
    private javax.swing.JButton jBtn17;
    private javax.swing.JButton jBtn19;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn20;
    private javax.swing.JButton jBtn21;
    private javax.swing.JButton jBtn22;
    private javax.swing.JButton jBtn23;
    private javax.swing.JButton jBtn24;
    private javax.swing.JButton jBtn26;
    private javax.swing.JButton jBtn27;
    private javax.swing.JButton jBtn29;
    private javax.swing.JButton jBtn30;
    private javax.swing.JButton jBtn31;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
