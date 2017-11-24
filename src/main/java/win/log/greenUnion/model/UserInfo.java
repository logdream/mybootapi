package win.log.greenUnion.model;

import java.util.UUID;

import win.log.greenUnion.Word;

public class UserInfo extends BaseModel<UserInfo>{

	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public UserInfo newInstance() {
		// TODO Auto-generated method stub
		UserInfo user = new UserInfo();
		user.setId(UUID.randomUUID().toString());
		user.setName(Word.getRandomCnStr(10));
		return user;
	}
	
}
