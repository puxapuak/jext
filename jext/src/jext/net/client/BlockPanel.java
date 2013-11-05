package jext.net.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.LayoutPanel;

public class BlockPanel extends Composite {

	public BlockPanel() {
		
		VerticalPanel verticalPanel = new VerticalPanel();
		initWidget(verticalPanel);
		
		SimplePanel blockHeader = new SimplePanel();
		blockHeader.setStyleName("blockheader");
		verticalPanel.add(blockHeader);
		blockHeader.setHeight("31px");
		
		LayoutPanel layoutPanel = new LayoutPanel();
		verticalPanel.add(layoutPanel);
	}

}
