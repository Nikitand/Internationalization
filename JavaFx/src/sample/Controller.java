package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Locale;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    private Menu menu;

    @FXML
    private MenuItem menuItemRu;

    @FXML
    private MenuItem menuItemEn;

    @FXML
    private Alert alert = new Alert(Alert.AlertType.INFORMATION);

    @FXML
    private Button button;

    @FXML
    private Label label;

    @FXML
    public void onClickMethod()
    {
        alert.showAndWait();
    }

    @FXML
    public void onChangeMethodEn()
    {
        Locale locale = new Locale("ru", "RUS");
        changeLanguage(locale);
    }

    @FXML
    public void onChangeMethodRu()
    {
        Locale locale = new Locale("en", "ENG");
        changeLanguage(locale);
    }

    private void changeLanguage(Locale locale)
    {
        ResourceBundle bundle = ResourceBundle.getBundle("text", locale);

        button.setText(bundle.getString("message_button"));
        label.setText(bundle.getString("label"));

        alert.setTitle(bundle.getString("alert_Title"));
        alert.setHeaderText(null);
        alert.setContentText(bundle.getString("alert_Message"));
        menu.setText(bundle.getString("menu"));
        menuItemEn.setText(bundle.getString("english"));
        menuItemRu.setText(bundle.getString("russian"));
    }
}
