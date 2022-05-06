public class TestShape1 {
    public static void main(String[] args) {
        Shape1 shape1=new Rectangle1(1,2);
        System.out.println(shape1);
        System.out.println("The area is: "+shape1.getArea());
        Shape1 shape2=new Triangle1(3,4);
        System.out.println(shape2);
        System.out.println("The area is: "+shape2.getArea());
    }
}
