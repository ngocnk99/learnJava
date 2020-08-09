package datat_Btree;

import java.util.Random;

import blancedTree.GlobalVar;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Node {
	private int data;
	private int height;
	private Node left, right; //for tree
	private Label label;
	private Arrow arrowl;
	private Arrow arrowr;
	
	private Random 	rand = new Random();
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}	
	public Arrow getArrowl() {
		return arrowl;
	}

	public void setArrowl(Arrow arrowl) {
		this.arrowl = arrowl;
	}

	public Arrow getArrowr() {
		return arrowr;
	}

	public void setArrowr(Arrow arrowr) {
		this.arrowr = arrowr;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Node() {
		// TODO Auto-generated constructor stub
		super();
		left = null;
        right = null;
        height = 0;
        arrowl= null;
    	arrowr = null;
		data = rand.nextInt(100);
		this.label = form();

	}

	public Node(int data) {
		super();
		left = null;
        right = null;
        height = 0;
        arrowl= null;
    	arrowr = null;
		this.data = data;
		this.label = form();
	}
	
	public Label form() {
		Label label = new Label();
		label.setBorder(new Border(new BorderStroke(Color.BLUE, BorderStrokeStyle.SOLID, new CornerRadii(5), new BorderWidths(1))));
//khung cua o chu                                       vien xanh                                  do cong                    do day                                                                     
		label.setText("" + data);
		label.setLayoutX(GlobalVar.PRIMARY_X);
		label.setLayoutY(GlobalVar.PRIMARY_Y);
		label.setPrefHeight(GlobalVar.LABEL_HEIGHT);
		label.setPrefWidth(GlobalVar.LABEL_WIDTH);
		label.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, null, null))); // mau nen o chu
		label.setFont(new Font(20)); //font chu
		label.setAlignment(Pos.CENTER);
		return label;
	}

}
