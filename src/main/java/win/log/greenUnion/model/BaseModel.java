package win.log.greenUnion.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import win.log.base.GuResult;

public abstract class BaseModel<T> {

	public abstract T newInstance();
	
	public 	Page<T> preparePage(){
		Sort sort = new Sort(Direction.DESC, "id");
	    Pageable pageable = new PageRequest(0, 15, sort);
	    List<T> ts = greatePage();
		Page<T> t = new PageImpl<T>(greatePage(),pageable,Long.parseLong(ts.size()+""));
		return t;
	}
	public 	Page<T> preparePage(int page,int size){
	    Pageable pageable = new PageRequest(page, size, null);
	    List<T> ts = greatePage(size);
		Page<T> t = new PageImpl<T>(ts,pageable,200);
		return t;
	}
	
	public GuResult<T> prepareGuPage(int page,int size){
		 List<T> ts = greatePage(size);
		 GuResult<T> tGuResult = new GuResult<T>(page, size, ts, 200);
		 return tGuResult;
		
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
