package ece428.mp1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class UnitTests {

    private static ArrayList<GrepClient> grepClientArrayList;

    public static void main(final String[] args) throws Exception {
        setUp();
        testLogGeneration();
    }

    public static void setUp() throws Exception {
        final BufferedReader temp = new BufferedReader(new FileReader("../number.txt"));
        final int exclude = Integer.parseInt(temp.readLine());
        grepClientArrayList = new ArrayList<GrepClient>();
        for (int i = 1; i < 10; i++) {
            if (i != exclude) {
                final String host = "fa17-cs425-g39-0" + Integer.toString(i) + ".cs.illinois.edu";
                final GrepClient grepClient = new GrepClient(host, 9090);
                grepClientArrayList.add(grepClient);
            }
        }
    }

    public static void testLogGeneration() throws Exception {
        for (int i = 0; i < grepClientArrayList.size(); ++i) {
            final GrepClient current = grepClientArrayList.get(i);
            if (current.isAvailable() || current.openConnection()) {
                current.writeData("grep LUKE");
                current.readData();
                System.out.println();
            } else {
                System.out.println("test");
            }
        }
    }
}
