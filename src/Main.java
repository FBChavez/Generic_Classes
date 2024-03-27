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
            MyMap<Integer, String> map = new MyMap<>();
            int key;
            String value;

            System.out.println("\nTesting put()...");
            do{
                System.out.print("Enter key: ");
                key = sc.nextInt();
                if(key == 0){
                    break;
                }
                System.out.print("Enter string value: ");
                sc.nextLine();
                value = sc.nextLine();
                map.put(key, value);

                System.out.println("Current Keys and Values:");
                System.out.println(map.keys);
                System.out.println(map.values);
            } while (true);

            System.out.println("\nTesting get()...");
            do{
                System.out.print("Enter key: ");
                key = sc.nextInt();
                System.out.println("Value from key " + key + ": " + map.get(key));
            } while (key != 0);

            System.out.println("\nTesting remove()...");
            do{
                System.out.print("Enter key: ");
                key = sc.nextInt();
                System.out.println("Removed " + map.remove(key) + " from key " + key);

                System.out.println("Current Keys and Values:");
                System.out.println(map.keys);
                System.out.println(map.values);
            } while (key != 0);
        }
    }
}