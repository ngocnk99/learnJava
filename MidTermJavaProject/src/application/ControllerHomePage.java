package application;
import java.io.IOException;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

public class ControllerHomePage implements Initializable {
	
	@FXML
	private AnchorPane presentArea;

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}
	
	public void homePage() throws IOException {
		System.out.println("Welcome Page");
		AnchorPane child = FXMLLoader.load(getClass().getResource("Welcomepage.fxml"));
		presentArea.getChildren().setAll(child);
	}
	
	public void stackPage() throws IOException {
		System.out.println("Stack Page");
		AnchorPane child = FXMLLoader.load(getClass().getResource("StackPage.fxml"));
		presentArea.getChildren().setAll(child);
	}
	
	public void linkedListPage() throws IOException {
		System.out.println("Linked List Page");
		AnchorPane child = FXMLLoader.load(getClass().getResource("LinkedListPage.fxml"));
		presentArea.getChildren().setAll(child);
	}
	
	public void BTreePage() throws IOException {
		System.out.println("BtreePage Page");
		AnchorPane child = FXMLLoader.load(getClass().getResource("BtreePage.fxml"));
		presentArea.getChildren().setAll(child);
	}

}
