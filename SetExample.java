import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Check size
        System.out.println("Size: " + set.size());

        // Check existence
        System.out.println("Contains Apple? " + set.contains("Apple"));

        // Remove element
        set.remove("Banana");
        System.out.println("Set after removing Banana: " + set);

        // Add all elements from another set
        Set<String> anotherSet = new HashSet<>();
        anotherSet.add("Date");
        anotherSet.add("Elderberry");
        set.addAll(anotherSet);
        System.out.println("Set after adding all elements from another set: " + set);

        // Clear the set
        set.clear();
        System.out.println("Set after clearing: " + set);
    }
}