
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.shape.Circle;

public class TextFieldExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    private int i;
    private Scene scene;
    private int p;

    @Override
    public void start(Stage primaryStage) throws Exception {
// TODO Auto-generated method stub
        Label user_id = new Label("User ID");
        TextField tf1 = new TextField("2");
        Button b = new Button("Submit");
        b.setOnAction(e -> System.out.println("You entered: circles: " + tf1.getText() + ""));
        String a = tf1.getText();
        try {
// the String to int conversion happens here
            int p;
            p = Integer.parseInt(a);
// print out the value after the conversion
            System.out.println("int i = " + p);
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }
        Group group = new Group();
        for (int k = 0; k <= p; p++) {
            Circle circle = new Circle();
            circle.setCenterX(500.0f);
            circle.setCenterY(500.0f);
            circle.setRadius(50);
            group.getChildren().addAll(circle);
        }
        GridPane root = new GridPane();
        root.addRow(0, user_id, tf1);
        root.addRow(2, b);
        scene = new Scene(root,400,250);
        primaryStage.setScene(scene);
        
        primaryStage.setTitle("Text Field Example");
        primaryStage.show();
    }
}
