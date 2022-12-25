package lab3.view;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;

import lab3.model.Vehicle;

public class PaintableVehicle extends JComponent {
    private final Image image;
    private final Vehicle car;

    public PaintableVehicle(String img, Vehicle car) {
        Image result = null;
        try {
        result = ImageIO.read(DrawPanel.class.getResourceAsStream(img));
        }
        catch (IOException ex){
        }
        this.image = result;
        this.car = car;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = (int) Math.round(car.getX());
        int y = (int) Math.round(car.getY());
        g.drawImage(image, x, y, null); // see javadoc for more info on the parameters
    }
}