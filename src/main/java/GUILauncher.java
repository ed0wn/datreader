import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.List;

public class GUILauncher extends Application {


  public static void main(String[] args) {
    launch(args);
  }
  @Override
  public void start(Stage primaryStage) throws Exception {
    Button button = new Button();
    DatReader datReader= new DatReader();
    button.setText("List Items");
    button.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent actionEvent) {
        ListView listView = new ListView();
        List<Vehicle> vehicleList = datReader.convertDatToObject();
        for (Vehicle vehicle : vehicleList) {
          listView.getItems().add(vehicle.toString());
        }
        HBox hbox = new HBox(listView);

        Scene scene = new Scene(hbox, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
      }
    });

    StackPane root = new StackPane();
    root.getChildren().add(button);

    Scene scene = new Scene(root,300,300);

    primaryStage.setTitle("DatReader");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
