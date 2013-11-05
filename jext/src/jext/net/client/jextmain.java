package jext.net.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.HorizontalPanel;

public class jextmain implements EntryPoint {

	public void onModuleLoad() {
		RootLayoutPanel rootLayoutPanel = RootLayoutPanel.get();
		rootLayoutPanel.setSize("100%", "100%");
		
		DockLayoutPanel dockLayoutPanel = new DockLayoutPanel(Unit.PX);
		rootLayoutPanel.add(dockLayoutPanel);
		dockLayoutPanel.setSize("100%", "100%");
		rootLayoutPanel.setWidgetLeftWidth(dockLayoutPanel, 0.0, Unit.PX, 100.0, Unit.PCT);
		rootLayoutPanel.setWidgetTopHeight(dockLayoutPanel, 0.0, Unit.PX, 100.0, Unit.PCT);
		
		DockLayoutPanel dockLayoutPanel_header = new DockLayoutPanel(Unit.PX);
		dockLayoutPanel.addNorth(dockLayoutPanel_header, 51.0);
		
		BreadcrumbPanel breadcrumbPanel = new BreadcrumbPanel();
		LoginPanel loginPanel = new LoginPanel();
		dockLayoutPanel_header.addEast(loginPanel, 140);
		
		Image image = new Image("skins/default/images/micrologo.png");
		image.setStyleName("logo");
		dockLayoutPanel_header.addWest(image, 150.0);
		dockLayoutPanel_header.add(breadcrumbPanel);
		
		FooterPanel footerPanel = new FooterPanel();
		dockLayoutPanel.addSouth(footerPanel, 31.0);
		
	}
}
