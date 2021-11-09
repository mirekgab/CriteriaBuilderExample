package pl.mirekgab.car;

import java.util.List;

/**
 *
 * @author mirek
 */
public interface CarRepositoryCustom {
    List<Car> findByCriteria(String brand, String model, String type, Integer registrationYear, String color, String fuel, String transmission);
    
}
