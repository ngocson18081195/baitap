package NgocSon.Dao;

import NgocSon.Entity.SanPhamEntity;

/**
 * Created by Dell on 22/04/2017.
 */
public interface SanPhamDAO  {
    public SanPhamEntity tim(String masp);
    public void save(SanPhamEntity sanPhamEntity);
}
