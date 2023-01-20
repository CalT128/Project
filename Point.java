public class Point{
    private int x;
    private int y;
    private double slope1;
    private double slope2;
    private double slope3;
    public Point(){
        x = 0;
        y = 0;
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int manhattanDistance(Point point){
        int distanceX = point.getX() - x;
        int distanceY = point.getY() - y;
        int total = Math.abs(distanceX) + Math.abs(distanceY);
        return total;
    }
    public boolean isCollinear(Point point1, Point point2){
        
        if (point1.getX() - x == 0 ){
            slope1 = 0;
        }
        else{
            slope1 = (point1.getY()-y) / (point1.getX()-x);
        }
        if (point2.getX() - point1.getX() == 0){
            slope2 = 0;
        }
        else{
            slope2 = (point2.getY()-point1.getY()) / (point2.getX()- point1.getX());
        }
        if (point2.getX() - x == 0){
            slope3 = 0;
        }
        else{
            slope3 = (point2.getY() - y) / (point2.getX() - x);
        }
        if (slope1 == slope2 && slope1 == slope3){
            return true;
        }
        else{
            return false;
        }
    }
    public String toString(){
        return "x = " + x + ", y = " + y;
    }
}