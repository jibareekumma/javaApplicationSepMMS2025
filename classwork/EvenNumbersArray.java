public class EvenNumbersArray{
    public static int[] getEvenNumbers(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        int[] evens = new int[count];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evens[index] = numbers[i];
                index++;
            }
        }
        return evens;
    }
    public static void main(String[] args) {
        int[] arr = {12, 13, 14, 15, 16, 17, 18};
        int[] evenNumbers = getEvenNumbers(arr);
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.printf("%d ", evenNumbers[i]);
        }
    }
}