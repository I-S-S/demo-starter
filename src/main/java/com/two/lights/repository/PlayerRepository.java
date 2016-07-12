package com.two.lights.repository;

import com.two.lights.game.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created with IntelliJ IDEA.
 * User: isosa
 * Date: 7/10/16
 * Time: 6:05 PM
 * To change this template use File | Settings | File Templates.
 */

@RestResource(path="players", rel="player")
public interface PlayerRepository extends CrudRepository<Team, Long> {

}
