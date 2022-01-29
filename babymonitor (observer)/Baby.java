/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package babymonitor;

import java.util.Observable;

/**
 *
 * @author krita
 */
public class Baby extends Observable {
    
    private boolean crying=false;
    private int level=0;
    private String babyname;

    public Baby(String babyname) {
        this.babyname = babyname;
    }
    
    public void setData(boolean crying, int level) {
	this.crying=crying;
	this.level=level;
        
        setChanged();
	notifyObservers(this);
    }

    public boolean isCrying() {
        return crying;
    }
}
