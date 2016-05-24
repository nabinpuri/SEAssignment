package lab0Foundation.prob3AddressForm;
/**
 * @author Group Apricot
 * Lab0Foundation Problem3 JavaFx
 * */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AddressForm extends Application{
	public static void  main(String[] args){
		//AddressForm form= new AddressForm();
		launch();
	}
	@Override
	public void start(Stage addressFormStage) throws Exception {
		addressFormStage.setTitle("AddressForm");
		addressFormStage.setX(0);
		addressFormStage.setY(0);
		//now create all label
		Label lblName= new Label("Name: ");
		Label lblStreet= new Label("Street: ");
		Label lblCity= new Label("City: ");
		Label lblState= new Label("State: ");
		Label lblZip= new Label("Zip: ");

		//now create textfield
		TextField tfName= new TextField();
		TextField tfStreet= new TextField();
		TextField tfcity= new TextField();
		TextField tfState= new TextField();
		TextField tfZip= new TextField();


		Button btnSubmit= new Button();
		btnSubmit.setText("Submit");
		btnSubmit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
					//tfZip.setText("here");
					if(tfName.getText()!=""){
						System.out.println(tfName.getText());
					}
					if(tfStreet.getText()!=""){
						System.out.println(tfStreet.getText());
					}
					if(tfcity.getText()!=""||tfState.getText()!=""||tfZip.getText()!=""){
						System.out.println(tfcity.getText()+","+tfState.getText()+" "+tfZip.getText());
					}
			}
		});

		//add to pane
		Pane root = new Pane();
		btnSubmit.setLayoutX(250);
		btnSubmit.setLayoutY(150);
	    root.getChildren().add(btnSubmit);



	    //now label add

	    lblName.setLayoutX(20);
	    lblName.setLayoutY(20);
	    root.getChildren().add(lblName);

	    lblStreet.setLayoutX(200);
	    lblStreet.setLayoutY(20);
	    root.getChildren().add(lblStreet);

	    lblCity.setLayoutX(410);
	    lblCity.setLayoutY(20);
	    root.getChildren().add(lblCity);

	    lblState.setLayoutX(80);
	    lblState.setLayoutY(70);
	    root.getChildren().add(lblState);

	    lblZip.setLayoutX(300);
	    lblZip.setLayoutY(70);
	    root.getChildren().add(lblZip);

	    //now add textField

		tfName.setLayoutX(20);
		tfName.setLayoutY(40);
	    root.getChildren().add(tfName);

	    tfStreet.setLayoutX(200);
	    tfStreet.setLayoutY(40);
	    root.getChildren().add(tfStreet);

	    tfcity.setLayoutX(410);
	    tfcity.setLayoutY(40);
	    root.getChildren().add(tfcity);

	    tfState.setLayoutX(80);
	    tfState.setLayoutY(95);
	    root.getChildren().add(tfState);

	    tfZip.setLayoutX(300);
	    tfZip.setLayoutY(95);
	    root.getChildren().add(tfZip);


	   // Scene scene= new Scene(root, 650,190 );
	    addressFormStage.setScene(new Scene(root, 650,190 ));
	    addressFormStage.show();

	}


}

