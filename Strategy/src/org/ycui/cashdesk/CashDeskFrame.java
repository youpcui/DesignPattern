package org.ycui.cashdesk;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class CashDeskFrame extends Frame{
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
		labelCashTotal.setSize(100,23);
		labelCashTotal.setLocation(120, 370);
		
	}
	public void addComponent(){
		panel.add(labelPrice);
		panel.add(textFieldPrice);
		buttonOK.addActionListener(new ButtonOKListener());
		panel.add(buttonOK);
		panel.add(labelQuantity);
		panel.add(textFieldQuantity);
		buttonClear.addActionListener(new ButtonClearListener());
		panel.add(buttonClear);
		panel.add(textAreaList);
		panel.add(labelTextTotal);
		panel.add(labelCashTotal);
		add(panel);
		setSize(500, 500);
		setVisible(true);
	}
	
/*	
	public void clickButtonOK(){ // inner class
		buttonOK.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){labelCashTotal.setText("OK");}
		});
	}
*/
	class ButtonOKListener implements ActionListener{ // action on click button "OK"
		double underTotal;
		double total;
		public void actionPerformed(ActionEvent evt){
			if("_STRING".equals(verifyInput(textFieldPrice.getText()))){ // verify the price
				JOptionPane.showMessageDialog(null, "Wrong input, please input a corret price!");
				textFieldPrice.setText("");
			}
			else if(!"_INT".equals(verifyInput(textFieldQuantity.getText()))){ // verify the quantity
				JOptionPane.showMessageDialog(null, "Wrong input, the quantity must be a integer!");
				textFieldQuantity.setText("");
			}else{
				underTotal =  (Double.parseDouble(textFieldPrice.getText()) * Integer.parseInt(textFieldQuantity.getText()));
				textAreaList.append("Price uni:" + textFieldPrice.getText() + ", Quantity:" + textFieldQuantity.getText() 
						+ ", under total: " + (Double.parseDouble(textFieldPrice.getText()) * Integer.parseInt(textFieldQuantity.getText())) + "\n");
				total += underTotal;
				labelCashTotal.setText(new java.text.DecimalFormat("#0.00").format(total)); // DecimalFormat 2
			}
		}
		
		private String verifyInput(String str){
			if (!str.matches("^[0-9]+([.]{0,1}[0-9]+){0,1}$")){
		        return "_STRING";   
		    }else if (str.matches("^[0-9]+$")){
		        return "_INT";
		    }else {
		        return "_DOUBLE";
		    }
		} 
	}
	
	class ButtonClearListener implements ActionListener{ // action on click button "clear"
		public void actionPerformed(ActionEvent evt){
			textFieldPrice.setText("");
			textFieldQuantity.setText("");
			textAreaList.setText("");
			labelCashTotal.setText("");
		}
	}
}


