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
import model.Sach;
import model.TheLoai;

/**
 *
 * @author Administrator
 */
public class SachRepository {

    public List<Sach> getAll() {
        String query = "SELECT        dbo.sack.ma_sach, dbo.sack.ten_sach, dbo.sack.nha_xuat_ban, dbo.sack.so_luong, dbo.sack.gia_tien, dbo.the_loai.ten_the_loai\n"
                + "FROM            dbo.sack INNER JOIN\n"
                + "                         dbo.the_loai ON dbo.sack.ma_the_loai = dbo.the_loai.ma_the_loai";
        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            List<Sach> listS = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TheLoai t1 = new TheLoai(rs.getString(6));
                Sach sach = new Sach(rs.getString(1), rs.getString(2), t1, rs.getInt(4), rs.getInt(5), rs.getString(3));
                listS.add(sach);
            }
            return listS;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Sach getOne(String maSach) {
        String query = "SELECT        dbo.sack.ma_sach, dbo.sack.ten_sach, dbo.sack.nha_xuat_ban, dbo.sack.so_luong, dbo.sack.gia_tien, dbo.the_loai.ten_the_loai\n"
                + "FROM            dbo.sack INNER JOIN\n"
                + "                         dbo.the_loai ON dbo.sack.ma_the_loai = dbo.the_loai.ma_the_loai";
        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                TheLoai t1 = new TheLoai(rs.getString(6));
                Sach sach = new Sach(rs.getString(1), rs.getString(2), t1, rs.getInt(4), rs.getInt(5), rs.getString(3));
                return sach;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(Sach sach) {

        String query = "INSERT INTO [dbo].[sack]"
                + "           ([ma_sach]"
                + "           ,[ten_sach]"
                + "           ,[ma_the_loai]"
                + "           ,[so_luong]"
                + "           ,[gia_tien]"
                + "           ,[nha_xuat_ban])"
                + "     VALUES"
                + "         (?,?,?,?,?,?)  ";
        int check = 0;
        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, sach.getMa_sach());
            ps.setObject(2, sach.getTen_sach());
            ps.setObject(3, sach.getTheLoai().getMa_the_loai());
            ps.setObject(4, sach.getSo_luong());
            ps.setObject(5, sach.getGia_tien());
            ps.setObject(6, sach.getNha_xuat_ban());

            check = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public static void main(String[] args) {
        List<Sach> list = new SachRepository().getAll();
        for (Sach sach : list) {
            System.out.println(sach.toString());
        }
    }
}
