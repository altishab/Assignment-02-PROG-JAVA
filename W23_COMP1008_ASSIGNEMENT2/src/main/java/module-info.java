module com.example.w23_comp1008_assignement2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.w23_comp1008_assignement2 to javafx.fxml;
    exports com.example.w23_comp1008_assignement2;
}