import java.util.LinkedHashSet;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        LinkedHashSet<String> set2 = new LinkedHashSet<>();

        //populate set1
        set1.add("George");
        set1.add("Jim");
        set1.add("John");
        set1.add("Blake");
        set1.add("Kevin");
        set1.add("Michael");

        //populate set2
        set2.add("George");
        set2.add("Katie");
        set2.add("Kevin");
        set2.add("Michelle");
        set2.add("Ryan");

        //Union the two sets
        LinkedHashSet<String> unionSet = new LinkedHashSet<>();
        unionSet = (LinkedHashSet) set1.clone();

        unionSet.addAll(set2);

        //Difference the two sets
        LinkedHashSet<String> differenceSet = new LinkedHashSet<>();
        differenceSet = (LinkedHashSet) set1.clone();

        differenceSet.removeAll(set2);

        //Intersection of the two sets
        LinkedHashSet<String> intersectionSet = new LinkedHashSet<>();
        intersectionSet = (LinkedHashSet) set1.clone();

        intersectionSet.retainAll(set2);

        //print the sets
        System.out.println("Union: ");
        printSet(unionSet);

        System.out.println("Difference: ");
        printSet(differenceSet);

        System.out.println("Intersection");
        printSet(intersectionSet);
    }

    static void printSet(LinkedHashSet<String> set) {
        for(String elem : set) {
            System.out.println(elem);
        }
    }
}
