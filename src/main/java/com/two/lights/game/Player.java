package com.two.lights.game;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: isosa
 * Date: 7/10/16
 * Time: 7:40 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class Player {

    @Id
    @GeneratedValue
    private Long Id;
    private String name;
    private String position;

    public Player(){super();}

    public Player(String name, String position){
        this();
        this.name = name;
        this.position = position;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
