package base;


/**
 * @author GuoHaiFeng
 */

@SuppressWarnings("serial")
public abstract class BaseEntity implements java.io.Serializable {

	@Override
	public String toString() {
		String json = null;
		try {
			json = JsonHelper.serialize(this);
		} catch (Exception ex) {
			return super.toString();
		}
		return json;
	}
	
}