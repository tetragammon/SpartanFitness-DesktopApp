module com.mycompany.spartanfitness {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.spartanfitness to javafx.fxml;
    exports com.mycompany.spartanfitness;
}
