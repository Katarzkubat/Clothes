import java.io.*;
import java.util.InputMismatchException;

public class DataManager {
    public static final String FILE_REGISTER = "warehouse.txt";
    protected Warehouse warehouse = new Warehouse();

    public void readData() {
        System.out.println("Data scanned - clothes: ");
        try (FileInputStream fis = new FileInputStream(FILE_REGISTER);
             ObjectInputStream ois = new ObjectInputStream(fis);) {

            warehouse = (Warehouse) ois.readObject();
            for (int i = 0; i < warehouse.MAX_NUMBER; i++) {
                System.out.println("Cloth: " + warehouse.getClothes()[i]);
            }

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

    public void writeData() throws InputMismatchException {
        DataReader dataReader = new DataReader();

        try (FileOutputStream fos = new FileOutputStream(FILE_REGISTER);
             ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            System.out.println("Write type:");
            String type = dataReader.getString();
            System.out.println("Write brand:");
            String brand = dataReader.getString();
            System.out.println("Write size:");
            String size = dataReader.getString();
            System.out.println("Write price:");
            int price = dataReader.getInt();

            warehouse.add(new Clothes(type, brand, size, price));
            warehouse.addPrice(price);
            oos.writeObject(warehouse);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InputMismatchException ime) {
            throw new InputMismatchException("Error");
        }
    }
}
