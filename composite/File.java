package composite;

class File implements FileSystem {

    String name;

    File(String name) {
        this.name = name;
    }

    @Override
    public void show(int level) {
        System.out.println("  ".repeat(level) + "File: " + name);
    }
}
