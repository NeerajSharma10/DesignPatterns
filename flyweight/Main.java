package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Tree> forest = new ArrayList<>();

        // Create many trees
        for (int i = 0; i < 5; i++) {
            TreeType oak = TreeFactory.getTreeType("Oak", "Green");
            forest.add(new Tree(i, i + 1, oak));
        }

        for (int i = 0; i < 3; i++) {
            TreeType pine = TreeFactory.getTreeType("Pine", "DarkGreen");
            forest.add(new Tree(i + 10, i + 20, pine));
        }

        // Draw all trees
        for (Tree t : forest) {
            t.draw();
        }
    }
}
