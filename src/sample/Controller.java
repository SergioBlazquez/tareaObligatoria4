package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {



    @FXML
    Button boton1, boton2, boton3;

    int contador=0;

    Ventana2 controllerVentana2=null;


    @FXML
    public void onClickButton1(){

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ventana2.fxml"));
            Stage stage = new Stage();

            AnchorPane root = (AnchorPane) loader.load();
            Scene scene = new Scene(root,300,200);
            stage.setScene(scene);
            stage.show();

            setButtonAble();

            controllerVentana2 = loader.getController();
            controllerVentana2.enviarController1(this);


        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    public void onClickButton2(){

        contador++;

        try {

            controllerVentana2.setContador(contador);
        }catch (Exception e){
            System.out.println("Null");
        }
    }

    @FXML
    public void onClickButton3(){

        contador--;

        try {

            controllerVentana2.setContador(contador);
        }catch (Exception e){
            System.out.println("Null");
        }
    }



    public void setButton1Disable(){

        boton2.setDisable(true);
        boton3.setDisable(true);
    }
    public void setButtonAble(){

        boton2.setDisable(false);
        boton3.setDisable(false);
    }
}
