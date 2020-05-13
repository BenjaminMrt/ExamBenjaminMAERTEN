package partiel;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.*;

public class Controller implements Initializable{
	
	//NE FONCTIONNE PAS
	
	@FXML
	private CategoryAxis xAxis;

	@FXML
	private NumberAxis yAxis;
	
	@FXML
	private LineChart glaLine;
	
	public void initialize(URL url, ResourceBundle resourceBundle)
	{
        xAxis.setLabel("Years");
        XYChart.Series<Integer,Integer> series = new XYChart.Series<Integer,Integer>();
        
        //Ouverture du fichier
		File myObj = new File("D:\\JavaWorkspace\\Tp6Fx\\src\\partiel\\glaciers.txt");
	    if (myObj.exists()) {
	    	//Verification du fichier, affichage du nom
	      System.out.println("File name: " + myObj.getName());
	    } else {
	      System.out.println("The file does not exist.");
	    }
	    try {
	    	//Mise ne place du scanner pour lire le fichier
	        Scanner myReader = new Scanner(myObj);
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          String[] datas = data.split(",");
	          if(datas[0].equals("Year")){}
	          else
	          {
	        	  //creation d'une classe
	        	  Glaciers myGla = new Glaciers(Integer.parseInt(datas[0]),Integer.parseInt(datas[0]),Integer.parseInt(datas[0]));
	        	  series.getData().add(new XYChart.Data(myGla.getYear(), myGla.getMass()));
	          }
	        }
	        System.out.println("on essaye d'ajouter les series");
		    glaLine.getData().add(series);
	        myReader.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	}
}
