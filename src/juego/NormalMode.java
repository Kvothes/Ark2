package juego;

import javax.swing.Timer;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

public class NormalMode extends javax.swing.JFrame {

    Funcionalidad funcion = new Funcionalidad();
    int[] numeros = funcion.getNumeros();
    String[] cartas = funcion.getCartas();

    public NormalMode() {
        initComponents();
        this.setResizable(false);
        setLocationRelativeTo(null);
        t = new Timer(10, acciones);
        cs = 0;
        s = 59;
        min = 1;
        voltear=new Timer(1000,vol); 
        s2=0;
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        b10.setEnabled(false);
        b11.setEnabled(false);
        b12.setEnabled(false);
        b13.setEnabled(false);
        b14.setEnabled(false);
        b15.setEnabled(false);
        b16.setEnabled(false);
        b17.setEnabled(false);
        b18.setEnabled(false);
    }
    private int cs, s, min, s2;

    private Timer t;
    private Timer voltear; 
        private ActionListener acciones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            cs++;
            if (cs == 100) {
                cs = 0;
                s--;
            }
            if (s == 0) {
                if (min == 0) {
                    if (min == 0 && s == 0) {
                        t.stop();
                        start.setEnabled(true);
                    }
                } else {
                    s = 59;
                }
                min--;
            }
            actualizar();
        }

    };
      
    private ActionListener vol = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
           s2++; 
        }

    };

    public void actualizar() {
        String mostrar = (min < 10 ? "0" : "") + min + ":" + (s < 10 ? "0" : "") + s + ":" + (cs < 10 ? "0" : "") + cs;
        cronometro.setText(mostrar);
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        start = new javax.swing.JButton();
        cronometro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1);
        b1.setBounds(60, 100, 90, 110);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modo Normal !");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(320, 10, 220, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cronometro");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(690, 20, 100, 22);

        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2);
        b2.setBounds(200, 100, 90, 110);

        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3);
        b3.setBounds(340, 100, 90, 110);

        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4);
        b4.setBounds(480, 100, 90, 110);

        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5);
        b5.setBounds(610, 100, 90, 110);

        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel1.add(b6);
        b6.setBounds(750, 100, 90, 110);

        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel1.add(b7);
        b7.setBounds(60, 240, 90, 110);

        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel1.add(b8);
        b8.setBounds(200, 240, 90, 110);

        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jPanel1.add(b9);
        b9.setBounds(340, 240, 90, 110);

        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        jPanel1.add(b10);
        b10.setBounds(480, 240, 90, 110);

        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        jPanel1.add(b11);
        b11.setBounds(610, 240, 90, 110);

        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        jPanel1.add(b12);
        b12.setBounds(750, 240, 90, 110);

        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });
        jPanel1.add(b13);
        b13.setBounds(60, 380, 90, 110);

        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        jPanel1.add(b14);
        b14.setBounds(200, 380, 90, 110);

        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        jPanel1.add(b15);
        b15.setBounds(340, 380, 90, 110);

        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });
        jPanel1.add(b16);
        b16.setBounds(480, 380, 90, 110);

        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });
        jPanel1.add(b17);
        b17.setBounds(610, 380, 90, 110);

        b18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b18ActionPerformed(evt);
            }
        });
        jPanel1.add(b18);
        b18.setBounds(750, 380, 90, 110);

        start.setText("Empezar");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        jPanel1.add(start);
        start.setBounds(50, 550, 120, 30);

        cronometro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cronometro.setText("00:00:00");
        jPanel1.add(cronometro);
        cronometro.setBounds(690, 50, 110, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int cont = 0;
    ArrayList<Color> a = new ArrayList<>();
    ArrayList<Color> listacolores = new ArrayList<>();
    ArrayList<JButton> botones=new ArrayList<>(); 
    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        
        Color c3 = new Color(Integer.parseInt(cartas[numeros[2]]));
        b3.setBackground(c3);
        this.deshabilitar(c3, b3);
        this.colorvacio(c3, b3);
        cont++;
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        
        Color c4 = new Color(Integer.parseInt(cartas[numeros[3]]));
        b4.setBackground(c4);
        this.deshabilitar(c4, b4);
        this.colorvacio(c4, b4);

    }//GEN-LAST:event_b4ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        
        Color c1 = new Color(Integer.parseInt(cartas[numeros[0]]));
        b1.setBackground(new Color(Integer.parseInt(cartas[numeros[0]])));
        this.colorvacio(c1, b1);

    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        
        Color c2 = new Color(Integer.parseInt(cartas[numeros[1]]));
        b2.setBackground(c2);
        this.colorvacio(c2, b2);

    }//GEN-LAST:event_b2ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        
        Color c6 = new Color(Integer.parseInt(cartas[numeros[5]]));
        b6.setBackground(c6);
        this.deshabilitar(c6, b6);
        this.colorvacio(c6, b6);

    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        
        Color c7 = new Color(Integer.parseInt(cartas[numeros[6]]));
        b7.setBackground(c7);
        this.deshabilitar(c7, b7);
        this.colorvacio(c7, b7);

    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        
        Color c8 = new Color(Integer.parseInt(cartas[numeros[7]]));
        b8.setBackground(c8);
        this.deshabilitar(c8, b8);
        this.colorvacio(c8, b8);

    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        
        Color c9 = new Color(Integer.parseInt(cartas[numeros[8]]));
        b9.setBackground(c9);
        this.deshabilitar(c9, b9);
        this.colorvacio(c9, b9);

    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        
        Color c10 = new Color(Integer.parseInt(cartas[numeros[9]]));
        b10.setBackground(c10);
        this.deshabilitar(c10, b10);
        this.colorvacio(c10, b10);

    }//GEN-LAST:event_b10ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        
        Color c11 = new Color(Integer.parseInt(cartas[numeros[10]]));
        b11.setBackground(c11);
        this.deshabilitar(c11, b11);
        this.colorvacio(c11, b11);

    }//GEN-LAST:event_b11ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        
        Color c12 = new Color(Integer.parseInt(cartas[numeros[11]]));
        b12.setBackground(c12);
        this.deshabilitar(c12, b12);
        this.colorvacio(c12, b12);
    
    }//GEN-LAST:event_b12ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        
        Color c13 = new Color(Integer.parseInt(cartas[numeros[12]]));
        b13.setBackground(c13);
        this.deshabilitar(c13, b13);
        this.colorvacio(c13, b13);

    }//GEN-LAST:event_b13ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        
        Color c14 = new Color(Integer.parseInt(cartas[numeros[13]]));
        b14.setBackground(c14);
        this.deshabilitar(c14, b14);
        this.colorvacio(c14, b14);
      
    }//GEN-LAST:event_b14ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
        
        Color c15 = new Color(Integer.parseInt(cartas[numeros[14]]));
        b15.setBackground(c15);
        this.deshabilitar(c15, b15);
        this.colorvacio(c15, b15);

    }//GEN-LAST:event_b15ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
        
        Color c16 = new Color(Integer.parseInt(cartas[numeros[15]]));
        b16.setBackground(c16);
        this.deshabilitar(c16, b16);
        this.colorvacio(c16, b16);

    }//GEN-LAST:event_b16ActionPerformed

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b17ActionPerformed
        
        Color c17 = new Color(Integer.parseInt(cartas[numeros[16]]));
        b17.setBackground(c17);
        this.deshabilitar(c17, b17);
        this.colorvacio(c17, b17);

    }//GEN-LAST:event_b17ActionPerformed

    private void b18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b18ActionPerformed
        
        Color c18 = new Color(Integer.parseInt(cartas[numeros[17]]));
        b18.setBackground(c18);
        this.deshabilitar(c18, b18);
        this.colorvacio(c18, b18);

    }//GEN-LAST:event_b18ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed

        Color c5 = new Color(Integer.parseInt(cartas[numeros[4]]));
        b5.setBackground(c5);
        this.deshabilitar(c5, b5);
        this.colorvacio(c5, b5);
    }//GEN-LAST:event_b5ActionPerformed

    private void deshabilitar(Color c, JButton a) {
        if (a.getBackground() == c) {
            a.setEnabled(false);
        }
    }

    private void habilitar(JButton xd) {
        xd.setEnabled(true);
    }

    private void colorvacio(Color c, JButton hb) {
      //  cont++;
       // System.out.println(cont);
       
       
            a.add(c);
            botones.add(hb); 
            if (a.size() == 2) {

                if (a.get(0).equals(a.get(1))) {

                } else {
                    botones.get(0).setBackground(null);
                    botones.get(1).setBackground(null);  
                    this.habilitar(botones.get(0));
                    this.habilitar(botones.get(1));
                }
                a.clear();
                botones.clear();
            }
            
  
    }


    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        t.start();
        //cronometro.setText(min+":"+s+":"+cs);

        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        b10.setEnabled(true);
        b11.setEnabled(true);
        b12.setEnabled(true);
        b13.setEnabled(true);
        b14.setEnabled(true);
        b15.setEnabled(true);
        b16.setEnabled(true);
        b17.setEnabled(true);
        b18.setEnabled(true);
        start.setEnabled(false);


    }//GEN-LAST:event_startActionPerformed

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
            java.util.logging.Logger.getLogger(NormalMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NormalMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NormalMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NormalMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NormalMode().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b17;
    private javax.swing.JButton b18;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel cronometro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
