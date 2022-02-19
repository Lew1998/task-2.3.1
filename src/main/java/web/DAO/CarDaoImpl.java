package web.DAO;

import org.springframework.stereotype.Controller;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarDaoImpl implements CarDao {
    private final List<Car> car;

    {
        car = new ArrayList<>();
        car.add(new Car(1, "Mercedes", "123"));
        car.add(new Car(2, "Audi", "1234"));
        car.add(new Car(3, "Lada", "1235"));
        car.add(new Car(4, "Porsche", "1236"));
        car.add(new Car(5, "Fiat", "1237"));
    }

    @Override
    public List<Car> show(int id) {
        if (id < 5) {
            return car.stream().limit(id).collect(Collectors.toList());
        }
        return car;
    }

    @Override
    public List<Car> show() {
        return car;
    }
}
