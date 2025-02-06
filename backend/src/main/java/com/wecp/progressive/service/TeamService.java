package com.wecp.progressive.service;

import com.wecp.progressive.entity.Team;

<<<<<<< HEAD
import java.sql.SQLException;
=======
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
import java.util.List;

public interface TeamService {

<<<<<<< HEAD
    List<Team> getAllTeams() throws SQLException;

    int addTeam(Team team) throws SQLException;

    List<Team> getAllTeamsSortedByName() throws SQLException;
=======
    List<Team> getAllTeams();

    int addTeam(Team team);

    List<Team> getAllTeamsSortedByName();
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1

    default void emptyArrayList() {
    }

    //Do not implement these methods in TeamServiceImplArrayList.java class
<<<<<<< HEAD
    default Team getTeamById(int teamId) throws SQLException {
        return null;
    }

    default void updateTeam(Team team) throws SQLException {}

    default void deleteTeam(int teamId) throws SQLException {}
=======
    default Team getTeamById(int teamId) {
        return null;
    }

    default void updateTeam(Team team) {}

    default void deleteTeam(int teamId) {}
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1

}
