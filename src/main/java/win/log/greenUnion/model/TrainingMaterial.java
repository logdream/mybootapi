package win.log.greenUnion.model;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

import win.log.greenUnion.Word;

public class TrainingMaterial extends BaseModel<TrainingMaterial>{

	private static String tempContent;
	private String id;
	private String categoryId;
	private String title;
	private String summary;
	private String state;
	private String content;
	private String tags;
	private Integer sort;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTags() {
		return tags;
	}
	public Integer getSort() {
		return new Random().nextInt(1000);
	}
	public void setSort(Integer sort) {
		this.sort = sort;
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
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryID) {
		this.categoryId = categoryID;
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
		helpDesk.setCategoryId(UUID.randomUUID().toString());
		helpDesk.setCreateTime(new Date());
		helpDesk.setModifyTime(new Date());
		helpDesk.setCreateUser(admin.newInstance());
		helpDesk.setModifyUser(admin.newInstance());
		helpDesk.setTags("建筑设计,管教中心,世贸,体育场馆");
		helpDesk.setState("1");
		return helpDesk;
	}
	
}
