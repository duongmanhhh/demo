/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impll;

import java.util.List;
import model.Sach;
import service.intFSach;

/**
 *
 * @author Administrator
 */
public class SachImpl implements intFSach {

    repository.SachRepository serS = new repository.SachRepository();

    @Override
    public List<Sach> getAll() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return serS.getAll();
    }

    @Override
    public Sach getOneTenTL(String maTl) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return serS.getOne(maTl);
    }

    @Override
    public void sapXep(List<Sach> list) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        list.sort((o1, o2) -> {
            Integer i1 = o1.getGia_tien();
            Integer i2 = o2.getGia_tien();
            return i1.compareTo(i2);
        });
    }

    @Override
    public List<Sach> loadData(List<Sach> list) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        list=serS.getAll();
        return list;
    }

    @Override
    public String add(Sach sach) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        boolean result = serS.add(sach);
        String kq = "";
        if (result == true) {
            kq = " add thanh cong";
        } else {
            kq = "add that bai";
        }
        return kq;
    }

}
