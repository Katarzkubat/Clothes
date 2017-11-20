import java.io.Serializable;

public class Warehouse implements Serializable {
    private static final long serialVersionUID = -7425273230264572679L;

    public static final int MAX_NUMBER = 10;
    private static int clothesNumber = 0;
    private Clothes[] clothes;
    private static int sum = 0;

    public int getClothesNumber() {
        return clothesNumber;
    }

    public void setClothesNumber(int clothesNumber) {
        this.clothesNumber = clothesNumber;
    }

    public Clothes[] getClothes() {
        return clothes;
    }

    public void setClothes(Clothes[] clothes) {
        this.clothes = clothes;
    }

    public Warehouse() {
        clothes = new Clothes[MAX_NUMBER];
        clothesNumber = 0;
    }

    public void add(Clothes clo) throws ArrayIndexOutOfBoundsException {
        if (clothesNumber == MAX_NUMBER) {
            throw new ArrayIndexOutOfBoundsException("MAX_AMOUNT " + MAX_NUMBER);
        }
        clothes[clothesNumber] = clo;
        clothesNumber++;
        System.out.println("Clothes added - current number: " + clothesNumber);
    }

    public int addPrice(int price) {
        sum = sum + price;
        System.out.println("Sum: " + sum);
        return sum;
    }
}
