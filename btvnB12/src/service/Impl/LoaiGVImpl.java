/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import java.util.List;
import model.LoaiGV;
import service.intFLoaiGV;

/**
 *
 * @author Administrator
 */
public class LoaiGVImpl implements intFLoaiGV{
    repository.LoaiGVRepository reP=new repository.LoaiGVRepository();
    @Override
    public List<LoaiGV> getAll(List<LoaiGV> list) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return reP.getAll();
    }

    @Override
    public LoaiGV getOne(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return reP.getOne(id);
    }
    
}
