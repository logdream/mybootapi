package win.log.base;

public class GuPlainModel<T> {
	private Integer code;
	private String message;
	private T result;
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
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
	public GuPlainModel(T result) {
		super();
		this.result = result;
		this.code = 200;
		this.message = "成功";
	}
	public GuPlainModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
