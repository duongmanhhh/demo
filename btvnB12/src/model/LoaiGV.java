/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author Administrator
 */
public class LoaiGV {
    private int id;
    private String ten;

    public LoaiGV(int id, String ten) {
        this.id = id;
        this.ten = ten;
    }

    public LoaiGV(String ten) {
        this.ten = ten;
    }

    public LoaiGV(int id) {
        this.id = id;
    }

    public LoaiGV() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "LoaiGV{" + "id=" + id + ", ten=" + ten + '}';
    }
    
    
}
