import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class q4a extends Applet implements KeyListener{

	private static final long serialVersionUID = 1L;
	
	TextField tf=new TextField();
	String msg="";
	public void init()
	{
		
		add(new Label("Enter the string"));
		add(tf);
		tf.addKeyListener(this);
		
	}
	
	public boolean palin(String s)
	{
		int i,j;
		for(i=0,j=s.length()-1;i<j;i++,j--)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
		}
		return true;
	}
	public void keyPressed(KeyEvent e) {

		String inp=tf.getText();
		if(e.getKeyChar()=='p'){
		if(palin(inp)){
			showStatus("It is a palindrome");
			msg="It is a palindrome";
		}
		else {
			showStatus("It is not a palindrome");
			msg="It is not a palindrome";
		}
		}
		repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		showStatus("Released");
	}

	@Override
	public void keyTyped(KeyEvent e) {	
	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg,50,50);
	}

}