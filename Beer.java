public class Beer extends Product{
    private double volume; // объем
    private double alcohol; // процент содержания алкоголя
    private String containerType; // тип упаковки

    public double getAlcoPercentage() {
        return alcohol;
    }

    public void setAlcoPercentage(double alcohol) {
        this.alcohol = alcohol;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getContainerType() {
        return containerType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }

    public Beer(String brand, String name, double price, double volume, double alcohol, String containerType) {
        super(brand, name, price);
        this.volume = volume;
        this.alcohol = alcohol;
        this.containerType = containerType;
    }

    @Override
    public String displayInfo() {
        return String.format("Пиво %s %s %s \nСтоимость: %.2f \nОбъем: %.1f \nCодержание алкоголя: %.1f",
                name, containerType, brand, price, volume, alcohol);

    }
}



