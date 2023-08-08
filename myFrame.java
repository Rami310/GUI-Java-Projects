package calculator;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class myFrame extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private static final int BUTTON_WIDTH = 60;
	private static final int BUTTON_HEIGHT = 60;
	double num = 0, n1 = 0, n2 = 0;
	boolean plus = false, minus = false, div = false, multi = false;
	
	private TextField text;
	private Button b0, b1, b2, b3, b4, b5, b6, b7, 
			b8, b9, bx, bPlus, bMinus, bDiv,
			bDot, bEquals, bDel, bClr;
	
	myFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(360, 500);
		this.setVisible(true);
		this.setResizable(false);
		this.setTitle("Calculator");
		this.setLocationRelativeTo(null);
		
		ImageIcon image = new ImageIcon("calculatorIcon.png");
		this.setIconImage(image.getImage());
		
		
		b1 = new Button();
		b1.setBounds(40, 60, BUTTON_WIDTH, BUTTON_HEIGHT);
		b1.setLabel("1");
		b1.setFont(new Font("Consolas", Font.ITALIC, 25));
		b1.setBackground(Color.gray);
		b1.addActionListener(this);
		
		b2 = new Button();
		b2.setBounds(110, 60, BUTTON_WIDTH, BUTTON_HEIGHT);
		b2.setLabel("2");
		b2.setFont(new Font("Consolas", Font.ITALIC, 25));
		b2.setBackground(Color.cyan);
		b2.addActionListener(this);

		b3 = new Button();
		b3.setBounds(180, 60, BUTTON_WIDTH, BUTTON_HEIGHT);
		b3.setLabel("3");
		b3.setFont(new Font("Consolas", Font.ITALIC, 25));
		b3.setBackground(new Color(250));
		b3.addActionListener(this);

		bPlus = new Button();
		bPlus.setBounds(250, 60, BUTTON_WIDTH, BUTTON_HEIGHT);
		bPlus.setLabel("+");
		bPlus.setFont(new Font("Consolas", Font.ITALIC, 25));
		bPlus.addActionListener(this);

		b4 = new Button();
		b4.setBounds(40, 130, BUTTON_WIDTH, BUTTON_HEIGHT);
		b4.setLabel("4");
		b4.setFont(new Font("Consolas", Font.ITALIC, 25));
		b4.setBackground(new Color(51,204,95));
		b4.addActionListener(this);

		b5 = new Button();
		b5.setBounds(110, 130, BUTTON_WIDTH, BUTTON_HEIGHT);
		b5.setLabel("5");
		b5.setFont(new Font("Consolas", Font.ITALIC, 25));
		b5.setBackground(new Color(10,255,102));
		b5.addActionListener(this);

		b6 = new Button();
		b6.setBounds(180, 130, BUTTON_WIDTH, BUTTON_HEIGHT);
		b6.setLabel("6");
		b6.setFont(new Font("Consolas", Font.ITALIC, 25));
		b6.setBackground(new Color(0,200,0));
		b6.addActionListener(this);

		bMinus = new Button();
		bMinus.setBounds(250, 130, BUTTON_WIDTH, BUTTON_HEIGHT);
		bMinus.setLabel("-");
		bMinus.setFont(new Font("Consolas", Font.ITALIC, 25));
		bMinus.addActionListener(this);

		b7 = new Button();
		b7.setBounds(40, 200, BUTTON_WIDTH, BUTTON_HEIGHT);
		b7.setLabel("7");
		b7.setFont(new Font("Consolas", Font.ITALIC, 25));
		b7.setBackground(new Color(200,51,51));
		b7.addActionListener(this);

		b8 = new Button();
		b8.setBounds(110, 200, BUTTON_WIDTH, BUTTON_HEIGHT);
		b8.setLabel("8");
		b8.setFont(new Font("Consolas", Font.ITALIC, 25));
		b8.setBackground(new Color(102,50,100));
		b8.addActionListener(this);

		b9 = new Button();
		b9.setBounds(180, 200, BUTTON_WIDTH, BUTTON_HEIGHT);
		b9.setLabel("9");
		b9.setFont(new Font("Consolas", Font.ITALIC, 25));
		b9.setBackground(new Color(151,207,255));
		b9.addActionListener(this);

		bx = new Button();
		bx.setBounds(250, 200, BUTTON_WIDTH, BUTTON_HEIGHT);
		bx.setLabel("x");
		bx.setFont(new Font("Consolas", Font.ITALIC, 25));
		bx.addActionListener(this);

		bDot = new Button();
		bDot.setBounds(40, 270, BUTTON_WIDTH, BUTTON_HEIGHT);
		bDot.setLabel(".");
		bDot.setFont(new Font("Consolas", Font.ITALIC, 25));
		bDot.addActionListener(this);

		b0 = new Button();
		b0.setBounds(110, 270, BUTTON_WIDTH, BUTTON_HEIGHT);
		b0.setLabel("0");
		b0.setFont(new Font("Consolas", Font.ITALIC, 25));
		b0.setBackground(new Color(1,100,255));
		b0.addActionListener(this);

		bEquals = new Button();
		bEquals.setBounds(180, 270, BUTTON_WIDTH, BUTTON_HEIGHT);
		bEquals.setLabel("=");
		bEquals.setFont(new Font("Consolas", Font.ITALIC, 25));
		bEquals.addActionListener(this);

		bDiv = new Button();
		bDiv.setBounds(250, 270, BUTTON_WIDTH, BUTTON_HEIGHT);
		bDiv.setLabel("/");
		bDiv.setFont(new Font("Consolas", Font.ITALIC, 25));
		bDiv.addActionListener(this);

		bDel = new Button();
		bDel.setBounds(40, 360, BUTTON_WIDTH * 2 + 10, BUTTON_HEIGHT);
		bDel.setLabel("Delete");
		bDel.setFont(new Font("Consolas", Font.ITALIC, 25));
		bDel.addActionListener(this);

		bClr = new Button();
		bClr.setBounds(180, 360, BUTTON_WIDTH * 2 + 10, BUTTON_HEIGHT);
		bClr.setLabel("Clear");
		bClr.setFont(new Font("Consolas", Font.ITALIC, 25));
		bClr.addActionListener(this);

		
		text = new TextField();
		text.setBounds(40, 10, 270, 35);
		text.setBackground(Color.white);
		text.setFont(new Font("Consolas", Font.ITALIC, 25));
		text.setEditable(false);
		this.add(text);
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(bPlus);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(bMinus);
		this.add(b7);
		this.add(b8);
		this.add(b9);
		this.add(bx);
		this.add(bDot);
		this.add(b0);
		this.add(bEquals);
		this.add(bDiv);
		this.add(bDel);
		this.add(bClr);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == b1)
		{
			text.setText(text.getText().concat("1"));
		}
		if(e.getSource() == b2)
		{
			text.setText(text.getText().concat("2"));
		}
		if(e.getSource() == b3)
		{
			text.setText(text.getText().concat("3"));
		}
		if(e.getSource() == b4)
		{
			text.setText(text.getText().concat("4"));
		}
		if(e.getSource() == b5)
		{
			text.setText(text.getText().concat("5"));
		}
		if(e.getSource() == b6)
		{
			text.setText(text.getText().concat("6"));
		}
		if(e.getSource() == b7)
		{
			text.setText(text.getText().concat("7"));
		}
		if(e.getSource() == b8)
		{
			text.setText(text.getText().concat("8"));
		}
		if(e.getSource() == b9)
		{
			text.setText(text.getText().concat("9"));
		}
		if(e.getSource() == b0)
		{
				text.setText(text.getText().concat("0"));
		}
		if(e.getSource() == bClr)
		{
			text.setText(null);
		}
		if(e.getSource() == bDel)
		{
			String string = text.getText();
			text.setText("");
			for(int i = 0; i < string.length() - 1; i++)
				text.setText(text.getText() + string.charAt(i));
		}
		if(e.getSource() == bDot)
		{
			if(!checkTextString())
				text.setText(text.getText().concat("."));
		}
		if(e.getSource() == bPlus)
		{
			if(!checkTextString())
			{
				plus = true;
				minus = false;
				div = false;
				multi = false;
				n1 = Double.valueOf(text.getText());
				text.setText(null);
			}
		}
		if(e.getSource() == bMinus)
		{
			if(!checkTextString())
			{
				plus = false;
				minus = true;
				div = false;
				multi = false;
				n1 = Double.valueOf(text.getText());
				text.setText(null);
			}
		}
		if(e.getSource() == bx)
		{
			if(!checkTextString())
			{
				plus = false;
				minus = false;
				div = false;
				multi = true;
				n1 = Double.valueOf(text.getText());
				text.setText(null);
			}
		}
		if(e.getSource() == bDiv)
		{
			if(!checkTextString())
			{
				plus = false;
				minus = false;
				div = true;
				multi = false;
				n1 = Double.valueOf(text.getText());
				text.setText(null);
			}
		}
		if(e.getSource() == bEquals) 
		{
			if(!checkTextString())
			{
				n2 = Double.parseDouble(text.getText());
				if(plus)
				{
					num = n1 + n2;
					text.setText(String.valueOf(num));
				}
				else if(minus)
				{
					num = n1 - n2;
					text.setText(String.valueOf(num));
				}
				else if(multi)
				{
					num = n1 * n2;
					text.setText(String.valueOf(num));
				}
				else if(div)
				{
					if(n2 != 0)
					{
						num = n1 / n2;
						text.setText(String.valueOf(num));
					}
					else text.setText("ERROR!!");
				}
			}
		}
	}
	boolean checkTextString() {
		return text.getText().equals("ERROR!!") || text.getText().equals("ERROR!") || text.getText().equals("ERROR")
				|| text.getText().equals("ERRO") || text.getText().equals("ERR") || text.getText().equals("ER")
				|| text.getText().equals("E") || text.getText().equals("");
	}

}
