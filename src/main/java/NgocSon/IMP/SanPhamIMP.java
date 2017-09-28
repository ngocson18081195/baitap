package NgocSon.IMP;

import NgocSon.Dao.SanPhamDAO;
import NgocSon.Entity.SanPhamEntity;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Dell on 22/04/2017.
 */
@Transactional
public class SanPhamIMP extends HibernateDaoSupport implements SanPhamDAO {


    public SanPhamEntity tim(String masp) {
        return (SanPhamEntity) getHibernateTemplate().find(masp);
    }

    public void save(SanPhamEntity sanPhamEntity) {
        getHibernateTemplate().saveOrUpdate(sanPhamEntity);
    }
}
