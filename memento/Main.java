package memento;

public class Main {
    public static void main(String[] args) {

        //CareTaker

        Editor editor = new Editor();
        editor.setText("Hello World");

        Memento m1 = editor.save();

        editor.setText("Hello World Again");

        editor.restore(m1);

        System.out.println(editor.getText());

    }
}
