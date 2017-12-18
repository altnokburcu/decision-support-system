/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcostreport;

/**
 *
 * @author Burcu
 */
public class jsonModel {
   private String p_gruplari;
   private String p_suresi;
   private String p_devamlilik;
   private String p_platform;

    public String getP_gruplari() {
        return p_gruplari;
    }

    public void setP_gruplari(String p_gruplari) {
        this.p_gruplari = p_gruplari;
    }

    public String getP_suresi() {
        return p_suresi;
    }

    public void setP_suresi(String p_suresi) {
        this.p_suresi = p_suresi;
    }

    public String getP_devamlilik() {
        return p_devamlilik;
    }

    public void setP_devamlilik(String p_devamlilik) {
        this.p_devamlilik = p_devamlilik;
    }

    public String getP_platform() {
        return p_platform;
    }

    public void setP_platform(String p_platform) {
        this.p_platform = p_platform;
    }

    public jsonModel(String p_gruplari, String p_suresi, String p_devamlilik, String p_platform) {
        this.p_gruplari = p_gruplari;
        this.p_suresi = p_suresi;
        this.p_devamlilik = p_devamlilik;
        this.p_platform = p_platform;
    }

    
}
