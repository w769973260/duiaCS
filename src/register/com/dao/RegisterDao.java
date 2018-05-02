package register.com.dao;


import java.util.List;

import org.springframework.stereotype.Repository;




import base.BaseDao;
import register.com.model.RegisterModel;

@Repository
public class RegisterDao extends BaseDao<RegisterModel, Integer>{

	
	@Override
	protected String getMybatisMapperNamesapce() {
		return "register.com.dao.RegisterDao";
	}
	//查询方法
	  public List<RegisterModel> findAll(String model ){
			return getSqlSession().selectList(getSelectModel("selectAll"),model);	
	    }
	  //添加insert
	public String getInsertStatement(String name) {
		return getMybatisMapperNamesapce() + ".insert";
	}
	//查询select
	public String getSelectModel(String model){
		return getMybatisMapperNamesapce()+".selectAll";
	}
	//添加方法
	public int insert(RegisterModel model){

		return getSqlSession().insert(getInsertStatement("insert"),model);
	}
  
  
}
