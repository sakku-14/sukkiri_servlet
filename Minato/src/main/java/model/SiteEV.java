package model;

import java.io.Serializable;

public class SiteEV implements Serializable {
	private int like;
	private int disLike;
	
	public SiteEV() {
	}
	public SiteEV(int l, int d) {
		this.like = l;
		this.disLike  = d;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public int getDisLike() {
		return disLike;
	}
	public void setDisLike(int disLike) {
		this.disLike = disLike;
	}
	
	
}