package udemy_java.clasess.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
// changing table name in hibernate logic hence in DB too
// @Table(name="alien_table")
public class Alien {
    @Id
    private int aid;
    // change the name of column 
    // @Column(name="alien_name")
    private String aname;
    // ignoring this var when create a columns
    // @Transient
    private String tech;
    // that means one to one mapping and each alien has one laptop which gets stored in separate table in DB
    // @OneToOne
    // private Laptop laptop;

    // one to many mapping
    // @OneToMany

    // if we will not want to create a separate join table for mapping
    // @OneToMany(mappedBy = "alien")

    //if we want many to many mapping
    // @ManyToMany

    // E.G. of Lazy/Eager fetching // by default it is LAZY
    @OneToMany(fetch = FetchType.EAGER)
    private List<Laptop> laptops;

    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public String getAname() {
        return aname;
    }
    public void setAname(String aname) {
        this.aname = aname;
    }
    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }
    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Alien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + ", laptops=" + laptops + "]";
    }
}
