package com.ekspedisi.service;

import com.ekspedisi.model.ModelEkspedisi;
import com.ekspedisi.repository.EkspedisiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EkspedisiService {

    @Autowired
    private EkspedisiRepository repository;

    // Add new Ekspedisi
    public void addEkspedisi(ModelEkspedisi ekspedisi) {
        repository.save(ekspedisi);
    }

    // Get Ekspedisi by ID
    public ModelEkspedisi getEkspedisi(int id) {
        return repository.findById(id).orElse(null);
    }

    // Update Ekspedisi
    public void updateEkspedisi(ModelEkspedisi ekspedisi) {
        repository.save(ekspedisi);
    }

    // Delete Ekspedisi by ID
    public void deleteEkspedisi(int id) {
        repository.deleteById(id);
    }

    // Get all Ekspedisi
    public List<ModelEkspedisi> getAllEkspedisi() {
        return repository.findAll();
    }
}
