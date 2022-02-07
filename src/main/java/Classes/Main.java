package Classes;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(Manufacturer.BMW, EngineType.electric, 100_000);
        Car car2 = new Car(Manufacturer.Honda, EngineType.diesel, 1000);
        
        Car[] cars = {car1, car2};


        car1.setEngineType(EngineType.diesel);
        System.out.println(car1);
        System.out.println("car1 price is currently £" + car1.getPrice());

        System.out.println("-----------------");

        Dealearship hd = new Dealearship("Hajr's a dealer", 5);
        System.out.println(hd);

        System.out.println("-----------------");

        for (Car car: cars) {
            hd.addCar(car);
        }
        System.out.println(hd);
        
    }
}
