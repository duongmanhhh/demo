/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import btvnb10.DongVat;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface DVImpl {
    List<DongVat>getAll();
    List<DongVat>loadData(List<DongVat>listDV);
    String add(DongVat dv);
    void sapSep(List<DongVat>listDV);
    DongVat getOne(String ten);
}
