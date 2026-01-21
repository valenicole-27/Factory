public class Main {

    public static void main(String[] args) {

        for (ShapeType type : ShapeType.values()) {
            Shape shape = ShapeFactory.getShape(type);
            System.out.println(shape.draw());
        }
    }
}