import java.util.Scanner;

public class advancedcalculator{

    static int plus(int a, int b){

        int result = a + b;

        System.out.println("Result : " + result);

        return result;

    }

    static int minus(int a, int b){

        int result = a - b;

        System.out.println("Result : " + result);

        return result;

    }

    static int times(int a, int b){

        int result = a * b;

        System.out.println("Result : " + result);

        return result;

    }

    static int divided(int a, int b){

        if(b == 0){

            System.out.println("ERROR : The second number must be different from 0.");

            return 0;

        }

        int result = a / b;

        System.out.println("Result : " + result);

        return result;

    }

    static int power(int a, int b){

        int result = 1;

        for(int i = 1; i <= b; i++){

            result *= a;

        }

        return result;

    }

    static int mod(int a, int b){

        return a % b;

    }

    static void rectangle(int a, int b){

        System.out.println("Perimeter : " + (2 * (a + b)));

        System.out.println("Area : " + (a * b));

    }

    static void factorial(int a){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter The Number : ");

        a = scan.nextInt();

        int result = 1;

        for (int i = 1; i <= a; i++) {

            result *= i;
        }

        System.out.println("Result : " + result);
    }

    public static void main(String[] args) {

        int select, a, b;

        Scanner scan = new Scanner(System.in);

        String menu = "1- Add\n2- Subtract\n3- Multiply\n4- Divide\n5- Power Number\n6- Modding\n7- Rectangle area and perimeter\n8- Factorial\n0- EXIT";


        System.out.println(menu);

        while(true){

            System.out.print("Choose an action : ");

            select = scan.nextInt();

            if(select == 0){

                System.out.println("Logged Out of The System !");

                break;

            }else if(select == 8){

                a = 1;

                factorial(a);

                continue;

            }else if(select > 8){

                System.out.println("Invalid Action ! Try Again !");

                continue;

            }

            System.out.print("Enter First Number : ");

            a = scan.nextInt();

            System.out.print("Enter Second Number : ");

            b = scan.nextInt();




            switch(select){

                case 1:

                    plus(a, b);

                    break;

                case 2:

                    minus(a, b);

                    break;

                case 3:

                    times(a, b);

                    break;

                case 4:

                    divided(a, b);

                    break;

                case 5:

                    System.out.println("Result : " + power(a, b));

                    break;

                case 6:

                    System.out.println("Result : " + mod(a, b));

                    break;

                case 7:

                    rectangle(a, b);

                    break;

            }

        }

    }

}
