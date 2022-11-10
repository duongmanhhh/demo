/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

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
public class LoaiGVRepository {
    public List<LoaiGV> getAll() {
        String query = "select * from Loaii";
        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            List<LoaiGV> listL = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LoaiGV l = new LoaiGV(rs.getInt(1), rs.getString(2));
                listL.add(l);
            }
            return listL;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public LoaiGV getOne(int id) {
        String query = "select * from Loaii where id=?";
        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                LoaiGV l = new LoaiGV(rs.getInt(1), rs.getString(2));
                return l;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
