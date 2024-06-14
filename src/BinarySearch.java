import java.util.ArrayList;

public class BinarySearch {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        System.out.println("The searched number is at position: " + binarySearch(numbers, 1));
    }

    public static Integer binarySearch(ArrayList<Integer> numbers, int number) {
        int lowestNumber = 0;
        int greatestNumber = numbers.size() - 1;
        int iteration = 1;

        while(lowestNumber <= greatestNumber) {
            int halfNumber = (lowestNumber + greatestNumber) / 2;
            int guess = numbers.get(halfNumber);
            if(guess == number) {
                return halfNumber;
            }
            System.out.println("Iteration: " + iteration++);
            System.out.println("Half number: " + halfNumber);
            if (guess > number) {
                System.out.println("Number is lower");
                greatestNumber = halfNumber - 1;
            } else {
                System.out.println("Number is higher");
                lowestNumber = halfNumber + 1;
            }

        }
        return null;
    }
}
