/**
 * Skeleton for 'Borders.fxml' Controller Class
 */

package it.polito.tdp.borders;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.borders.model.Border;
import it.polito.tdp.borders.model.Country;
import it.polito.tdp.borders.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BordersController {

	Model model;

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="txtAnno"
	private TextField txtAnno; // Value injected by FXMLLoader

	@FXML // fx:id="txtResult"
	private TextArea txtResult; // Value injected by FXMLLoader
	
	@FXML // fx:id="txtResult"
	private ComboBox<Country> boxStato; // Value injected by FXMLLoader

	List<Border> b = new LinkedList<Border>();
	List<Country> c = new LinkedList<Country>();

	
	public void setModel(Model model) {
		this.model=model;
		
	}
	
	@FXML
	void doCalcolaConfini(ActionEvent event) {
		txtResult.clear();
		c.clear();
		
		int anno = Integer.parseInt(txtAnno.getText());
		
		model.creaGrafo(anno);
		c.addAll(model.getAllCountries());
		boxStato.getItems().addAll(c);
		
		for(Country cc : c)
			if(cc.getGrado()!=0)
				txtResult.appendText(cc.getNome() + " " + cc.getGrado() + "\n");
	}
	
	@FXML
	void doVicini(ActionEvent Event) {
		Country c = boxStato.getValue();
	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert txtAnno != null : "fx:id=\"txtAnno\" was not injected: check your FXML file 'Borders.fxml'.";
		assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Borders.fxml'.";
		assert boxStato != null : "fx:id=\"boxStato\" was not injected: check your FXML file 'Borders.fxml'.";
	}
}
