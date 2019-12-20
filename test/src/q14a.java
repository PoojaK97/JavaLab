import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class q14a extends Applet implements MouseListener,MouseMotionListener {


	int x=0,y=0,width=0,height=0,startx=0,starty=0;
	public void init()
	{
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	public void mouseDragged(MouseEvent me) {
		x=startx;
		y=starty;
		height=me.getX()-x;
		width=me.getY()-y;
		
		if(height<0)
		{
			x=me.getX();
			y=me.getY();
			height=Math.abs(height);
			
		}
		if(width<0)
		{
			x=me.getX();
			y=me.getY();
			width=Math.abs(width);
			
		}
		// TODO Auto-generated method stub
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		showStatus("mouse clicked");
	}

	@Override
	public void mousePressed(MouseEvent me) {
		// TODO Auto-generated method stub
		startx=me.getX();
		starty=me.getY();
		showStatus("mouse pressed");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		showStatus("mouse released");
		
	}
	public void paint(Graphics g)
	{
		g.drawRect(x,y,width,height);
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
}