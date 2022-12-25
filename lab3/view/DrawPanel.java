package lab3.view;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

// This panel represent the animated part of the view with the car images.

public class DrawPanel extends JPanel{
    private ArrayList<PaintableVehicle> paintableCars;
    // Initializes the panel and reads the images

    public DrawPanel(ArrayList<PaintableVehicle> cars) {
        this.paintableCars = cars;

        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(800, 560));
        this.setBackground(Color.green);

    }

    // This method is called each time the panel updates/refreshes/repaints itself
    // TODO: Change to suit your needs.
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (PaintableVehicle car : paintableCars) {
            car.paintComponent(g);
        }
    }
}
