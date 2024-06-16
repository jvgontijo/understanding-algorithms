import java.util.ArrayList;
import java.util.LinkedList;

public class OrderByAscendent {

    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(94);
        numbers.add(65);
        numbers.add(67);
        numbers.add(2);
        numbers.add(10);
        numbers.add(12);
        numbers.add(1);
        numbers.add(4);
        numbers.add(99);
        numbers.add(3);
        System.out.println("Normal list: " + numbers);
        System.out.println("Ordered list: " + orderNumbersByAscendent(numbers));
    }

    private static Integer returnSmallestNumberIndex(LinkedList<Integer> numbers) {
        int smallest = numbers.get(0);
        int smallestIndex = 0;

        for (int i = 1; i < numbers.size(); i++) {
            if(numbers.get(i) < smallest) {
                smallest = numbers.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    private static ArrayList<Integer> orderNumbersByAscendent(LinkedList<Integer> numbers) {
        ArrayList<Integer> orderedList = new ArrayList<>();
        for (int i = numbers.size(); i > 0 ; i--) {
            int returnSmallestNumberIndex = returnSmallestNumberIndex(numbers);
            orderedList.add(numbers.remove(returnSmallestNumberIndex));
        }
        return orderedList;
    }
}
