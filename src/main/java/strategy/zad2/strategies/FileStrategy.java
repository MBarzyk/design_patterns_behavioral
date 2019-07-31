package strategy.zad2.strategies;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by amen on 8/17/17.
 */
public class FileStrategy implements IInputStrategy {
    private Scanner scanner;

    public FileStrategy() {
        openFile();
    }

    @Override
    public int getInt() {
        Integer result = null;
        do {
            try {
                checkFile();
                result = scanner.nextInt();
            } catch (InputMismatchException ime) {
                System.err.println("Input missmatch! " + scanner.next());
            }
        } while (result == null);
        return result;
    }

    @Override
    public String getString() {
        checkFile();
        return scanner.next();
    }

    @Override
    public double getDouble() {
        Double result = null;
        do {
            try {
                checkFile();
                result = scanner.nextDouble();
            } catch (InputMismatchException ime) {
                System.err.println("Input missmatch! " + scanner.next());
            }
        } while (result == null);
        return result;
    }

    private void openFile() {
        try {
            scanner = new Scanner(new FileReader("input.txt"));
        } catch (FileNotFoundException fnfe) {
            System.err.println("File not found!");
        }
    }

    private void checkFile() {
        if (!scanner.hasNext()) {
            openFile();
        }
    }
}
