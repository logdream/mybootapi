package win.log.base;

public class RequestList {

	private Integer pageSize;
	private Integer current;
	private String searchs;
	private String sorts;
	
	public String getSearchs() {
		return searchs;
	}
	public void setSearchs(String searchs) {
		this.searchs = searchs;
	}
	public String getSorts() {
		return sorts;
	}
	public void setSorts(String sorts) {
		this.sorts = sorts;
	}
	public RequestList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getCurrent() {
		return current;
	}
	public void setCurrent(Integer current) {
		this.current = current;
	}
	
}
