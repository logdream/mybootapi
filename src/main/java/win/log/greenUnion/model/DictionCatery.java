package win.log.greenUnion.model;

public class DictionCatery extends BaseModel<DictionCatery>{
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
	@Override
	public DictionCatery newInstance() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
