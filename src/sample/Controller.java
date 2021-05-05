package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {



    @FXML
    Button boton1, boton2;

    int contador=0;

    FXMLLoader loader = new FXMLLoader(getClass().getResource("ventana2.fxml"));

    @FXML
    public void onClickButton1(){

        try {
            Stage stage = new Stage();

            AnchorPane root = (AnchorPane) loader.load();
            Scene scene = new Scene(root,300,200);
            stage.setScene(scene);
            stage.show();

            boton2.setDisable(false);




        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    public void onClickButton2(){

        contador++;
        Ventana2 controller = loader.getController();

        controller.setContador(contador);

    }

    public void setButton1Disable(){

        boton2.setDisable(true);
    }
}
