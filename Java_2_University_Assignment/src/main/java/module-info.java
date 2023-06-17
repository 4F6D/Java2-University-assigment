module com.example.java_2_university_assignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_2_university_assignment to javafx.fxml;
    exports com.example.java_2_university_assignment;
}