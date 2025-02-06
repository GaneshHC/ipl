package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Vote;
<<<<<<< HEAD
import com.wecp.progressive.service.VoteService;
import com.wecp.progressive.service.impl.VoteServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
=======
import org.springframework.http.ResponseEntity;
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1

import java.util.List;
import java.util.Map;

<<<<<<< HEAD
@RestController
@RequestMapping("/vote")
public class VoteController {

    @Autowired
    VoteServiceImpl voteService;

    @GetMapping
    public ResponseEntity<List<Vote>> getAllVotes() {
        
        return ResponseEntity.status(HttpStatus.OK).body(voteService.getAllVotes());
    }

    @PostMapping
    public ResponseEntity<Integer> createVote(@RequestBody Vote vote) {
        int id = voteService.createVote(vote);
        return new ResponseEntity<>(id , HttpStatus.CREATED);
=======
public class VoteController {

    public ResponseEntity<List<Vote>> getAllVotes() {
        return null;
    }

    public ResponseEntity<Integer> createVote(Vote vote) {
        return null;
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
    }

    // Each key (k) represents a category (categories - “Team”, “Batsman”, “Bowler”, “All-rounder” and “Wicketkeeper”)
    // and each value (v) represents the total number of votes for that category.
<<<<<<< HEAD
    @GetMapping("/count")
    public ResponseEntity<Map<String, Long>> getVotesCountOfAllCategories() {
        return ResponseEntity.status(HttpStatus.OK).body(voteService.getVotesCountOfAllCategories());
=======
    public ResponseEntity<Map<String, Long>> getVotesCountOfAllCategories() {
        return null;
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
    }
}
