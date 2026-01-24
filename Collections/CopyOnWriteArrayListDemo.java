import java.util.*;

public class CopyOnWriteArrayListDemo {

    public static void main(String args[]) {

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        shoppingList.add("Initial List :" + shoppingList);

        for (String item : shoppingList) {
            System.out.println(item);

            if (item.equals("Eggs")) {
                shoppingList.add("Butter");
                System.out.println("Added Butter while reading.");
            }
        }
        

        System.out.println("Updated ShoppingL;ist :" + shoppingList);
        
    }
}