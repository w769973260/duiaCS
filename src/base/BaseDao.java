package base;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;



@SuppressWarnings({ "unchecked", "rawtypes" })
public abstract class BaseDao<E, PK extends Serializable> extends SqlSessionDaoSupport {
	
	public  int save(E entity) {
        prepareObjectForSaveOrUpdate(entity);
        int affectCount = getSqlSession().insert(getInsertStatement(), entity);
        return affectCount;
    }

    
    /**
     * 用于子类覆盖,在insert,update之前调用
     * @param entity
     */
    protected void prepareObjectForSaveOrUpdate(E entity) {
    }

    protected abstract String getMybatisMapperNamesapce();


  

    public String getInsertStatement() {
        return getMybatisMapperNamesapce() + ".insert";
    }

    public String getUpdateStatement() {
        return getMybatisMapperNamesapce() + ".update";
    }

    
    public String getCountStatementForPaging(String statementName) {
        return statementName + "_count";
    }

    /** 组装mapper中映射的查询ID */
    public String getStatementName(String statementName) {
        return getMybatisMapperNamesapce() + "." + statementName;
    }
    

}
