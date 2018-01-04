package win.log.base;

import java.util.List;

public class GuResult<T> {

	private Integer code;
	private String message;
	private GUlist<T> result;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public GUlist<T> getResult() {
		return result;
	}
	public void setResult(GUlist<T> result) {
		this.result = result;
	}
	public GuResult() {
		super();
		this.code = 200;
		this.message = "成功";
		GUlist<T> tGUlist = new GUlist<>();
		this.result = tGUlist;
		
	}
	
	public GuResult(int page,int size,List<T> items,int total){
		GUlist<T> gUlist = new GUlist<>(page, size, total, items);
		this.result = gUlist;
		this.code = 200;
		this.message = "成功";
		
	}
	
}
