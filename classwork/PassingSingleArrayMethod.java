public class PassingSingleArrayMethod{

    public static int sumTotal(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {12, 13, 14, 15, 16, 17, 18};

        int totalNumber = sumTotal(arr);

        System.out.printf("The total number is %d%n", totalNumber);
    }
}