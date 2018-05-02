package register.com.controller;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import register.com.model.AddModel;
import register.com.model.RegisterModel;
import register.com.service.AdditionService;
import base.BaseController;
import base.HttpXy;
import base.Json;
import base.JsonHelper;

@Controller
@RequestMapping("/Addition")
public class AdditionController extends BaseController{

	@RequestMapping("Addition")
	public String Employees() {
		return "jsp/Addition";
	}

	@ResponseBody                            //新建数据
	@RequestMapping("/save")
	public Json save(String mobile) 
	{

		Json json = new Json();
		try {

			String url="http://sale.back.test.duia.com/classStudent/addStudent/repair";

			AdditionService as=new AdditionService();
			if(mobile!=null&&mobile!=""){
				if(mobile.length()==11){
				json.setMessage("操作成功");
				as.GetUrl(url,mobile);
				}else {
					json.setMessage("数据长度不对");
				}
			}else {

				json.setMessage("数据不能为空");
			}
			//System.out.println(mobile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			json.setMessage("操作失败  请联系管理员");

			e.printStackTrace();
		}
		return json;
	}

}

