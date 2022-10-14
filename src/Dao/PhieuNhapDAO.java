/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Helper.ConnectDatabase;
import Model.PhieuNhap;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class PhieuNhapDAO extends MainDao<PhieuNhap, String>{

    public void insert(PhieuNhap model){
        String sql="INSERT INTO PhieuNhap (MaPhieuNhap, MaNgLieu, DonGia, DonViTinh, SoLuong, NgayLapPhieu, NgayNhap, MaCC, NguoiNhap) "
                + "VALUES (?, ?, ?, ?, ?, ? ,? ,? ,?)";
        ConnectDatabase.update(sql, 
                model.getMaPhieuNhap(),model.getMaNgLieu(),model.getDonGia(),model.getDonViTinh(),model.getSoLuong(),
                model.getNgayLapPhieu(),model.getNgayNhap(),model.getMaCC(),model.getNguoiNhap());
    }
    
    public void update(PhieuNhap model){
        String sql="UPDATE PhieuNhap SET MaNgLieu=?, DonGia=?, DonViTinh=?, SoLuong=?, NgayLapPhieu= ?, NgayNhap= ?, "
                + "MaCC = ? , NguoiNhap = ? WHERE MaPhieuNhap=?";
        ConnectDatabase.update(sql, 
                model.getMaPhieuNhap(),model.getMaNgLieu(),model.getDonGia(),model.getDonViTinh(),model.getSoLuong(),
                model.getNgayLapPhieu(),model.getNgayNhap(),model.getMaCC(),model.getNguoiNhap());
    }
    
    public void delete(String MaNV){
        String sql="DELETE FROM PhieuNhap WHERE MaPhieuNhap=?";
        ConnectDatabase.update(sql, MaNV);
    }
    
    public List<PhieuNhap> selectAll(){
        String sql="SELECT * FROM PhieuNhap ";
        return this.selectBySql(sql);
    }
    
    public PhieuNhap selectById(String manv){
        String sql="SELECT * FROM PhieuNhap WHERE MaPhieuNhap=?";
        List<PhieuNhap> list = this.selectBySql(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }
    public List<PhieuNhap> selectAllbyentity(String entity,String a){
        String sql="SELECT * FROM PhieuNhap ORDER BY "+entity+" "+a;
        List<PhieuNhap> list = this.selectBySql(sql);
        return list;
    }
    protected List<PhieuNhap> selectBySql(String sql, Object...args){
        List<PhieuNhap> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = ConnectDatabase.query(sql, args);
                while(rs.next()){
                    PhieuNhap entity=new PhieuNhap();
                    entity.setMaPhieuNhap(rs.getString("MaPhieuNhap"));
                    entity.setMaNgLieu(rs.getString("MaNgLieu"));
                    entity.setDonGia(rs.getDouble("DonGia"));
                    entity.setDonViTinh(rs.getString("DonViTinh"));
                    entity.setSoLuong(rs.getInt("SoLuong"));
                    entity.setNgayLapPhieu(rs.getString("NgayLapPhieu"));
                    entity.setNgayNhap(rs.getString("NgayNhap"));
                    entity.setMaCC(rs.getString("MaCC"));
                    entity.setNguoiNhap(rs.getString("NguoiNhap"));
                    list.add(entity);
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
    
}
