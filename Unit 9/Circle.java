public class Circle extends Shape{
    private int radius;
    public Circle(String name, String color, int radius){
        super(name, color);
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double findArea(){
        return (Math.pow(radius, 2.0)*Math.PI);
    }
    public String toString(){
        return super.toString() + " with radius of " + this.getRadius();
    }
}
