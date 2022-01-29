/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package babymonitor_pull;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author krita
 */
public class BabyMonitorSimple implements Observer {
    
    private Baby mdata;
    private String location;
    private boolean crying;
    
    public BabyMonitorSimple(String location, Observable d) {
	this.location=location;
        this.mdata=(Baby)d;
	d.addObserver(this);
    }
    
    public void display() {
	if (this.crying) {
            System.out.println("Monitor: baby is crying at " + this.location);
	}
    }

    @Override
    public void update(Observable o, Object o1) {
        
        this.crying = this.mdata.isCrying();
        display();
        
    }
}
