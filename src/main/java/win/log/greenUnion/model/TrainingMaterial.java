package win.log.greenUnion.model;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;

import win.log.greenUnion.Word;

public class TrainingMaterial extends BaseModel<TrainingMaterial>{

	private static String tempContent;
	private String id;
	private String categoryID;
	private String title;
	private String summary;
	private String state;
	private String content;
	private String tags;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
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
	public TrainingMaterial() {
		super();
	}
	@Override
	public TrainingMaterial newInstance() {
		// TODO Auto-generated method stub
		Admin admin = new Admin();
		TrainingMaterial helpDesk = new TrainingMaterial();
		helpDesk.setId(UUID.randomUUID().toString());
		helpDesk.setTitle(Word.getRandomCnStr(20));
		helpDesk.setSummary(Word.getRandomCnStr(100));
		helpDesk.setCategoryID(UUID.randomUUID().toString());
		helpDesk.setCreateTime(new Date());
		helpDesk.setModifyTime(new Date());
		helpDesk.setCreateUser(admin.newInstance());
		helpDesk.setModifyUser(admin.newInstance());
		helpDesk.setTags("建筑设计,管教中心,世贸,体育场馆");
		helpDesk.setState("1");
		return helpDesk;
	}
	
}
