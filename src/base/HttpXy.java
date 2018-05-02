package base;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.log4j.spi.ErrorCode;

import java.util.UUID;

import net.sf.json.JSONObject;
import net.sf.log4jdbc.DataSourceSpyInterceptor;

import java.nio.charset.Charset;
public class HttpXy{
	

	public static boolean httpPostWithJson(JSONObject jsonObj,String url){
		boolean isSuccess = false;

		HttpPost post = null;
		try {
			HttpClient httpClient = new DefaultHttpClient();

			// 设置超时时间
			httpClient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 2000);
			httpClient.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, 2000);
			
			

			post = new HttpPost(url);
			// 构造消息头
			post.setHeader("Content-type", "application/json; charset=utf-8");
			post.setHeader("Connection", "Close");
			String sessionId = getSessionId();
			post.setHeader("SessionId", sessionId);

			// 构建消息实体
			StringEntity entity = new StringEntity(jsonObj.toString());
			entity.setContentEncoding("UTF-8");
			// 发送Json格式的数据请求
			entity.setContentType("application/json");
			post.setEntity(entity);

			HttpResponse response = httpClient.execute(post);

			// 检验返回码
			int statusCode = response.getStatusLine().getStatusCode();
			if(statusCode != HttpStatus.SC_OK){
				System.out.println("请求出错: "+statusCode);
				isSuccess = false;
			}else{
				int retCode = 0;
				String sessendId = "";
				// 返回码中包含retCode及会话Id
				for(Header header : response.getAllHeaders()){
					if(header.getName().equals("retcode")){
						retCode = Integer.parseInt(header.getValue());
					}
					if(header.getName().equals("SessionId")){
						sessendId = header.getValue();
					}
				}

				/*if(ErrorCode.IAS_SUCCESS != retCode ){
					// 日志打印
					System.out.println("error return code,  sessionId: "+sessionId+"\t"+"retCode: "+retCode);
					isSuccess = false;
				}else{
					isSuccess = true;
				}*/
			}
		} catch (Exception e) {
			e.printStackTrace();
			isSuccess = false;
		}finally{
			if(post != null){
				try {
					
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		return isSuccess;
	}

	// 构建唯一会话Id
	public static String getSessionId(){
		UUID uuid = UUID.randomUUID();
		String str = uuid.toString();
		return str.substring(0, 8) + str.substring(9, 13) + str.substring(14, 18) + str.substring(19, 23) + str.substring(24);
	}
}