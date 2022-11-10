/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.TheLoai;

/**
 *
 * @author Administrator
 */
public class TheLoaiRepository {

    public List<TheLoai> getAll() {
        String query = "select * from the_loai";
        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            List<TheLoai> listTL = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TheLoai tl = new TheLoai(rs.getString(1), rs.getString(2));
                listTL.add(tl);
            }
            return listTL;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public TheLoai getOne(String maTL) {
        String query = "select * from the_loai where the_loai.ma_the_loai=?";
        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, maTL);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                TheLoai tl = new TheLoai(rs.getString(1), rs.getString(2));
                return tl;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
