/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import model.GiangVien;
import model.LoaiGV;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class GiangVienRepository {

    public List<GiangVien> getAll() {
        String query = "SELECT        dbo.GGGiangVien.maNV, dbo.GGGiangVien.ten, dbo.GGGiangVien.tuoi, dbo.GGGiangVien.bac, dbo.GGGiangVien.gioiTinh, dbo.GGGiangVien.loaiGV,dbo.Loaii.id\n"
                + "FROM            dbo.GGGiangVien CROSS JOIN\n"
                + "                         dbo.Loaii";
        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            List<GiangVien> listGV = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LoaiGV loaiGV = new LoaiGV(rs.getInt(7), rs.getString(6));
                GiangVien gv = new GiangVien(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getBoolean(5), loaiGV);
                listGV.add(gv);
            }
            return listGV;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(GiangVien gv) {
        String query = "INSERT INTO [dbo].[GGGiangVien]\n"
                + "           ([ten]\n"
                + "           ,[tuoi]\n"
                + "           ,[bac]\n"
                + "           ,[gioiTinh]\n"
                + "           ,[loaiGV])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?)";
        int check = 0;
        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, gv.getTen());
            ps.setObject(2, gv.getTuoi());
            ps.setObject(3, gv.getBac());
            ps.setObject(4, gv.isGioiTinh());
            ps.setObject(5, gv.getLoaiGV().getId());

            check = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String maNV) {
        String query = "DELETE FROM [dbo].[GGGiangVien]\n"
                + "      WHERE GGGiangVien.maNV=?";
        int check = 0;
        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, maNV);

            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(GiangVien gv, String maNV) {
        String query = "UPDATE [dbo].[GGGiangVien] "
                + "   SET [ten] = ?"
                + "      ,[tuoi] = ?"
                + "      ,[bac] = ?"
                + "      ,[gioiTinh] = ?"
                + "      ,[loaiGV] = ?"
                + " WHERE GGGiangVien.maNV=?";
        int check = 0;
        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, gv.getTen());
            ps.setObject(2, gv.getTuoi());
            ps.setObject(3, gv.getBac());
            ps.setObject(4, gv.isGioiTinh());
            ps.setObject(5, gv.getLoaiGV().getId());
            ps.setObject(6, maNV);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check > 0;
    }
}
