package blancedTree;


import java.io.IOException;

import javax.swing.JOptionPane;

import datat_Btree.BTree;
import datat_Btree.Datatype;
import datat_Btree.Node;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


public class ControllerBtree {
	@FXML
	AnchorPane displayPane;
	
	@FXML
	TextField InputField;
	
	Node newnode;
	final double  offset = 550;  //		this.offset=displayPane.getWidth()*0.5;
	final double  fixset = 44;  //fixset = displayPane.getHeight()*i-GlobalVar.LABEL_HEIGHT/2;
	Datatype dt = new BTree();
		
	public void insert() {
			insertBtree();	
	}
	
	public static Integer tryParser(String str) {
		try {
				return Integer.parseInt(str);
		}catch(NumberFormatException e) {
			return null;
		}
	}
	
	private void insertBtree() {
		System.out.println("insertBtree");
		try {
			String str = InputField.getText();
			if (str.equals("")) {
				JOptionPane.showMessageDialog(null, "Enter the input!!");
				return;
			}else if(tryParser(str)==null) {
				InputField.clear();
				JOptionPane.showMessageDialog(null, "wrong index");
			}
			int d = Integer.parseInt(InputField.getText());
			newnode = new Node(d);
			InputField.clear();
		} catch (NumberFormatException | NullPointerException nfe) {
			
		}
		displayPane.getChildren().clear();
		((BTree)dt).insert(newnode.getData());
		((BTree)dt).nodelist.clear();
		((BTree)dt).preorder();
		((BTree)dt).drawNotAni(dt.nodelist,offset,fixset);
		for(int i=0;i<dt.nodelist.size();i++) {
			displayPane.getChildren().add(dt.nodelist.get(i).getLabel());
			if(dt.nodelist.get(i).getArrowl()!=null&&dt.nodelist.get(i).getLeft()!=null)
			displayPane.getChildren().add(dt.nodelist.get(i).getArrowl());
			if(dt.nodelist.get(i).getArrowr()!=null&&dt.nodelist.get(i).getRight()!=null)
			displayPane.getChildren().add(dt.nodelist.get(i).getArrowr());
		}

		
	}
	
	public void delete() throws InterruptedException {
		deleteBtree();
	}
	
	private void deleteBtree() {
		System.out.println("deleteNode");
		try {
			String str = InputField.getText();
			if (str.equals("")) {
				JOptionPane.showMessageDialog(null, "Enter the input!!");
				return;
			}else if(tryParser(str)==null) {
				InputField.clear();
				JOptionPane.showMessageDialog(null, "wrong index");
			}
			int d = Integer.parseInt(InputField.getText());
			newnode = new Node(d);
			InputField.clear();
		} catch (NumberFormatException | NullPointerException nfe) {
			
		}
		displayPane.getChildren().clear();
		((BTree)dt).delete(newnode.getData());
		dt.nodelist.clear();
		((BTree)dt).preorder();
		((BTree)dt).drawNotAni(dt.nodelist,offset,fixset);
		System.out.println(dt.nodelist.size());
		for(int i=0;i<dt.nodelist.size();i++) {
			displayPane.getChildren().add(dt.nodelist.get(i).getLabel());
			if(dt.nodelist.get(i).getArrowl()!=null&&dt.nodelist.get(i).getLeft()!=null)
			displayPane.getChildren().add(dt.nodelist.get(i).getArrowl());
			if(dt.nodelist.get(i).getArrowr()!=null&&dt.nodelist.get(i).getRight()!=null)
			displayPane.getChildren().add(dt.nodelist.get(i).getArrowr());
		}

	}
	
	public void clear() {
		dt.nodelist.clear();
		dt = new BTree();
		displayPane.getChildren().clear();		
	}
	
	public void back() throws IOException {
		AnchorPane child = FXMLLoader.load(getClass().getResource("/appication/Welcomepage.fxml"));
		displayPane.getChildren().setAll(child);
	}
	
}

