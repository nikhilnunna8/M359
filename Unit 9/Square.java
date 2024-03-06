public class Square extends Rectangle{
    public Square(String name, String color, int length){
        super(name, color, length, length);
    }
    @Override
    public String toString(){
        String out = "";
        out += this.getColor() + " " + this.getName() + " shape with side length of " + super.getLength();
        return out;
    }
    @Override
    public double findArea(){
        return Math.pow(super.getLength(), 2);
    }
    public void scaleSize(double co){
        double x = super.getLength()*co;
        super.setLength(x);
    }
}
