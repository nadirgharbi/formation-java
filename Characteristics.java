
public abstract class Characteristics {
    protected Integer numberDoor;
    protected String FuelType;
    protected String color;

    protected abstract String getCharacteristics();

    protected Characteristics(Integer numberDoor, String FuelType, String color) {
        this.numberDoor = numberDoor;
        this.FuelType = FuelType;
        this.color = color;
    }
}
