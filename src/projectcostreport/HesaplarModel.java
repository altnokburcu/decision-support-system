/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcostreport;

import javax.swing.JComboBox;

/**
 *
 * @author Burcu
 */
public class HesaplarModel {
   private int p_gruplari;
   private int p_suresi;
   private int p_devamlilik;
   private int p_platform;

    public HesaplarModel(int p_gruplari, int p_suresi, int p_devamlilik, int p_platform) {
        this.p_gruplari = p_gruplari;
        this.p_suresi = p_suresi;
        this.p_devamlilik = p_devamlilik;
        this.p_platform = p_platform;
    }

   
    public int getP_gruplari() {
        return p_gruplari;
    }

    public void setP_gruplari(int p_gruplari) {
        this.p_gruplari = p_gruplari;
    }

    public int getP_suresi() {
        return p_suresi;
    }

    public void setP_suresi(int p_suresi) {
        this.p_suresi = p_suresi;
    }

    public int getP_devamlilik() {
        return p_devamlilik;
    }

    public void setP_devamlilik(int p_devamlilik) {
        this.p_devamlilik = p_devamlilik;
    }

    public int getP_platform() {
        return p_platform;
    }

    public void setP_platform(int p_platform) {
        this.p_platform = p_platform;
    }
   
}
