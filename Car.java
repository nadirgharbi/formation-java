import java.util.Optional;

public class Car extends Characteristics {
    private String marque;
    private String model;
    private Integer fabrication;

    public Car(String marque, String model, Integer fabrication, Integer numberDoor, String FuelType, String color) {
        super(numberDoor, FuelType, color);
        this.marque = marque;
        this.model = model;
        this.fabrication = fabrication;
    }

    @Override
    public String getCharacteristics() {
        return "\nNombre de porte : " + this.numberDoor.toString() + "\nType de carburant : " + this.FuelType + "\nCouleur : " + this.color;
    }

    public String getDetails() {
        return "Marque : " + this.marque + "\nModèle : " + this.model + "\nAnnée de fabrication : " + this.fabrication.toString();
    }

    public String getCar() {
        return getDetails() + getCharacteristics() + "\n------------";
    }
}
