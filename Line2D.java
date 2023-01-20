public class Line2D{
    private Point p1;
    private Point p2;

    private double slope;
    private double slopeIsCollinear;
    
    public Line2D(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public Line2D(int firstX, int firstY, int secondX, int secondY){
        p1 = new Point(firstX, firstY);
        p2 = new Point(secondX, secondY);
    }
    public Point getP1(){
        return p1;
    }
    public Point getP2(){
        return p2;
    }
    public String toString(){
        return "[(" + p1.getX() + ", " + p1.getY() + "), (" + p2.getX() + ", " + p2.getY() + ")]";
    }
    public double slope(){
        if (p1.getX() == p2.getX()){
            slope = 0;
        }
        else if (p1.getY() == p2.getY()){
            throw new IllegalArgumentException("undefined slope");
        }
        else{
            slope = (double)(p1.getY() - p2.getY()) / (p1.getX() - p2.getX());
        }
        return slope;
    }
    public boolean isCollinear(Point p3){
        if (p1.getX() == p3.getX()){
            slopeIsCollinear = 0;
        }
        else{
            slopeIsCollinear = ((double)(p1.getY() - p3.getY()) / (p1.getX() - p3.getX()));
        }
        if (slope <= slopeIsCollinear + 0.01 && slope >= slopeIsCollinear-0.01){
            return true;
        }
        else{
            return false;
        }
    }

}