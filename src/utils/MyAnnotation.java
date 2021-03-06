package utils;

import java.lang.annotation.*;
/**
 * 定义excel描述注解
 * @author LiMing
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	/**
	 * 列索引
	 * @return
	 */
	public int columnIndex() default 0;	
	/**
	 * 列名
	 * @return
	 */
	public String columnName() default "";
	
}
