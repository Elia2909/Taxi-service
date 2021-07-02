package taxi.service.dao;

import taxi.service.model.Car;

import java.util.List;

public interface CarDao extends GenericDao<Car> {
    List<Car> getAllByDriver(Long driverId);
}
