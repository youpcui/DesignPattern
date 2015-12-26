package org.ycui.cashdesk;

import java.awt.*;

public class CashDeskFrame extends Frame {
	Panel panel = new Panel();
	Button buttonOK = new Button("  OK  ");
	Button buttonClear = new Button("Clear");
	Label labelPrice = new Label("Price:");
	Label labelQuantity = new Label("Quantity:");
	TextField textFieldPrice = new TextField(25);
	TextField textFieldQuantity = new TextField(25);
	TextArea textAreaList = new TextArea();
	Label labelTextTotal = new Label("Total:");
	Label labelCashTotal = new Label();
	

	public CashDeskFrame(String title) {
		super(title);		
		
	}
	public void formatComponent(){
		panel.setLayout(null);
		
		labelPrice.setLocation(50, 30);
		textFieldPrice.setLocation(120, 30);
		buttonOK.setSize(60, 22);
		buttonOK.setLocation(350, 30);
		
		labelQuantity.setLocation(50, 70);
		textFieldQuantity.setLocation(120, 70);
		buttonClear.setSize(60, 22);
		buttonClear.setLocation(350, 70);
		
		textAreaList.setSize(360, 220);
		textAreaList.setLocation(50, 110);
		
		
		labelTextTotal.setLocation(50, 370);
		labelCashTotal.setLocation(120, 370);
		
	}
	public void addComponent(){
		panel.add(labelPrice);
		panel.add(textFieldPrice);
		panel.add(buttonOK);
		panel.add(labelQuantity);
		panel.add(textFieldQuantity);
		panel.add(buttonClear);
		panel.add(textAreaList);
		panel.add(labelTextTotal);
		panel.add(labelCashTotal);
		add(panel);
		setSize(500, 500);
		setVisible(true);
	}

}
