/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ekspedisi.model;


import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 *
 * @author Fauzanramaa
 */
public class ModelTabelEkspedisi extends AbstractTableModel {
    private List<ModelEkspedisi> ekspedisiList;
    private String[] columnNames = {"ID", "NPM", "Nama", "Semester", "IPK"};

    public ModelTabelEkspedisi(List<ModelEkspedisi> ekspedisiList) {
        this.ekspedisiList = ekspedisiList;
    }

    @Override
    public int getRowCount() {
        return ekspedisiList.size(); // Jumlah baris sesuai dengan jumlah data mahasiswa
    }

    @Override
    public int getColumnCount() {
        return columnNames.length; // Jumlah kolom sesuai dengan jumlah elemen dalam columnNames
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ModelEkspedisi ekspedisi = ekspedisiList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return ekspedisi.getId();
            case 1:
                return ekspedisi.getAsaldantujuan();
            case 2:
                return ekspedisi.getBerat();
            case 3:
                return ekspedisi.getSemester();
            case 4:
                return ekspedisi.getIpk();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column]; // Mengatur nama kolom
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false; // Semua sel tidak dapat diedit
    }

    // Method untuk menambahkan atau memodifikasi data, jika dibutuhkan
    public void setMahasiswaList(List<ModelMahasiswa> mahasiswaList) {
        this.mahasiswaList = mahasiswaList;
        fireTableDataChanged(); // Memberitahu JTable bahwa data telah berubah
    }
}
