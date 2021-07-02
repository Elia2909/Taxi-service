package taxi.service.service;

import taxi.service.model.Car;
import taxi.service.model.Driver;

import java.util.List;

public interface CarService extends GenericService<Car> {
    void addDriverToCar(Driver driver, Car car);

    void removeDriverFromCar(Driver driver, Car car);

    List<Car> getAllByDriver(Long driverId);
}