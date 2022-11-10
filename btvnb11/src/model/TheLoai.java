/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Administrator
 */
public class TheLoai {
    private String ma_the_loai;
    private String ten_the_loai;

    public TheLoai(String ma_the_loai, String ten_the_loai) {
        this.ma_the_loai = ma_the_loai;
        this.ten_the_loai = ten_the_loai;
    }

    public TheLoai(String ten_the_loai) {
        this.ten_the_loai = ten_the_loai;
    }

    public TheLoai() {
    }

    public String getMa_the_loai() {
        return ma_the_loai;
    }

    public void setMa_the_loai(String ma_the_loai) {
        this.ma_the_loai = ma_the_loai;
    }

    public String getTen_the_loai() {
        return ten_the_loai;
    }

    public void setTen_the_loai(String ten_the_loai) {
        this.ten_the_loai = ten_the_loai;
    }

    @Override
    public String toString() {
        return "TheLoai{" + "ma_the_loai=" + ma_the_loai + ", ten_the_loai=" + ten_the_loai + '}';
    }
    
}
