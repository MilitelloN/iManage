package com.example.gestordegastos.database.entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Transaction {
    @PrimaryKey @NonNull private int id;
    @NonNull private int idAccount;
    @NonNull private double amount;
    private String desc;
    @NonNull private int idTransType;
    @NonNull private int installments;
    @NonNull private Long createdAt;
    @NonNull private int idCategoryType;

    public Transaction(int id, @NonNull int idAccount, double amount, String desc, @NonNull int idTransType, int installments, @NonNull Long createdAt, @NonNull int idCategoryType) {
        this.id = id;
        this.idAccount = idAccount;
        this.amount = amount;
        this.desc = desc;
        this.idTransType = idTransType;
        this.installments = installments;
        this.createdAt = createdAt;
        this.idCategoryType = idCategoryType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(@NonNull int idAccount) {
        this.idAccount = idAccount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @NonNull
    public int getIdTransType() {
        return idTransType;
    }

    public void setIdTransType(@NonNull int idTransType) {
        this.idTransType = idTransType;
    }

    public int getInstallments() {
        return installments;
    }

    public void setInstallments(int installments) {
        this.installments = installments;
    }

    @NonNull
    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(@NonNull Long createdAt) {
        this.createdAt = createdAt;
    }

    @NonNull
    public int getIdCategoryType() {
        return idCategoryType;
    }

    public void setIdCategoryType(@NonNull int idCategoryType) {
        this.idCategoryType = idCategoryType;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", account=" + idAccount +
                ", amount=" + amount +
                ", desc='" + desc + '\'' +
                ", transType=" + idTransType +
                ", installments=" + installments +
                ", createdAt=" + createdAt +
                ", categoryType=" + idCategoryType +
                '}';
    }
}
