package taxi.service.service;

import java.util.Optional;
import taxi.service.controller.exception.AuthenticationException;
import taxi.service.lib.Injector;
import taxi.service.lib.Service;
import taxi.service.model.Driver;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Injector injector = Injector.getInstance("taxi.service");
    private static DriverService driverService =
            (DriverService) injector.getInstance(DriverService.class);

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> driver = driverService.findByLogin(login);
        if (driver.isPresent() && driver.get().getPassword().equals(password)) {
            return driver.get();
        }
        throw new AuthenticationException("Login or password is incorrect. Try again");
    }
}
