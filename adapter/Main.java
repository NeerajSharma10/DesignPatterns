package adapter;

public class Main {
    public static void main(String[] args) {
        // Using the Adapter
        LegacyPrinter legacyPrinter = new LegacyPrinter();
        Printer adapter = new PrinterAdapter(legacyPrinter);

        adapter.print();


    }
}
