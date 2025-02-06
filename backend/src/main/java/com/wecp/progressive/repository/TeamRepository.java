package com.wecp.progressive.repository;

<<<<<<< HEAD
import com.wecp.progressive.entity.Team;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

    Optional<Team> findByTeamId(int teamId);
    Optional<Team> findByTeamName(String teamName);
=======
public interface TeamRepository {
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
}
