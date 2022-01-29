/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package babymonitor;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author krita
 */
public class BabyMonitorSimple implements Observer {
    
    private String location;
    private boolean crying;
    
    public BabyMonitorSimple(String location, Observable d) {
	this.location=location;
	d.addObserver(this);
    }
    
    public void display() {
	if (this.crying) {
            System.out.println("Monitor: baby is crying at " + this.location);
	}
    }

    @Override
    public void update(Observable o, Object o1) {
        
        if (o1 instanceof Baby) {
            Baby data = (Baby) o1;
            
            this.crying = data.isCrying();
            
            display();
        }
        
    }
}
