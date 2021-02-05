import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> stops = new ArrayList<Integer>();
        stops.add(110);
        stops.add(20);
        stops.add(70);
        stops.add(30); 
        
        // Uncomment each line to test something new

        // Bus b = new Bus(0, "Blue", stops);

        // System.out.println(b);

        // Should print 20
        // System.out.println(b.getSmallestDistance());

        // Should print [30, 70, 110]
        // System.out.println(b.stopDistances);

        // b.travelToSmallestDistance(10);

        // Should print [70, 110]
        // System.out.println(b.stopDistances);

        // Should print 3
        // System.out.println(b.speed);
    }
}
