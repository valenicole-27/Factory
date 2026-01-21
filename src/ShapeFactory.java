public class ShapeFactory {

    public static Shape getShape(ShapeType type) {

        switch (type) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case TRIANGLE:
                return new Triangle();
            default:
                throw new IllegalArgumentException("Tipo di shape non supportato");
        }
    }
}