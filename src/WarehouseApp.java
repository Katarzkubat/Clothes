
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class WarehouseApp {

    public static void main(String[] args) {

        DataReader dataReader = new DataReader();
        DataManager dataManager = new DataManager();

        Option option = null;

         while (option != Option.EXIT) {
            try {printOptions();
                option = Option.createFromInt(dataReader.getInt());
                switch (option) {
                    case ADD_CLOTHES:
                        dataManager.writeData();
                        break;
                    case READ_DATA:
                        dataManager.readData();
                        break;
                    case EXIT:
                        ;
                }

            } catch (InputMismatchException ime) {
                System.out.println("Data not correct!");
                option = Option.EXIT;
            } catch (NumberFormatException | NoSuchElementException nsee) {
              System.out.println("This option doesn't exist. Try again :) " + nsee.getMessage());
                option = Option.EXIT;
            }
        }

        dataReader.close();
    }

    private static void printOptions() {
        System.out.println("You can choose one options:");
        for (Option option : Option.values()) {
            System.out.println(option.getDescription());
        }
    }
}


