package Ex10_6;

import java.util.Random;
import unit4.collectionsLib.*;

/**
 * This class tests classes Plane, Train, Vehicle, and AirportInfo.
 * It demonstrates random creation, sorting, moving, and direct comparison of transport objects.
 */
public class TestAirportInfo {
    static final String[] SOURCES = {
        "Jerusalem", "Paris", "New-York", "London", "Roma"
    };
    static final String[] DESTINATIONS = {
        "Barcelona", "Madrid", "Copenhagen", "Helsinki", "Bordeaux"
    };
    static final int TOTAL = SOURCES.length;

    public static void main(String[] args) {
        Train[] trainList = new Train[5];
        Plane[] planeList = new Plane[5];
        Random rnd = new Random();

        // Initialize array of 5 trains with random data
        for (int i = 0; i < trainList.length; i++) {
            trainList[i] = new Train(
                SOURCES[rnd.nextInt(TOTAL)],
                DESTINATIONS[rnd.nextInt(TOTAL)],
                rnd.nextInt(500),
                i * 20 + rnd.nextInt(20 * (i + 1))
            );
        }

        // Sort and print trains
        System.out.println("--- Sorting trains... ---\n");
        AirportInfo.sortTransport(trainList);
        System.out.print(AirportInfo.reportAll(trainList));

        // Initialize array of 5 planes with random data
        for (int i = 0; i < planeList.length; i++) {
            planeList[i] = new Plane(
                SOURCES[rnd.nextInt(TOTAL)],
                DESTINATIONS[rnd.nextInt(TOTAL)],
                rnd.nextInt(1500),
                i * 10 + rnd.nextInt(10 * (i + 1))
            );
        }

        // Sort and print planes
        System.out.println();
        System.out.println("--- Sorting planes... ---\n");
        AirportInfo.sortTransport(planeList);
        System.out.print(AirportInfo.reportAll(planeList));

        // Combine trains and planes into one Movable array
        Movable[] m = new Movable[trainList.length * 2];
        for (int i = 0; i < m.length; i += 2) {
            m[i] = trainList[i / 2];
            m[i + 1] = planeList[i / 2];
        }

        // Print all together
        System.out.println();
        System.out.println("--- All together before move ---\n");
        System.out.print(AirportInfo.reportAll(m));

        // Move all and print again
        for (int i = 0; i < m.length; i++) {
            m[i].move();
        }
        System.out.println();
        System.out.println("--- All together after move ---\n");
        System.out.print(AirportInfo.reportAll(m));

        // === Additional tests ===

        // Direct comparison between two known trains and planes
        System.out.println();
        System.out.println("--- Direct comparison ---");
        Train t1 = new Train("Jerusalem", "Tel Aviv", 111, 100);
        Train t2 = new Train("Haifa", "Beer Sheva", 112, 120);
        System.out.println("t1 vs t2: " + t1.compareTo(t2)); // -1
        System.out.println("t2 vs t1: " + t2.compareTo(t1)); // 1

        Plane p1 = new Plane("Paris", "Berlin", 211, 30000);
        Plane p2 = new Plane("London", "Rome", 212, 25000);
        System.out.println("p1 vs p2: " + p1.compareTo(p2)); // 1
        System.out.println("p2 vs p1: " + p2.compareTo(p1)); // -1

        // Test move() on a single Train
        System.out.println();
        System.out.println("--- Test move() on single train ---");
        System.out.println("Before move: " + t1.getSource() + " ➝ " + t1.getDestination());
        t1.move();
        System.out.println("After move: " + t1.getSource() + " ➝ " + t1.getDestination());

        // Report one plane and one train individually
        System.out.println();
        System.out.println("--- Individual report ---");
        System.out.println(t1.details());
        System.out.println("------");
        System.out.println(p1.details());
    }
}
