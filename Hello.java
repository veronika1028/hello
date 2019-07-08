import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.geometry.Orientation;

public class Hello extends Application {
    public static void main(String[] args) {
        Application.launch(args);
        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello," + " " + name);
    }

    public void start(Stage stage) throws Exception {
        Label lbl = new Label("What is your name?");
        TextField textField = new TextField();
        textField.setPrefColumnCount(10);
        Button btn = new Button("Click");
        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10, lbl, textField, btn);
        Scene scene = new Scene(root, 250, 200, Color.CORAL);
        stage.setScene(scene);
        stage.setTitle("Hello");
        stage.show();
String s = "1234567890*.";
if (textField.getText().indexOf(s) !=-1)
    btn.setOnAction(event -> lbl.setText("Input your name, chars only"));
else
{

                btn.setOnAction(event -> lbl.setText("Hello," + " " + textField.getText()));}
            }


    }