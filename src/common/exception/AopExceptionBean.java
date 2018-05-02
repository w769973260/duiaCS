package common.exception;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * aop组件,记录异常信息
 * 
 * @author GuoHaiFeng
 */
@Component
// 将当前Bean扫描到容�?
@Aspect
// 将当前Bean指定为aop组件
public class AopExceptionBean {
    private Logger logger = Logger.getLogger(AopExceptionBean.class);
    
    // 定义切入点表达式
    @Pointcut("within(com.zthl.controller..*)")
    public void mypoint() {
    }
    
    /**
     * ex对象是目标对象抛出的异常 参数名与throwing属�?�一�?
     * 
     * @param ex
     */
    // 采用异常通知
    @AfterThrowing(pointcut = "mypoint()", throwing = "ex")
    public void loggerException(Exception ex) {
        // 以文件形式记录异常信�?
        logger.error("AOP记录异常信息", ex);
    }
}
