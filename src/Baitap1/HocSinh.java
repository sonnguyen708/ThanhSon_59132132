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
public class HocSinh extends CaNhan {
    private String lop;
    private String nangkhieu;
    public HocSinh(){
        super();
        this.lop="";
        this.nangkhieu="";
    }
    public HocSinh(String hoten,int tuoi,String diachi,String sdt,String lop,String nangkhieu){
        super(hoten,tuoi,diachi,sdt);
        this.lop=lop;
        this.nangkhieu=nangkhieu;
    }
    public void setlop(String lop){
        this.lop=lop;
    }
    public void settomonDay(String nangkhieu){
        this.nangkhieu=nangkhieu;
    }
    public String getlop(){ 
        return this.lop;
    }  
    public String getnangkhieu(){
        return this.nangkhieu;
    }

    @Override
    public String HienThiTT() {
        String Thongtin="";
        Thongtin="hoten:"+this.hoten+"tuoi:"+this.tuoi+"diachi:"+this.diachi
                +"sdt:"+this.sdt+"lop:"+this.lop+"nangkhieu:"+this.nangkhieu;
        System.out.println(Thongtin);
        return Thongtin;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
