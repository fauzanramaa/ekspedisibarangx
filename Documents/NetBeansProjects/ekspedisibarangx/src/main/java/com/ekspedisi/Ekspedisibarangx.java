/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ekspedisi;


import com.ekspedisi.controller.EkspedisiController;
import com.ekspedisi.service.EkspedisiService;
import com.ekspedisi.view.EkspedisiView;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author Fauzanramaa
 */
@SpringBootApplication
public class Ekspedisibarangx {
    
    @Autowired
    private EkspedisiService ekspedisiService;

    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        
        ApplicationContext context = SpringApplication.run(Ekspedisibarangx.class, args);
        
        EkspedisiController controller = context.getBean(EkspedisiController.class);
        EkspedisiView ekspedisiView = new EkspedisiView(controller);
        ekspedisiView.setVisible(true);
    }
}
