package com.meditab.training.srp.excersice_refactored;
import java.util.Arrays;
import java.util.List;

public class carInfo {
	private CarManager CM = new CarManager();
	private List<Car> carsData = CM.getData();
	
	public String getCarsNames()
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : carsData) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
	
    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : carsData) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
