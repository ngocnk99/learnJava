package linkedList;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ControllerLinkedList implements Initializable {
	
	@FXML
		private AnchorPane pane;
	@FXML 
		private TextField valueAdd;
	@FXML 
		private TextField indexInsert;
	@FXML 
		private TextField valueInsert;
	@FXML 
		private TextField indexDelete;
	@FXML 
	private Button addItem;
	@FXML 
	private Button insertItem;
	@FXML 
	private Button deleteItem;
	@FXML 
	private Button no1,no2,no3,no4,no5,no6,no7,no8,no9,no10;
	@FXML
	private Button n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
	@FXML
	private Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	@FXML
	private Label a1,a2,a3,a4,a5,a6,ar6,r1,r2,r3,r4,a7,a8,a9,a10;
	@FXML
	private Button[] noButton = new Button[10];
	private Button[] nButton = new Button[10];
	private Label[] l = new Label[10];
	private Label[] a = new Label[10];
	
	public ArrayList<String> list = new ArrayList<String>();
	
	public void setArray() {
		noButton[0] = no1;
		noButton[1] = no2;
		noButton[2] = no3;
		noButton[3] = no4;
		noButton[4] = no5;
		noButton[5] = no6;
		noButton[6] = no7;
		noButton[7] = no8;
		noButton[8] = no9;
		noButton[9] = no10;
		
		nButton[0] = n1;
		nButton[1] = n2;
		nButton[2] = n3;
		nButton[3] = n4;
		nButton[4] = n5;
		nButton[5] = n6;
		nButton[6] = n7;
		nButton[7] = n8;
		nButton[8] = n9;
		nButton[9] = n10;
		
		l[0] = l1;
		l[1] = l2;
		l[2] = l3;
		l[3] = l4;
		l[4] = l5;
		l[5] = l6;
		l[6] = l7;
		l[7] = l8;
		l[8] = l9;
		l[9] = l10;
		
		a[1] = a2;
		a[2] = a3;
		a[3] = a4;
		a[4] = a5;
		a[5] = a6;
		a[6] = a7;
		a[7] = a8;
		a[8] = a9;
		a[9] = a10;
	}
	
	public void indexOn(Integer num,String str) {

		noButton[num-1].setText(str);
		noButton[num-1].setVisible(true);
		nButton[num-1].setVisible(true);
		l[num-1].setVisible(true);
		if((num >= 2)&&(num != 6)) a[num-1].setVisible(true); 
		if(num == 6)
		{
			a[num-1].setVisible(true); 
			ar6.setVisible(true);
			r1.setVisible(true);
			r2.setVisible(true);
			r3.setVisible(true);
			r4.setVisible(true);
		}
	}
	
	public void indexOff(Integer num) {
		noButton[num-1].setVisible(false);
		nButton[num-1].setVisible(false);
		l[num-1].setVisible(false);
		if((num >= 2)&&(num != 6)) a[num-1].setVisible(false);
		if(num == 6)
		{
			a[num-1].setVisible(false);
			ar6.setVisible(false);
			r1.setVisible(false);
			r2.setVisible(false);
			r3.setVisible(false);
			r4.setVisible(false);
		}
		
	}
	
	public void addItem(ActionEvent event) {
		setArray();
		String str = valueAdd.getText();
		if (str.equals("")) {
			JOptionPane.showMessageDialog(null, "Enter the input!!");
			return;
		}
		valueAdd.clear();
		list.add(str);
		printList();
	}
	
	public void insertItem(ActionEvent event) {
		String index = indexInsert.getText();
        if(index.equals(""))
        {
			JOptionPane.showMessageDialog(null, "Enter the input!!");
			return;
		}
		int id = Integer.parseInt(index);
		String value = valueInsert.getText();
		if (value.equals("")) {
			JOptionPane.showMessageDialog(null, "Enter the input!!");
			return;
		}
		
		if(id > list.size())
			JOptionPane.showMessageDialog(null,"Wrong index!");
		indexInsert.clear();
		valueInsert.clear();
		list.add(id, value);
		
		printList();
	}
	
	public void deleteItem(ActionEvent event) {
		String index = indexDelete.getText();
		int id = Integer.parseInt(index);
		if(id > list.size()-1)
			JOptionPane.showMessageDialog(null,"Wrong index!");
		indexDelete.clear();
		list.remove(id);
		for(int i=1; i<=10;i++)
			indexOff(i);
		printList();
	}
	
	public void clear(ActionEvent event) {
		setArray();
		list.clear();  
		for (int i = 1; i <= 10; i++) {
			indexOff(i);		
		}
	}
	
	public void back() throws IOException {
		AnchorPane child = FXMLLoader.load(getClass().getResource("Welcomepage.fxml"));
		pane.getChildren().setAll(child);
	}
	
	public void printList() {
		Iterator<String> itr = list.iterator();
		int k=0;
	    while (itr.hasNext()) {
	       k++;
	       indexOn(k, itr.next());
	    }
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
