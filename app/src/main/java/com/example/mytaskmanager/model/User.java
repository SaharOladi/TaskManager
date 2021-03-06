package com.example.mytaskmanager.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;
@Entity(tableName = "userTable")
public class User implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private long primaryId;

    @ColumnInfo(name = "uuid")
    private UUID mId;

    @ColumnInfo(name = "user_name")
    private String mUserName;

    @ColumnInfo(name = "user_password")
    private String mPassword;


    public String getUserTasks() {
        return mUserTasks;
    }

    public void setUserTasks(String userTasks) {
        mUserTasks = userTasks;
    }

    @ColumnInfo(name = "user_task")
    private String mUserTasks;

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    @ColumnInfo(name = "user_login")
    private Date mDate;

    public void setId(UUID id) {
        mId = id;
    }

    public User(UUID id, String userName, String password) {
        mId = id;
        mUserName = userName;
        mPassword = password;
    }

    public User(String userName, String password) {
        mId = UUID.randomUUID();
        mUserName = userName;
        mPassword = password;
    }

    public User(String userName, String password, Date date) {
        mUserName = userName;
        mPassword = password;
        mDate = date;
    }

    public User(UUID id) {
        mId = id;
    }

    public User(UUID id, String userName, String password, Date date) {
        mId = id;
        mUserName = userName;
        mPassword = password;
        mDate = date;
    }

    public User() {
        this(UUID.randomUUID());
        mDate = new Date();
    }

    //Getter & Setters
    public UUID getId() {
        return mId;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String userName) {
        mUserName = userName;
    }

    public long getPrimaryId() {
        return primaryId;
    }

    public void setPrimaryId(long primaryId) {
        this.primaryId = primaryId;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        mPassword = password;
    }
}
