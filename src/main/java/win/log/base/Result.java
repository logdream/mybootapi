package win.log.base;

public class Result<T> {

	private boolean isok;
	private String desc;
	private T t;
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public boolean isIsok() {
		return isok;
	}
	public void setIsok(boolean isok) {
		this.isok = isok;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Result(boolean isok, String desc) {
		super();
		this.isok = isok;
		this.desc = desc;
	}
	public Result(boolean isok){
		this.isok = isok;
		if(this.isok)
			this.desc = "成功";
		else
			this.desc = "失败";
	}
	
	
}
