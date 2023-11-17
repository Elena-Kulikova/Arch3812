package ModelElements;

import java.util.ArrayList;

public class Poligon {
    public ArrayList<Point3D> points;

    public Poligon() {
        points = new ArrayList<>();
    }

    public void addPoint(Point3D point) {
        points.add(point);
    }

    public ArrayList<Point3D> getPoints() {
        return points;
    }
}
