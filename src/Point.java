public class Point {
    public double x=3.0;
    public double y=2.0;
    public double z=-1.0;

    public Point() {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public static void main(String[] args){
        Point point=new Point();
        System.out.println("Point("+point.getX()+","+point.getY()+","+point.getZ()+")");
    }
}
