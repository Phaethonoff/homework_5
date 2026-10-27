import java.util.Scanner;

public class PatternGenerator {


    public static void printRightTriangle(int n, int style) {
        System.out.println("--- Right Triangle ---");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (style == 1) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }


    public static void printInvertedRightTriangle(int n, int style) {
        System.out.println("--- Inverted Right Triangle ---");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (style == 1) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void printPyramid(int n, int style) {
        System.out.println("--- Pyramid ---");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= (n - i); s++) {
                System.out.print("  ");
            }
            if (style == 1) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j + " ");
                }
            } else {
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void printInvertedPyramid(int n, int style) {
        System.out.println("--- Inverted Pyramid ---");
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= (n - i); s++) {
                System.out.print("  ");
            }
            if (style == 1) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j + " ");
                }
            } else {
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void printDiamond(int n, int style) {
        System.out.println("--- Diamond Pattern ---");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= (n - i); s++) {
                System.out.print("  ");
            }
            if (style == 1) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j + " ");
                }
            } else {
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= (n - i); s++) {
                System.out.print("  ");
            }
            if (style == 1) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j + " ");
                }
            } else {
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number Pattern Generator");

        while (true) {
            System.out.print("1. Enter the size of the pattern (rows, or 0 to exit): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Error: Please enter a valid positive integer.");
                scanner.next();
                continue;
            }
            int size = scanner.nextInt();
            if (size == 0) {
                System.out.println("Exiting Number Pattern Generator. Goodbye!");
                break;
            }
            if (size < 1) {
                System.out.println("Si1ze must be at least 1. Try again.");
                continue;
            }

            System.out.println("Select pattern style:");
            System.out.println("  1 -> Numeric (1 2 3)");
            System.out.println("  2 -> Star (*)");
            System.out.print("Choice: ");
            int style = scanner.nextInt();
            if (style != 1 && style != 2) {
                System.out.println("Defaulting to Numeric style.");
                style = 1;
            }

            System.out.println("\n2. Choose the pattern type of your choice:");
            System.out.println("  1 -> Right Triangle");
            System.out.println("  2 -> Inverted Right Triangle");
            System.out.println("  3 -> Pyramid");
            System.out.println("  4 -> Inverted Pyramid");
            System.out.println("  5 -> Diamond (Another Example)");
            System.out.print("Enter choice (1-5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printRightTriangle(size, style);
                    break;
                case 2:
                    printInvertedRightTriangle(size, style);
                    break;
                case 3:
                    printPyramid(size, style);
                    break;
                case 4:
                    printInvertedPyramid(size, style);
                    break;
                case 5:
                    printDiamond(size, style);
                    break;
                default:
                    System.out.println("Invalid pattern type selected!");
            }
        }

        scanner.close();
    }
}
