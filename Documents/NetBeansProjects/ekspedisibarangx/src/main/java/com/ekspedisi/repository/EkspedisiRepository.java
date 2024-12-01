/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ekspedisi.repository;

import com.ekspedisi.model.ModelEkspedisi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author geren
 */
@Repository
public interface EkspedisiRepository extends JpaRepository<ModelEkspedisi, Integer>{
    
    
    
}
