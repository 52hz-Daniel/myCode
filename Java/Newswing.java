
import java.awt.*;  
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.EmptyBorder;  

public class Newswing extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel, lblNewLabel_1, lblNewLabel_2, lblNewLabel_3, lblNewLabel_4, lblNewLabel_5, lblNewLabel_6, lblNewLabel_7, lblNewLabel_8, lblNewLabel_9, lblNewLabel_10, lblNewLabel_11, lblNewLabel_12, lblNewLabel_13, lblNewLabel_14, lblNewLabel_15;
	private int a[][]= new int [4][4];
	private int x, y=0, z, v;
	private char t;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Newswing frame = new Newswing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Newswing() {
		setTitle("JAVA2048 By Rubin V1.02");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 423, 294);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(6, 6, 6, 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("0");
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(123, 53, 33, 33);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(166, 53, 33, 33);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("0");
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setFont(new Font("宋体", Font.BOLD, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(209, 53, 33, 33);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("0");
		lblNewLabel_3.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_3.setFont(new Font("宋体", Font.BOLD, 16));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(252, 53, 33, 33);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("0");
		lblNewLabel_4.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_4.setFont(new Font("宋体", Font.BOLD, 16));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(123, 96, 33, 33);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("0");
		lblNewLabel_5.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5.setFont(new Font("宋体", Font.BOLD, 16));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(166, 96, 33, 33);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("0");
		lblNewLabel_6.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_6.setFont(new Font("宋体", Font.BOLD, 16));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(209, 96, 33, 33);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("0");
		lblNewLabel_7.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_7.setFont(new Font("宋体", Font.BOLD, 16));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(252, 96, 33, 33);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("0");
		lblNewLabel_8.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_8.setFont(new Font("宋体", Font.BOLD, 16));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(123, 139, 33, 33);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("0");
		lblNewLabel_9.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_9.setFont(new Font("宋体", Font.BOLD, 16));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(166, 139, 33, 33);
		contentPane.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("0");
		lblNewLabel_10.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_10.setFont(new Font("宋体", Font.BOLD, 16));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(209, 139, 33, 33);
		contentPane.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("0");
		lblNewLabel_11.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_11.setFont(new Font("宋体", Font.BOLD, 16));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(252, 139, 33, 33);
		contentPane.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("0");
		lblNewLabel_12.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_12.setFont(new Font("宋体", Font.BOLD, 16));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBounds(123, 182, 33, 33);
		contentPane.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("0");
		lblNewLabel_13.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_13.setFont(new Font("宋体", Font.BOLD, 16));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setBounds(166, 182, 33, 33);
		contentPane.add(lblNewLabel_13);
		
		lblNewLabel_14 = new JLabel("0");
		lblNewLabel_14.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_14.setFont(new Font("宋体", Font.BOLD, 16));
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setBounds(209, 182, 33, 33);
		contentPane.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("0");
		lblNewLabel_15.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_15.setFont(new Font("宋体", Font.BOLD, 16));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setBounds(252, 182, 33, 33);
		contentPane.add(lblNewLabel_15);
		
		JButton btnNewButton = new JButton("Up");
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 18));
		btnNewButton.setBounds(79, 0, 251, 43);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Left");
		btnNewButton_1.setBounds(10, 0, 59, 257);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Right");
		btnNewButton_2.setBounds(340, 0, 65, 257);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Down");
		btnNewButton_3.setFont(new Font("宋体", Font.PLAIN, 18));
		btnNewButton_3.setBounds(79, 213, 251, 50);
		contentPane.add(btnNewButton_3);
		
		btnNewButton.addActionListener(new BL());
		btnNewButton_1.addActionListener(new BL());
		btnNewButton_2.addActionListener(new BL());
		btnNewButton_3.addActionListener(new BL());
        
	}

		public class BL implements ActionListener   {
		public void actionPerformed(ActionEvent ae) {
			
			Random r=new Random();
			
			if (ae.getActionCommand().equals("Up"))
				t='w';
	        else if (ae.getActionCommand().equals("Left")) 
	        	t='a';
	        else if (ae.getActionCommand().equals("Right")) 
	        	t='d';
	        else if (ae.getActionCommand().equals("Down")) 
	        	t='s';
			
				y=0;
				z=0;
				
				if (t=='a')
					for(int c=0; c<=3;c++)
					{
						for(int b=1; b<=3; b++)
							while(b!=0&&a[b-1][c]==0&&a[b][c]!=0)
							{
								a[b-1][c]=a[b][c];
								a[b][c]=0;
								if(b!=0)
								b--;
							}
						
						for(int b=3; b>=1; b--)
							if(a[b-1][c]==a[b][c]&&a[b][c]!=0)
							{
								a[b-1][c]+=a[b][c];
								a[b][c]=0;
								b--;
							}
						
						for(int b=1; b<=3; b++)
							while(b!=0&&a[b-1][c]==0&&a[b][c]!=0)
							{
								a[b-1][c]=a[b][c];
								a[b][c]=0;
								if(b!=0)
								b--;
							}
					}
					
					else if (t=='d')
					for(int c=0; c<=3;c++)
						{
							for(int b=2; b>=0; b--)
								while(b!=3&&a[b+1][c]==0&&a[b][c]!=0)
								{
									a[b+1][c]=a[b][c];
									a[b][c]=0;
									if(b!=3)
									b++;
								}
							
							for(int b=0; b<=2; b++)
								if(a[b+1][c]==a[b][c]&&a[b][c]!=0)
								{
									a[b+1][c]+=a[b][c];
									a[b][c]=0;
									b++;
								}
							
							for(int b=2; b>=0; b--)
								while(b!=3&&a[b+1][c]==0&&a[b][c]!=0)
								{
									a[b+1][c]=a[b][c];
									a[b][c]=0;
									if(b!=3)
									b++;
								}
						}
				
					else if (t=='w')
					for(int b=0; b<=3;b++)
					{
						for(int c=1; c<=3; c++)
							while(c!=0&&a[b][c-1]==0&&a[b][c]!=0)
							{
								a[b][c-1]=a[b][c];
								a[b][c]=0;
								if(c!=0)
								c--;
							}
						
						for(int c=3; c>=1; c--)
							if(a[b][c-1]==a[b][c]&&a[b][c]!=0)
							{
								a[b][c-1]+=a[b][c];
								a[b][c]=0;
								c--;
							}
						
						for(int c=1; c<=3; c++)
							while(c!=0&&a[b][c-1]==0&&a[b][c]!=0)
							{
								a[b][c-1]=a[b][c];
								a[b][c]=0;
								if(c!=0)
								c--;
							}
					}
				
					else if (t=='s')
					for(int b=0; b<=3;b++)
					{
						for(int c=2; c>=0; c--)
							while(c!=3&&a[b][c+1]==0&&a[b][c]!=0)
							{
								a[b][c+1]=a[b][c];
								a[b][c]=0;
								if(c!=3)
								c++;
							}
						
						for(int c=0; c<=2; c++)
							if(a[b][c+1]==a[b][c]&&a[b][c]!=0)
							{
								a[b][c+1]+=a[b][c];
								a[b][c]=0;
								c++;
							}
						
						for(int c=2; c>=0; c--)
							while(c!=3&&a[b][c+1]==0&&a[b][c]!=0)
							{
								a[b][c+1]=a[b][c];
								a[b][c]=0;
								if(c!=3)
								c++;
							}
					}
				
				for(int c=0; c<=15;c++)
					if (a[c%4][c/4]==0)
					z++;
				
					if(z==0)
					{
						JOptionPane.showMessageDialog(null, "Game Over");
						System.exit(0);
					}	
					
					x=r.nextInt(z);
					for(int c=0; c<=15;c++)
						if (a[c%4][c/4]==0)
						{
							if(y==x)
							{
								v=(r.nextInt(2)+1)*2;
								a[c%4][c/4]=v;
								c=16;
							}
							y++;
								
						}
					lblNewLabel.setText(""+a[0][0]);
					lblNewLabel_1.setText(""+a[1][0]);
					lblNewLabel_2.setText(""+a[2][0]);
					lblNewLabel_3.setText(""+a[3][0]);
					lblNewLabel_4.setText(""+a[0][1]);
					lblNewLabel_5.setText(""+a[1][1]);
					lblNewLabel_6.setText(""+a[2][1]);
					lblNewLabel_7.setText(""+a[3][1]);
					lblNewLabel_8.setText(""+a[0][2]);
					lblNewLabel_9.setText(""+a[1][2]);
					lblNewLabel_10.setText(""+a[2][2]);
					lblNewLabel_11.setText(""+a[3][2]);
					lblNewLabel_12.setText(""+a[0][3]);
					lblNewLabel_13.setText(""+a[1][3]);
					lblNewLabel_14.setText(""+a[2][3]);
					lblNewLabel_15.setText(""+a[3][3]);
					
					}
			}
	}

