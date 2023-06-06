package homework_week_5;

/*4. Write a Java program to create a new array list,
add some colours (string) and printout the collection using for each loop.  */

import java.util.ArrayList;

public class Programme_4_Colours {

    public static void main(String[] args) {
        //create object
        Programme_4_Colours p4 = new Programme_4_Colours();
        p4.colours();

    }

    public void colours(){
        ArrayList<String> colourName = new ArrayList<>();
        colourName.add("Pink");
        colourName.add("Blue");
        colourName.add("Yellow");
        colourName.add("Red");
        colourName.add("Green");

        for(String str: colourName)
        {
            System.out.println(str);
        }

    }
}
