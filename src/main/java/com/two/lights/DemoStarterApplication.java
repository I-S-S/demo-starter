package com.two.lights;

import com.two.lights.game.Player;
import com.two.lights.game.Team;
import com.two.lights.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class DemoStarterApplication {

    @Autowired TeamRepository teamRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoStarterApplication.class, args);
	}

    @PostConstruct
    public void init(){
        List<Team> teamList = new ArrayList<>();
        Set<Player> playerSet = new HashSet<>();

        Player player = new Player("Isaias", "defensa");
        Player playerTwo = new Player("Ever", "volante");

        playerSet.add(player);
        playerSet.add(playerTwo);

        Team teamOne = new Team("Juan", "Guatemala", playerSet);
/*
        teamOne.setName("Isaias");
        teamOne.setLocation("Guatemala");
        teamOne.setMascotte("Osso");
*/

        teamList.add(teamOne);

        playerSet = new HashSet<>();

        Player playerThree = new Player("Milton", "delantero");
        Player playerFour = new Player("Alvaro", "media");

        playerSet.add(playerThree);
        playerSet.add(playerFour);

        Team teamTwo = new Team("Pedro", "Guatemala", playerSet);
/*
        teamTwo.setName("Ever");
        teamTwo.setLocation("Guatemala");
        teamTwo.setMascotte("Capitan");
*/

        teamList.add(teamTwo);

        teamRepository.save(teamList);
    }
}
