package composite;

public class Main {
    public static void main(String[] args) {

        Folder root = new Folder("Root");

        Folder docs = new Folder("Docs");
        docs.add(new File("A.txt"));
        docs.add(new File("B.txt"));

        Folder images = new Folder("Images");
        images.add(new File("img1.png"));
        images.add(new File("img2.png"));

        root.add(docs);
        root.add(images);
        root.add(new File("C.txt"));

        root.show(0); // 👈 start with level 0
    }
}
