import Arithmetic.Arithmetic;
import Map.MyMap;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    Daghan kaayo i exceptions
    Mao nana
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;

        while (input != 1 && input != 2) {
            System.out.print("Testing which class? " +
                    "\nInput \"1\" for Arithmetic Class" +
                    "\nInput \"2\" for MyMap Class" +
                    "\nYour input: ");

            try {
                input = sc.nextInt();
                if (input != 1 && input != 2) {
                    System.out.println("Invalid class! Please input either 1 or 2.");
                }
            } catch (InputMismatchException e) {
                System.err.println("Invalid input! Please input an integer.");
                sc.next();
            }
            System.out.println();
        }

        if (input == 1) {
            Object num1;
            Object num2;

            while (true) {
                System.out.print("Enter the data type of num1 (int, double, float, short, long): ");
                String dataType1 = sc.next();
                System.out.print("Enter num1: ");

                try {
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
                            continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.err.println("InputMismatchException!");
                    System.out.println("Make sure to input the correct data type and num1!");
                    sc.next();
                }
            }

            while (true) {
                System.out.print("Enter the data type of num2 (int, double, float, short, long): ");
                String dataType2 = sc.next();
                System.out.print("Enter num2: ");

                try {
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
                            continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.err.println("InputMismatchException!");
                    System.out.println("Make sure to input the correct data type and num2!");
                    sc.next();
                }
            }

            Arithmetic<Number, Number> arithmetic = new Arithmetic<>((Number) num1, (Number) num2);
            System.out.println("Addition: " + arithmetic.add());
            System.out.println("Subtraction: " + arithmetic.subtract());
            System.out.println("Multiplication: " + arithmetic.multiply());
            System.out.println("Division: " + arithmetic.divide());
            System.out.println("Minimum: " + arithmetic.getMin());
            System.out.println("Maximum: " + arithmetic.getMax());

            System.out.println("Thank you for using Arithmetic!");
        } else {
            MyMap<Integer, String> map = new MyMap<>();
            int key;
            String value;
            int select = 0;

            do {
                System.out.print("""
                    Select method to use:
                    Input "1" to use put(key, value) method
                    Input "2" to use get(key) method
                    Input "3" to use remove(key) method
                    Input any integer value to exit
                    Your input:\s""");
                    select = sc.nextInt();

                    if (select == 1) {
                        System.out.println("\nTesting put(key, value) method");
                        do{
                            System.out.print("Enter integer key (Input 0 to break): ");
                            key = sc.nextInt();
                            if(key == 0){
                                System.out.println();
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
                    } else if (select == 2) {
                        System.out.print("\nTesting get(key) method");
                        do{
                            System.out.print("Enter integer key (Input 0 to break): ");
                            key = sc.nextInt();

                            if(key == 0){
                                System.out.println();
                                break;
                            }

                            System.out.println("Value from key " + key + ": " + map.get(key) + "\n");
                        } while (true);
                    } else if (select == 3) {
                        System.out.println("\nTesting remove(key) method");
                        do{
                            System.out.print("Enter integer key (Input 0 to break): ");
                            key = sc.nextInt();

                            if(key == 0){
                                System.out.println();
                                break;
                            }

                            System.out.println("Removed \"" + map.remove(key) + "\" from key " + key);
                            System.out.println("Current Keys and Values:");
                            System.out.println(map.keys);
                            System.out.println(map.values);
                            System.out.println();
                        } while (true);
                    }
            } while (select == 1 || select == 2 || select == 3);

            System.out.println("Thank you for using MyMap!");
        }
    }
}