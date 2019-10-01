import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
class Model extends WindowAdapter implements ActionListener
{
	JFrame f=new JFrame("Claculator");
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	Label l1,l2,l3;
	TextField t1,t2;
	
	
	Model()
	{
		f.setSize(300,300);
		l1=new Label("Enter:");
		l1.setBounds(20, 100, 50, 20);
		t1=new TextField("");
		t1.setBounds(20, 130, 100, 30);
		t2=new TextField("");
		t2.setBounds(180, 130, 50, 30);
		f.add(l1);
		f.add(t1);
		f.add(t2);
		l2=new Label("result");
		l2.setBounds(125, 130, 50, 20);
		f.add(l2);
		b1=new Button("+");
		b2=new Button("-");
		b3=new Button("x");
		b4=new Button("/");
		b5=new Button("%");
		b6=new Button("^");
		b7=new Button("sin");
		b8=new Button("cos");
		b9=new Button("tan");
		b10=new Button("=");
		b11=new Button("=");
		b1.setBounds(20, 170, 40, 40);f.add(b1);
		b2.setBounds(60, 170, 40, 40);f.add(b2);
		b3.setBounds(100, 170, 40, 40);f.add(b3);
		b4.setBounds(140, 170, 40, 40);f.add(b4);
		b5.setBounds(180, 170, 40, 40);f.add(b5);
		b6.setBounds(220, 170, 40, 40);f.add(b6);
		b7.setBounds(20, 210, 40, 40);f.add(b7);
		b8.setBounds(60, 210, 40, 40);f.add(b8);
		b9.setBounds(100, 210, 40, 40);f.add(b9);
		b10.setBounds(140, 210, 40, 40);f.add(b10);
		b11.setBounds(140, 210, 40, 40);f.add(b11);
		f.setVisible(true);
		f.setLayout(null);
		t1.setVisible(true);
		f.addWindowListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
	
	}
	public void actionPerformed(ActionEvent e)
	{
		double first,end,result;
		String r;
		first=Double.parseDouble(t1.getText());
		
		if(e.getSource()==b1)
		{
			t1.setText(null);
			end=Double.parseDouble(t1.getText());
			result=first+end;
			r=Double.toString(result);
			t1.setText(r);
			
			
			
			
		}
		if(e.getSource()==b2)
		{
			
		}
		if(e.getSource()==b3)
		{
			
		}
		if(e.getSource()==b4)
		{
			
		}
		if(e.getSource()==b5)
		{
			
		}
		if(e.getSource()==b6)
		{
			
		}
		if(e.getSource()==b7)
		{
			
		}
		if(e.getSource()==b8)
		{
			
		}
		if(e.getSource()==b9)
		{
			
		}
		if(e.getSource()==b11)
		{
			
		}
		
	}
	public void windowClosing (WindowEvent e)
	{
		f.setVisible(false);
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


