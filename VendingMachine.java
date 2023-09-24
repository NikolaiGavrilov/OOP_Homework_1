
import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }
    public BottleOfMilk getBottleOfMilk(String name, int volume) {
        for (Product product : products){
            if (product instanceof BottleOfMilk){
                BottleOfMilk bottleOfMilk = (BottleOfMilk)product;
                if (bottleOfMilk.getName().equals(name) && bottleOfMilk.getVolume() == volume)
                    return bottleOfMilk;
            }
        }
        return null;
    }

    public Beer getBeer(String name, double volume, double alcohol, String containerType) {
        for (Product product : products){
            if (product instanceof Beer){
                Beer beer = (Beer)product;
                if (beer.getName().equals(name) 
                && beer.getVolume() == volume 
                && beer.getAlcoPercentage() == alcohol 
                && beer.getContainerType().equals(containerType))
                    return beer;
            }
        }
        return null;
    }


}
