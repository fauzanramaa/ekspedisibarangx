/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ekspedisi.model;

/**
 *
 * @author Fauzanramaa
 */
public class AsalTujuan {
    private String asal;
    private String tujuan;
    private int jarak;

    public AsalTujuan(String asal, String tujuan, int jarak) {
        this.asal = asal;
        this.tujuan = tujuan;
        this.jarak = jarak;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public int getJarak() {
        return jarak;
    }

    public void setJarak(int jarak) {
        this.jarak = jarak;
    }

    @Override
    public String toString() {
        return asal + "To" + tujuan + " = " + jarak;
    }
}

