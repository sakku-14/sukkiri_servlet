package model;

public class SiteEVLogic {
	public SiteEV sev;
	
	public SiteEVLogic(SiteEV s) {
		this.sev = s;
	}
	
	public void incEV(int like) {
		if (like == 1) {
			this.sev.setLike(this.sev.getLike() + 1);
		} else {
			this.sev.setDisLike(this.sev.getDisLike() + 1);
		}
	}
}