public class TestPoint {
    public static void main(String[]args){
        Point p1 = new Point();
        Point p2 = new Point(3,4);
        Point p3 = new Point(-5,7);
        Point p4 = new Point(3,-10);
        Point p5 = new Point(3,10);
        Point p6 = new Point(6,8);
        System.out.println(p2.manhattanDistance(p3));
        System.out.println(p3.manhattanDistance(p4));
        System.out.println(p2.isCollinear(p4, p5));
        System.out.println(p2.isCollinear(p3, p4));
        System.out.println(p1.isCollinear(p2, p6));
        System.out.println(p1.isCollinear(p2, p3));

    }
    


}
