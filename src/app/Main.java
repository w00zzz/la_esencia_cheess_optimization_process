package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/*import app.Logic.AutenticacionCRUD.Cliente;
import java.util.ArrayList;
import app.Logic.AutenticacionCRUD.WriteObject;*/


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/app/GUI/Login/Login.fxml"));
        primaryStage.setTitle("La Esencia Cheese Process Optimization Software.");
        primaryStage.setScene(new Scene(root, 1200, 700));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        /*
         * Cliente c1 = new Cliente("Robert Alvarez", "robertalvarez@gmail.com", "A5P7mAwZ");
        Cliente c2 = new Cliente("Adrian Alpizar", "adrianalpizar@gmail.com", "A5P7mAwZ");
        Cliente c3 = new Cliente("Livan Zamora", "livanzamora@gmail.com", "A5P7mAwZ");
        Cliente c4 = new Cliente("Brayan Cespedes", "brayancespedes@gmail.com", "A5P7mAwZ");

        ArrayList<Cliente> listaCliente = new ArrayList<>();
        listaCliente.add(c1);
        listaCliente.add(c2);
        listaCliente.add(c3);
        listaCliente.add(c4);

        System.out.println(listaCliente);

        WriteObject wo = new WriteObject("tmp_file_CientsList.ser");
        wo.Write(listaCliente);


        System.out.println(c1.to_String());
         */
        
    }
}