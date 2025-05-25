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

public class lat_1 extends Application {

    public void start(Stage lat1){
        Button button = new Button("TES");
        Label label1 = new Label("Sebelum ditekan");

        button.setOnAction(e ->
        {label1.setText("Sesudah ditekan");}
        );

        HBox hbox = new HBox(10);
        hbox.setStyle("-fx-background-color : lightBlue");
        hbox.getChildren().addAll(label1,button);

        Scene scene = new Scene(hbox);

        lat1.setTitle("TES LISTENER");
        lat1.setScene(scene);
        lat1.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
