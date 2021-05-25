package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Ventana2 {

    @FXML
    Label label;

    @FXML
    Button boton1;

    @FXML
    CheckBox checkBox1;

    private Controller controllerVentana1;

    public void initialize(){


    }

    @FXML
    public void cerrarVentana(){

        Stage stage = (Stage) boton1.getScene().getWindow();
        stage.close();
        controllerVentana1.setButton1Disable();




    }


    public void setContador(int numero){
        label.setText(String.valueOf(numero));

    }

    public String getContador(){
        return label.getText();
    }

    public void enviarController1(Controller ventana1Controller) {
        controllerVentana1 = ventana1Controller;
    }

    @FXML
    public void onClickCheckBox(){
        if(checkBox1.isSelected())
            controllerVentana1.setButton1Disable();
        else
            controllerVentana1.setButtonAble();

    }

}
