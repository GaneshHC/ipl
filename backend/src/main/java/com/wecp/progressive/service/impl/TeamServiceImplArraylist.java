package com.wecp.progressive.service.impl;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;
@Service
public class TeamServiceImplArraylist implements TeamService {

    private List<Team> teamList = new ArrayList<>();

   @Override 
   public List<Team> getAllTeams() 
   { 
    return teamList;
   }
    @Override
    public int addTeam(Team team) {
      teamList.add(team);
    return teamList.size();  }

    @Override
    public List<Team> getAllTeamsSortedByName() {
        List<Team> sortedTeamList = teamList;
        sortedTeamList.sort(Comparator.comparing(Team :: getTeamName));
        return sortedTeamList;
    }
=======
public class TeamServiceImplArraylist  {
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1

}