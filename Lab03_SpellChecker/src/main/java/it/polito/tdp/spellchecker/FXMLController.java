package it.polito.tdp.spellchecker;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.dizionari.Dizionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController
{
	Dizionario model;
	
	@FXML
	private ResourceBundle resources;
	@FXML
	private URL location;
	@FXML
	private TextField txtTestoDaControllare;
	@FXML
	private TextArea txtParoleSbagliate;
	@FXML
	private Label txtTempoImpiegato;
	@FXML
	private Label txtNumeroParoleSbagliate;
	@FXML
	private Button cancellaTesto;

	@FXML
	void SelectEnglish(ActionEvent event)
	{
		
	}

	@FXML
	void SelectItaliano(ActionEvent event)
	{
		
	}

	@FXML
	void doCancellaTesto(ActionEvent event)
	{
		
	}

	@FXML
	void doControllo(ActionEvent event)
	{

	}

	@FXML
	void initialize()
	{
		assert txtTestoDaControllare != null
				: "fx:id=\"txtTestoDaControllare\" was not injected: check your FXML file 'Scene.fxml'.";
		assert txtParoleSbagliate != null
				: "fx:id=\"txtParoleSbagliate\" was not injected: check your FXML file 'Scene.fxml'.";
		assert txtTempoImpiegato != null
				: "fx:id=\"txtTempoImpiegato\" was not injected: check your FXML file 'Scene.fxml'.";
		assert txtNumeroParoleSbagliate != null
				: "fx:id=\"txtNumeroParoleSbagliate\" was not injected: check your FXML file 'Scene.fxml'.";
		assert cancellaTesto != null : "fx:id=\"cancellaTesto\" was not injected: check your FXML file 'Scene.fxml'.";

	}

	public void setModel(Dizionario model)
	{
		this.model = model;
	}
}
