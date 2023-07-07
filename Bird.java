
package javaapplication24;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class Bird { /*PANEL*/
    public float x, y, vx, vy;
    final int PANEL_WIDTH = 800;
    final int PANEL_HEIGHT = 600;
    public static final int RAD = 25;
	
    private Image img ,lava,BackGroundImage;/*imgs*/
    public Bird() {
        x = FlappyBird.WIDTH/2;
        y = FlappyBird.HEIGHT/2;
        try {
            img = ImageIO.read(new File("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\MyProject\\src\\images\\Bird.png"));/*ur Bird img path*/
            ImageIcon bg = new ImageIcon("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\JavaApplication24\\src\\images\\bg.jpg");/*ur background img path*/
                                   Image SI1 = bg.getImage().getScaledInstance(PANEL_WIDTH, PANEL_HEIGHT,java.awt.Image.SCALE_SMOOTH);
                                   bg=new ImageIcon(SI1);
                                   BackGroundImage = bg.getImage();
                                   ImageIcon lv = new ImageIcon("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\JavaApplication24\\src\\images\\lava2.png");/*ur lava img path*/
                                   Image SI2 = lv.getImage().getScaledInstance(800, 100,java.awt.Image.SCALE_SMOOTH);
                                   lv=new ImageIcon(SI2);
                                   lava = lv.getImage();
                                   
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
    public void physics() {
        x+=vx;
        y+=vy;
        vy+=0.5f;
    }
    public void update(Graphics g) { 
        g.setColor(Color.BLACK);
        g.drawImage(BackGroundImage, 0, 0, null);
        g.drawImage(lava, 0, 500, null);
        g.drawImage(img, Math.round(x-RAD),Math.round(y-RAD),2*RAD,2*RAD, null);
        
    }
    public void jump() {
        vy = -8;
    }
    
    public void reset() {
        x = 640/2;
        y = 640/2;
        vx = vy = 0;
    }
}
