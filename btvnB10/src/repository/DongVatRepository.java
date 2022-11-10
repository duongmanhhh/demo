/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import btvnb10.DongVat;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class DongVatRepository {

    public List<DongVat> getAll() {
        String query = "select * from DongVat";
        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            List<DongVat> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DongVat dv = new DongVat(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
                list.add(dv);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public DongVat getOne(String ten) {
        String query = "select * from DongVat where DongVat.tenDV like ?";

        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ten);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                DongVat dv = new DongVat(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
                return dv;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(DongVat dv) {
        String query = "INSERT INTO [dbo].[DongVat]\n"
                + "           ([maDV]\n"
                + "           ,[tenDV]\n"
                + "           ,[namSinh]\n"
                + "           ,[gioiTinh])\n"
                + "     VALUES"
                + "(?,?,?,?)";
        int check = 0;
        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, dv.getMaDV());
            ps.setObject(2, dv.getTen());
            ps.setObject(3, dv.getNamSinh());
            ps.setObject(4, dv.getGioiTinh());
            check = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public static void main(String[] args) {
//        List<GiangVien> list = new GiangVienRepository().getAll();
//        for (GiangVien giangVien : list) {
//            System.out.println(giangVien.toString());
//        }
        DongVat dv = new DongVatRepository().getOne("cho");
        System.out.println(dv.toString());
//        List<DongVat> list = new DongVatRepository().getAll();
//        for (DongVat dongVat : list) {
//            System.out.println(dongVat.toString());
//        }
    }
}
