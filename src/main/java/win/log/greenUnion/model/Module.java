package win.log.greenUnion.model;

import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Module extends BaseModel<Module>{
	private String id;
	String[] names = "帮助中心、项目、用户、培训资料".split("、");
	private String name;
	String[] codes = "help,project,user,train".split(",");
	private String code;

	private List<Permission> permissions;
	
	
	
	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

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

	public Module() {
		super();
	}

	@Override
	public Module newInstance() {
		// TODO Auto-generated method stub
		int i = new Random().nextInt(codes.length);
		Module p = new Module();
		p.name = names[i];
		p.code = codes[i];
		p.id = UUID.randomUUID().toString();
		Permission per = new Permission();
		List<Permission> pers = per.greatePage(4);
		p.permissions = pers;
		return p;
	}
	

}
