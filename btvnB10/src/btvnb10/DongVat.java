/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvnb10;

/**
 *
 * @author Administrator
 */
public class DongVat {
    private String maDV;
    private String ten;
    private int namSinh;
    private int gioiTinh;

    public DongVat(String maDV, String ten, int namSinh, int gioiTinh) {
        this.maDV = maDV;
        this.ten = ten;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }

    public DongVat() {
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "DongVat{" + "maDV=" + maDV + ", ten=" + ten + ", namSinh=" + namSinh + ", gioiTinh=" + gioiTinh + '}';
    }
    public Object[] toDataRow(){
        return new Object[]{maDV,ten,namSinh,gioiTinh==1?"duc":"cai"};
    }
    
}
