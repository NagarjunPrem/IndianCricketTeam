/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.asg3;

/**
 *
 * @author Nagarjun Prem
 */
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

/**
 *
 * @author Nagarjun Prem
 */
@Named
@RequestScoped
public class MarkLocation implements Serializable {
    private MapModel loc;

    @PostConstruct
    public void init()
    {
        loc = new DefaultMapModel();
        
        LatLng value = new LatLng(13.062813434734771, 80.27915153754752);
        //simpleModel.addOverlay(new Marker(coord1, "Konyaalti"));
        loc.addOverlay(new Marker(value, "MCA"));
    }
    
        public MapModel getLoc() {
        return loc;
    }   
    
    
}

