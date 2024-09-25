import java.util.LinkedList;

public class TimeComplexityLinkedList {
    public static void main(String[] args) {
        // Test for different sizes of LinkedLists
        for (int size = 1000; size <= 1000000; size *= 10) {
            LinkedList<Integer> linkedList = new LinkedList<>();

            // Fill the LinkedList with integers
            for (int i = 0; i < size; i++) {
                linkedList.add(i);
            }

            // Measure time for search operation
            long startTime = System.nanoTime();
            
            // Searching for the last element
            linkedList.contains(size - 1);  
            
            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            //inserting at the head
            long startTime2 = System.nanoTime();

            linkedList.add(0, 1);

            long endTime2 = System.nanoTime();

            long duration2 = endTime2 - startTime2;

            //inserting in the middle
            long startTime3 = System.nanoTime();

            linkedList.add(size/2, 1);

            long endTime3 = System.nanoTime();

            long duration3 = endTime3 - startTime3;

            //inserting in the end
            long startTime4 = System.nanoTime();

            linkedList.add(size, 1);

            long endTime4 = System.nanoTime();

            long duration4 = endTime4 - startTime4;

            //removing from the head
            long startTime5 = System.nanoTime();

            linkedList.remove(0);

            long endTime5 = System.nanoTime();

            long duration5 = endTime5 - startTime5;

            //removing from the middle
            long startTime6 = System.nanoTime();

            linkedList.remove(size/2);

            long endTime6 = System.nanoTime();

            long duration6 = endTime6 - startTime6;

            //removing from the end
            long startTime7 = System.nanoTime();

            linkedList.remove(size-1);

            long endTime7 = System.nanoTime();

            long duration7 = endTime7 - startTime7;

            System.out.println("Time taken for search in LinkedList of size " + size + ": " + duration + " nanoseconds");
            System.out.println("Time taken for inserting at the head in LinkedList of size " + size + ": " + duration2 + " nanoseconds");
            System.out.println("Time taken for inserting in the middle in LinkedList of size " + size + ": " + duration3 + " nanoseconds");
            System.out.println("Time taken for inserting at the end in LinkedList of size " + size + ": " + duration4 + " nanoseconds");
            System.out.println("Time taken for removing from the head in LinkedList of size " + size + ": " + duration5 + " nanoseconds");
            System.out.println("Time taken for removing from the middle in LinkedList of size " + size + ": " + duration6 + " nanoseconds");
            System.out.println("Time taken for removing from the end in LinkedList of size " + size + ": " + duration7 + " nanoseconds");

        }
    }
}
