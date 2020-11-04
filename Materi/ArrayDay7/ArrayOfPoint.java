package go.g2academy.ArrayDay7;

import java.awt.*;

public class ArrayOfPoint {

    public Point[] createArray() {
        Point[] p;

        p = new Point[10];
        for (int i = 0; i < p.length; i++) {
            p[i] = new Point(i, i+1);
        }

        return p;
    }
}
