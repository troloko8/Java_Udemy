package udemy_java.clasess;

import jakarta.persistence.Embeddable;
// Marking as embeddable class for embedding in another entity
@Embeddable
public class Laptop {
    private String brand;
    private String model;
    private int ram;


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

    @Override
    public String toString() {
        return "Laptop [ram=" + ram + ", brand=" + brand + ", model=" + model + "]";
    }
}
