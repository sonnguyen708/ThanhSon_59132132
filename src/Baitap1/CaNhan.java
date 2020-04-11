/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap1;

/**
 *
 * @author Admin
 */
public abstract class CaNhan {
    String hoten;
    int tuoi;
    String diachi;
    String sdt;
    public CaNhan() {
    }
    public CaNhan(String hoten, int tuoi, String diachi, String sdt) {
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.sdt = sdt;
    }
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public abstract String HienThiTT();
}

