package base;

import java.util.List;

import net.sf.json.JSONArray;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.util.ReflectionUtils;

public class JsonHelper {

	public static String serialize(Object value) {
		String json = null;
		
		try {
			ObjectMapper mapper = new ObjectMapper();
			json = mapper.writeValueAsString(value);
		} catch (Exception e) {
			ReflectionUtils.handleReflectionException(e);
		}
		
		return json;
	}
	
	public static <T> JSONArray toJSONString(List<T> list)
	{
	JSONArray jsonArray = JSONArray.fromObject(list);

	return jsonArray;
	}
	
	
}
