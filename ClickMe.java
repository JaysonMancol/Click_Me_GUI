import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
public class ClickMe {
   public static void main(String[] args) {
      ImageIcon image1 = new ImageIcon("jayson.jpeg");
      ImageIcon image2 = new ImageIcon("PAKU.png");
      JLabel title = new JLabel("COL", JLabel.CENTER);
             title.setForeground(Color.WHITE);
             title.setBounds(115, 30, 100, 80);
             title.setFont(new Font("Arial", Font.BOLD, 22));

      JLabel title1 = new JLabel("MAN", JLabel.CENTER);
             title1.setForeground(new Color(255, 126, 0));
             title1.setBounds(165, 30, 100, 80);
             title1.setFont(new Font("Arial", Font.BOLD, 20));

      JLabel text1 = new JLabel("<html><h1>CLICK ME!<h1/><html/>");
             text1.setBounds(130, 100, 130, 40);
             text1.setForeground(new Color(255, 126, 0));
             text1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
             text1.addMouseListener(new MouseListener() {
         public void mouseClicked(MouseEvent e) {
            text1.setText("PAK YOU");
            text1.setFont(new Font("Arial", Font.BOLD, 29));
         }
         public void mousePressed(MouseEvent e) {
            text1.setText("JOKE!");
            text1.setFont(new Font("Arial", Font.BOLD, 39));
         }
         public void mouseReleased(MouseEvent e) {
           
         }
         public void mouseEntered(MouseEvent e) {
          
         }
         public void mouseExited(MouseEvent e) {
            text1.setText("<html><h1>CLICK ME!<h1/><html/>");
         }
      });

      JLabel programmer = new JLabel("Ja_Colman", JLabel.LEFT);
             programmer.setForeground(new Color(255, 126, 0));
             programmer.setBounds(20, 150, 100, 40);
             programmer.setFont(new Font("Arial", Font.BOLD, 12));
             programmer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            programmer.addMouseListener(new MouseListener() {
         public void mouseClicked(MouseEvent e) {
   
         }
         public void mousePressed(MouseEvent e) {
      
         }
         public void mouseReleased(MouseEvent e) {
           
         }
         public void mouseEntered(MouseEvent e) {
            programmer.setText("Jayson Mancol");
            programmer.setFont(new Font("Arial", Font.BOLD, 12));
         }
         public void mouseExited(MouseEvent e) {
            programmer.setText("Ja_Colman");
            programmer.setFont(new Font("Arial", Font.BOLD, 12));
         }
      });

      JFrame frame = new JFrame();
             frame.setTitle("JA_COLMAN");
             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             frame.setResizable(false);
             frame.setSize(400, 250);
             frame.setLayout(null);
             frame.setVisible(true);
             frame.setIconImage(image1.getImage());
             frame.add(title);
             frame.add(title1);
             frame.getContentPane().setBackground(new Color(10, 10, 10));
             frame.add(text1);
             frame.add(programmer);
    }
 }