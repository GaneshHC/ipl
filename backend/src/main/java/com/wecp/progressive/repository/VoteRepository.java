package com.wecp.progressive.repository;

<<<<<<< HEAD
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Vote;

@Repository
public interface VoteRepository extends JpaRepository<Vote , Integer>{
    
    //@Query("SELECT COUNT(v) FROM Vote v WHERE v.category = :category")
    Long countByCategory(String category);

    @Modifying
    @Transactional
    @Query("DELETE FROM Vote t WHERE t.team.teamId = :teamId")
    void deleteByTeamId(int teamId);

    @Modifying
    @Transactional
    @Query("DELETE FROM Vote c WHERE c.cricketer.cricketerId = :cricketerId")
    void deleteByCricketerId(int cricketerId);

}
=======

public interface VoteRepository {
}
>>>>>>> f2c76cf28480e12a5e7fc657d50183224141e4ec
