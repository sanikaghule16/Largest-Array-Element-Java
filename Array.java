public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 7, 89, 56};

        int largest = numbers[0];  // Assume first element is largest

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest element in the array is: " + largest);
    }
}
