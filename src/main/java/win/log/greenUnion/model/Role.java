package win.log.greenUnion.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import win.log.greenUnion.Word;

public class Role extends BaseModel<Role>{

	private String id;
	private String name;
	private String code;
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public Role newInstance() {
		// TODO Auto-generated method stub
		Role role = new Role();
		role.id = UUID.randomUUID().toString();
		this.code = "admin";
		this.name = "管理员";
		return null;
	}
	@Override
	public List<Role> greatePage(){
		int size = new Random().nextInt(50);
		
		List<Role> list = new ArrayList<>(size);
		for(int i=0;i<size;i++){
			Role role = new Role();
			role.setName(Word.getRandomCnStr(6));
			role.setCode(Word.getRandomStr(6));
			list.add(role);
		}
		return list;
	}
}
