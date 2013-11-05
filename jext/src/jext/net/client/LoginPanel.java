package jext.net.client;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.SimplePanel;

public class LoginPanel extends Composite {

	public LoginPanel() {
		
		DockLayoutPanel dockLayoutPanel = new DockLayoutPanel(Unit.PX);
		initWidget(dockLayoutPanel);
		dockLayoutPanel.setSize("140px", "51px");
		
		Image image = new Image("skins/default/images/bg_siteheader_left.png");
		dockLayoutPanel.addWest(image, 5.0);
		
		Image image_1 = new Image("skins/default/images/bg_siteheader_right.png");
		dockLayoutPanel.addEast(image_1, 5.0);
		
		SimplePanel simplePanel = new SimplePanel();
		simplePanel.setStyleName("header");
		dockLayoutPanel.add(simplePanel);
		simplePanel.setSize("130", "51px");
		
	}

}
