
import java.util.ArrayList;
import java.util.Stack;

public class DesignPage extends javax.swing.JFrame {

    public DesignPage() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        panel1 = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        science = new java.awt.Panel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton("\uF0E7");
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        speed = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        screen = new javax.swing.JTextField();
        printopt = new javax.swing.JTextField();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scientific Calculater");
        setResizable(false);
        getContentPane().setLayout(new java.awt.FlowLayout());

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setPreferredSize(new java.awt.Dimension(400, 500));
        panel1.setLayout(null);

        panel2.setBackground(new java.awt.Color(204, 204, 255));
        panel2.setLayout(new java.awt.CardLayout());

        science.setBackground(new java.awt.Color(204, 204, 204));
        science.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        science.setLayout(null);

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton1.setText("Tan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        science.add(jButton1);
        jButton1.setBounds(330, 10, 65, 50);

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton2.setText("Sin");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        science.add(jButton2);
        jButton2.setBounds(170, 10, 65, 50);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("sqrt");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        science.add(jButton4);
        jButton4.setBounds(10, 130, 65, 50);

        jButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton3.setText("ln");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        science.add(jButton3);
        jButton3.setBounds(90, 10, 65, 50);

        jButton5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton5.setText("Cos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        science.add(jButton5);
        jButton5.setBounds(250, 10, 65, 50);

        jButton7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton7.setText("Log");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        science.add(jButton7);
        jButton7.setBounds(90, 70, 65, 50);

        jButton8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton8.setText("Sinh");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        science.add(jButton8);
        jButton8.setBounds(170, 70, 65, 50);

        jButton9.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton9.setText("Cosh");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        science.add(jButton9);
        jButton9.setBounds(250, 70, 65, 50);

        jButton10.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jButton10.setText("Tanh");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        science.add(jButton10);
        jButton10.setBounds(330, 70, 65, 50);

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setText("-");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        science.add(jButton11);
        jButton11.setBounds(330, 190, 65, 50);

        jButton15.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jButton15.setText("x^2");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        science.add(jButton15);
        jButton15.setBounds(10, 250, 65, 50);

        jButton16.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jButton16.setText("x^y");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        science.add(jButton16);
        jButton16.setBounds(10, 190, 65, 50);

        jButton18.setFont(new java.awt.Font("Wingdings", 1, 18));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        science.add(jButton18);
        jButton18.setBounds(10, 70, 65, 50);

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton19.setText("C");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        science.add(jButton19);
        jButton19.setBounds(10, 10, 65, 50);

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton20.setText("+");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        science.add(jButton20);
        jButton20.setBounds(330, 130, 65, 50);

        jButton21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton21.setText("/");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        science.add(jButton21);
        jButton21.setBounds(330, 310, 65, 50);

        jButton24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton24.setText("2");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        science.add(jButton24);
        jButton24.setBounds(170, 250, 65, 50);

        jButton26.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jButton26.setText("x^3");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        science.add(jButton26);
        jButton26.setBounds(10, 310, 65, 50);

        jButton30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton30.setText("*");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        science.add(jButton30);
        jButton30.setBounds(330, 250, 65, 50);

        jButton35.setText("jButton1");
        science.add(jButton35);
        jButton35.setBounds(330, 310, 65, 50);

        jButton37.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton37.setText("0");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        science.add(jButton37);
        jButton37.setBounds(90, 310, 60, 50);

        jButton39.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton39.setText(".");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        science.add(jButton39);
        jButton39.setBounds(170, 310, 65, 50);

        jButton40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton40.setText("=");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        science.add(jButton40);
        jButton40.setBounds(250, 310, 65, 50);

        jButton38.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton38.setText("3");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        science.add(jButton38);
        jButton38.setBounds(250, 250, 65, 50);

        jButton41.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton41.setText("1");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        science.add(jButton41);
        jButton41.setBounds(90, 250, 65, 50);

        jButton42.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton42.setText("6");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        science.add(jButton42);
        jButton42.setBounds(250, 190, 65, 50);

        jButton43.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton43.setText("5");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        science.add(jButton43);
        jButton43.setBounds(170, 190, 65, 50);

        jButton44.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton44.setText("4");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        science.add(jButton44);
        jButton44.setBounds(90, 190, 65, 50);

        jButton45.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton45.setText("9");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        science.add(jButton45);
        jButton45.setBounds(250, 130, 65, 50);

        jButton46.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton46.setText("8");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        science.add(jButton46);
        jButton46.setBounds(170, 130, 65, 50);

        jButton47.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton47.setText("7");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        science.add(jButton47);
        jButton47.setBounds(90, 130, 65, 50);

        panel2.add(science, "card1");

        speed.setBackground(new java.awt.Color(204, 204, 204));
        speed.setLayout(null);

        jLabel2.setText("speed");
        speed.add(jLabel2);
        jLabel2.setBounds(170, 120, 70, 70);

        panel2.add(speed, "card3");

        panel1.add(panel2);
        panel2.setBounds(0, 40, 400, 430);

        screen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        screen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        screen.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        screen.setEnabled(false);
        screen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                screenActionPerformed(evt);
            }
        });
        panel1.add(screen);
        screen.setBounds(40, 0, 360, 40);

        printopt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        printopt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        printopt.setBorder(null);
        printopt.setEnabled(false);
        printopt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printoptActionPerformed(evt);
            }
        });
        panel1.add(printopt);
        printopt.setBounds(0, 0, 40, 40);

        getContentPane().add(panel1);

        setSize(new java.awt.Dimension(417, 451));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            screen.setText(""+Math.sqrt(Double.parseDouble(screen.getText())));
        }catch(Exception e){}
//        screen.setText(screen.getText()+" sqrt ");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

        screen.setText(screen.getText()+"^2");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        
        screen.setText(screen.getText()+"^");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        
        screen.setText(screen.getText()+"2");
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        
        screen.setText(screen.getText()+"^3");
//        String ans = jTextField3.getText();
//        if(!ans.equals("")){
//            double n = Double.parseDouble(ans);
//            jTextField3.setText(String.valueOf(n*n*n));
//        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        
         screen.setText(screen.getText()+"0");
    }//GEN-LAST:event_jButton37ActionPerformed

    private void screenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_screenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_screenActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        
        screen.setText(screen.getText()+"3");
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        
        screen.setText(screen.getText()+"1");
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        
        screen.setText(screen.getText()+"6");
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        
        screen.setText(screen.getText()+"5");
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        
        screen.setText(screen.getText()+"4");
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        
        screen.setText(screen.getText()+"9");
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        
        screen.setText(screen.getText()+"8");
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        
        screen.setText(screen.getText()+"7");
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        
        screen.setText(null);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        
        try{
            String str = screen.getText();
            screen.setText(str.substring(0,str.length()-1));
        }
        catch(StringIndexOutOfBoundsException e){}
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        
        String str = screen.getText();
        int chr = Character.compare(str.charAt(str.length()-1), '.');
        if(chr != 0){
            
            screen.setText(screen.getText()+".");
        }
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        
        
        if(checkLastChar('+'))
            screen.setText(screen.getText()+"+");
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
        if(checkLastChar('-'))
            screen.setText(screen.getText()+"-");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        
        if(checkLastChar('*'))
            screen.setText(screen.getText()+"*");
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        
        if(checkLastChar('/'))
            screen.setText(screen.getText()+"/");
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        
        if(!Character.isDigit(screen.getText().charAt(screen.getText().length()-1))){
            
            screen.setText("");
            return;
        }
    
        ArrayList <String> equvation = eqArrayList();
        
        try{
            screen.setText(solveEquation(equvation));
        }catch(Exception e){
            
            screen.setText("");
        }
        
        
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        screen.setText(screen.getText()+" Sin ");
        try{
            screen.setText(""+Math.sin(Double.parseDouble(screen.getText())));
        }catch(Exception e){}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
//        screen.setText(screen.getText()+" Cos ");
        try{
            screen.setText(""+Math.cos(Double.parseDouble(screen.getText())));
        }catch(Exception e){}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try{
            screen.setText(""+Math.tan(Double.parseDouble(screen.getText())));
        }catch(Exception e){}
//        screen.setText(screen.getText()+" Tan ");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try{
            screen.setText(""+Math.sinh(Double.parseDouble(screen.getText())));
        }catch(Exception e){}
//        screen.setText(screen.getText()+" Sinh ");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try{
            screen.setText(""+Math.cosh(Double.parseDouble(screen.getText())));
        }catch(Exception e){}
//        screen.setText(screen.getText()+" Cosh ");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try{
            screen.setText(""+Math.tanh(Double.parseDouble(screen.getText())));
        }catch(Exception e){}
//        screen.setText(screen.getText()+" Tanh ");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try{
            screen.setText(""+Math.log(Double.parseDouble(screen.getText())));
        }catch(Exception e){}
//        screen.setText(screen.getText()+" Log ");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            double ans = 1;
            int op1 = 10;
            int op2 = Integer.parseInt(screen.getText());
            for(int i = 0;i<op2;i++)
                ans = ans*op1;
            screen.setText(String.valueOf(ans));
        }catch(Exception e){}
//        screen.setText(screen.getText()+" Antilog ");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void printoptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printoptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printoptActionPerformed

    // My Methods.....
    
    public ArrayList eqArrayList(){
        
        ArrayList <String>solve = new ArrayList();
        
        String getstring = screen.getText()+" ";
        String word = "";
        for(int i=0; i<getstring.length(); i++){
            
            char c = getstring.charAt(i);
            
            if(Character.isDigit(c) || c == '.')
                word += c;
            else if(Character.isLetter(c))
                word += c; 
            else{
                solve.add(word);
                word = "";
                
                if(c != ' '){
                    word += c;
                    solve.add(word);
                    word = "";
                }
            }  
        }
        
        return solve;
    }
    
    private boolean isOperator(String input) {
        return !Character.isDigit(input.charAt(0));

    }
    
    public boolean checkLastChar(char oparetor){
        
        if(screen.getText().equals(""))
            return false;
        
        char c = screen.getText().charAt(screen.getText().length()-1);
        
        if(oparetor == c)
            return false;
        else
            return true;
    }
    
    public int priority(String sign){
        
        switch (sign) {
            
            case "+" :
            case "-" : return 0; 
            
            case "*" :
            case "/" : return 1;
            
            case "sqrt" :
            case "^" : return 2;
            
            case "Antilog" :
            case "Log" :
            case "Sin" :
            case "Cos" :
            case "Tan" :
            case "Sinh" :
            case "Cosh" :
            case "Tanh" : return 3;
            default:
                break;
        }
        return -1;
    }
    
    public String[] infixToPostfix(ArrayList input){
        
        Stack <String>stack = new Stack();
    
        String[] postfix = new String[input.size()];
        int k=0;
        
        for (int i = 0; i < input.size(); i++){
            
            postfix[k] = "";
            String c = String.valueOf(input.get(i));
            
            if (Character.isDigit(c.charAt(0))) {

                postfix[k] = c;
                k++;
            }
            else if (c.equals("(")) {

                stack.push(c);
            } 
            else if (c.equals(")")) {

                while (!String.valueOf(stack.peek()).equals("(")) {

                    postfix[k] = String.valueOf(stack.pop());
                    k++;
                }
                
                stack.pop();
            }
            else if (c.equals("-") || c.equals("+") || c.equals("*") || c.equals("/") || c.equals("^")
                    || c.equals("Sin") || c.equals("Cos") || c.equals("Tan") || c.equals("Log")
                    || c.equals("Sinh") || c.equals("Cosh") || c.equals("Tanh") || c.equals("Antilog")
                    || c.equals("sqrt")){
            
                while (stack.size() > 0 && !String.valueOf(stack.peek()).equals("(")
                        && priority(c) <= priority(String.valueOf(stack.peek()))) {

                    postfix[k] = String.valueOf(stack.pop());
                    k++;
                }
                stack.push(c);
            }
        }
        while (stack.size() > 0) {
            
            postfix[k] = String.valueOf(stack.pop());
            k++;
        }
        
        return postfix;
    }
    
    public String solveEquation(ArrayList infix) throws Exception{
        
    String[] postfix = infixToPostfix(infix);
    Stack <String>stack = new Stack();
    stack.push("1");
    
    for (String c : postfix){
    
        if (c == null)
            return "";
        
        if (isOperator(c)){
        
            if (c.equals("-") || c.equals("+") || c.equals("*") || c.equals("/") || 
                c.equals("^")){
            
                double op2 = Double.parseDouble(stack.pop());
                double op1 = Double.parseDouble(stack.pop());
                
                if(c.equals("^") && op2>2){
                    
                    double ans = 1;
                    for(int i = 0;i<op2;i++){
                        
                        ans = ans*op1;
                    }
                    stack.push(String.valueOf(ans));
                }
                else{
                    double result = twoOprandEquvation(op1,op2,c.charAt(0));
                    stack.push(String.valueOf(result));
                }
            }
            else{
            
                double op1 = Double.parseDouble(stack.pop());
                double result = oneOprandEquvation(op1,c);
                result = Double.parseDouble(stack.pop())*result;
                stack.push(String.valueOf(result));
            }
        }
        else {
            stack.push(c);
        }
    }
    
    return stack.pop();
}
    
    public double twoOprandEquvation(double x,double y,char oprand){
        
        switch(oprand){
            
            case '+' : return x+y;
            case '-' : return x-y;
            case '*' : return x*y;
            case '/' : return x/y;
            case '^' : return x*x;
            default : return 0.0;
        }
    }
    
    public double oneOprandEquvation(double x,String oprand){
        
        switch(oprand){
            
            case "Sin" : return Math.sin(x);
            case "Cos" : return Math.cos(x);
            case "Tan" : return Math.tan(x);
            case "Tanh" : return Math.tanh(x);
            case "Cosh" : return Math.cosh(x);
            case "Sinh" : return Math.sinh(x);
            case "sqrt" : return Math.sqrt(x);
            case "Log" : return Math.log(x);
            default : return 0;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem2;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JTextField printopt;
    private java.awt.Panel science;
    private javax.swing.JTextField screen;
    private java.awt.Panel speed;
    // End of variables declaration//GEN-END:variables
}
