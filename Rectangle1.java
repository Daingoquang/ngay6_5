public class Rectangle1 implements Shape1 {
    private int height,width;
    public Rectangle1(int height, int width){
        this.height=height;
        this.width=width;
    }

    @Override
    public String toString() {
        return "Rectangle1{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
    @Override
    public double getArea(){
        return height*width;
    }
}
