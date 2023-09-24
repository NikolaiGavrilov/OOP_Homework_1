
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Product canOfBeer1 = new Beer("Арсенальное", "Пиво", 107, 0.5, 7.2, "в банке");
        Product canOfBeer2 = new Beer("Золотая Бочка", "Пиво", 106, 0.5, 4.8, "в банке");
        Product bottleOfBeer1 = new Beer("Gold Mine Beer", "Пиво", 328, 1.5, 4.2, "в бутылке");
        Product bottleOfBeer2 = new Beer("Арсенальное", "Пиво", 227, 1.0, 7.2, "в бутылке");
        Product canOfBeer3 = new Beer("Сибирская корона", "Пиво", 126, 0.5, 5.3, "в банке");
        Product canOfBeer4 = new Beer("Мотор", "Пиво", 112, 0.5, 8.0, "в банке");
        Product bottleOfBeer3 = new Beer("Охота крепкое", "Пиво", 299, 1.5, 8.5, "в бутылке");

        ArrayList<Product> arrayList = new ArrayList<>();
        arrayList.add(canOfBeer1);
        arrayList.add(canOfBeer2);
        arrayList.add(canOfBeer3);
        arrayList.add(canOfBeer4);
        arrayList.add(bottleOfBeer1);
        arrayList.add(bottleOfBeer2);
        arrayList.add(bottleOfBeer3);

        VendingMachine vendingMachine = new VendingMachine(arrayList);

        Beer beerToBuy = vendingMachine.getBeer("Пиво", 0.5, 7.2, "в банке");
        if (beerToBuy != null){
            System.out.println("Вы купили:");
            System.out.println(beerToBuy.displayInfo());
        }
        else {
            System.out.println("В автомате нет такого пива.");
        }

    }

}
