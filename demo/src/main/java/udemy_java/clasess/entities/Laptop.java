package udemy_java.clasess.entities;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Embeddable;
// Marking as embeddable class for embedding in another entity
// @Embeddable
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
@Cacheable
public class Laptop {
    @Id
    private int lid;
    private String brand;
    private String model;
    private int ram;

    // if we want reference to Alien class here
    // @ManyToOne
    // private Alien alien;

    // for many to many mapping
    // @ManyToMany(mappedBy = "laptops")

    // E.G. of Lazy/Eager fetching
    // private List<Alien> aliens;

    public int getLid() {
        return lid;
    }
    public void setLid(int lid) {
        this.lid = lid;
    }
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
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

    // for one to many mapping
    // public Alien getAlien() {
    //     return alien;
    // }
    // public void setAlien(Alien alien) {
    //     this.alien = alien;
    // }

    // public List<Alien> getAliens() {
    //     return aliens;
    // }

    // public void setAliens(List<Alien> aliens) {
    //     this.aliens = aliens;
    // }
    
    @Override
    public String toString() {
        return "Laptop [lid=" + lid + ", brand=" + brand + ", model=" + model + ", ram=" + ram + "]";
    }
}
