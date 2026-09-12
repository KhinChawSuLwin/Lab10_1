public class ShapeFactory implements ShapeFactoryTemplate {
    public static final int TYPE_CIRCLE = 0;
    public static final int TYPE_TRIANGLE = 1;
    public static final int TYPE_ELLIPSE = 2;

    // Maximum limits
    private static final int MAX_EACH_TYPE = 2;
    private static final int MAX_TOTAL = 5;

    // Counters
    private int circleCount = 0;
    private int triangleCount = 0;
    private int ellipseCount = 0;
    private int totalCount = 0;

    @Override
    public Shape getShape(int shapeType) {
        // Check total limit first
        if (totalCount >= MAX_TOTAL) {
            System.out.println("Cannot create shape. Total shape limit of 5 has been reached.");
            return null;
        }

        // Create Circle
        if (shapeType == TYPE_CIRCLE) {
            if (circleCount >= MAX_EACH_TYPE) {
                System.out.println("Cannot create Circle. Maximum limit of 2 Circles has been reached.");
                return null;
            }
            circleCount++;
            totalCount++;
            System.out.println("Circle created.");
            return new Circle();
        }
        // Create Triangle
        else if (shapeType == TYPE_TRIANGLE) {
            if (triangleCount >= MAX_EACH_TYPE) {
                System.out.println("Cannot create Triangle. Maximum limit of 2 Triangles has been reached.");
                return null;
            }
            triangleCount++;
            totalCount++;
            System.out.println("Triangle created.");
            return new Triangle();
        }
        // Create Ellipse
        else if (shapeType == TYPE_ELLIPSE) {
            if (ellipseCount >= MAX_EACH_TYPE) {
                System.out.println("Cannot create Ellipse. Maximum limit of 2 Ellipses has been reached.");
                return null;
            }
            ellipseCount++;
            totalCount++;
            System.out.println("Ellipse created.");
            return new Ellipse();
        }
        else {
            System.out.println("Invalid shape type.");
            return null;
        }
    }
}