package com.taraspringrest.my;

import javax.persistence.*;

/**
 * Created by admin on 16.08.2017.
 */
@Entity
@Table(name = "fighters")
public class Fighter {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;


    private String name;
    private String style;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Fighter(){

    }
    public Fighter(String name, String style) {
        this.name = name;
        this.style = style;
    }
}
