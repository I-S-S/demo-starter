package com.two.lights.game;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: isosa
 * Date: 7/10/16
 * Time: 5:35 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class Team {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String location;
    private String mascotte;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "teamId")
    Set<Player> playerSet;

    public Team(){super();}

    public Team(String name, String location, Set<Player> playerSet){
        this();
        this.name = name;
        this.location = location;
        this.playerSet = playerSet;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMascotte() {
        return mascotte;
    }

    public void setMascotte(String mascotte) {
        this.mascotte = mascotte;
    }

    public Set<Player> getPlayers() {
        return playerSet;
    }

    public void setPlayers(Set<Player> players) {
        this.playerSet = players;
    }

}
