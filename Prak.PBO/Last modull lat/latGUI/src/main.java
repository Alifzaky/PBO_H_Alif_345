import com.sun.javafx.tk.quantum.PrimaryTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class main extends Application{
    @Override
    public void start(Stage primaryStage){
       Label label = new Label("Nama : ");
       TextField input = new TextField("Masukkan nama");
       Button button = new Button("Kirim");

       VBox vbox = new VBox(10);
       vbox.getChildren().addAll(label,input,button);

       Scene scene = new Scene(vbox,200,200);

       primaryStage.setTitle("Formulir sederhana");
       primaryStage.setScene(scene);
       primaryStage.show();

       button.setOnAction(e -> {String nama = input.getText();
           Alert alert = new Alert(Alert.AlertType.INFORMATION);
           alert.setContentText("Halo " + nama + "!");
           alert.showAndWait();
       });

    }

    public static void main(String[] args) {
       launch(args);

    }
}
