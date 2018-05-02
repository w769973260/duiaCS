package register.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import register.com.model.RegisterModel;
import register.com.service.RegisterService;


import base.BaseController;
import base.Json;
@Controller
@RequestMapping("/Register")
public class RegisterController extends BaseController{


	@Autowired(required = false)
	private RegisterService registerService ;



	public RegisterService getRegisterService() {
		return registerService;
	}
	public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
	}
	
	
	@RequestMapping("Register")
	public String Employees() {
		return "jsp/Register";
	}
	@ResponseBody                            //新建数据
	@RequestMapping("/save")
	public Json save(RegisterModel registerModel, String mobile) 
	{
		Json json = new Json();
		

		try {
			registerService.save(registerModel,mobile);
			
			//System.out.println(mobile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		
			e.printStackTrace();
		}
		//json.setSuccess(true);
	
		json.setMessage(registerService.getTs());

		return json;
	}

}
