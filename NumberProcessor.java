import java.util.Scanner;

public class NumberProcessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking two numbers as input
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        // Check if the difference is less than 200
        int diff = Math.abs(num1 - num2);
        if (diff < 200) {
            System.out.println("The difference between the numbers is less than 200. Program ending.");
            return;
        }

        int sumEvenDivisibleBy4 = 0;
        int sumEvenDivisibleBy8 = 0;
        int sumNotEvenNotDivisibleBy5 = 0;

        // Using a for loop
        for (int i = num1; i <= num2; i++) {
            switch (i % 2) {
                case 0:
                    if (i % 4 == 0) {
                        sumEvenDivisibleBy4 += i;
                    }
                    if (i % 8 == 0) {
                        sumEvenDivisibleBy8 += i;
                    }
                    break;
                case 1:
                    if (i % 5 != 0) {
                        sumNotEvenNotDivisibleBy5 += i;
                    }
                    break;
            }
        }

        // Using a while loop
        int currentNum = num1;
        while (currentNum <= num2) {
            switch (currentNum % 2) {
                case 0:
                    if (currentNum % 4 == 0) {
                        sumEvenDivisibleBy4 += currentNum;
                    }
                    if (currentNum % 8 == 0) {
                        sumEvenDivisibleBy8 += currentNum;
                    }
                    break;
                case 1:
                    if (currentNum % 5 != 0) {
                        sumNotEvenNotDivisibleBy5 += currentNum;
                    }
                    break;
            }
            currentNum++;
        }

        // Using a do-while loop
        currentNum = num1;
        do {
            switch (currentNum % 2) {
                case 0:
                    if (currentNum % 4 == 0) {
                        sumEvenDivisibleBy4 += currentNum;
                    }
                    if (currentNum % 8 == 0) {
                        sumEvenDivisibleBy8 += currentNum;
                    }
                    break;
                case 1:
                    if (currentNum % 5 != 0) {
                        sumNotEvenNotDivisibleBy5 += currentNum;
                    }
                    break;
            }
            currentNum++;
        } while (currentNum <= num2);

        // Displaying the sums
        System.out.println("Sum of even numbers divisible by 4: " + sumEvenDivisibleBy4);
        System.out.println("Sum of even numbers divisible by 8: " + sumEvenDivisibleBy8);
        System.out.println("Sum of numbers not even and not divisible by 5: " + sumNotEvenNotDivisibleBy5);
    }
}
