package org.javaguru.student_grigoriy_emiliyanov.lesson_9_inheritance.lessoncode;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ShapesApp {
    private final List<Shape> shapeList = new ArrayList<>();
    public static void main(String[] args) {
        ShapesApp shapesApp = new ShapesApp();
        shapesApp.start();
    }

    private void start() {
        while (true) {
            System.out.println("Program menu:");
            System.out.println("1. Create Circle");
            System.out.println("2. Create Square");
            System.out.println("3. Create Rectangle");
            System.out.println("4. Calculate all shapes area");
            System.out.println("5. Calculate all shapes perimeter");
            System.out.println("6. Show all shapes");
            System.out.println("7. Exit");
            System.out.println("================");
            System.out.println("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 1) {
                System.out.println("Enter circle name: ");
                String figureName = scanner.nextLine();
                System.out.println("Enter circle radius:");
                int radius = Integer.parseInt(scanner.nextLine());
                shapeList.add(new Circle(figureName, radius));
            }
            if (choice == 2) {
                System.out.println("Enter square name: ");
                String figureName = scanner.nextLine();
                System.out.println("Enter square side:");
                int side = Integer.parseInt(scanner.nextLine());
                shapeList.add(new Square(figureName, side));
            }
            if (choice == 3) {
                System.out.println("Enter rectangle name: ");
                String figureName = scanner.nextLine();
                System.out.println("Enter rectangle width:");
                int width = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter rectangle height:");
                int height = Integer.parseInt(scanner.nextLine());
                shapeList.add(new Rectangle(figureName, width, height));
            }
            if (choice == 4) {
                double area = 0;
                for (Shape shape : shapeList) {
                    area += shape.area();
                }
                System.out.println("Overall area is: " + area);
            }
            if (choice == 5) {
                double perimeter = 0;
                for (Shape shape : shapeList) {
                    perimeter += shape.perimeter();
                }
                System.out.println("Overall perimeter is: " + perimeter);
            }
            if (choice == 6) {
                if (shapeList.isEmpty()) {
                    System.out.println("There no shape!");
                } else {
                    System.out.println("All shapes are:");
                    for (Shape shape : shapeList) {
                        shape.print();
                    }
                }
            }
            if (choice == 7) {
                System.out.println("Bye-bye!");
                System.exit(0);
            }
        }
    }
}
