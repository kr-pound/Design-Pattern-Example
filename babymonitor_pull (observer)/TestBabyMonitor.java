/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package babymonitor_pull;

/**
 *
 * @author krita
 */
public class TestBabyMonitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Baby marla = new Baby("marla");
        
        BabyMonitorSimple livingRoom = new BabyMonitorSimple("kitchen", marla);
        marla.setData(true, 1);
        
        Baby charlie = new Baby("Charlie");
        
        BabyMonitorSimple kitchen = new BabyMonitorSimple("Living room", charlie);
        charlie.setData(true, 1);
        
    }
    
}
