public class DecoratorPatternDemo {
   public static void main(String[] args) {

      Shape triangle = new Triangle();

      Shape blackTriangle = new ShapeDecorator(new Triangle());

      Shape blackSquare = new ShapeDecorator(new Square());
      System.out.println("Triangle with normal border");
      triangle.draw();

      System.out.println("\nTriangle of black border");
      blackTriangle.draw();

      System.out.println("\nSquare of black border");
      blackSquare.draw();
   }
}
