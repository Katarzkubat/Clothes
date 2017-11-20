import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DataReader {

    private Scanner input;

    public DataReader() {
        input = new Scanner(System.in);
    }

    public void close() {
        input.close();
    }

    public int getInt() {
        int num = 0;
        try {
            num = input.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println();
        } finally {
            input.nextLine();
        }
        return num;
    }

    public String getString() {
        String word = input.nextLine();
        return word;
    }
}
