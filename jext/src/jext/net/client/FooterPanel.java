package jext.net.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.dom.client.Style.Unit;

public class FooterPanel extends Composite {

	public FooterPanel() {
		
		DockLayoutPanel dockLayoutPanel = new DockLayoutPanel(Unit.PX);
		initWidget(dockLayoutPanel);
		dockLayoutPanel.setSize("100%", "31px");
		
		Image image = new Image("skins/default/images/bg_sitefooter_left.png");
		dockLayoutPanel.addWest(image, 5.0);
		
		Image image_1 = new Image("skins/default/images/bg_sitefooter_right.png");
		dockLayoutPanel.addEast(image_1, 5.0);
		
		SimplePanel simplePanel = new SimplePanel();
		simplePanel.setStyleName("footer");
		dockLayoutPanel.add(simplePanel);
		simplePanel.setSize("100%", "31px");
	}

}
