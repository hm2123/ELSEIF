import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Optional;
import javafx.scene.control.TextInputDialog;

public class ELSEIF extends Application {

    @Override
    public void start (Stage primaryStage) {
        TextInputDialog textInputDialog = new TextInputDialog("1");
        textInputDialog.setTitle("Println vs. Printf");
        textInputDialog.setContentText("Select option 1 for println or option 2 for printf");

        Optional<String> input = textInputDialog.showAndWait();
        String option = input.get();

        if(option.equals("1")) {
            System.out.println("You chose println and thats what I perfer!");
        } else if (option.equals("2")) {
            System.out.printf("Great choice %s \n", "Courageous one");
            System.out.printf("Character: %c \n", 123);
            System.out.printf("Decimal: %d \n", 5, 4321);
            System.out.printf("Exponents: %12.3e \n", 45.6);
            System.out.printf("Float: %f \n", 7.8910);

        }
    }

}
