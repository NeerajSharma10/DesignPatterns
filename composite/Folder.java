package composite;

import java.util.*;

import java.util.*;

class Folder implements FileSystem {

    String name;
    List<FileSystem> items = new ArrayList<>();

    Folder(String name) {
        this.name = name;
    }

    void add(FileSystem fs) {
        items.add(fs);
    }

    @Override
    public void show(int level) {
        System.out.println("  ".repeat(level) + "Folder: " + name);

        for (FileSystem fs : items) {
            fs.show(level + 1); // 👈 increase level
        }
    }
}
