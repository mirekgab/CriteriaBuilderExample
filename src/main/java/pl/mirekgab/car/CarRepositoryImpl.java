package pl.mirekgab.car;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mirek
 */
@Repository
public class CarRepositoryImpl implements CarRepositoryCustom {
    EntityManager em;
    
    @Autowired
    public CarRepositoryImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Car> findByCriteria(String brand, String model, String type, Integer registrationYear, String color, String fuel, String transmission) {
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Car> criteriaQuery = criteriaBuilder.createQuery(Car.class);
        
        Root<Car> car = criteriaQuery.from(Car.class);
        List<Predicate> predicates = new ArrayList<>();
        
        if (brand!=null && brand.length()>0) {
            predicates.add(criteriaBuilder.equal(car.get("brand"), brand));
        }
        if (model!=null && model.length()>0) {
            predicates.add(criteriaBuilder.equal(car.get("model"), model));
        }
        if (transmission!=null && transmission.length()>0) {
            predicates.add(criteriaBuilder.equal(car.get("transmission"), transmission));
        }
        
        criteriaQuery.where(predicates.toArray(new Predicate[0]));
        
        return em.createQuery(criteriaQuery).getResultList();
    }
    
}
