import Arithmetic.Arithmetic;
import Map.MyMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Testing which class? " +
                "\nInput \"1\" for Arithmetic Class" +
                "\nInput \"2\" for MyMap Class" +
                "\nYour input: ");
        int input = sc.nextInt();

        if (input == 1) {
            System.out.print("Enter the data type of num1 (int, double, float, short, long): ");
            String dataType1 = sc.next();
            System.out.print("Enter num1: ");
            Object num1;
            switch (dataType1) {
                case "int":
                    num1 = sc.nextInt();
                    break;
                case "double":
                    num1 = sc.nextDouble();
                    break;
                case "float":
                    num1 = sc.nextFloat();
                    break;
                case "short":
                    num1 = sc.nextShort();
                    break;
                case "long":
                    num1 = sc.nextLong();
                    break;
                default:
                    System.out.println("Invalid data type");
                    return;
            }

            System.out.print("Enter the data type of num2 (int, double, float, short, long): ");
            String dataType2 = sc.next();
            System.out.print("Enter num2: ");
            Object num2;
            switch (dataType2) {
                case "int":
                    num2 = sc.nextInt();
                    break;
                case "double":
                    num2 = sc.nextDouble();
                    break;
                case "float":
                    num2 = sc.nextFloat();
                    break;
                case "short":
                    num2 = sc.nextShort();
                    break;
                case "long":
                    num2 = sc.nextLong();
                    break;
                default:
                    System.out.println("Invalid data type");
                    return;
            }

            Arithmetic<Number, Number> arithmetic = new Arithmetic<>((Number) num1, (Number) num2);
            System.out.println("Addition: " + arithmetic.add());
            System.out.println("Subtraction: " + arithmetic.subtract());
            System.out.println("Multiplication: " + arithmetic.multiply());
            System.out.println("Division: " + arithmetic.divide());
            System.out.println("Minimum: " + arithmetic.getMin());
            System.out.println("Maximum: " + arithmetic.getMax());
        } else {
            MyMap<String, Integer> map = new MyMap<>();
            map.put("One", 1);
            map.put("Two", 2);
            map.put("Three", 3);
            System.out.println("Value corresponding to key 'Two': " + map.get("Two"));
            System.out.println("Value corresponding to key 'Four': " + map.get("Four"));
            System.out.println("Removing key 'Two', corresponding value: " + map.remove("Two"));
            System.out.println("Value corresponding to key 'Two' after removal: " + map.get("Two"));
        }
    }
}