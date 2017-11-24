package win.log.greenUnion.model;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

public abstract class BaseModel<T> {

	public abstract T newInstance();
	
	public 	Page<T> preparePage(){
		Page<T> t = new PageImpl<>(greatePage());
		return t;
	}
	
	
	public List<T> greatePage(){
		int size = new Random().nextInt(50);
		
		List<T> list = new ArrayList<>(size);
		for(int i=0;i<size;i++){
			list.add(newInstance());
		}
		return list;
	}
	
	public List<T> greatePage(int size){
		
		List<T> list = new ArrayList<>(size);
		for(int i=0;i<size;i++){
			list.add(newInstance());
		}
		return list;
	}
	
	

	
}
