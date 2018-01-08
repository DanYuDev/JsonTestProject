package json;

import java.util.jar.Attributes.Name;

public class Riot {
	private int id;
	private String version;
	private String name;
	
	public Riot() {
		id=-1;
		version="";
		name="";
	}
	
	public Riot(int id,String version,String name) {
		this.id=id;
		this.version=version;
		this.name=name;	
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setVersion(String version) {
		this.version=version;
	}
	public String getVersion() {
		return this.version;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return "id:"+id+" version:"+version+" name:"+name;
	}
}
