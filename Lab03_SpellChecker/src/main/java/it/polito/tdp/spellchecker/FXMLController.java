package it.polito.tdp.spellchecker;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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
	private Dizionario dizionario;
	private String input;
	@FXML private ResourceBundle resources;
	@FXML private URL location;
	@FXML private TextField txtTestoDaControllare;
	@FXML private Button btnControlla;
	@FXML private TextArea txtParoleSbagliate;
	@FXML private Label txtTempoImpiegato;
	@FXML private Label txtNumeroParoleSbagliate;
	@FXML private Button cancellaTesto;

	@FXML
	void SelectEnglish(ActionEvent event)
	{
		dizionario.setEnglish();
		txtTestoDaControllare.setDisable(false);
	}

	@FXML
	void SelectItaliano(ActionEvent event)
	{
		dizionario.setItaliano();
		txtTestoDaControllare.setDisable(false);
	}

	@FXML
	void doCancellaTesto(ActionEvent event)
	{
		txtParoleSbagliate.clear();
	}

	@FXML
	void doControllo(ActionEvent event)
	{
		input = txtTestoDaControllare.getText();	
		input.replaceAll("[.,\\/#!$%\\^&\\*;:{}=\\-_`~()\\[\\]\"]", "");
		String[] parole = input.split(" ");
		
		for (String string : parole)
		{
			System.out.println(string);
		}
		
		List<String> paroleNonTrovate = new ArrayList<>(dizionario.cerca(parole));
		if(paroleNonTrovate.isEmpty())
			System.out.println("TUTTE CORRETTE");
		else txtParoleSbagliate.setText(paroleNonTrovate.toString());
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
		this.dizionario = model;
	}
}
