package zkc;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import org.apache.commons.beanutils.BeanUtils;
public class Beanutiils {

	public static void main(String[] args)  {
		Person p=new Person();
		try {
			BeanUtils.setProperty(p, "name", "�Կ���");
			String name=BeanUtils.getProperty(p, "name");
	        System.out.print(name);
		} catch (IllegalAccessException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	

	}

}
