package nl.Pet_Supplies_Online.model;

import javax.persistence.*;

/**
 * Created by rwitlox on 21-5-2017.
 */
@Entity
public class Product{
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String description;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String description) { this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}