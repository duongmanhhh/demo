/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author Administrator
 */
public class Sach {
    private String ma_sach;
    private String ten_sach;
    private TheLoai theLoai;
    private int so_luong;
    private int gia_tien;
    private String nha_xuat_ban;

    public Sach(String ma_sach, String ten_sach, TheLoai theLoai, int so_luong, int gia_tien, String nha_xuat_ban) {
        this.ma_sach = ma_sach;
        this.ten_sach = ten_sach;
        this.theLoai = theLoai;
        this.so_luong = so_luong;
        this.gia_tien = gia_tien;
        this.nha_xuat_ban = nha_xuat_ban;
    }

    public Sach() {
    }

    public String getMa_sach() {
        return ma_sach;
    }

    public void setMa_sach(String ma_sach) {
        this.ma_sach = ma_sach;
    }

    public String getTen_sach() {
        return ten_sach;
    }

    public void setTen_sach(String ten_sach) {
        this.ten_sach = ten_sach;
    }

    public TheLoai getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(TheLoai theLoai) {
        this.theLoai = theLoai;
    }

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    public int getGia_tien() {
        return gia_tien;
    }

    public void setGia_tien(int gia_tien) {
        this.gia_tien = gia_tien;
    }

    public String getNha_xuat_ban() {
        return nha_xuat_ban;
    }

    public void setNha_xuat_ban(String nha_xuat_ban) {
        this.nha_xuat_ban = nha_xuat_ban;
    }

    @Override
    public String toString() {
        return "Sach{" + "ma_sach=" + ma_sach + ", ten_sach=" + ten_sach + ", theLoai=" + theLoai + ", so_luong=" + so_luong + ", gia_tien=" + gia_tien + ", nha_xuat_ban=" + nha_xuat_ban + '}';
    }

    

    public Object[]  toDataRow(){
        return new Object[]{ma_sach,ten_sach,nha_xuat_ban,so_luong,gia_tien,theLoai.getTen_the_loai()};
    }
}
