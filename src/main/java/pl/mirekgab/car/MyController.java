package pl.mirekgab.car;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mirek
 */
@RestController
public class MyController {
    
    private final CarRepository carRepository;
    private final CarRepositoryImpl carRepositoryImpl;

    @Autowired
    public MyController(CarRepository carRepository, CarRepositoryImpl carRepositoryImpl) {
        this.carRepository = carRepository;
        this.carRepositoryImpl = carRepositoryImpl;
    }
    
    @GetMapping("/")
    public List<Car> carsList() {
        return carRepository.findAll();
    }
    
    @GetMapping("/cq")
    public List<Car> carsListCriteriaQuery() {
        return carRepositoryImpl.findByCriteria("Fiat", null, null, null, null, null, null);
    }
    
    @GetMapping("/param")
    public List<Car> carsListManual(
            @RequestParam(value="brand", defaultValue = "") String brand, 
            @RequestParam(value="model", defaultValue="") String model
    ) {
        return carRepositoryImpl.findByCriteria(brand, model, null, null, null, null, null);
    }
}
