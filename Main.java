public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "X1", 2022, 5, "Diesel", "Blanc");
        Car mercedes = new Car("Mercedes", "GLA", 2021, 5, "Essence", "Noire");
        Car renault = new Car("Renault", "CLIO 4", 2020, 3, "GPL", "Gris");
        Car citroen = new Car("Citroen", "C3 PICASSO", 2019, 5, "Essence", "Bleu");

        String[] listCar = {bmw.getCar(), mercedes.getCar(), renault.getCar(), citroen.getCar()};

        getDetailsList(listCar);
    }

    static void getDetailsList(String[] listCar) {
        for(int i = 0; i < listCar.length; i++) {
            System.out.println(listCar[i]);
        }
    }
}
