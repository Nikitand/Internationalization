package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.task1.CounterInstans;
import sample.task2.List;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root, 300,275);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        CounterInstans counterInstans = new CounterInstans();
        CounterInstans counterInstans1 = new CounterInstans();

       // System.out.println(CounterInstans.count);

        List list = new List();
        int z = 5;
        while(z!=70) {
            list.setElement(z);
            z++;
        }

        list.getAllElement();

        System.out.println(list.size());

        launch(args);
    }
}
