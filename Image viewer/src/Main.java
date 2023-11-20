import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.File;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Image viewer");
        //FileInputStream input = new FileInputStream("NahIdWin.jpeg");
        Image image1=new Image("NahIdWin1.gif");
        Image image2=new Image("NahIdWin2.jpeg");
        Image image3=new Image("NahIdWin3.png");
        Image image4=new Image("NahIdWin4.jpeg");
        Image image5=new Image("GoatJobs.jpeg");
        Image image6=new Image("AppleNotCalledRed.jpeg");


        Button button0 = new Button("Your Image");
        Button button1 = new Button("image1");
        Button button2 = new Button("image2");
        Button button3 = new Button("image3");
        Button button4 = new Button("image4");
        Button button5 = new Button("image5");
        Button button6 = new Button("image6");
        Button button7 = new Button("Clear View");

        RadioButton radioButton1 = new RadioButton("Image1");
        RadioButton radioButton2 = new RadioButton("Image2");
        RadioButton radioButton3 = new RadioButton("Image3");
        RadioButton radioButton4 = new RadioButton("Image4");
        RadioButton radioButton5 = new RadioButton("Image5");
        RadioButton radioButton6 = new RadioButton("Image6");
        FileChooser fileChooser = new FileChooser();
        Button fileButton = new Button("Select File");




        ImageView imageView=new ImageView();
        imageView.setImage(image1);

        imageView.setPreserveRatio(true);
        imageView.setSmooth(true);
        imageView.setCache(true);





        MenuItem menuItem0 = new MenuItem("Your image");
        MenuItem menuItem1 = new MenuItem("Image 1");
        MenuItem menuItem2 = new MenuItem("Image 2");
        MenuItem menuItem3 = new MenuItem("Image 3");
        MenuItem menuItem4 = new MenuItem("Image 4");
        MenuItem menuItem5 = new MenuItem("Image 5");
        MenuItem menuItem6 = new MenuItem("Image 6");


        MenuButton menuButton = new MenuButton("Image", null, menuItem1, menuItem2, menuItem3,menuItem4,menuItem5,menuItem6);

        menuItem1.setOnAction(event -> {
            menuButton.setText(menuItem1.getText());
            imageView.setImage(image1);
        });
        menuItem2.setOnAction(event -> {
            menuButton.setText(menuItem2.getText());
            imageView.setImage(image2);
        });
        menuItem3.setOnAction(event -> {
            menuButton.setText(menuItem3.getText());
            imageView.setImage(image3);
        });
        menuItem4.setOnAction(event -> {
            menuButton.setText(menuItem4.getText());
            imageView.setImage(image4);
        });
        menuItem5.setOnAction(event -> {
            menuButton.setText(menuItem5.getText());
            imageView.setImage(image5);
        });
        menuItem6.setOnAction(event -> {
            menuButton.setText(menuItem6.getText());
            imageView.setImage(image6);
        });


        ToggleGroup radioGroup = new ToggleGroup();

        radioButton1.setToggleGroup(radioGroup);
        radioButton2.setToggleGroup(radioGroup);
        radioButton3.setToggleGroup(radioGroup);
        radioButton4.setToggleGroup(radioGroup);
        radioButton5.setToggleGroup(radioGroup);
        radioButton6.setToggleGroup(radioGroup);

        radioButton1.setOnAction(actionEvent -> {
            imageView.setImage(image1);
            menuButton.setText(menuItem1.getText());
        });
        radioButton2.setOnAction(actionEvent -> {
            imageView.setImage(image2);
            menuButton.setText(menuItem2.getText());
        });
        radioButton3.setOnAction(actionEvent -> {
            imageView.setImage(image3);
            menuButton.setText(menuItem3.getText());
        });
        radioButton4.setOnAction(actionEvent -> {
            imageView.setImage(image4);
            menuButton.setText(menuItem4.getText());
        });
        radioButton5.setOnAction(actionEvent -> {
            imageView.setImage(image5);
            menuButton.setText(menuItem5.getText());
        });
        radioButton6.setOnAction(actionEvent -> {
            imageView.setImage(image6);
            menuButton.setText(menuItem6.getText());
        });


        button1.setOnAction(actionEvent -> {
            imageView.setImage(image1);
            menuButton.setText(menuItem1.getText());
        });
        button2.setOnAction(actionEvent -> {
            imageView.setImage(image2);
            menuButton.setText(menuItem2.getText());
        });
        button3.setOnAction(actionEvent -> {
            imageView.setImage(image3);
            menuButton.setText(menuItem3.getText());
        });
        button4.setOnAction(actionEvent -> {
            imageView.setImage(image4);
            menuButton.setText(menuItem4.getText());
        });
        button5.setOnAction(actionEvent -> {
            imageView.setImage(image5);
            menuButton.setText(menuItem5.getText());
        });
        button6.setOnAction(actionEvent -> {
            imageView.setImage(image6);
            menuButton.setText(menuItem6.getText());
        });

        button7.setOnAction(actionEvent -> {
            imageView.setImage(null);
            menuButton.setText("Image");

        });

        fileButton.setOnAction(event-> {
            File selectedFile = fileChooser.showOpenDialog(primaryStage);
            Image image0 =new Image(selectedFile.toURI().toString());
            button0.setOnAction(actionEvent ->{
                menuButton.setText(menuItem0.getText());
                imageView.setImage(image0);
            });
        });


        HBox hbox1 = new HBox(imageView,menuButton,fileButton,button7);
        HBox hbox2 = new HBox(button1,button2,button3,button4,button5,button6,button0);
        VBox vbox1 = new VBox( hbox1,hbox2,radioButton1,radioButton2,radioButton3,radioButton4,radioButton5,radioButton6);
        Scene myScene1 = new Scene(vbox1,1920,1080);
        primaryStage.setTitle("Image viewer");
        primaryStage.setScene(myScene1);
        primaryStage.show();

    }
    public static void main(String[] args) {

        launch(args);
    }
}
