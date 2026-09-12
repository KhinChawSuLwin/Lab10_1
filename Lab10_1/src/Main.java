public class Main {
    public static void main(String[] args) {
        // Instantiate the factory using the template interface reference
        ShapeFactoryTemplate factory = new ShapeFactory();

        System.out.println("--- 1. Creating shapes within allowed limits ---");
        Shape c1 = factory.getShape(ShapeFactory.TYPE_CIRCLE);
        Shape c2 = factory.getShape(ShapeFactory.TYPE_CIRCLE);

        Shape t1 = factory.getShape(ShapeFactory.TYPE_TRIANGLE);
        Shape t2 = factory.getShape(ShapeFactory.TYPE_TRIANGLE);

        Shape e1 = factory.getShape(ShapeFactory.TYPE_ELLIPSE);

        System.out.println("\n--- 2. Testing individual shape type limit ---");
        // Attempting to create a 3rd Circle (should fail because max per type is 2)
        Shape c3 = factory.getShape(ShapeFactory.TYPE_CIRCLE);

        System.out.println("\n--- 3. Testing total shapes limit ---");
        // Attempting to create a 2nd Ellipse (should fail because total count reached 5)
        Shape e2 = factory.getShape(ShapeFactory.TYPE_ELLIPSE);

        System.out.println("\n--- 4. Calling draw() on created shapes ---");
        if (c1 != null) c1.draw();
        if (t1 != null) t1.draw();
        if (e1 != null) e1.draw();
    }
}