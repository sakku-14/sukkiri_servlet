package model;

import java.util.List;

public class PostMutterLogic {
	public void setMutter(Mutter mutter, List<Mutter> mutterList) {
		mutterList.add(0, mutter);
	}
}