/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.GiangVien;

/**
 *
 * @author Administrator
 */
public interface intFGiangVien {
    List<GiangVien>getAll(List<GiangVien>list);
    String add(GiangVien gv);
    String update(GiangVien gv,String maGV);
    String delete(String maGV);
    void loadData(List<GiangVien>list);
    void sapSep(List<GiangVien>list);
}
