package NgocSon.Controller;

import NgocSon.Dao.SanPhamDAO;
import NgocSon.Entity.SanPhamEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Dell on 18/04/2017.
 */
@Controller
public class controller {
    @Autowired
    private SanPhamDAO sanPhamDAO;
    @RequestMapping( value = "/hello")
    public String string(){
        return "hello";
    }
    @RequestMapping(value = "/SanPham")
    public String SP(Model model, @RequestParam(value = "masp",defaultValue = "")String masp){
        SanPhamEntity sanPhamEntity=null;
        if (masp!=null && masp.length() > 0){
            sanPhamEntity=sanPhamDAO.tim(masp);
        }
            sanPhamEntity=new SanPhamEntity();
        model.addAttribute("sp",sanPhamEntity);
        return "SanPham";
    }
}
