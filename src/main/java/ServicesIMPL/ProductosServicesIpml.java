
package ServicesIMPL;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import Config.MyBatisUtil;
import DAO.ProductosMapper;
import models.Productos;
import Services.ProductosServices;

public class ProductosServicesIpml implements ProductosServices {

	@Override
	public List<Productos> listarProductos() {
		try {
			SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
			ProductosMapper categoriaMapper = session.getMapper(ProductosMapper.class);
			return categoriaMapper.listarProductos();
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	

}
