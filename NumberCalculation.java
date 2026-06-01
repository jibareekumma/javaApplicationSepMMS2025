public class NumberCalculation {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sumA = numbers[0] + numbers[4] + numbers[9];
        int sumB = numbers[2] + numbers[7] + numbers[1];
        int product = sumA * sumB;
        int sumC = numbers[3] + numbers[6] + numbers[5] + numbers[8];
        int result = sumC - product;

        System.out.printf("Sum of 1st, 5th, 10th     : %d%n", sumA);
        System.out.printf("Sum of 3rd, 8th, 2nd       : %d%n", sumB);
        System.out.printf("Product (A x B)             : %d%n", product);
        System.out.printf("Sum of 4th, 7th, 6th, 9th  : %d%n", sumC);
        System.out.printf("Final Result (C - Product)  : %d%n", result);
        System.out.printf("-------------------------------------------%n");

        if (result >= 100) {
            System.out.printf("Result: %d >= 100 --> hurray I did it%n", result);
        } else {
            System.out.printf("Result: %d < 100 --> I still need to learn more in Java%n", result);
        }
    }
}