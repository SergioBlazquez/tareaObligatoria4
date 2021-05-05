package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Ventana2 {

    @FXML
    Label label;

    @FXML
    Button boton1;




    public void cerrarVentana(){

        Stage stage = (Stage) boton1.getScene().getWindow();
        stage.close();

        FXMLLoader loader2 = new FXMLLoader(getClass().getResource("sample.fxml"));
        Controller controller2 = loader2.getController();

        //controller2.setButton1Disable();
        controller2.boton2.setDisable(true);


    }


    public void setContador(int numero){
        label.setText(String.valueOf(numero));

    }

}
