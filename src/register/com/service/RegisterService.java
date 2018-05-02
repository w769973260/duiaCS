package register.com.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import base.BaseService;
import register.com.dao.RegisterDao;
import register.com.model.RegisterModel;



@Service
public class RegisterService extends BaseService{
	@Autowired
	private RegisterDao  registerDao;

	String mobil = "1330000";
	String ts="";
	@Transactional(readOnly = false)
	public int save(RegisterModel registerModel,String no1) {

		if(no1.length()==4){
			String s1=mobil+no1;
			List<RegisterModel> jg=registerDao.findAll(s1);

			if(jg.size()!=0){
				ts="��������";
				System.out.println(ts);
			}else{
				System.out.println("�����������");
				registerModel.setUsername("��������");
				registerModel.setMobile(s1);
				registerModel.setPassword("e10adc3949ba59abbe56e057f20f883e");
				registerModel.setUsertype(1);
				registerModel.setState(1);
				//ʱ�����ʽ
				Date date=new Date();
				Timestamp timeStamp = new Timestamp(date.getTime());
				registerModel.setRegist_time(timeStamp);
				ts="��ӳɹ�";
			}

		}else {
			ts="���ݳ�������";	
		}
		return registerDao.save(registerModel);			
	}
	public String getTs() {
		return ts;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}

}
