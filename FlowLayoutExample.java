import java.applet.*;
import java.awt.*;
import java.awt.event.*;

class FlowLayoutExample extends Frame implements ActionListener
{
	Label l1;
	Button b1,b2,b3,b4,b5;
	FlowLayoutExample()
{
		
	l1= new Label("HELLO");
	b1=new Button("Red");
	b2=new Button("Green");
	b3=new Button("Blue");
	b4=new Button("Orange");
	b5=new Button("Pink");
	setBackground(Color.lightGray);
	setLayout(new FlowLayout());
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	this.add(l1);
	this.add(b1);
	this.add(b2);
	this.add(b3);
	this.add(b4);
	this.add(b5);
	}
public void actionPerformed(ActionEvent ae)
{
	
	String select=ae.getActionCommand();
	if(select.equals("Red"))
	{
	l1.setForeground(Color.red);	
	//setBackground(Color.red);
	}
	else if(select.equals("Green"))
	{
	l1.setForeground(Color.green);
	setBackground(Color.green);
	}
	else if(select.equals("Blue"))
	{
	l1.setForeground(Color.blue);
	setBackground(Color.blue);
	}	
	else if(select.equals("Orange"))
	{
	l1.setForeground(Color.orange);
	
	//setBackground(Color.orange);
	}	
	else if(select.equals("Pink"))
	{
	l1.setForeground(Color.pink);
	
	//setBackground(Color.pink);
	}
}
public static void main(String s[])
{
	FlowLayoutExample obj= new FlowLayoutExample();
	obj.setSize(200,300);
	obj.setTitle("Flow Layout Example");
	obj.setVisible(true);
}}