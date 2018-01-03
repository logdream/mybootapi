package win.log.greenUnion.model;

import java.util.Date;
import java.util.UUID;

import win.log.greenUnion.Word;

public class HelpDesk extends BaseModel<HelpDesk>{

	private String id;
	private String categoryID;
	private String title;
	private String summary;
	private String state;
	private Admin createUser;
	private Date createTime;
	private Admin modifyUser;
	private Date modifyTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Admin getCreateUser() {
		return createUser;
	}
	public void setCreateUser(Admin createUser) {
		this.createUser = createUser;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Admin getModifyUser() {
		return modifyUser;
	}
	public void setModifyUser(Admin modifyUser) {
		this.modifyUser = modifyUser;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public HelpDesk() {
		super();
	}
	@Override
	public HelpDesk newInstance() {
		// TODO Auto-generated method stub
		Admin admin = new Admin();
		HelpDesk helpDesk = new HelpDesk();
		helpDesk.setId(UUID.randomUUID().toString());
		helpDesk.setTitle(Word.getRandomCnStr(20));
		helpDesk.setSummary(Word.getRandomCnStr(100));
		helpDesk.setCategoryID(UUID.randomUUID().toString());
		helpDesk.setCreateTime(new Date());
		helpDesk.setModifyTime(new Date());
		helpDesk.setCreateUser(admin.newInstance());
		helpDesk.setModifyUser(admin.newInstance());
		helpDesk.setState("1");
		return helpDesk;
	}
	
}
