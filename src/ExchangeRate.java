import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExchangeRate extends JFrame implements ActionListener{

	JPanel panel1, panel2, panel3, panel4, panel5;
	JLabel label1, label2, label3, label4, label5, label6, label7;
	JTextField USD, JPY, CNY, THB, EUR, TWD, Result1, Result2, Result3, Result4, Result5, Result6;
	JButton btnOk, btnReset;
	
	public ExchangeRate() {
		setSize(1000,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("환율 계산기");
		setBackground(Color.RED);
		setLayout(new FlowLayout());
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		//컴포넌트 생성
		label1 = new JLabel("달러");
		USD = new JTextField(5);
		label2 = new JLabel("엔화");
		JPY = new JTextField(5);
		panel1.setLayout(new GridLayout());
		panel1.add(label1);
		panel1.add(USD);
		panel1.add(label2);
		panel1.add(JPY);
		
		label3 = new JLabel("위안");
		CNY = new JTextField(5);
		label4 = new JLabel("바트");
		THB = new JTextField(5);
		panel2.setLayout(new GridLayout());
		panel2.add(label3);
		panel2.add(CNY);
		panel2.add(label4);
		panel2.add(THB);
		
		label5 = new JLabel("유로");
		EUR = new JTextField(5);
		label6 = new JLabel("대만");
		TWD = new JTextField(5);
		panel3.setLayout(new GridLayout());
		panel3.add(label5);
		panel3.add(EUR);
		panel3.add(label6);
		panel3.add(TWD);
		
		panel4.setLayout(new FlowLayout());
		label7= new JLabel("KRW:");
		Result1 = new JTextField(10);
		Result2 = new JTextField(10);
		Result3 = new JTextField(10);
		Result4 = new JTextField(10);
		Result5 = new JTextField(10);
		Result6 = new JTextField(10);
		panel4.setLayout(new GridLayout());
		panel4.add(label7);
		panel4.add(Result1);
		panel4.add(Result2);
		panel4.add(Result3);
		panel4.add(Result4);
		panel4.add(Result5);
		panel4.add(Result6);
		
		panel5.setLayout(new BorderLayout());
		btnOk = new JButton("계산");
		btnReset = new JButton("초기화");
		btnOk.addActionListener(this);
		btnReset.addActionListener(this);
		panel5.add(btnOk);
		panel5.add(btnReset, BorderLayout.SOUTH);
		
		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
		this.add(panel4);
		this.add(panel5);
		
		
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new ExchangeRate();
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		String USD_ = USD.getText();
		int USD = Integer.parseInt(USD_);
		double unitUSD = (double)USD*1179;
		System.out.println(unitUSD);
		
		String JPY_ = JPY.getText();
		int JPY = Integer.parseInt(JPY_);
		double unitJPY = (double)JPY*10;
		System.out.println(unitJPY);
		
		String CNY_ = CNY.getText();
		int CNY = Integer.parseInt(CNY_);
		double unitCNY = (double)CNY*180;
		System.out.println(unitCNY);
		
		String THB_ = THB.getText();
		int THB = Integer.parseInt(THB_);
		double unitTHB = (double)JPY*35;
		System.out.println(unitTHB);
		
		String EUR_ = EUR.getText();
		int EUR = Integer.parseInt(EUR_);
		double unitEUR = (double)EUR*1375;
		System.out.println(unitEUR);
		
		String TWD_ = TWD.getText();
		int TWD = Integer.parseInt(TWD_);
		double unitTWD = (double)TWD*41;
		System.out.println(unitTWD);
		
		String output1 = unitUSD+"원";
		String output2 = unitJPY+"원";
		String output3 = unitCNY+"원";
		String output4 = unitTHB+"원";
		String output5 = unitEUR+"원";
		String output6 = unitTWD+"원";
		
		Result1.setText(output1);
		Result2.setText(output2);
		Result3.setText(output3);
		Result4.setText(output4);
		Result5.setText(output5);
		Result6.setText(output6);
		
		if(e.getSource() == btnReset) {
			Result1.setText("");
			Result2.setText("");
			Result3.setText("");
			Result4.setText("");
			Result5.setText("");
			Result6.setText("");
			repaint();
		}
	}

}

