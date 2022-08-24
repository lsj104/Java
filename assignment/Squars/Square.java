import java.awt.Color;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

import javax.swing.*;
import java.awt.*;

public class Square extends JFrame {
Square() {
RectPanel panel = new RectPanel();
this.add(panel, BorderLayout.CENTER);
}
class RectPanel extends JPanel{
public void paintComponent(Graphics g){
super.paintComponent(g);

int x, y, width, height;
x = y = 20;
width = height = 30;


for(int i = 0; i < 20; i++) {
if (i % 3 == 0) {
g.setColor(Color.RED);
} else if (i % 3 == 1) {
g.setColor(Color.GREEN);
} else {
g.setColor(Color.BLUE);
}
g.drawRect(x, y, width, height);
x += 10;
y += 10;
width += 10;
height += 10;
	}
		}
	}

}