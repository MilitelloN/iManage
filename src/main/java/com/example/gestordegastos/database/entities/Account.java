package com.example.gestordegastos.database.entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity
public class Account {
    @PrimaryKey @NonNull int id;
    @NonNull private String name;
    private String desc;
    @NonNull private int idAccType;
    private Long prevClose;
    private Long currClose;
    private Long nextClose;


    public Account(int id, @NonNull String name, String desc, @NonNull int idAccType, Long prevClose, Long currClose, Long nextClose) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.idAccType = idAccType;
        this.prevClose = prevClose;
        this.currClose = currClose;
        this.nextClose = nextClose;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @NonNull
    public int getIdAccType() {
        return idAccType;
    }

    public void setIdAccType(@NonNull int idAccType) {
        this.idAccType = idAccType;
    }

    public Long getPrevClose() {
        return prevClose;
    }

    public void setPrevClose(Long prevClose) {
        this.prevClose = prevClose;
    }

    public Long getCurrClose() {
        return currClose;
    }

    public void setCurrClose(Long currClose) {
        this.currClose = currClose;
    }

    public Long getNextClose() {
        return nextClose;
    }

    public void setNextClose(Long nextClose) {
        this.nextClose = nextClose;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", accType=" + idAccType +
                ", prevClose=" + prevClose +
                ", currClose=" + currClose +
                ", nextClose=" + nextClose +
                '}';
    }
}
