/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Administrator
 */
public class GiangVien {
    private int maNV;
    private String ten;
    private int tuoi;
    private int bac;
    private boolean gioiTinh;
    private LoaiGV loaiGV;

    public GiangVien(int maNV, String ten, int tuoi, int bac, boolean gioiTinh, LoaiGV loaiGV) {
        this.maNV = maNV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.bac = bac;
        this.gioiTinh = gioiTinh;
        this.loaiGV = loaiGV;
    }

    public GiangVien() {
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public LoaiGV getLoaiGV() {
        return loaiGV;
    }

    public void setLoaiGV(LoaiGV loaiGV) {
        this.loaiGV = loaiGV;
    }

    @Override
    public String toString() {
        return "GiangVien{" + "maNV=" + maNV + ", ten=" + ten + ", tuoi=" + tuoi + ", bac=" + bac + ", gioiTinh=" + gioiTinh + ", loaiGV=" + loaiGV + '}';
    }
    public Object[] toDataRow(){
        return new Object[]{maNV,ten,tuoi,bac,gioiTinh==true?"nam":"nu"};
    }
}
