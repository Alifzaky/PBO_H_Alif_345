import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class kalkulator extends Application {

    public void start(Stage jalankan){
        TextField input1 = new TextField();
        input1.setPromptText("Masukkan bilangan pertama ");
        TextField input2 = new TextField();
        input2.setPromptText("Masukkan bilangan kedua");
        Button kirim = new Button("Tambahkan");
        Label label = new Label();

        kirim.setOnAction(e -> {
            try{
                int a = Integer.parseInt(input1.getText());
                int b = Integer.parseInt(input2.getText());
                int hasil = a + b;
                label.setText( "Hasil : "+ hasil);
            } catch (NumberFormatException ex){
                label.setText("Masukkan angka woiii");
            }
        });

        VBox root = new VBox (10,input1,input2,kirim,label);
        root.setStyle("--background-color : lightBlue");
        root.setPadding(new Insets(20));

        Scene scene = new Scene(root,300,200);

        jalankan.setTitle("Kalkulator sederhana");
        jalankan.setScene(scene);
        jalankan.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
