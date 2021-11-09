package pl.mirekgab.car;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author mirek
 */
public interface CarRepository extends JpaRepository<Car, Long>, CarRepositoryCustom {
    
}
