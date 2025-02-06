package com.wecp.progressive.service;

import com.wecp.progressive.entity.Cricketer;

<<<<<<< HEAD
import java.sql.SQLException;
=======
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
import java.util.List;

public interface CricketerService {

<<<<<<< HEAD
    List<Cricketer> getAllCricketers() throws SQLException;

    Integer addCricketer(Cricketer cricketer) throws SQLException;

    List<Cricketer> getAllCricketersSortedByExperience() throws SQLException;
=======
    List<Cricketer> getAllCricketers();

    Integer addCricketer(Cricketer cricketer);

    List<Cricketer> getAllCricketersSortedByExperience();
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1

    default void emptyArrayList() {
    }

    //Do not implement these methods in CricketerServiceImplArraylist.java class
<<<<<<< HEAD
    default void updateCricketer(Cricketer cricketer) throws SQLException {}

    default void deleteCricketer(int cricketerId) throws SQLException {}

    default Cricketer getCricketerById(int cricketerId) throws SQLException {
=======
    default void updateCricketer(Cricketer cricketer) {}

    default void deleteCricketer(int cricketerId) {}

    default Cricketer getCricketerById(int cricketerId) {
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
        return null;
    }

    //Do not implement these methods in CricketerServiceImplArraylist.java and CricketerServiceImplJdbc.java class
<<<<<<< HEAD
    default List<Cricketer> getCricketersByTeam(int teamId) throws SQLException {
=======
    default List<Cricketer> getCricketersByTeam(int teamId) {
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
        return null;
    }

}
