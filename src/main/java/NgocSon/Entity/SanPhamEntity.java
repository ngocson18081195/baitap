package NgocSon.Entity;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Dell on 22/04/2017.
 */
@Entity
@Table(name = "SanPham")
public class SanPhamEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Masp",nullable = false)
    private int masp;
    @Column(name = "Tensp",nullable = false)
    private String tensp;
    @Lob
    @Column(name = "Image",length = Integer.MAX_VALUE,nullable = true)
    private byte[] image;
    @Column(name = "ThongTin")
    private String thongtin;
    @Column(name = "SPkm")
    private boolean spkm;
    @Column(name = "SPhot")
    private boolean sphot;
    @Column(name = "Active")
    private boolean active;
    @Column(name = "Giabd")
    private float giabd;
    @Column(name = "Giaht")
    private float giaht;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date date;
    @Column(name = "NhaCC")
    private String ncc;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SanPhamEntity)) return false;

        SanPhamEntity that = (SanPhamEntity) o;

        return masp == that.masp;
    }

    @Override
    public int hashCode() {
        return masp;
    }

    public int getMasp() {
        return masp;
    }

    public void setMasp(int masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getThongtin() {
        return thongtin;
    }

    public void setThongtin(String thongtin) {
        this.thongtin = thongtin;
    }

    public boolean isSpkm() {
        return spkm;
    }

    public void setSpkm(boolean spkm) {
        this.spkm = spkm;
    }

    public boolean isSphot() {
        return sphot;
    }

    public void setSphot(boolean sphot) {
        this.sphot = sphot;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public float getGiabd() {
        return giabd;
    }

    public void setGiabd(float giabd) {
        this.giabd = giabd;
    }

    public float getGiaht() {
        return giaht;
    }

    public void setGiaht(float giaht) {
        this.giaht = giaht;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNcc() {
        return ncc;
    }

    public void setNcc(String ncc) {
        this.ncc = ncc;
    }

    public SanPhamEntity() {
    }

    public SanPhamEntity(String tensp, byte[] image, String thongtin, boolean spkm, boolean sphot, boolean active, float giabd, float giaht, Date date, String ncc) {
        this.tensp = tensp;
        this.image = image;
        this.thongtin = thongtin;
        this.spkm = spkm;
        this.sphot = sphot;
        this.active = active;
        this.giabd = giabd;
        this.giaht = giaht;
        this.date = date;
        this.ncc = ncc;
    }

}
