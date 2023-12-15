package atm_machine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATMMachine extends JFrame{
    
    private Container c;
    private JPanel panel;
    private JTextField tf, tf2;
    private JPasswordField pf;
    private JLabel label,thumb, top,l1,l2,l3,l4,l5;
    private JButton lb1, lb2, rb1, rb2;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, cnl, clr, ent, ent2, ent3;
    private Font f,g;
    private ImageIcon icon;
    private static int Balance = 5000, withdraw;
    
    private static String pin = "7967";
    
    
    ATMMachine()
    {
        ImageIcon Icon = new ImageIcon(getClass().getResource("icon.png")); 
        Image icon = Icon.getImage();
        setIconImage(icon); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("ATM");
        setSize(650,686);
        setLocationRelativeTo(null);
        
        f = new Font("Century Gothic", Font.BOLD, 18);
        g = new Font("Century Gothic", Font.BOLD, 16);
        
        c = this.getContentPane();
        c.setLayout(null);
              
        tf= new JTextField();
        tf.setBounds(221,110,211,45);
        tf.setFont(f);
        c.add(tf);
        
        pf = new JPasswordField();
        pf.setBounds(221,110,211,45);
        c.add(pf);
        pf.setEchoChar('*');
        pf.setVisible(false);
        pf.setFont(f);
        
        ImageIcon intface = new ImageIcon(getClass().getResource("interface.png")); 
        thumb = new JLabel();
        thumb.setIcon(intface);
        thumb.setSize(650,686);
        c.add(thumb);
        
        ImageIcon Lb1 = new ImageIcon(getClass().getResource("lArrow.png")); 
        JButton lb1 = new JButton();
        lb1.setBounds(10,20,138,85);
        Image image = Lb1.getImage();  
        Image newimg = image.getScaledInstance(138, 85,  java.awt.Image.SCALE_SMOOTH);  
        Lb1 = new ImageIcon(newimg);
        lb1.setIcon(Lb1);
        c.add(lb1);
        
        ImageIcon Lb2 = new ImageIcon(getClass().getResource("lArrow.png")); 
        JButton lb2 = new JButton();
        lb2.setBounds(10,136,138,85);
        Image iMage = Lb2.getImage();  
        Image Newimg = iMage.getScaledInstance(138, 85,  java.awt.Image.SCALE_SMOOTH);   
        Lb2 = new ImageIcon(Newimg);
        lb2.setIcon(Lb2);
        c.add(lb2);
        
        ImageIcon Rb1 = new ImageIcon(getClass().getResource("rArrow.png")); 
        JButton rb1 = new JButton();
        rb1.setBounds(490,20,138,85);
        Image imAge = Rb1.getImage();  
        Image nEwimg = imAge.getScaledInstance(138, 85,  java.awt.Image.SCALE_SMOOTH);  
        Rb1 = new ImageIcon(nEwimg);
        rb1.setIcon(Rb1);
        c.add(rb1);
        
        ImageIcon Rb2 = new ImageIcon(getClass().getResource("rArrow.png")); 
        JButton rb2 = new JButton();
        rb2.setBounds(490,136,138,85);
        Image imaGe = Rb2.getImage();  
        Image neWimg = imaGe.getScaledInstance(138, 85,  java.awt.Image.SCALE_SMOOTH);   
        Rb2 = new ImageIcon(neWimg);
        rb2.setIcon(Rb2);
        c.add(rb2);
        
        ImageIcon B1 = new ImageIcon(getClass().getResource("one.png")); 
        JButton b1 = new JButton();
        b1.setBounds(25,266,126,74);
        Image button1 = B1.getImage();  
        Image Button1 = button1.getScaledInstance(126, 74,  java.awt.Image.SCALE_SMOOTH);   
        B1 = new ImageIcon(Button1);
        b1.setIcon(B1);
        c.add(b1);
        
        ImageIcon B4 = new ImageIcon(getClass().getResource("four.png")); 
        JButton b4 = new JButton();
        b4.setBounds(25,366,126,74);
        Image button4 = B4.getImage();  
        Image Button4 = button4.getScaledInstance(126, 74,  java.awt.Image.SCALE_SMOOTH);   
        B4 = new ImageIcon(Button4);
        b4.setIcon(B4);
        c.add(b4);
        
        ImageIcon B7 = new ImageIcon(getClass().getResource("seven.png")); 
        JButton b7 = new JButton();
        b7.setBounds(25,466,126,74);
        Image button7 = B7.getImage();  
        Image Button7 = button7.getScaledInstance(126, 74,  java.awt.Image.SCALE_SMOOTH);   
        B7 = new ImageIcon(Button7);
        b7.setIcon(B7);
        c.add(b7);
        
        ImageIcon B2 = new ImageIcon(getClass().getResource("two.png")); 
        JButton b2 = new JButton();
        b2.setBounds(174,264,132,79);
        Image button2 = B2.getImage();  
        Image Button2 = button2.getScaledInstance(132, 79,  java.awt.Image.SCALE_SMOOTH);   
        B2 = new ImageIcon(Button2);
        b2.setIcon(B2);
        c.add(b2);
        
        ImageIcon B5 = new ImageIcon(getClass().getResource("five.png")); 
        JButton b5 = new JButton();
        b5.setBounds(175,366,132,79);
        Image button5 = B5.getImage();  
        Image Button5 = button5.getScaledInstance(132, 79,  java.awt.Image.SCALE_SMOOTH);   
        B5 = new ImageIcon(Button5);
        b5.setIcon(B5);
        c.add(b5);
        
        ImageIcon B8 = new ImageIcon(getClass().getResource("eight.png")); 
        JButton b8 = new JButton();
        b8.setBounds(175,466,132,79);
        Image button8 = B8.getImage();  
        Image Button8 = button8.getScaledInstance(132,79,  java.awt.Image.SCALE_SMOOTH);   
        B8 = new ImageIcon(Button8);
        b8.setIcon(B8);
        c.add(b8);
        
        ImageIcon B0 = new ImageIcon(getClass().getResource("zero.png")); 
        JButton b0 = new JButton();
        b0.setBounds(175,566,132,79);
        Image button0 = B0.getImage();  
        Image Button0 = button0.getScaledInstance(132,79,  java.awt.Image.SCALE_SMOOTH);   
        B0 = new ImageIcon(Button0);
        b0.setIcon(B0);
        c.add(b0);
        
        ImageIcon B3 = new ImageIcon(getClass().getResource("three.png")); 
        JButton b3 = new JButton();
        b3.setBounds(329,264,132,75);
        Image button3 = B3.getImage();  
        Image Button3 = button3.getScaledInstance(132, 75,  java.awt.Image.SCALE_SMOOTH);   
        B3 = new ImageIcon(Button3);
        b3.setIcon(B3);
        c.add(b3);
        
        ImageIcon B6 = new ImageIcon(getClass().getResource("six.png")); 
        JButton b6 = new JButton();
        b6.setBounds(329,366,132,75);
        Image button6 = B6.getImage();  
        Image Button6 = button6.getScaledInstance(132, 75,  java.awt.Image.SCALE_SMOOTH);   
        B6 = new ImageIcon(Button6);
        b6.setIcon(B6);
        c.add(b6);
        
        ImageIcon B9 = new ImageIcon(getClass().getResource("nine.png")); 
        JButton b9 = new JButton();
        b9.setBounds(329,466,132,75);
        Image button9 = B9.getImage();  
        Image Button9 = button9.getScaledInstance(132,75,  java.awt.Image.SCALE_SMOOTH);   
        B9 = new ImageIcon(Button9);
        b9.setIcon(B9);
        c.add(b9);
        
        ImageIcon Cnl = new ImageIcon(getClass().getResource("cancel.png")); 
        JButton cnl = new JButton();
        cnl.setBounds(480,264,132,76);
        Image cncl = Cnl.getImage();  
        Image Cncl = cncl.getScaledInstance(132, 76,  java.awt.Image.SCALE_SMOOTH);   
        Cnl = new ImageIcon(Cncl);
        cnl.setIcon(Cnl);
        c.add(cnl);
        
        ImageIcon Clr = new ImageIcon(getClass().getResource("clear.png")); 
        JButton clr = new JButton();
        clr.setBounds(480,366,132,76);
        Image clear = Clr.getImage();  
        Image Clear = clear.getScaledInstance(132, 76,  java.awt.Image.SCALE_SMOOTH);   
        Clr = new ImageIcon(Clear);
        clr.setIcon(Clr);
        c.add(clr);
        
        ImageIcon Ent = new ImageIcon(getClass().getResource("enter.png")); 
        JButton ent = new JButton();
        ent.setBounds(480,466,132,76);
        Image entr = Ent.getImage();  
        Image Entr = entr.getScaledInstance(132,76,  java.awt.Image.SCALE_SMOOTH);   
        Ent = new ImageIcon(Entr);
        ent.setIcon(Ent);
        c.add(ent);
        
        JButton ent2 = new JButton();
        ent2.setBounds(480,466,132,76);
        ent2.setIcon(Ent);
        c.add(ent2);
        ent2.setVisible(false);
        
        JButton ent3 = new JButton();
        ent3.setBounds(480,466,132,76);
        ent3.setIcon(Ent);
        c.add(ent3);
        ent3.setVisible(false);
        
        top = new JLabel("WELCOME!");
        top.setBounds(275,0,221,75);
        top.setFont(f);
        thumb.add(top);
        
        l1 = new JLabel("ENTER YOUR CARD NUMBER");
        l1.setBounds(221,35,221,75);
        l1.setFont(g);
        thumb.add(l1);
        
        cnl.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                tf.setText("");
            }
        });
        clr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = tf.getText();
                if (currentText.length() > 0) {
                    String newText = currentText.substring(0, currentText.length() - 1);
                    tf.setText(newText);
                }
            }
        });
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "1");
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "2");
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "3");
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "4");
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "5");
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "6");
            }
        });

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "7");
            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "8");
            }
        });

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "9");
            }
        });

        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "0");
                
            }
        });
        
        ent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cardNo = tf.getText();
                                
                if(cardNo.equals("111122223333")){
                    top.setVisible(false);
                    tf.setVisible(false);
                    pf.setVisible(true);
                    l1.setText("Enter Pin Code");
                    cnl.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            pf.setText("");
                        }
                    });

                    clr.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            char[] currentText = pf.getPassword();
                            if (currentText.length > 0) {
                                char[] newText = new char[currentText.length - 1];
                                System.arraycopy(currentText, 0, newText, 0, currentText.length - 1);
                                pf.setText(String.valueOf(newText));
                            }
                        }
                    });

                    b1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            pf.setText(new String(pf.getPassword()) + "1");
                        }
                    });

                    b2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            pf.setText(new String(pf.getPassword()) + "2");
                        }
                    });

                    b3.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            pf.setText(new String(pf.getPassword()) + "3");
                        }
                    });

                    b4.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            pf.setText(new String(pf.getPassword()) + "4");
                        }
                    });

                    b5.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            pf.setText(new String(pf.getPassword()) + "5");
                        }
                    });

                    b6.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            pf.setText(new String(pf.getPassword()) + "6");
                        }
                    });

                    b7.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            pf.setText(new String(pf.getPassword()) + "7");
                        }
                    });

                    b8.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            pf.setText(new String(pf.getPassword()) + "8");
                        }
                    });

                    b9.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            pf.setText(new String(pf.getPassword()) + "9");
                        }
                    });

                    b0.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            pf.setText(new String(pf.getPassword()) + "0");
                        }
                    });

                    ent.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String PIN = pf.getText();
                                
                            if(PIN.equals(pin)){
                                l1.setVisible(false);
                                pf.setVisible(false);
                                inside();
                                lb1.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        l2.setVisible(false);
                                        l3.setVisible(false);
                                        l4.setVisible(false);
                                        l5.setText("Back");
                                        tf.setVisible(true);
                                        top.setText("Enter amount");
                                        top.setVisible(true);
                                        ent2.setVisible(true);
                                        ent.setVisible(false);
                                        ent2.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                withdraw = Integer.parseInt(tf.getText());
                                                if(withdraw<Balance){
                                                    Balance= Balance-withdraw;
                                                    top.setText("Withdrawn");
                                                    l1.setText("New Balance: "+Balance);
                                                    l1.setVisible(true);
                                                    tf.setVisible(false);  
                                                    JOptionPane.showMessageDialog(null, "Withdrawal\nID:111122223333\nAmount: "+withdraw+"\nNew Balance: "+Balance,"Receipt",-1);
                                                }else{
                                                    top.setText("Sorry");
                                                    l1.setText("Insufficient Balance");
                                                    l1.setVisible(true);}
                                            }
                                        });
                                    }
                                });  
                                
                                lb2.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        l2.setVisible(false);
                                        l3.setVisible(false);
                                        l4.setVisible(false);
                                        l5.setText("Back");
                                        top.setText("Balance: ");
                                        top.setBounds(275,40,211,45);
                                        top.setVisible(true);
                                        l1.setText(Integer.toString(Balance));
                                        l1.setBounds(275,85,211,45);
                                        l1.setFont(f);
                                        l1.setVisible(true);    
                                    }
                                });
                                
                                rb1.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        l2.setVisible(false);
                                        l3.setVisible(false);
                                        l4.setVisible(false);
                                        l5.setText("Back");
                                        top.setText("New PIN: ");
                                        top.setBounds(275,40,211,45);
                                        top.setVisible(true);
                                        pf.setVisible(true);
                                        pf.setText("");
                                        ent3.setVisible(true);
                                        ent.setVisible(false);
                                        ent2.setVisible(false);
                                        ent3.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                pin = pf.getText();
                                                if(pin.length()!=4){
                                                    top.setText("Invalid PIN");
                                                    pf.setText("");
                                                }else{    
                                                JOptionPane.showMessageDialog(null, "PIN Changed Successfully","CHANGE PIN",-1);
                                                
                                                }
                                            }
                                        });
                                        
                                        
                                    }
                                });
                                rb2.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    dispose();
                                    ATMMachine frame = new ATMMachine();
                                    frame.setVisible(true);
                                }
                            });
                                    

                                    
                                                   

         
                              
                            }
                            else{
                                top.setText("Try Again");
                                top.setVisible(true);
                                l1.setText("Wrong PIN entered!");}      
                        }
                    });
                }
                else{
                    top.setText("Try Again");
                    l1.setText("Inelligible Card Number!"); 
                    tf.setText("");
                }      
            }
        });
            
    }

    public void inside(){  
        
        l2 = new JLabel("WITHDRAW");
        l2.setBounds(221,18,221,75);
        l2.setFont(g);
        thumb.add(l2);
        
        l3 = new JLabel("Check Balance");
        l3.setBounds(221,134,221,75);
        l3.setFont(g);
        thumb.add(l3);
        
        l4 = new JLabel("Change PIN");
        l4.setBounds(345,18,221,75);
        l4.setFont(g);
        thumb.add(l4);
        
        l5 = new JLabel("EXIT");
        l5.setBounds(420,134,221,75);
        l5.setFont(g);
        thumb.add(l5); 
        
    }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        ATMMachine frame = new ATMMachine();
        frame.setVisible(true);
        
        
        
    }
}
