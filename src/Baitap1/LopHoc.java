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
import interfaces.IQLDS;
public class LopHoc {
    int themHocSinh;
    int themGVGD;
    int inDSHS;
    int inDSGVGD;
    IQLDS qldsHS= new QLDS();
    IQLDS qldsGV= new QLDS();
    public int themHocSinh(HocSinh hs){
        if(qldsHS.them(hs)==1)
            return 1;
       return 0;  
    }
    public int themGVGD(Giaovien gv){
        if(qldsGV.them(gv)==1)
           return 1;
        return 0;
    }
    public int inDSHS(){
        System.out.println("IN danh sach hoc sinh:");
        qldsHS.inDS();
        return 1;
    }
    public int inDSGVGD(){
        System.out.println("IN danh sach giao vien giang day:");
        qldsGV.inDS();
        return 1;
    }
}
