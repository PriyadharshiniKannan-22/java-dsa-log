import java.util.ArrayList;
class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list);

        System.out.println("Element at index 1: " + list.get(1));

        System.out.println("Size of the list: " + list.size());

        list.set(1, "Blueberry");
        System.out.println("After updating index 1: " + list);

        System.out.println(list.contains("Cherry"));

        list.remove(0);
        System.out.println("After removing index 0: " + list);

        list.removeAll(list); // Or list.clear();
        System.out.println("After clearing the list: " + list);

        System.out.println("Is the list empty? " + list.isEmpty());
    }
}
