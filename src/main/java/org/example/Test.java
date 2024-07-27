import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class VideoPlayer extends Application {
	
    @Override
    public void start(Stage primaryStage) {
        String path = "E://movies//The Godfather Part 3 (1990)//testplay.mp4";
        Media media = new Media(path);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        
        // Set the starting point (e.g., 10 seconds)
        mediaPlayer.setOnReady(() -> mediaPlayer.seek(Duration.seconds(10)));

        MediaView mediaView = new MediaView(mediaPlayer);

        Button playButton = new Button("Play");
        playButton.setOnAction(e -> mediaPlayer.play());

        StackPane root = new StackPane();
        root.getChildren().addAll(mediaView, playButton);
        Scene scene = new Scene(root, 800, 600);

        primaryStage.setTitle("Video Player");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        start(args);
    }
}