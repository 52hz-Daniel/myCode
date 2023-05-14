 

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;


public class Encryption {
    private JPanel Interface;
    private JTextField textField1;
    private JTextArea textArea1;
    private JButton encryptButton;
    private JButton decryptButton;

    public Encryption() {
        encryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calendar y= Calendar.getInstance();
                StringBuffer x = new StringBuffer();
                char[] c = textField1.getText().toCharArray();
                for (int i = 0; i < c.length; i++) {
                    String x0=Integer.toHexString(c[i]);
                    switch(x0.length())
                    {
                        case 1:
                            x.append("0");
                        case 2:
                            x.append("0");
                        case 3:
                            x.append("0");
                    }
                    x.append(x0);
                }
                int xs=x.length()/12;
                if(x.length()%12!=0)
                    xs++;
                String s1[]=new String[xs];
                for (int i=0; i<xs; i++){
                    if(i!=x.length()/12)
                        s1[i]=x.substring(i*12,i*12+12);
                    else
                        s1[i]=x.substring(i*12);
                }
                String o="";
                int yy=y.get(Calendar.YEAR)%7+1, mm=y.get(Calendar.MONTH)%7+1, dd=y.get(Calendar.DAY_OF_MONTH)%7+1;
                for (int i=0; i<s1.length; i++) {
                    long z = Long.valueOf(s1[i], 16);
                    String x1=z/yy+""+z%yy;
                    String x2=Long.parseLong(x1)/mm+""+Long.parseLong(x1)%mm;
                    String x3=Long.parseLong(x2)/dd+""+Long.parseLong(x2)%dd;
                    o+=x3+"\n";
                }
                textArea1.setText(o);
            }
        });
        decryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calendar y = Calendar.getInstance();
                String x = "";
                String x0, y1="";
                String z=textArea1.getText();
                for(String z1:z.split("\n")) {
                    int yy = y.get(Calendar.YEAR) % 7 + 1, mm = y.get(Calendar.MONTH) % 7 + 1, dd = y.get(Calendar.DAY_OF_MONTH) % 7 + 1;
                    String a1 = "" + (Long.parseLong(z1.substring(0, z1.length() - 1)) * dd + Long.parseLong(z1.substring(z1.length() - 1)));
                    String a2 = "" + (Long.parseLong(a1.substring(0, a1.length() - 1)) * mm + Long.parseLong(a1.substring(a1.length() - 1)));
                    String a3 = "" + (Long.parseLong(a2.substring(0, a2.length() - 1)) * yy + Long.parseLong(a2.substring(a2.length() - 1)));
                    x0= Long.toHexString(Long.parseLong(a3));
                    switch(x0.length()%4)
                    {
                        case 1:
                            x+="0";
                        case 2:
                            x+="0";
                        case 3:
                            x+="0";
                    }
                    x += x0;
                }
                for (int i = 0; i < x.length(); i += 4) {
                    y1+=(char) Integer.parseInt(x.substring(i, i + 4), 16);
                }
                textField1.setText(y1);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Encryption");
        frame.setContentPane(new Encryption().Interface);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
