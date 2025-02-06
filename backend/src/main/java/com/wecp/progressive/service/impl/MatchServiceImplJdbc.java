package com.wecp.progressive.service.impl;

<<<<<<< HEAD
import com.wecp.progressive.dao.MatchDAO;
import com.wecp.progressive.entity.Match;
import com.wecp.progressive.service.MatchService;

import java.sql.SQLException;
import java.util.List;

public class MatchServiceImplJdbc implements MatchService {

    private MatchDAO matchDAO;

    public MatchServiceImplJdbc(MatchDAO matchDAO) {
        this.matchDAO = matchDAO;
    }

    @Override
    public List<Match> getAllMatches() throws SQLException {
        return matchDAO.getAllMatches();
    }

    @Override
    public Match getMatchById(int matchId) throws SQLException {
        return matchDAO.getMatchById(matchId);
    }

    @Override
    public Integer addMatch(Match match) throws SQLException {
        return matchDAO.addMatch(match);
    }

    @Override
    public void updateMatch(Match match) throws SQLException {
        matchDAO.updateMatch(match);
    }

    @Override
    public void deleteMatch(int matchId) throws SQLException {
        matchDAO.deleteMatch(matchId);
    }
=======
public class MatchServiceImplJdbc  {
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1

}