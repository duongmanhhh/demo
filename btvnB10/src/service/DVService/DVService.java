/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.DVService;

import btvnb10.DongVat;
import java.util.List;
import service.DVImpl;

/**
 *
 * @author Administrator
 */
public class DVService implements DVImpl {

    private repository.DongVatRepository reP = new repository.DongVatRepository();

    @Override
    public List<DongVat> getAll() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return reP.getAll();
    }

    @Override
    public List<DongVat> loadData(List<DongVat> listDV) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        listDV = reP.getAll();
        return listDV;
    }

    @Override
    public String add(DongVat dv) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        boolean result = reP.add(dv);
        String kq = "";
        if (result == true) {
            kq = "add thanh cong";
        } else {
            kq = "add that bai";
        }
        return kq;

    }

    @Override
    public void sapSep(List<DongVat> listDV) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        listDV.sort((o1, o2) -> {
            return o2.getTen().compareTo(o1.getTen()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
        });
    }

    @Override
    public DongVat getOne(String ten) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DongVat dv=reP.getOne(ten);
        return dv;
    }

}
