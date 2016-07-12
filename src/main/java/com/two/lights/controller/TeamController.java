package com.two.lights.controller;

import com.two.lights.game.Team;
import com.two.lights.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: isosa
 * Date: 7/10/16
 * Time: 5:41 PM
 * To change this template use File | Settings | File Templates.
 */

//@RestController
public class TeamController {

    @Autowired TeamRepository repository;

    @RequestMapping("/teams/{Id}")
    public Team getTeam(@PathVariable Long Id){
        return repository.findOne(Id);
    }

    @RequestMapping("/teams")
    public List<Team> getTeams(){

/*
        List<Team> teamList = new ArrayList<>();

        Team teamOne = new Team();
        teamOne.setName("Isaias");
        teamOne.setLocation("Guatemala");
        teamOne.setMascotte("Osso");

        teamList.add(teamOne);

        Team teamTwo = new Team();
        teamTwo.setName("Ever");
        teamTwo.setLocation("Guatemala");
        teamTwo.setMascotte("Capitan");

        teamList.add(teamTwo);
        repository.save(teamList);
*/

        return (List<Team>) repository.findAll();
    }
}
