package com.wecp.progressive.service.impl;

import com.wecp.progressive.entity.Cricketer;
<<<<<<< HEAD
import com.wecp.progressive.exception.TeamCricketerLimitExceededException;
import com.wecp.progressive.repository.CricketerRepository;
import com.wecp.progressive.repository.VoteRepository;
=======
import com.wecp.progressive.repository.CricketerRepository;
>>>>>>> f2c76cf28480e12a5e7fc657d50183224141e4ec
import com.wecp.progressive.service.CricketerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;

@Service
public class CricketerServiceImplJpa implements CricketerService {

<<<<<<< HEAD
    
    private CricketerRepository cricketerRepository;

    @Autowired
    VoteRepository voteRepository;

    @Autowired
=======
    private CricketerRepository cricketerRepository;

    @Autowired
>>>>>>> f2c76cf28480e12a5e7fc657d50183224141e4ec
    public CricketerServiceImplJpa(CricketerRepository cricketerRepository) {
        this.cricketerRepository = cricketerRepository;
    }

    @Override
    public List<Cricketer> getAllCricketers() throws SQLException {
        return cricketerRepository.findAll();
    }

    @Override
<<<<<<< HEAD
    public Integer addCricketer(Cricketer cricketer) throws TeamCricketerLimitExceededException {
        Long noOfCricketers = cricketerRepository.countByTeam_TeamId(cricketer.getTeam().getTeamId());
        if(noOfCricketers == 11)
        {
            throw new TeamCricketerLimitExceededException("already 11 cricekters");
        }
=======
    public Integer addCricketer(Cricketer cricketer) throws SQLException {
>>>>>>> f2c76cf28480e12a5e7fc657d50183224141e4ec
        return cricketerRepository.save(cricketer).getCricketerId();
    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() throws SQLException {
        List<Cricketer> sortedCricketer = cricketerRepository.findAll();
        sortedCricketer.sort(Comparator.comparing(Cricketer::getExperience));
        return sortedCricketer;
    }

    @Override
    public void updateCricketer(Cricketer cricketer) throws SQLException {
        cricketerRepository.save(cricketer);
    }

    @Override
    public void deleteCricketer(int cricketerId) throws SQLException {
<<<<<<< HEAD
        voteRepository.deleteByCricketerId(cricketerId);
=======
>>>>>>> f2c76cf28480e12a5e7fc657d50183224141e4ec
        cricketerRepository.deleteById(cricketerId);
    }

    @Override
    public Cricketer getCricketerById(int cricketerId) throws SQLException {
        return cricketerRepository.findByCricketerId(cricketerId);
    }

    @Override
    public List<Cricketer> getCricketersByTeam(int teamId) throws SQLException {
        return cricketerRepository.findByTeam_TeamId(teamId);
    }
<<<<<<< HEAD
}


=======
}
>>>>>>> f2c76cf28480e12a5e7fc657d50183224141e4ec
