/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ekspedisi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ekspedisi.model.ModelEkspedisi;
import com.ekspedisi.service.EkspedisiService;

import java.util.List;

@RestController
@RequestMapping("/api/ekspedisi")
public class EkspedisiController {

    @Autowired
    private EkspedisiService ekspedisiService;

    
    public String addEkspedisi(@RequestBody ModelEkspedisi ekspedisi) {
        ekspedisiService.addEkspedisi(ekspedisi);
        return "Ekspedisi added successfully";
    }

    
    public ModelEkspedisi getEkspedisi(@PathVariable int id) {
        return ekspedisiService.getEkspedisi(id);
    }

    
    public String updateEkspedisi(@RequestBody ModelEkspedisi ekspedisi) {
        ekspedisiService.updateEkspedisi(ekspedisi);
        return "Ekspedisi updated successfully";
    }

    
    public String deleteEkspedisi(@PathVariable int id) {
        ekspedisiService.deleteEkspedisi(id);
        return "Ekspedisi deleted successfully";
    }

    
    public List<ModelEkspedisi> getAllEkspedisi() {
        return ekspedisiService.getAllEkspedisi();
    }
}

