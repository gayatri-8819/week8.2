import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class DisplayTextAndImage extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Text and Image Display");

        Label label = new Label("Hello, JavaFX!");

        // Keep imagePath.jpg in the same folder as this program when running.
        Image image = new Image("file:imagePath.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(250);
        imageView.setFitHeight(220);
        imageView.setPreserveRatio(true);

        VBox root = new VBox(15);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(label, imageView);

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
