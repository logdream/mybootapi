package win.log.greenUnion.model;

import java.util.Date;
import java.util.UUID;

import win.log.greenUnion.Word;

public class Token {

	private String id;
	private String account;
	private String token;
	private Date expeirDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Date getExpeirDate() {
		return expeirDate;
	}
	public void setExpeirDate(Date expeirDate) {
		this.expeirDate = expeirDate;
	}
	public Token(String account) {
		super();
		// TODO Auto-generated constructor stub
		this.id = UUID.randomUUID().toString();
		this.account = account;
		this.token = UUID.randomUUID().toString();
		this.expeirDate = new Date(new Date().getTime()+10000000L);
	}
	
	
}
