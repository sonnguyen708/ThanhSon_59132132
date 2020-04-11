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
public class Giaovien extends CaNhan{
    private String monDay;
    private String tomonDay;
    
    public Giaovien(){
        super();
        this.monDay="";
        this.tomonDay="";
    }
    public Giaovien(String hoten,int tuoi,String diachi,String sdt,String monDay,String tomonDay){
        super(hoten,tuoi,diachi,sdt);
        this.monDay=monDay;
        this.tomonDay=tomonDay;
    }
    public void setMonDay(String monDay){
        this.monDay=monDay;
    }
    public void settomonDay(String tomonDay){
        this.tomonDay=tomonDay;
    }
    public String getmonDay(){ 
        return this.monDay;
    }  
    public String gettomonDay(){
        return this.tomonDay;
    }

    @Override
    public String HienThiTT() {
        String Thongtin="";
        Thongtin="hoten:"+this.hoten+"tuoi:"+this.tuoi+"diachi:"+this.diachi
                +"sdt:"+this.sdt+"monDay:"+this.monDay+"tomonDay:"+this.tomonDay;
        System.out.println(Thongtin);
        return Thongtin;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
