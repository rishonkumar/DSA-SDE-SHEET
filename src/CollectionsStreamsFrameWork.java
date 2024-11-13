import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CollectionsStreamsFrameWork {

    private static Object Arrays;

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        //get based on 0 index
        System.out.println(list.get(1));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (int x : list) {
            System.out.println(x);
        }

        //to check element present
        System.out.println(list.contains(5));

        list.remove(2); //remove element from the index

        list.add(2, 50); // to add element in particular index
        list.set(2, 50); // replace element from particular index

        System.out.println(list); // toString

        List<String> list1 = java.util.Arrays.asList("Monday", "Tuesday"); // asList will return fixed size
        System.out.println(list1);

        List<Integer> integers = List.of(1, 2, 3); // in this we can not modify this list


        // COMPERATOR
        List<String> words = java.util.Arrays.asList("banana", "apple", "date");

        words.sort(null);
        System.out.println(words);
        // no we need to sort based on custom logic example based on string
        // So inside compaerator there is a method called compare which will compare two objects of same type
        words.sort(new StringLengthComparator());
        System.out.println(words);

        //same thing using lamda experssion
        words.sort((a,b) -> a.length() - b.length());
        System.out.println(words);

        //using java 8 other way of doing
        Comparator<String> reversed = Comparator.comparing(String::length).reversed();
        System.out.println(reversed);
    }


}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}