package homework_week_5;

/*6. Write a Java program to retrieve an element (at a specified index) from a given array list
 * */

import java.util.ArrayList;

public class Programme_6_ArrayList {

    public static void main(String[] args) {
        My_method();
    }

    public static void My_method() {
        ArrayList<String> list = new ArrayList();
        list.add("London");
        list.add("New Zealand");
        list.add("America");
        list.add("China");
        list.add("India");

        System.out.println("The ArrayList is : " + list.get(3));
    }
}


