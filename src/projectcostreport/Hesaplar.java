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
public class Hesaplar {

 public int Hesaplar(HesaplarModel hModel){
     int zp = zorlukPuani(hModel.getP_gruplari(), hModel.getP_suresi(),hModel.getP_platform());
     int dp = devamlilikPuani(hModel.getP_devamlilik());
     float topPuan=toplamPuan(zp,dp);
     int fiyat=fiyatHesapla(topPuan);
     return fiyat;
 }
    int zorlukPuani(int p_gruplari, int p_suresi, int p_platform){
        int puan=0;
        if(p_gruplari==0){
            puan = puan+5;
        }
        else if(p_gruplari==1){
            puan = puan+10;
        }
        else if(p_gruplari==2){
            puan = puan+15;
        }
        else{
            puan = puan+20;
        }
        if(p_suresi==0){
            puan=puan+5;
        }
        else if(p_suresi==1){
            puan=puan+10;
        }
        else if(p_suresi==2){
            puan=puan+15;
        }
        else if(p_suresi==3){
            puan=puan+20;
        }
        else{
            puan=puan+25;
        }
        if(p_platform==0){
            puan=puan+5;
        }
        else if(p_platform==1){
            puan=puan+10;
        }
        else{
            puan=puan+15;
        }
        return puan;
    }
    int devamlilikPuani(int p_devamlilik){
        int puan=0;
        if(p_devamlilik==0){
            puan=puan+10;
        }
        else if(p_devamlilik==1){
            puan=puan+20;
        }
        else{
            puan=puan+30;
        }
     return puan;
    
    }
    float toplamPuan(int zp,int dp){
        float puan=(zp*7)/10 + (dp*3)/10;
        return puan;
    }
    int fiyatHesapla(float puan){
    int fiyat = 500;
    if(puan>13 && puan<=15){
        fiyat=500;
    }
    else if(puan>15 && puan<=25){
        fiyat=1500;
    }
    else if(puan>25 && puan<=40){
        fiyat=3000;
    }
    else if(puan>40 && puan<=51){
        fiyat=10000;
    }
    return fiyat;
    }
    
}
