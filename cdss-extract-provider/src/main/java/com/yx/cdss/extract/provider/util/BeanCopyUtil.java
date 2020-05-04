
package com.yx.cdss.extract.provider.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtils;


public class BeanCopyUtil {

	

	
	/**
	 *     复制 列表对象
	 * @param <T>
	 * @param source
	 * @param destCls
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T> List copyListBean(T source, Class destCls) {
		List<T> sourceList = (List<T>) source;
		List<T> objectiveList = new ArrayList<T>() ;
		try {
			T value = null;
			if (sourceList != null && sourceList.size() > 0) {
				for (T t : sourceList) {
					value = (T) Class.forName(destCls.getName()).newInstance();
					PropertyUtils.copyProperties(value, t);
					objectiveList.add((T) value);
				}
			}
		} catch (Exception e) {
		  e.printStackTrace();
		}
		return objectiveList;
	}
	
	
	
	public static void copyBean(Object source, Object dest){
		try {
			PropertyUtils.copyProperties(dest, source);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
}
