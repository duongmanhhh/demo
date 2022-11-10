/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impll;

import model.TheLoai;
import service.intFTheLoai;

/**
 *
 * @author Administrator
 */
public class TheLoaiImpl implements intFTheLoai{
    repository.TheLoaiRepository serTl=new repository.TheLoaiRepository();
    
    @Override
    public TheLoai getOne(String maTl) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return serTl.getOne(maTl);
    }
    
}
