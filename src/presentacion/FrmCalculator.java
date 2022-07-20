package presentacion;

import aplicacion.Metodos;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Mr.Devv
 */
public class FrmCalculator extends javax.swing.JFrame {

    int xMouse;
    int yMouse;

    boolean modoOscuro = false;
    String operacion;
    double resultado = 0;

    Metodos metodos;

    public FrmCalculator() {
        initComponents();
        setLocationRelativeTo(null);
        metodos = new Metodos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblResultado = new javax.swing.JLabel();
        lblOperacion = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCambiarTema = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnAC = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnPorcentaje = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(235, 235, 235));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(235, 235, 235));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblResultado.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(42, 49, 55));
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 240, 38));

        lblOperacion.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblOperacion.setForeground(new java.awt.Color(203, 203, 203));
        lblOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lblOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 240, -1));

        jPanel3.setBackground(new java.awt.Color(235, 235, 235));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel3MouseReleased(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCambiarTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonCambiarTemaClaro.png"))); // NOI18N
        btnCambiarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarTemaActionPerformed(evt);
            }
        });
        jPanel3.add(btnCambiarTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 60, 20));

        btnSalir.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonSalir.png"))); // NOI18N
        btnSalir.setText("X");
        btnSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSalir.setBorderPainted(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel3.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 160));

        jPanel2.setBackground(new java.awt.Color(235, 235, 235));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAC.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        btnAC.setForeground(new java.awt.Color(153, 153, 153));
        btnAC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btnAC.setBorderPainted(false);
        btnAC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAC.setLabel("AC");
        btnAC.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btnAC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1Activo.png"))); // NOI18N
        btnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACActionPerformed(evt);
            }
        });
        jPanel2.add(btnAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 50));

        btnDelete.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(153, 153, 153));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btnDelete.setText("DEL");
        btnDelete.setBorderPainted(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btnDelete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1Activo.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 50, 50));

        btnPorcentaje.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btnPorcentaje.setForeground(new java.awt.Color(153, 153, 153));
        btnPorcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btnPorcentaje.setText("%");
        btnPorcentaje.setBorderPainted(false);
        btnPorcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPorcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btnPorcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1Activo.png"))); // NOI18N
        btnPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(btnPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 50, 50));

        btnDivision.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(153, 153, 153));
        btnDivision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btnDivision.setText("÷");
        btnDivision.setBorderPainted(false);
        btnDivision.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDivision.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btnDivision.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1Activo.png"))); // NOI18N
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        jPanel2.add(btnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 50, 50));

        btnMultiplicacion.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btnMultiplicacion.setForeground(new java.awt.Color(153, 153, 153));
        btnMultiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btnMultiplicacion.setText("x");
        btnMultiplicacion.setBorderPainted(false);
        btnMultiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMultiplicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btnMultiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1Activo.png"))); // NOI18N
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });
        jPanel2.add(btnMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 50, 50));

        btnResta.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btnResta.setForeground(new java.awt.Color(153, 153, 153));
        btnResta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btnResta.setText("-");
        btnResta.setBorderPainted(false);
        btnResta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btnResta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1Activo.png"))); // NOI18N
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        jPanel2.add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 50, 50));

        btnSuma.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(153, 153, 153));
        btnSuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btnSuma.setText("+");
        btnSuma.setBorderPainted(false);
        btnSuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSuma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btnSuma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1Activo.png"))); // NOI18N
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 50, 50));

        btn9.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btn9.setForeground(new java.awt.Color(153, 153, 153));
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn9.setText("9");
        btn9.setBorderPainted(false);
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1Activo.png"))); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 50, 50));

        btn8.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btn8.setForeground(new java.awt.Color(153, 153, 153));
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn8.setText("8");
        btn8.setBorderPainted(false);
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1Activo.png"))); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 50, 50));

        btn7.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btn7.setForeground(new java.awt.Color(153, 153, 153));
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn7.setText("7");
        btn7.setBorderPainted(false);
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1Activo.png"))); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 50, 50));

        btn4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btn4.setForeground(new java.awt.Color(153, 153, 153));
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn4.setText("4");
        btn4.setBorderPainted(false);
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1Activo.png"))); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, 50));

        btn5.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btn5.setForeground(new java.awt.Color(153, 153, 153));
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn5.setText("5");
        btn5.setBorderPainted(false);
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1Activo.png"))); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 50, 50));

        btn6.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btn6.setForeground(new java.awt.Color(153, 153, 153));
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn6.setText("6");
        btn6.setBorderPainted(false);
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1Activo.png"))); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 50, 50));

        btn3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btn3.setForeground(new java.awt.Color(153, 153, 153));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn3.setText("3");
        btn3.setBorderPainted(false);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1Activo.png"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 50, 50));

        btn2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(153, 153, 153));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn2.setText("2");
        btn2.setBorderPainted(false);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1Activo.png"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 50, 50));

        btn1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(153, 153, 153));
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn1.setText("1");
        btn1.setBorderPainted(false);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1Activo.png"))); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 50, 50));

        btnPunto.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btnPunto.setForeground(new java.awt.Color(153, 153, 153));
        btnPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btnPunto.setText(".");
        btnPunto.setBorderPainted(false);
        btnPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPunto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btnPunto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1Activo.png"))); // NOI18N
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        jPanel2.add(btnPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 50, 50));

        btn0.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btn0.setForeground(new java.awt.Color(153, 153, 153));
        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn0.setText("0");
        btn0.setBorderPainted(false);
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1Activo.png"))); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 50, 50));

        btnIgual.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(203, 203, 203));
        btnIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2_1.png"))); // NOI18N
        btnIgual.setText("=");
        btnIgual.setBorderPainted(false);
        btnIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIgual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2_1.png"))); // NOI18N
        btnIgual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2Activo_1.png"))); // NOI18N
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        jPanel2.add(btnIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 110, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 270, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACActionPerformed
        lblOperacion.setText("");
        lblResultado.setText("");
    }//GEN-LAST:event_btnACActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        addNumber("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        addNumber("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        addNumber("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        operacion = lblOperacion.getText();

        if (metodos.existeOperador(operacion)) {
            if (metodos.existeOperadorAlfinal(operacion)) {
                char[] cadena = operacion.toCharArray();
                cadena[cadena.length - 1] = 'x';
                lblOperacion.setText(String.valueOf(cadena));
            } else {
                resultado = metodos.obtenerResultado(metodos.obtenerOperador(operacion), operacion);
                String resp = String.valueOf(resultado);
                if (resp.contains(".0")) {
                    lblResultado.setText(String.valueOf(Math.round(resultado)));
                    lblOperacion.setText(lblResultado.getText() + "x");
                } else {
                    lblResultado.setText(String.valueOf(String.format("%.2f", resultado)));
                    lblOperacion.setText(lblResultado.getText() + "x");
                }
            }
        } else if (!lblOperacion.getText().isEmpty()) {
            addNumber("x");
        }
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        addNumber("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        addNumber("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        addNumber("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        operacion = lblOperacion.getText();

        if (metodos.existeOperador(operacion)) {
            if (metodos.existeOperadorAlfinal(operacion)) {
                char[] cadena = operacion.toCharArray();
                cadena[cadena.length - 1] = '-';
                lblOperacion.setText(String.valueOf(cadena));
            } else {
                resultado = metodos.obtenerResultado(metodos.obtenerOperador(operacion), operacion);
                String resp = String.valueOf(resultado);
                if (resp.contains(".0")) {
                    lblResultado.setText(String.valueOf(Math.round(resultado)));
                    lblOperacion.setText(lblResultado.getText() + "-");
                } else {
                    lblResultado.setText(String.valueOf(String.format("%.2f", resultado)));
                    lblOperacion.setText(lblResultado.getText() + "-");
                }
            }
        } else if (!operacion.isEmpty()) {
            addNumber("-");
        }

    }//GEN-LAST:event_btnRestaActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        addNumber("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        addNumber("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        addNumber("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        operacion = lblOperacion.getText();

        if (metodos.existeOperador(operacion)) {
            if (metodos.existeOperadorAlfinal(operacion)) {
                char[] cadena = operacion.toCharArray();
                cadena[cadena.length - 1] = '+';
                lblOperacion.setText(String.valueOf(cadena));
            } else {
                resultado = metodos.obtenerResultado(metodos.obtenerOperador(operacion), operacion);
                String resp = String.valueOf(resultado);
                if (resp.contains(".0")) {
                    lblResultado.setText(String.valueOf(Math.round(resultado)));
                    lblOperacion.setText(lblResultado.getText() + "+");
                } else {
                    lblResultado.setText(String.valueOf(String.format("%.2f", resultado)));
                    lblOperacion.setText(lblResultado.getText() + "+");
                }
            }

        } else if (!lblOperacion.getText().isEmpty()) {
            addNumber("+");
        }
    }//GEN-LAST:event_btnSumaActionPerformed


    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        addNumber("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed

        if (lblOperacion.getText().isEmpty()) {
            return;
        } else {
            operacion = lblOperacion.getText();
            if (metodos.existeOperadorAlfinal(operacion)) {
                return;
            }
        }

        addNumber(".");
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (!lblOperacion.getText().isEmpty()) {
            String nuevaOperacion = lblOperacion.getText().substring(0, lblOperacion.getText().length() - 1);
            lblOperacion.setText(String.valueOf(nuevaOperacion));
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentajeActionPerformed
        operacion = lblOperacion.getText();

        if (metodos.existeOperador(operacion)) {
            if (metodos.existeOperadorAlfinal(operacion)) {
                char[] cadena = operacion.toCharArray();
                cadena[cadena.length - 1] = '%';
                lblOperacion.setText(String.valueOf(cadena));
            } else {
                resultado = metodos.obtenerResultado(metodos.obtenerOperador(operacion), operacion);
                String resp = String.valueOf(resultado);
                if (resp.contains(".0")) {
                    lblResultado.setText(String.valueOf(Math.round(resultado)));
                    lblOperacion.setText(lblResultado.getText() + "%");
                } else {
                    lblResultado.setText(String.valueOf(String.format("%.2f", resultado)));
                    lblOperacion.setText(lblResultado.getText() + "%");
                }
            }
        } else if (!lblOperacion.getText().isEmpty()) {
            addNumber("%");
        }
    }//GEN-LAST:event_btnPorcentajeActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        operacion = lblOperacion.getText();

        if (metodos.existeOperador(operacion)) {
            if (metodos.existeOperadorAlfinal(operacion)) {
                char[] cadena = operacion.toCharArray();
                cadena[cadena.length - 1] = '÷';
                lblOperacion.setText(String.valueOf(cadena));
            } else {
                resultado = metodos.obtenerResultado(metodos.obtenerOperador(operacion), operacion);
                String resp = String.valueOf(resultado);
                if (resp.contains(".0")) {
                    lblResultado.setText(String.valueOf(Math.round(resultado)));
                    lblOperacion.setText(lblResultado.getText() + "÷");
                } else {
                    lblResultado.setText(String.valueOf(String.format("%.2f", resultado)));
                    lblOperacion.setText(lblResultado.getText() + "÷");
                }
            }
        } else if (!lblOperacion.getText().isEmpty()) {
            addNumber("÷");
        }
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        operacion = lblOperacion.getText();

        if (metodos.existeOperadorAlfinal(operacion)) {
            return;
        }
        resultado = metodos.obtenerResultado(metodos.obtenerOperador(operacion), operacion);
        String resp = String.valueOf(resultado);

        if (resp.contains(".0")) {
            lblResultado.setText(String.valueOf(Math.round(resultado)));
        } else {
            lblResultado.setText(String.valueOf(String.format("%.2f", resultado)));
        }

        lblOperacion.setText("");
    }//GEN-LAST:event_btnIgualActionPerformed


    private void btnCambiarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarTemaActionPerformed
        if (!modoOscuro) {
            activarModoOscuro();
        } else {
            activarModoClaro();
        }

    }//GEN-LAST:event_btnCambiarTemaActionPerformed

    private void activarModoOscuro() {
        jPanel1.setBackground(Color.decode("#243441"));
        jPanel2.setBackground(Color.decode("#243441"));
        jPanel3.setBackground(Color.decode("#243441"));
        lblResultado.setForeground(Color.white);

        activarModoOscuroBotonTipo1(btn0);
        activarModoOscuroBotonTipo1(btn1);
        activarModoOscuroBotonTipo1(btn2);
        activarModoOscuroBotonTipo1(btn3);
        activarModoOscuroBotonTipo1(btn4);
        activarModoOscuroBotonTipo1(btn5);
        activarModoOscuroBotonTipo1(btn6);
        activarModoOscuroBotonTipo1(btn7);
        activarModoOscuroBotonTipo1(btn8);
        activarModoOscuroBotonTipo1(btn9);
        activarModoOscuroBotonTipo1(btnPunto);
        activarModoOscuroBotonTipo1(btn9);
        activarModoOscuroBotonTipo1(btnAC);
        activarModoOscuroBotonTipo1(btnDelete);
        activarModoOscuroBotonTipo1(btnPorcentaje);
        activarModoOscuroBotonTipo1(btnDivision);
        activarModoOscuroBotonTipo1(btnMultiplicacion);
        activarModoOscuroBotonTipo1(btnResta);
        activarModoOscuroBotonTipo1(btnSuma);
        activarModoOscuroBotonTipo2(btnIgual);

        btnAC.setForeground(Color.decode("#ef8230"));
        btnDelete.setForeground(Color.decode("#ef8230"));
        btnPorcentaje.setForeground(Color.decode("#ef8230"));
        btnMultiplicacion.setForeground(Color.decode("#ef8230"));
        btnResta.setForeground(Color.decode("#ef8230"));
        btnSuma.setForeground(Color.decode("#ef8230"));
        btnDivision.setForeground(Color.decode("#ef8230"));

        btnCambiarTema.setIcon(new ImageIcon(getClass().getResource("/imagenes/botonCambiarTema.png")));

        modoOscuro = true;

    }

    private void activarModoClaro() {
        jPanel1.setBackground(Color.decode("#EBEBEB"));
        jPanel2.setBackground(Color.decode("#EBEBEB"));
        jPanel3.setBackground(Color.decode("#EBEBEB"));
        lblResultado.setForeground(Color.decode("#2A3137"));

        activarModoClaroBotonTipo1(btn0);
        activarModoClaroBotonTipo1(btn1);
        activarModoClaroBotonTipo1(btn2);
        activarModoClaroBotonTipo1(btn3);
        activarModoClaroBotonTipo1(btn4);
        activarModoClaroBotonTipo1(btn5);
        activarModoClaroBotonTipo1(btn6);
        activarModoClaroBotonTipo1(btn7);
        activarModoClaroBotonTipo1(btn8);
        activarModoClaroBotonTipo1(btn9);
        activarModoClaroBotonTipo1(btnPunto);
        activarModoClaroBotonTipo1(btn9);
        activarModoClaroBotonTipo1(btnAC);
        activarModoClaroBotonTipo1(btnDelete);
        activarModoClaroBotonTipo1(btnPorcentaje);
        activarModoClaroBotonTipo1(btnDivision);
        activarModoClaroBotonTipo1(btnMultiplicacion);
        activarModoClaroBotonTipo1(btnResta);
        activarModoClaroBotonTipo1(btnSuma);
        activarModoClaroBotonTipo2(btnIgual);

        btnAC.setForeground(Color.decode("#999999"));
        btnDelete.setForeground(Color.decode("#999999"));
        btnPorcentaje.setForeground(Color.decode("#999999"));
        btnMultiplicacion.setForeground(Color.decode("#999999"));
        btnResta.setForeground(Color.decode("#999999"));
        btnSuma.setForeground(Color.decode("#999999"));
        btnDivision.setForeground(Color.decode("#999999"));

        btnCambiarTema.setIcon(new ImageIcon(getClass().getResource("/imagenes/botonCambiarTemaClaro.png")));

        modoOscuro = false;

    }

    void activarModoOscuroBotonTipo1(JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/btn1ModoOscuro.png")));
        boton.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/btn1ModoOscuroActivo.png")));
        boton.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/btn1ModoOscuro.png")));
    }

    void activarModoOscuroBotonTipo2(JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/btn2ModoOscuro.png")));
        boton.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/btn2ModoOscuroActivo.png")));
        boton.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/btn2ModoOscuro.png")));
    }

    void activarModoClaroBotonTipo1(JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/btn1.png")));
        boton.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/btn1Activo.png")));
        boton.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/btn1.png")));
    }

    void activarModoClaroBotonTipo2(JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/btn2_1.png")));
        boton.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/btn2Activo_1.png")));
        boton.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/btn2_1.png")));
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseReleased

    }//GEN-LAST:event_jPanel3MouseReleased

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel3MouseDragged

    public void addNumber(String digito) {
        lblOperacion.setText(lblOperacion.getText() + digito);
    }

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
            java.util.logging.Logger.getLogger(FrmCalculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCalculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCalculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCalculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAC;
    private javax.swing.JButton btnCambiarTema;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnPorcentaje;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSuma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblOperacion;
    private javax.swing.JLabel lblResultado;
    // End of variables declaration//GEN-END:variables
}
