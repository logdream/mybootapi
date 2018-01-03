package win.log.base;

import java.util.List;

public class GUlist<T> {
	private Integer current;
    private Integer pageSize ;
    private Integer total;
    private List<T> items;
	public Integer getCurrent() {
		return current;
	}
	public void setCurrent(Integer current) {
		this.current = current;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List<T> getItems() {
		return items;
	}
	public void setItems(List<T> items) {
		this.items = items;
	}
	public GUlist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GUlist(Integer current, Integer pageSize, Integer total, List<T> items) {
		super();
		this.current = current;
		this.pageSize = pageSize;
		this.total = total;
		this.items = items;
	}
	
	
    
}
