public class Rectangle extends Shape{
    private double length, width;
    public Rectangle(String name, String color, int length, int width){
        super(name, color);
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public String toString(){
        return super.toString() + " with sides of " + length + " by " + width;
    }
    public double findArea(){
        return (double)length*width;
    }
}
