/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap1;

import interfaces.IQLDS;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QLDS implements IQLDS {
    private ArrayList<CaNhan> dsCaNhan= new ArrayList<>();

    @Override
    public int them(CaNhan cn) {
        dsCaNhan.add(cn);
        return 1;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int xoa(String ten) {
        if(dsCaNhan.removeIf(cn->cn.hoten==ten))
        return 1;
        else 
        return 0;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inDS() {
        dsCaNhan.forEach(cn->cn.HienThiTT());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}
