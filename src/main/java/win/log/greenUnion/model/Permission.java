package win.log.greenUnion.model;

import java.util.Random;

public class Permission extends BaseModel<Permission>{

	String[] names = {"增","删","改","查","审核","实名认证"};
	private String name;
	String[] codes  = {"add","del","update","view","ad","auth"};
	private String code;
	private boolean isChecked;
	
	public boolean isChecked() {
		return isChecked;
	}
	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
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
	public Permission newInstance() {
		// TODO Auto-generated method stub
		int i = new Random().nextInt(codes.length);
		Permission p = new Permission();
		p.name = names[i];
		p.code = codes[i];
		p.isChecked = new Random().nextBoolean();
		return p;
	}
	
}
