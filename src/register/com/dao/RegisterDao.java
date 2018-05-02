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
	//��ѯ����
	  public List<RegisterModel> findAll(String model ){
			return getSqlSession().selectList(getSelectModel("selectAll"),model);	
	    }
	  //���insert
	public String getInsertStatement(String name) {
		return getMybatisMapperNamesapce() + ".insert";
	}
	//��ѯselect
	public String getSelectModel(String model){
		return getMybatisMapperNamesapce()+".selectAll";
	}
	//��ӷ���
	public int insert(RegisterModel model){

		return getSqlSession().insert(getInsertStatement("insert"),model);
	}
  
  
}
