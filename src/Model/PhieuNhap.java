/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class PhieuNhap {
    public String MaPhieuNhap;
    public String MaNgLieu;
    public double DonGia;
    public String DonViTinh;
    public int SoLuong;
    public String NgayLapPhieu;
    public String NgayNhap;
    public String MaCC;
    public String NguoiNhap;

    public String getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public void setMaPhieuNhap(String MaPhieuNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
    }

    public String getMaNgLieu() {
        return MaNgLieu;
    }

    public void setMaNgLieu(String MaNgLieu) {
        this.MaNgLieu = MaNgLieu;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    public String getDonViTinh() {
        return DonViTinh;
    }

    public void setDonViTinh(String DonViTinh) {
        this.DonViTinh = DonViTinh;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getNgayLapPhieu() {
        return NgayLapPhieu;
    }

    public void setNgayLapPhieu(String NgayLapPhieu) {
        this.NgayLapPhieu = NgayLapPhieu;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public String getMaCC() {
        return MaCC;
    }

    public void setMaCC(String MaCC) {
        this.MaCC = MaCC;
    }

    public String getNguoiNhap() {
        return NguoiNhap;
    }

    public void setNguoiNhap(String NguoiNhap) {
        this.NguoiNhap = NguoiNhap;
    }
    public List<String> getEntity()
    {
        List<String> list = new ArrayList<>();
        list.add("MaPhieuNhap");
        list.add("MaNgLieu");
        list.add("DonGia");
        list.add("DonViTinh");
        list.add("SoLuong");
        list.add("NgayLapPhieu");
        list.add("NgayNhap");
        list.add("MaCC");
        list.add("NguoiNhap");
        return list;
    }
    
}
