public class BlackShapeDecorator extends ShapeDecorator {

   public BlackShapeDecorator(Shape decoratedShape) {
      super(decoratedShape);		
   }

   @Override
   public void draw() {
      decoratedShape.draw();	       
      setBlackBorder(decoratedShape);
   }

   private void setBlackBorder(Shape decoratedShape){
      System.out.println("Border Color: Black");
   }
}
