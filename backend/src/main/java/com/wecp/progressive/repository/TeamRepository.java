package com.wecp.progressive.repository;

import com.wecp.progressive.entity.Team;
<<<<<<< HEAD

import java.util.Optional;

=======
>>>>>>> f2c76cf28480e12a5e7fc657d50183224141e4ec
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

<<<<<<< HEAD
    Optional<Team> findByTeamId(int teamId);
    Optional<Team> findByTeamName(String teamName);
}
=======
    Team findByTeamId(int teamId);
}
>>>>>>> f2c76cf28480e12a5e7fc657d50183224141e4ec
