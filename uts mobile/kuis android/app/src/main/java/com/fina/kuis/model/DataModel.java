package com.fina.kuis.model;

import com.google.gson.annotations.SerializedName;

public class DataModel {
    @SerializedName("kode")
    private String mKode;
    @SerializedName("id")
    private String mId;
    @SerializedName("nama")
    private String mNama;
    @SerializedName("stok")
    private String mStok;
    public String getKode() {
        return mKode;
    }
    public void setKode(String kode) {
        mKode = kode;
    }
    public String getId() {
        return mId;
    }
    public void setId(String id) {
        mId = id;
    }
    public String getNama() {
        return mNama;
    }
    public void setNama(String nama) {
        mNama = nama;
    }
    public String getStok() {
        return mStok;
    }
    public void setStok(String stok) {
        mStok = stok;
    }
    }
