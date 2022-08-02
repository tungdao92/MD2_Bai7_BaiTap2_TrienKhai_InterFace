public class Main {
    public static void main(String[] args) {
//        System.out.println("===========SHAPE=============");
//        Shape shape = new Shape();
//        System.out.println(shape);
//        shape = new Shape("red", false);
//        System.out.println(shape);
//        System.out.println("==============CIRCLE==============");
//        Circle circle = new Circle();
//        System.out.println(circle);
//        circle = new Circle(3.5);
//        System.out.println(circle);
//        circle = new Circle("indigo",false,3.5);
//        System.out.println(circle);
//        System.out.println("============Rectangle============");
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//        rectangle = new Rectangle(2.3, 5.8);
//        System.out.println(rectangle);
//        rectangle = new Rectangle();
//        System.out.println(rectangle);
        Shape [] shapes = new Shape[3];
        for (int i = 0; i < shapes.length; i++) {
            int random = (int) (Math.random() * 3);
            switch (random) {
                case 0:
                    shapes[i] = new Rectangle((int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1);
                    break;
                case 1:
                    shapes[i] = new Square((int) (Math.random() * 100) + 1);
                    break;
                case 2:
                    shapes[i] = new Circle((int) (Math.random() * 100) + 1);
            }
        }
        for (Shape shape : shapes) {

            System.out.println(shape.getClass().getSimpleName() + ": " + shape.getArea());

            if (shape instanceof IColorable) {

                ((IColorable) shape).howToColor();
            }
            System.out.println();
        }
    }


}

