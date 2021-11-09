package pl.mirekgab.car;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author mirek
 */
@Entity(name = "cars")
public class Car {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String brand;
    private String model;
    private String type;
    private Integer registrationYear;
    private String color;
    private String fuel;
    private String transmission;

    public Car() {
    }

    public Car(Long id, String brand, String model, String type, Integer registrationYear, String color, String fuel, String transmission) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.registrationYear = registrationYear;
        this.color = color;
        this.fuel = fuel;
        this.transmission = transmission;
    }
    
    public Car(String brand, String model, String type, Integer registrationYear, String color, String fuel, String transmission) {
        this.id = null;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.registrationYear = registrationYear;
        this.color = color;
        this.fuel = fuel;
        this.transmission = transmission;
    }    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getRegistrationYear() {
        return registrationYear;
    }

    public void setRegistrationYear(Integer registrationYear) {
        this.registrationYear = registrationYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    
    
}
