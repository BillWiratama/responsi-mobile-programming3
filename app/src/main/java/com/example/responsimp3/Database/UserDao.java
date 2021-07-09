package com.example.responsimp3.Database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface UserDao {
    @Insert
    void registerUser(UserEntity userEntity);

    @Query("SELECT * from user where email=(:userID) and password=(:password)")
    UserEntity login(String userID ,String password);

    @Query("SELECT * from user where email=(:email)")
    UserEntity recovery(String email);
}
