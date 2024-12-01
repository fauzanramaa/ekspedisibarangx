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

    @Transient
    private AsalTujuan asaldantujuan; // Representasi asal, tujuan, dan jarak

    @Column(name = "asaldantujuan", nullable = false, length = 50)
    private String asaldantujuanStr; // String untuk penyimpanan di database

    @Column(name = "berat", nullable = false)
    private float berat;

    @Column(name = "pengiriman", nullable = false, length = 30)
    private String pengiriman;

    @Column(name = "pembayaran", nullable = false, length = 20)
    private String pembayaran;

    @Column(name = "harga")
    private int harga;

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AsalTujuan getAsaldantujuan() {
        return asaldantujuan;
    }

    public void setAsaldantujuan(AsalTujuan asaldantujuan) {
        this.asaldantujuan = asaldantujuan;
        this.asaldantujuanStr = asaldantujuan.toString(); // Simpan string representasi untuk database
    }

    public String getAsaldantujuanStr() {
        return asaldantujuanStr;
    }

    public void setAsaldantujuanStr(String asaldantujuanStr) {
        this.asaldantujuanStr = asaldantujuanStr;
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

    // Kalkulasi harga berdasarkan jarak, berat, dan metode pengiriman
    public void calculateHarga() {
        int hargaPerKm = switch (pengiriman) {
            case "Fast Track" -> 10000;
            case "Mass Track" -> 8000;
            case "Motor Track" -> 5000;
            default -> 0;
        };
        this.harga = (int) (asaldantujuan.getJarak() * berat * hargaPerKm);
    }
}

