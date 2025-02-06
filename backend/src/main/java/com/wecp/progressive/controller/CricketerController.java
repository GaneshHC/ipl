package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Cricketer;
<<<<<<< HEAD
import com.wecp.progressive.entity.Team;
import com.wecp.progressive.exception.TeamCricketerLimitExceededException;
import com.wecp.progressive.service.impl.CricketerServiceImplJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/cricketer")
public class CricketerController {

    @Autowired
    CricketerServiceImplJpa cricketerServiceImplJpa;

    @GetMapping
    public ResponseEntity<List<Cricketer>> getAllCricketers() {
        try {
            List<Cricketer> cricketerList = cricketerServiceImplJpa.getAllCricketers();
            return new ResponseEntity<>(cricketerList, HttpStatus.OK);
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{cricketerId}")
    public ResponseEntity<Cricketer> getCricketerById(@PathVariable int cricketerId) {
        try {
            Cricketer cricketer = cricketerServiceImplJpa.getCricketerById(cricketerId);
            return new ResponseEntity<>(cricketer, HttpStatus.OK);
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Integer> addCricketer(@RequestBody Cricketer cricketer) {
        try {
            int cricketerId = cricketerServiceImplJpa.addCricketer(cricketer);
            return new ResponseEntity<>(cricketerId, HttpStatus.CREATED);
        }catch(TeamCricketerLimitExceededException t){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } 
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{cricketerId}")
    public ResponseEntity<Void> updateCricketer(@PathVariable int cricketerId, @RequestBody Cricketer cricketer) {
        try {
            cricketer.setCricketerId(cricketerId);
            cricketerServiceImplJpa.updateCricketer(cricketer);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{cricketerId}")
    public ResponseEntity<Void> deleteCricketer(@PathVariable int cricketerId) {
        try {
            cricketerServiceImplJpa.deleteCricketer(cricketerId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/cricketer/team/{teamId}")
    public ResponseEntity<List<Cricketer>> getCricketersByTeam(@PathVariable int teamId) {
        try {
            List<Cricketer> cricketerList = cricketerServiceImplJpa.getCricketersByTeam(teamId);
            return new ResponseEntity<>(cricketerList, HttpStatus.OK);
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
=======
import org.springframework.http.ResponseEntity;

import java.util.List;

public class CricketerController {

    public ResponseEntity<List<Cricketer>> getAllCricketers() {
        return null;
    }

    public ResponseEntity<Cricketer> getCricketerById(int cricketerId) {
        return null;
    }

    public ResponseEntity<Integer> addCricketer(Cricketer cricketer) {
        return null;
    }

    public ResponseEntity<Void> updateCricketer(int cricketerId, Cricketer cricketer) {
        return null;
    }

    public ResponseEntity<Void> deleteCricketer(int cricketerId) {
        return null;
    }

    public ResponseEntity<List<Cricketer>> getCricketersByTeam(int teamId) {
        return null;
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
    }
}