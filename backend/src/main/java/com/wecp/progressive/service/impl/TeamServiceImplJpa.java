package com.wecp.progressive.service.impl;

import com.wecp.progressive.entity.Team;
import com.wecp.progressive.exception.TeamAlreadyExistsException;
import com.wecp.progressive.exception.TeamDoesNotExistException;
import com.wecp.progressive.repository.CricketerRepository;
import com.wecp.progressive.repository.MatchRepository;
import com.wecp.progressive.repository.TeamRepository;
<<<<<<< HEAD
import com.wecp.progressive.repository.VoteRepository;
=======
>>>>>>> f2c76cf28480e12a5e7fc657d50183224141e4ec
import com.wecp.progressive.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImplJpa  implements TeamService {

    private TeamRepository teamRepository;

    @Autowired
    CricketerRepository cricketerRepository;

    @Autowired
    MatchRepository matchRepository;

    @Autowired
<<<<<<< HEAD
    VoteRepository voteRepository;

    @Autowired
=======
>>>>>>> f2c76cf28480e12a5e7fc657d50183224141e4ec
    public TeamServiceImplJpa(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public List<Team> getAllTeams() throws SQLException {
        return teamRepository.findAll();
    }

    @Override
<<<<<<< HEAD
    public int addTeam(Team team) throws TeamAlreadyExistsException {
        Optional<Team> existingTeam = teamRepository.findByTeamName(team.getTeamName());
        if (existingTeam.isPresent()) {
            throw new TeamAlreadyExistsException("Team with name " + team.getTeamName() + " already exists.");
        }
=======
    public int addTeam(Team team) throws SQLException {
>>>>>>> f2c76cf28480e12a5e7fc657d50183224141e4ec
        return teamRepository.save(team).getTeamId();
    }

    @Override
    public List<Team> getAllTeamsSortedByName() throws SQLException {
        List<Team> sortedTeam = teamRepository.findAll();
        sortedTeam.sort(Comparator.comparing(Team::getTeamName));
        return sortedTeam;
    }

    @Override
<<<<<<< HEAD
    public Team getTeamById(int teamId) throws TeamDoesNotExistException {
        Optional<Team> existingTeam = teamRepository.findByTeamId(teamId);
        if(!existingTeam.isPresent())
        {
            throw new TeamDoesNotExistException("team does not exist");
        }
        return teamRepository.findByTeamId(teamId).get();
    }

    @Override
    public void updateTeam(Team team) throws TeamAlreadyExistsException {
        Optional<Team> existingTeam = teamRepository.findByTeamName(team.getTeamName());
        if(existingTeam.isPresent())
        {
            throw new TeamAlreadyExistsException("team already exists");
        }
        else
        {
            teamRepository.save(team);
        }
=======
    public Team getTeamById(int teamId) throws SQLException {
        return teamRepository.findByTeamId(teamId);
    }

    @Override
    public void updateTeam(Team team) throws SQLException {
        teamRepository.save(team);
>>>>>>> f2c76cf28480e12a5e7fc657d50183224141e4ec
    }

    @Override
    public void deleteTeam(int teamId) throws SQLException {
<<<<<<< HEAD
        voteRepository.deleteByTeamId(teamId);
=======
>>>>>>> f2c76cf28480e12a5e7fc657d50183224141e4ec
        matchRepository.deleteByTeamId(teamId);
        cricketerRepository.deleteByTeamId(teamId);
        teamRepository.deleteById(teamId);
    }
<<<<<<< HEAD
}



=======
}
>>>>>>> f2c76cf28480e12a5e7fc657d50183224141e4ec
