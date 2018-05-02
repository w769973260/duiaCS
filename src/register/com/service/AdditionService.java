package register.com.service;


import java.io.IOException;
import java.util.Map;


import org.jsoup.Connection;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import base.Json;

@Service
public class AdditionService{

	public Json GetUrl(String url,String mobile) {
		Json json = new Json();
		try {
			
			//���ÿ����̨��Ŀ�ĵ�¼Ȩ�޵�cookies
			Response conn = Jsoup.connect( "http://sso.back.test.duia.com/cl" ).
					data( "email", "zaoshujuzhuanyong@duia.com" ).
					data( "password", "duia123456" ).
					data( "isrem", "false" ).
					data( "returnUrl", "http//sale.back.test.duia.com" ).
					data( "timestrap", "1524465085000" ).
					//data("From Data",(String) dto).
					method( Connection.Method.POST ).execute();
			//	            System.out.println( conn.body().toString() );

			//���һ������ȡ����cookies
			Map<String, String> cookies = conn.cookies();

			String sd = conn.cookie( "s_t" );
			String sid = conn.cookie( "SID" );
		
			//����̨�ӿڴ��ݵ�json
			Document conn1 = (Document) Jsoup.connect( url )	.data( "skuId","369")
				    .data( "skuName","���ר��")
				    .data( "classType","1433")
				    .data("classId","4920" )
				    .data("classNo","yj369180426-1"  )
				    .data( "userAccount",mobile )
				    .data( "subject2","" )
				    .data( "reMark","�������ݴ���" )
				    .data( "email","" )
				    .data("phone",mobile  ).cookie( "s_t", sd ).cookie( "SID", sid ).timeout( 30000 ).post();
			//System.out.println( conn1 );
			//System.out.println( cookies );
			//System.out.println("�ܲ����ߵ���");
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		return json;
	}
}