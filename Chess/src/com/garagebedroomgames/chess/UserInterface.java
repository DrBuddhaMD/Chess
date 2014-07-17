package com.garagebedroomgames.chess;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class UserInterface extends JPanel implements MouseListener, MouseMotionListener{

	private static final long serialVersionUID = 1L;
	
	static int x = 0, y = 0;
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.YELLOW);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		
		g.setColor(Color.BLUE);
		g.fillRect(x-10, y-20, 40, 40);
		g.setColor(new Color(190,81,215));
		g.fillRect(120, 20, 120, 50);
		
		//Image
		
		Image chessPiecesImage;
		
		chessPiecesImage = new ImageIcon("data/ChessPieces.png").getImage();
		g.drawImage(chessPiecesImage, x, y, x+64 , y+64, 0, 0, 64, 64, this);
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		x = e.getX();
		y = e.getY();
		
		repaint();
			
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}
	
	

}
