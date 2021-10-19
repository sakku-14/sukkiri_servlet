package model;

import java.io.Serializable;

public class Mutter implements Serializable {
	private String name;
	private String murmur;
	
	public Mutter() {
	}
	public Mutter(String n, String m) {
		this.name = n;
		this.murmur = m;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMurmur() {
		return murmur;
	}
	public void setMurmur(String murmur) {
		this.murmur = murmur;
	}
	
}