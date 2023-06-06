package homework_week_5;

/*10. Write a programme that tells you which line passes through particular stations.
 Just use Zone 1 stations name.
 * */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programme_10_StationName {

    String[] zone1 = {"Oxford Circus", "Green Park", "Euston Square", "Bond Street"};
    String[] jubilee = new String[]{"Green Park", "Bond Street"};
    String[] metropolitan = new String[]{"Euston square"};
    String[] central = new String[]{"Oxford Circus", "Bond Street"};

    public static void main(String[] args) {
        Programme_10_StationName p = new Programme_10_StationName();
        Boolean found = false;

        for (String sName : p.zone1) {
            System.out.println(sName);
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter London Zone 1 Station :  ");
        String station = sc.nextLine();
        sc.close();
        System.out.println(station);

        List<String> nameList = new ArrayList<>(Arrays.asList(p.jubilee));
        if (nameList.contains(station)) {
            System.out.println("Station found on jubilee line");
            found = true;
        }
        nameList = new ArrayList<>(Arrays.asList(p.metropolitan));
        if (nameList.contains(station)) {
            System.out.println("Station found on metropolitan line");
            found = true;
        }
        nameList = new ArrayList<>(Arrays.asList(p.central));
        if (nameList.contains(station)) {
            System.out.println("Station found on central line");
            found = true;
        }
    }


}
