package pt.fabm.jsf.cool;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean
public class TestBean {
	private boolean showPanel = false;

	public String getTestStr(){
		return "this is my sample 2";
	}

	public boolean isShowPanel() {
		return showPanel;
	}
}
