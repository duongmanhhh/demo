/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import java.util.List;
import model.GiangVien;
import service.intFGiangVien;

/**
 *
 * @author Administrator
 */
public class GiangVienImpl implements intFGiangVien {

    repository.GiangVienRepository reP = new repository.GiangVienRepository();

    @Override
    public List<GiangVien> getAll(List<GiangVien> list) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return reP.getAll();

    }

    @Override
    public String add(GiangVien gv) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        boolean kq = reP.add(gv);
        String result = "";
        if (kq == true) {
            result = "add thanh cong";
        } else {
            result = "add that bai";
        }
        return result;
    }

    @Override
    public String update(GiangVien gv, String maGV) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        boolean kq = reP.update(gv, maGV);
        String result = "";
        if (kq == true) {
            result = "sua thanh cong";
        } else {
            result = "sua that bai";
        }
        return result;
    }

    @Override
    public String delete(String maGV) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        boolean kq = reP.delete(maGV);
        String result = "";
        if (kq == true) {
            result = "xoa thanh cong";
        } else {
            result = "xoa that bai";
        }
        return result;
    }

    @Override
    public void loadData(List<GiangVien> list) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        list = reP.getAll();
    }

    @Override
    public void sapSep(List<GiangVien> list) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        list.sort((o1, o2) -> {
            return o1.getTen().compareTo(o2.getTen()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
        });
    }

}
