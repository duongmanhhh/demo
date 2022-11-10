/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Sach;

/**
 *
 * @author Administrator
 */
public interface intFSach {
    List<Sach> getAll();
    Sach getOneTenTL(String maTl);
    void sapXep(List<Sach>list);
    List<Sach>loadData(List<Sach>list);
    String add(Sach sach);
}
