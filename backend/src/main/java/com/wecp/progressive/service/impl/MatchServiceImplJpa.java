<<<<<<< HEAD

package com.wecp.progressive.service.impl;

import com.wecp.progressive.entity.Match;
import com.wecp.progressive.exception.NoMatchesFoundException;
=======
package com.wecp.progressive.service.impl;

import com.wecp.progressive.entity.Match;
>>>>>>> f2c76cf28480e12a5e7fc657d50183224141e4ec
import com.wecp.progressive.repository.MatchRepository;
import com.wecp.progressive.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class MatchServiceImplJpa implements MatchService {

    private MatchRepository matchRepository;

    @Autowired
    public MatchServiceImplJpa(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    @Override
    public List<Match> getAllMatches() throws SQLException {
        return matchRepository.findAll();
    }

    @Override
    public Match getMatchById(int matchId) throws SQLException {
        return matchRepository.findByMatchId(matchId);
    }

    @Override
    public Integer addMatch(Match match) throws SQLException {
        return matchRepository.save(match).getMatchId();
    }

    @Override
    public void updateMatch(Match match) throws SQLException {
        matchRepository.save(match);
    }

    @Override
    public void deleteMatch(int matchId) throws SQLException {
        matchRepository.deleteById(matchId);
    }

    @Override
    public List<Match> getAllMatchesByStatus(String status) throws SQLException {
<<<<<<< HEAD
        if(matchRepository.findAll().isEmpty())
        {
            throw new NoMatchesFoundException("no match found");
        }
        List<Match> matchList = matchRepository.findAllByStatus(status);
        return matchList;
    }
}



=======
        List<Match> matchList = matchRepository.findAllByStatus(status);
        return matchList;
    }
}
>>>>>>> f2c76cf28480e12a5e7fc657d50183224141e4ec
