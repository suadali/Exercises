package Classes;

import java.util.Arrays;
import java.util.Locale;

//Create a class to represent a car dealership. It should have properties representing its name, the maximum number of
// cars it can have on display and all the cars currently in stock.
//
//Hint 1: We could create an individual property for each car we have in stock, but is there a data type we have already
// seen which would let us store all our cars together in the same variable? How can we figure out how big that data structure should be?
//
//Hint 2: A brand new dealership won't have any cars yet. Do we need to pass that information in the constructor when we
// create a dealership, or can we define our class in such a way that every new dealership starts with no cars?
public class Dealearship {
    private String dealershipName;
    private int maxCars;
    private Car[] cars;

    public Dealearship()  {};

    public Dealearship(String dealershipName, int maxCars) {
        this.dealershipName = dealershipName;
        this.maxCars = maxCars;
        this.cars = new Car[maxCars];
    }

    public String getDealershipName() {
        return dealershipName;
    }

    public void setDealershipName(String dealershipName) {
        this.dealershipName = dealershipName;
    }

    public int getMaxCars() {
        return maxCars;
    }

    public void setMaxCars(int maxCars) {
        this.maxCars = maxCars;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Dealearship{" +
                "dealershipName='" + dealershipName + '\'' +
                ", maxCars=" + maxCars +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }

    public int countNumberOfCars() {
        // have counter
        int numOfCars = 0;
        // Loop through number whole dealership array, and count
        for (int i = 0; i < this.maxCars; i++) {
            //If not empty increase number
            if (this.cars[i] != null) {
                numOfCars += 1;
            }
        }
        return numOfCars;
    }




    public void addCar(Car newCar){
        // Loop through our cars array
        for (int i = 0; i < this.maxCars; i++) {
            // Check if there is already a car in that space
            if (this.cars[i] == null){
                // If not, put our new car in that slot
                this.cars[i] = newCar;
                // Once we have placed our new car we can stop the loop
                break;
            }
        }
    }

    public Car findCarByManufacturer(String manufacturerName){

        //Loop through all cars

        for (Car car : this.cars) {
//            System.out.println(car);
            // Get the car manufacturer
            try {

                if(car.getManufacturer().name().toLowerCase().equals(manufacturerName.toLowerCase())){
                    return car;
                }
            }catch (Exception e){
                System.out.println("No Car");
            }

        }

        //Return a
        return new Car();

    }
}


