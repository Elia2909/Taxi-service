package taxi.service.service;

import taxi.service.model.Driver;

import java.util.Optional;

public interface DriverService extends GenericService<Driver> {
    Optional<Driver> findByLogin(String login);
}
