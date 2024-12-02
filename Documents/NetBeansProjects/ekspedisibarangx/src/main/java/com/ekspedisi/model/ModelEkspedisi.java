/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ekspedisi.model;
import jakarta.persistence.*;

/**
 *
 * @author Fauzanramaa
 */
@Entity
@Table(name = "ekspedisi")
public class ModelEkspedisi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "asaldantujuan", nullable = false, length = 50)
    private String asaldantujuan; // String untuk penyimpanan di database

    @Column(name = "berat", nullable = false)
    private float berat;

    @Column(name = "pengiriman", nullable = false, length = 30)
    private String pengiriman;

    @Column(name = "pembayaran", nullable = false, length = 20)
    private String pembayaran;

    @Column(name = "harga")
    private int harga;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAsaldantujuan() {
        return asaldantujuan;
    }

    public void setAsaldantujuan(String asaldantujuanStr) {
        this.asaldantujuan = asaldantujuanStr;
    }

    public float getBerat() {
        return berat;
    }

    public void setBerat(float berat) {
        this.berat = berat;
    }

    public String getPengiriman() {
        return pengiriman;
    }

    public void setPengiriman(String pengiriman) {
        this.pengiriman = pengiriman;
    }

    public String getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(String pembayaran) {
        this.pembayaran = pembayaran;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
}

