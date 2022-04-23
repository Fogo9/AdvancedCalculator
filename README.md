# **ADVANCED CALCULATOR**

# Information

* **Improved calculator that can calculate user-selected transactions.**

# Technologies Used

* **JAVA**

# Contents

* The variables **a**, **b**, **result**, **i**, **select** and **menu** are defined with int.

* The calculator is developed using while and for loop, if-else if and switch-case control mechanisms.

* Value assignment has been created with the scanner class so that the user can perform operations on the calculator.

* Return, void and int methods are used.

* The possibility of the user to log out of the system at any time has been defined.

<br />

# Codes

```Java

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


```

```Java

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

```

```bash

    1- Add
    2- Subtract
    3- Multiply
    4- Divide
    5- Power Number
    6- Modding
    7- Rectangle area and perimeter
    8- Factorial
    0- EXIT

    Choose an action : 1
    Enter First Number : 3
    Enter Second Number : 4
    Result : 7

    Choose an action : 2
    Enter First Number : 3
    Enter Second Number : 4
    Result : -1

    Choose an action : 3
    Enter First Number : 3
    Enter Second Number : 4
    Result : 12

    Choose an action : 4
    Enter First Number : 3
    Enter Second Number : 0
    ERROR : The second number must be different from 0.

    Choose an action : 4
    Enter First Number : 6
    Enter Second Number : 3
    Result : 2

    Choose an action : 5
    Enter First Number : 4
    Enter Second Number : 3
    Result : 64

    Choose an action : 6
    Enter First Number : 125
    Enter Second Number : 30
    Result : 5

    Choose an action : 7
    Enter First Number : 4
    Enter Second Number : 5
    Perimeter : 18
    Area : 20

    Choose an action : 8
    Enter The Number : 6
    Result : 720

    Choose an action : 9
    Invalid Action ! Try Again !

    Choose an action : 0
    Logged Out of The System !

```

<br />

# LINK

* Click here https://github.com/Fogo9/AdvancedCalculator.git to access the Github page for this project.

<br />

# LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
