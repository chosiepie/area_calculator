package Area; 
import java.util.Scanner;

public class ShapeCalculator {
    private Shape shape;

    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();
        calculator.run();
    }

    public void run() {
        do {
            getUserChoice();
            if (shape != null) {
                readShapeParameters();
                double area = shape.calculateArea();
                displayResult(area);
            }
        } while (askToCalculateAgain());
    }
    private void getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a shape:");
        System.out.println("Type 1 for Round");
        System.out.println("Type 2 for Rectangle");
        System.out.println("Type 3 for Square");
        System.out.println("Type 4 for Triangle");
        		
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                shape = new Round();
                break;
            case 2:
                shape = new Rectangle();
                break;
            case 3:
                shape = new Square();
                break;
            case 4:
                shape = new Triangle();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    private void readShapeParameters() {
        if (shape instanceof Round) {
            setRoundParameters((Round) shape);
        } else if (shape instanceof Rectangle) {
            setRectangleParameters((Rectangle) shape);
        } else if (shape instanceof Square) {
            setSquareParameters((Square) shape);
        } else if (shape instanceof Triangle) {
            setTriangleParameters((Triangle) shape);
        }
    }

    private void setRoundParameters(Round round) {
        double radius = InputValidator.getPositiveInput("Enter the radius of the round:");
        round.setRadius(radius);
    }

    private void setRectangleParameters(Rectangle rectangle) {
        double length = InputValidator.getPositiveInput("Enter the length of the rectangle:");
        double width = InputValidator.getPositiveInput("Enter the width of the rectangle:");
        rectangle.setLength(length);
        rectangle.setWidth(width);
    }

    private void setSquareParameters(Square square) {
        double side = InputValidator.getPositiveInput("Enter the side of the square:");
        square.setSide(side);
    }

    private void setTriangleParameters(Triangle triangle) {
        double base = InputValidator.getPositiveInput("Enter the base of the triangle:");
        double height = InputValidator.getPositiveInput("Enter the height of the triangle:");
        triangle.setBase(base);
        triangle.setHeight(height);
    }

    private void displayResult(double area) {
        System.out.println("The area of the selected shape is: " + area);
    }

    private boolean askToCalculateAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to calculate the area for another shape? (yes/no)");
        String response = scanner.next().toLowerCase();
        return response.equals("yes");
    }
}