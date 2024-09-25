import java.util.HashSet;

public class HashSetTimeComplexity {
    public static void main(String[] args) {
        // Test for different sizes of HashSets
        for (int size = 1000; size <= 1000000; size *= 10) {
            HashSet<Integer> hashSet = new HashSet<>();

            // Fill the HashSet with integers
            for (int i = 0; i < size; i++) {
                hashSet.add(i);
            }

            // Measure time for search operation
            long startTime = System.nanoTime();
            
            // Searching for the last element
            hashSet.contains(size - 1);

            


            
            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            
            
            //removing from the head
            long startTime5 = System.nanoTime();

            hashSet.remove(0);

            long endTime5 = System.nanoTime();

            long duration5 = endTime5 - startTime5;

            //removing from the middle
            long startTime6 = System.nanoTime();

            hashSet.remove(size/2);

            long endTime6 = System.nanoTime();

            long duration6 = endTime6 - startTime6;

            //removing from the end
            long startTime7 = System.nanoTime();

            hashSet.remove(size-1);

            long endTime7 = System.nanoTime();

            long duration7 = endTime7 - startTime7;

            System.out.println("Time taken for search in hashSet of size " + size + ": " + duration + " nanoseconds");
            System.out.println("Time taken for removing from the head in hashSet of size " + size + ": " + duration5 + " nanoseconds");
            System.out.println("Time taken for removing from the middle in hashSet of size " + size + ": " + duration6 + " nanoseconds");
            System.out.println("Time taken for removing from the end in hashSet of size " + size + ": " + duration7 + " nanoseconds");
        }
    }
}
