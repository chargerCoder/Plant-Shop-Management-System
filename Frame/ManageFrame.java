package Frame;

import Entity.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class ManageFrame extends JFrame implements ActionListener
{
	private JPanel panel, sellPanel, buyPanel, detailsPanel;
	private JLabel labelZERO, label1, label2, label3, label4, label5, label6;
	private JLabel label7, label8, label9;
	private JLabel label10, label11, label12, label13;
	
	private JTextField tf1, tf2, tf3;
	private JPasswordField pf1;
	private JComboBox jb1, jb2, jb3, jb4, jb5;
	private JRadioButton rb_, rb, rb0, rb1, rb2, rb3;
	private ButtonGroup bg1, bg2;
	private JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7;
	private JTextArea ta;
	private ImageIcon img;

	private Font f1, f2;
	private Color c1;

	public ManageFrame(){
		super("Plant & Shop Management System");

		super.setBounds(600, 200, 800, 800);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 800, 800);
		c1 = new Color(210, 230, 210);
		panel.setBackground(c1);

		f1 = new Font("Cambria", Font.BOLD, 30);
		f2 = new Font("Cambria", Font.BOLD, 20);



		label1 = new JLabel("User Information");
		label1.setBounds(300, 60, 500, 50);
		label1.setFont(f1);
		panel.add(label1);
		
		img = new ImageIcon("Picture\\Plant.jpg");
		labelZERO = new JLabel(img);
		labelZERO.setBounds(630, 30, 100, 100); //(x, y, width, height)
		panel.add(labelZERO);
		
		label2 = new JLabel("Customer Name: ");
		label2.setBounds(150, 150, 200, 40);
		label2.setFont(f2);
		panel.add(label2);

		tf1 = new JTextField();
		tf1.setBounds(350, 150, 250, 40);
		tf1.setFont(f2);
		panel.add(tf1);

		label3 = new JLabel("Division: ");
		label3.setBounds(150, 200, 200,40);
		label3.setFont(f2);
		panel.add(label3);
		
		String items[] = new String[] {"", "Dhaka", "Chittagong(Chattogram)", "Khulna", "Rajshahi", "Rangpur", "Mymensingh", "Sylhet", "Barishal"};
		jb1 = new JComboBox(items);
		jb1.setBounds(350, 200, 250, 40);
		jb1.setFont(f2);
		panel.add(jb1);
		
		label4 = new JLabel("Gardening Skill: ");
		label4.setBounds(150, 250, 200, 40);
		label4.setFont(f2);
		panel.add(label4);
		
		rb_ = new JRadioButton("Beginner");
		rb_.setBounds(350, 250,120,40); //(x, y, width, height)
		rb_.setFont(f2);
		rb_.setBackground(c1);
		panel.add(rb_);
		
		rb = new JRadioButton("Intermediate");
		rb.setBounds(480, 250, 150, 40); //(x, y, width, height)
		rb.setFont(f2);
		rb.setBackground(c1);
		panel.add(rb);
		
		rb0 = new JRadioButton("Expert");
		rb0.setBounds(650, 250, 150, 40); //(x, y, width, height)
		rb0.setFont(f2);
		rb0.setBackground(c1);
		panel.add(rb0);
		
		bg1 = new ButtonGroup();
		bg1.add(rb_);
		bg1.add(rb);
		bg1.add(rb0);
		
		label5 = new JLabel("Contact No: ");
		label5.setBounds(150, 300, 200, 40);
		label5.setFont(f2);
		panel.add(label5);
		
		pf1 = new JPasswordField();
		pf1.setBounds(350,300,250,40);
		pf1.setEchoChar('*');
		panel.add(pf1);
		
		
		label6= new JLabel("Plant: ");
		label6.setBounds(150, 350, 200, 40);
		label6.setFont(f2);
		panel.add(label6);
		
		rb1 = new JRadioButton("Buy Plant");
		rb1.setBounds(350, 350, 120, 40); //(x, y, width, height)
		rb1.setFont(f2);
		rb1.setBackground(c1);
		panel.add(rb1);
		
		rb2 = new JRadioButton("Sell Plant");
		rb2.setBounds(480, 350, 150, 40); //(x, y, width, height)
		rb2.setFont(f2);
		rb2.setBackground(c1);
		panel.add(rb2);
		
		bg2 = new ButtonGroup();
		bg2.add(rb1);
		bg2.add(rb2);
		
		bt1 = new JButton("Continue");
		bt1.setBounds(350, 400, 140, 40);
		bt1.setFont(f2);
		panel.add(bt1);
		bt1.addActionListener(this);
		
		bt6 = new JButton("Details");
		bt6.setBounds(350, 450, 140, 40);
		bt6.setFont(f2);
		panel.add(bt6);
		bt6.addActionListener(this);
		
		
		
		SellPanel();
		BuyPanel();	
		DetailsPanel();
		
		super.add(panel);
		super.add(sellPanel);
		super.add(buyPanel);
		super.add(detailsPanel);
		
		panel.setVisible(true);
		sellPanel.setVisible(false);
		buyPanel.setVisible(false);
		detailsPanel.setVisible(false);
	}
	//////////////////////
	public void SellPanel(){
		sellPanel = new JPanel();
		sellPanel.setLayout(null);
		sellPanel.setBounds(0, 0, 800, 800);
		c1 = new Color(210, 230, 210);
		sellPanel.setBackground(c1);
		
		label7 = new JLabel("Sell Plant");
		label7.setBounds(350, 60, 500, 50);
		label7.setFont(f1);
		sellPanel.add(label7);
		
		label8 = new JLabel("Select Plant: ");
		label8.setBounds(150, 150, 500, 50);
		label8.setFont(f2);
		sellPanel.add(label8);
		
		String plantList[] = new String[] {"", "Gada(30tk)", "Golap(100tk)", "Beli(60tk)", "Joba(80tk)", "Nayantara(40tk)", "Lily(150tk)", "Cactus(120tk)"};
		jb2 = new JComboBox(plantList);
		jb2.setBounds(150, 200, 250, 40);
		jb2.setFont(f2);
		sellPanel.add(jb2);
		
		label8 = new JLabel("Quantity: ");
		label8.setBounds(150, 250, 500, 50);
		label8.setFont(f2);
		sellPanel.add(label8);
		
		String[] quantities = {"", "1", "2", "3", "4", "5", "10"};
		jb3 = new JComboBox(quantities);
		jb3.setBounds(150, 300, 250, 40);
		jb3.setFont(f2);
		sellPanel.add(jb3);
		
		label9 = new JLabel("Total Prices: ");
		label9.setBounds(150, 350, 500, 50);
		label9.setFont(f2);
		sellPanel.add(label9);
		
		bt2 = new JButton("Calculate");
		bt2.setBounds(300, 350, 140, 40);
		bt2.setFont(f2);
		sellPanel.add(bt2);
		bt2.addActionListener(this);
		
		tf2 = new JTextField(10);
		tf2.setEditable(false); 
		tf2.setBounds(150, 400, 250, 40);
		tf2.setForeground(Color.BLUE);
		tf2.setFont(f2);
		sellPanel.add(tf2);
		
		bt3 = new JButton("Sell");
		bt3.setBounds(350, 450, 140, 40);
		bt3.setFont(f2);
		sellPanel.add(bt3);
		bt3.addActionListener(this);
		
	}
	public void BuyPanel(){
		buyPanel = new JPanel();
		buyPanel.setLayout(null);
		buyPanel.setBounds(0, 0, 800, 800);
		c1 = new Color(210, 230, 210);
		buyPanel.setBackground(c1);
		
		label10 = new JLabel("Buy Plant");
		label10.setBounds(350, 60, 500, 50);
		label10.setFont(f1);
		buyPanel.add(label10);
		
		label11 = new JLabel("Select Plant: ");
		label11.setBounds(150, 150, 500, 50);
		label11.setFont(f2);
		buyPanel.add(label11);
		
		String plantList[] = new String[] {"", "Gada(40tk)", "Golap(110tk)", "Beli(70tk)", "Joba(90tk)", "Nayantara(50tk)", "Lily(160tk)", "Cactus(130tk)"};
		jb4 = new JComboBox(plantList);
		jb4.setBounds(150, 200, 250, 40);
		jb4.setFont(f2);
		buyPanel.add(jb4);
		
		label12 = new JLabel("Quantity: ");
		label12.setBounds(150, 250, 500, 50);
		label12.setFont(f2);
		buyPanel.add(label12);
		
		String[] quantities = {"", "1", "2", "3", "4", "5", "10"};
		jb5 = new JComboBox(quantities);
		jb5.setBounds(150, 300, 250, 40);
		jb5.setFont(f2);
		buyPanel.add(jb5);
		
		label13 = new JLabel("Total Prices: ");
		label13.setBounds(150, 350, 500, 50);
		label13.setFont(f2);
		buyPanel.add(label13);
		
		bt4 = new JButton("Calculate");
		bt4.setBounds(300, 350, 140, 40);
		bt4.setFont(f2);
		buyPanel.add(bt4);
		bt4.addActionListener(this);
		
		tf3 = new JTextField(10);
		tf3.setEditable(false); 
		tf3.setBounds(150, 400, 250, 40);
		tf3.setForeground(Color.BLUE);
		tf3.setFont(f2);
		buyPanel.add(tf3);
		
		bt5 = new JButton("Buy");
		bt5.setBounds(350, 450, 140, 40);
		bt5.setFont(f2);
		buyPanel.add(bt5);
		bt5.addActionListener(this);
	}
	public void DetailsPanel(){
		
		
		detailsPanel = new JPanel();
		detailsPanel.setLayout(null);
		detailsPanel.setBounds(0, 0, 800, 800);
		c1 = new Color(211, 211, 211);
		detailsPanel.setBackground(c1);
		
		ta = new JTextArea();
		JScrollPane scroll = new JScrollPane(ta);
		scroll.setBounds(100, 100, 600, 600);
		ta.setFont(f2);
		detailsPanel.add(scroll);
		showInfo();
		
		bt7 = new JButton("Back");
		bt7.setBounds(330, 710, 130, 40);
		bt7.setFont(f2);
		detailsPanel.add(bt7);
		bt7.addActionListener(this);
		
		
	}
	
	
	public double SellCalculate(){
		String plantName = jb2.getSelectedItem().toString();
		int quantityPlant = Integer.parseInt(jb3.getSelectedItem().toString());
		int singlePrice = 0;
		if(plantName.equals("Gada(30tk)")){
			singlePrice += 30;
		}
		else if(plantName.equals("Golap(100tk)")){
			singlePrice += 100;
		}
		else if(plantName.equals("Beli(60tk)")){
			singlePrice += 60;
		}
		else if(plantName.equals("Joba(80tk)")){
			singlePrice += 80;
		}
		else if(plantName.equals("Nayantara(40tk)")){
			singlePrice += 40;
		}
		else if(plantName.equals("Lily(150tk)")){
			singlePrice += 150;
		}
		else if(plantName.equals("Cactus(120tk)")){
			singlePrice += 120;
		}
		else{
			singlePrice += 0;
		}
		
		return singlePrice * quantityPlant;
		
	}
	public double BuyCalculate(){
		String plantName = jb4.getSelectedItem().toString();
		int quantityPlant = Integer.parseInt(jb5.getSelectedItem().toString());
		int singlePrice = 0;
		if(plantName.equals("Gada(40tk)")){
			singlePrice += 40;
		}
		else if(plantName.equals("Golap(110tk)")){
			singlePrice += 110;
		}
		else if(plantName.equals("Beli(70tk)")){
			singlePrice += 70;
		}
		else if(plantName.equals("Joba(90tk)")){
			singlePrice += 90;
		}
		else if(plantName.equals("Nayantara(50tk)")){
			singlePrice += 50;
		}
		else if(plantName.equals("Lily(160tk)")){
			singlePrice += 160;
		}
		else if(plantName.equals("Cactus(130tk)")){
			singlePrice += 130;
		}
		else{
			singlePrice += 0;
		}
		
		return singlePrice * quantityPlant;
		
	}
	
	

	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == bt1){
			String s1, s2, s3, s4, s5;
			s1 = tf1.getText();
			s2 = jb1.getSelectedItem().toString();
			
			if(rb_.isSelected())
			{
				s3 = rb_.getText();
			}
			else if(rb.isSelected())
			{
				s3 = rb.getText();
			}
			else if(rb0.isSelected())
			{
				s3 = rb0.getText();
			}
			else{
				s3 = "";
			}
			s4 = pf1.getText();
			
			if(rb1.isSelected())
			{
				s5 = rb1.getText();
			}
			else if(rb2.isSelected())
			{
				s5 = rb2.getText();
			}
			else{
				s5 = "";
			}
			
			if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty() || s5.isEmpty()){
				JOptionPane.showMessageDialog(this,"Kindly fill up all the information");
			}
			else{
				if(rb1.isSelected()){
					panel.setVisible(false);
					buyPanel.setVisible(true);
				}
				else if(rb2.isSelected()){
					panel.setVisible(false);
					sellPanel.setVisible(true);
				}
			}
			
		}
		
		if(ae.getSource() == bt2){
			tf2.setText(SellCalculate() + " TK");
		}
		if(ae.getSource() == bt3)
		{
			String s1, s2, s3, s4, s5, s6, s7;
			double s8;
			s1 = tf1.getText();
			s2 = jb1.getSelectedItem().toString();
			
			if(rb_.isSelected())
			{
				s3 = rb_.getText();
			}
			else if(rb.isSelected())
			{
				s3 = rb.getText();
			}
			else if(rb0.isSelected())
			{
				s3 = rb0.getText();
			}
			else{
				s3 = "";
			}
			s4 = pf1.getText();
			
			if(rb1.isSelected())
			{
				s5 = rb1.getText();
			}
			else if(rb2.isSelected())
			{
				s5 = rb2.getText();
			}
			else{
				s5 = "";
			}
			
			s6 = jb2.getSelectedItem().toString();
			s7 = jb3.getSelectedItem().toString();
			s8 = SellCalculate();
			
			if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty() || s5.isEmpty() || s6.isEmpty() || s7.isEmpty()){
				JOptionPane.showMessageDialog(this,"Kindly fill up all the information");
			}
			else{
				DataStore ds = new DataStore(s1, s2, s3, s4, s5, s6, s7, s8);
				ds.insertAllInfo();
				JOptionPane.showMessageDialog(this,"Thanks for selling the plants for " + SellCalculate() + " tk");
				System.exit(0);
			}
		}
			
			
			
			
			
		if(ae.getSource() == bt4){
			tf3.setText(BuyCalculate() + " TK");
		}
		if(ae.getSource() == bt5){
			String s1, s2, s3, s4, s5, s6, s7;
			double s8;
			s1 = tf1.getText();
			s2 = jb1.getSelectedItem().toString();
			
			if(rb_.isSelected())
			{
				s3 = rb_.getText();
			}
			else if(rb.isSelected())
			{
				s3 = rb.getText();
			}
			else if(rb0.isSelected())
			{
				s3 = rb0.getText();
			}
			else{
				s3 = "";
			}
			s4 = pf1.getText();
			
			if(rb1.isSelected())
			{
				s5 = rb1.getText();
			}
			else if(rb2.isSelected())
			{
				s5 = rb2.getText();
			}
			else{
				s5 = "";
			}
			
			s6 = jb4.getSelectedItem().toString();
			s7 = jb5.getSelectedItem().toString();
			s8 = BuyCalculate();
			
			if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty() || s5.isEmpty() || s6.isEmpty() || s7.isEmpty()){
				JOptionPane.showMessageDialog(this,"Kindly fill up all the information");
			}
			else{
				DataStore ds = new DataStore(s1, s2, s3, s4, s5, s6, s7, s8);
				ds.insertAllInfo();
				JOptionPane.showMessageDialog(this,"Thanks for buying the plants for " + BuyCalculate() + " tk");
				System.exit(0);
			}
		}
		if(ae.getSource() == bt6){
			panel.setVisible(false);
			detailsPanel.setVisible(true);
		}
		if(ae.getSource() == bt7){
			detailsPanel.setVisible(false);
			panel.setVisible(true);
		}
	}
	
	private void showInfo()
	{
		try 
		{
			File file = new File("./Data/userdata.txt");
			if(file.exists())
			{
				FileReader fr = new FileReader(file); 
				BufferedReader br = new BufferedReader(fr);
				
				String line;
				while((line = br.readLine()) != null)
				{
					ta.append(line+"\n");
				}
				br.close();
			}
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
			JOptionPane.showMessageDialog(this,"Error occcurs");
		}
	}
}