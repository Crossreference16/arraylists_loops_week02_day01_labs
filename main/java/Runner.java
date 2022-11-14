import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Runner {
    public static void main(String[] args) {

        System.out.println("<--- ISLANDS SECTION --->");

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add( "Coll");
//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");
//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2, "Islay");
//        4. Print out the index position of "Skye"
        System.out.println(scottishIslands.get(4));
//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);
//        7. Print the number of islands in your arraylist
        System.out.println(scottishIslands.size());
//        8. Sort the list alphabetically

//        9. Print out all the islands using a for loop

        //System.out.println(scottishIslands); <---- to print island names WITHOUT for lop
        for (String scottishIsland : scottishIslands){
            System.out.println(scottishIsland.toUpperCase());} // <---- to print island names USING for loop



//        NUMBERS
        System.out.println("<--- NUMBERS SECTION --->");

        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        List<Integer> evenNumbers = new ArrayList<>();
        System.out.println("Even Numbers:");
        for(Integer number : numbers){
            if(number % 2 == 0){
                evenNumbers.add(number);
            };
        }
        System.out.println(evenNumbers);
//        2. Print the difference between the largest and smallest value
        int max =Collections.max(numbers);
        int min =Collections.min(numbers);
        int diff = max - min;
        System.out.println(diff);

        System.out.println("Difference between Min and Max: " + (max - min));
//        3. Print True if the list contains a 1 next to a 1 somewhere.
        for (int i = 0; i < numbers.size() - 1; i++) {
            if(numbers.get(i) == 1 && numbers.get(i+1) == 1){
                System.out.println(true);
            }
        }

//        4. Print the sum of the numbers,
        int sum = 0;
        for(int number : numbers) {
                    sum += number;
                }
        System.out.println(sum);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [7, 13, 2] would have sum of 9.

        int newsum = numbers.get(0);
        for (int i = 1; i< numbers.size(); i++){
            if(numbers.get(i) == 13 || numbers.get(i -1) == 13){
                break;
            }
            newsum += numbers.get(i);
            System.out.println("New Sum: " + newsum);
        }
    }
}
