package zkc;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import org.apache.commons.beanutils.BeanUtils;
public class Beanutiils {

	public static void main(String[] args)  {
		Person p=new Person();
		try {
			BeanUtils.setProperty(p, "name", "赵康成");
			String name=BeanUtils.getProperty(p, "name");
	        System.out.print(name);
		} catch (IllegalAccessException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	

	}

}
