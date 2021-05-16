import java.util.Scanner;

public class TriangleArea {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();
      Triangle largerTriangle = new Triangle();

      // TODO: Read and set base and height for triangle1 (use setBase() and setHeight())
      triangle1.setBase(scnr.nextDouble());
      triangle1.setHeight(scnr.nextDouble());

      // TODO: Read and set base and height for triangle2 (use setBase() and setHeight())
      triangle2.setBase(scnr.nextDouble());
      triangle2.setHeight(scnr.nextDouble());

      // TODO: Determine larger triangle (use getArea())
      if (triangle1.getArea() > triangle2.getArea()) {
         largerTriangle = triangle1;
      }
      else if (triangle2.getArea() > triangle1.getArea()) {
         largerTriangle = triangle2;
      }
      
      System.out.println("Triangle with larger area:");
      // TODO: Output larger triangle's info (use printInfo())
      largerTriangle.printInfo();
   }
}
