package com.wecp.progressive.service;

import com.wecp.progressive.entity.Match;

<<<<<<< HEAD
import java.sql.SQLException;
=======
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
import java.util.List;

public interface MatchService {

<<<<<<< HEAD
    List<Match> getAllMatches() throws SQLException;

    Match getMatchById(int matchId) throws SQLException;

    Integer addMatch(Match match) throws SQLException;

    void updateMatch(Match match) throws SQLException;

    void deleteMatch(int matchId) throws SQLException;

    //Do not implement these methods in MatchServiceImplJdbc.java class
    default List<Match> getAllMatchesByStatus(String status)  throws SQLException {
=======
    List<Match> getAllMatches();

    Match getMatchById(int matchId);

    Integer addMatch(Match match);

    void updateMatch(Match match);

    void deleteMatch(int matchId);

    //Do not implement these methods in MatchServiceImplJdbc.java class
    default List<Match> getAllMatchesByStatus(String status) {
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
        return null;
    }
}
