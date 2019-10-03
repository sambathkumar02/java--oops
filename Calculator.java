import java.awt.*;
import java.lang.Math;
import javax.script.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class Model implements ActionListener
{
	
	JFrame f=new JFrame("Claculator");
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;
	JTextField t1=new JTextField(" ");
	String op="";double result;
	Model()
	
	{
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(408,350);
		t1.setBounds(0, 11, 398, 57);f.add(t1);
		b1=new JButton("2");b1.setBounds(72, 86, 50, 41);f.add(b1);b1.addActionListener(this);
		b2=new JButton("3");b2.setBounds(134, 86, 50, 41);f.add(b2);b2.addActionListener(this);
		b3=new JButton("-");b3.setBounds(194, 86, 50, 41);f.add(b3);b3.addActionListener(this);
		b4=new JButton("4");b4.setBounds(18, 137, 50, 41);f.add(b4);b4.addActionListener(this);
		b5=new JButton("1");b5.setBounds(16, 86, 50, 41);f.add(b5);b5.addActionListener(this);
		b6=new JButton("6");b6.setBounds(134, 137, 50, 41);f.add(b6);b6.addActionListener(this);
		b7=new JButton("x");b7.setBounds(190, 137, 54, 41);f.add(b7);b7.addActionListener(this);
		b8=new JButton("7");b8.setBounds(18, 192, 50, 41);f.add(b8);b8.addActionListener(this);
		b9=new JButton("8");b9.setBounds(74, 192, 50, 41);f.add(b9);b9.addActionListener(this);
		b10=new JButton("9");b10.setBounds(134, 192, 50, 41);f.add(b10);b10.addActionListener(this);
		b11=new JButton("5");b11.setBounds(78, 137, 50, 41);f.add(b11);b11.addActionListener(this);
		b12=new JButton("0");b12.setBounds(18, 244, 50, 41);f.add(b12);b12.addActionListener(this);
		b13=new JButton("=");b13.setBounds(78, 244, 50, 41);f.add(b13);b13.addActionListener(this);
		b14=new JButton("+");b14.setBounds(134, 244, 50, 41);f.add(b14);b14.addActionListener(this);
		b15=new JButton("(");b15.setBounds(194, 244, 50, 41);f.add(b15);b15.addActionListener(this);
		b16=new JButton("/");b16.setBounds(194, 192, 51, 41);f.add(b16);b16.addActionListener(this);
		b17=new JButton("tan");b17.setBounds(262, 201, 57, 23);f.add(b17);b17.addActionListener(this);
		b18=new JButton("sin");b18.setBounds(262, 161, 57, 23);;f.add(b18);b18.addActionListener(this);
		b19=new JButton(")");b19.setBounds(263, 244, 56, 23);f.add(b19);b19.addActionListener(this);
		b20=new JButton("log");b20.setBounds(329, 201, 54, 23);f.add(b20);b20.addActionListener(this);
		b21=new JButton(".");b21.setBounds(329, 244, 54, 23);f.add(b21);b21.addActionListener(this);
		b22=new JButton("cos");b22.setBounds(329, 161, 54, 23);f.add(b22);b22.addActionListener(this);
		b23=new JButton("AC");b23.setBounds(262, 86, 121, 23);f.add(b23);b23.addActionListener(this);
		b24=new JButton("CLR");b24.setBounds(262, 120, 121, 23);f.add(b24);b24.addActionListener(this);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}
	public void actionPerformed(ActionEvent e)
	{
		
		
		
		if(e.getSource()==b1)
			t1.setText(t1.getText()+"2");
		if(e.getSource()==b2)
			t1.setText(t1.getText()+"3");
		if(e.getSource()==b3)
			t1.setText(t1.getText()+"-");
		if(e.getSource()==b4)
			t1.setText(t1.getText()+"4");
		if(e.getSource()==b5)
			t1.setText(t1.getText()+"1");
		if(e.getSource()==b6)
			t1.setText(t1.getText()+"6");
	    if(e.getSource()==b7)
	    	t1.setText(t1.getText()+"*");
		if(e.getSource()==b8)
			t1.setText(t1.getText()+"7");
		if(e.getSource()==b9)
			t1.setText(t1.getText()+"8");
		if(e.getSource()==b10)
			t1.setText(t1.getText()+"9");
		if(e.getSource()==b11)
			t1.setText(t1.getText()+"5");
		if(e.getSource()==b12)
			t1.setText(t1.getText()+"0");
		if(e.getSource()==b13)
		{
		
			Evaluate();
			t1.setText(String.valueOf(result));
			
		}
		if(e.getSource()==b14)
			t1.setText(t1.getText()+"+");
	    if(e.getSource()==b15)
	    	t1.setText(t1.getText()+"(");
		if(e.getSource()==b16)
		{
			t1.setText(t1.getText()+"/");
			
		}
		if(e.getSource()==b17)
		{
			t1.setText(t1.getText()+"tan");
			op="tan";
		}
		if(e.getSource()==b18)
		{
			t1.setText(t1.getText()+"sin");
			op="sin";
		}
		if(e.getSource()==b19)
		{
			t1.setText(t1.getText()+")");
			
		}
		if(e.getSource()==b20)
		{
			t1.setText(t1.getText()+"log");
			op="log";
		}
		if(e.getSource()==b21)
			t1.setText(t1.getText()+".");
		if(e.getSource()==b22)
		{
			t1.setText(t1.getText()+"cos");
			op="cos";
		}
		if(e.getSource()==b23)
			t1.setText(null);
		if(e.getSource()==b24)
			t1.setText(null);
	}	
	
	
void  Evaluate()
{
	ScriptEngineManager m =new ScriptEngineManager();
	ScriptEngine e=m.getEngineByName("JavaScript");
	String exp=t1.getText();
	if((op=="sin")|(op=="cos")|(op=="tan")|(op=="log"))
	{
		String temp="",s;int i=5;
		System.out.println("this is temp before"+temp);
		char c=exp.charAt(i);
		while(c!=')')
		{
			s=String.valueOf(c);
			temp=temp+s;
			i++;
			c=exp.charAt(i);
			System.out.println(temp+"this is while loop");
	
		}
		double number =Double.valueOf(temp);
		System.out.println(number);
		if(op=="sin")
			result= Math.sin(number);
		if(op=="cos")
			result= Math.cos(number);
		if(op=="tan")
			result= Math.tan(number);
		if(op=="log")
			result=Math.log(number);
	}
	
	try
	{
			double ae=(Double)(e.eval(exp));
			result=ae;
	}
	catch(ScriptException a)
	{
			System.out.println(a);
			
			
	}
			
		
}
	
	
	
	
}

public class Calculator {
	public static void main(String []args)
	{
		SwingUtilities.invokeLater(new Runnable() {
				public void run()
				{
				Model m=new Model();
				}
		});
						
						
	}
			
				
}


