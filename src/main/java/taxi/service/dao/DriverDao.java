package taxi.service.dao;

import taxi.service.model.Driver;

import java.util.Optional;

public interface DriverDao extends GenericDao<Driver> {
    Optional<Driver> findByLogin(String login);
}
