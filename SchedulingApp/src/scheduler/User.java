package scheduler;

import javafx.collections.ObservableList;
import scheduler.utils.Database;

import java.util.ArrayList;

public class User {
    private final String name;
    private final String password;
    private final int userId;
    private ObservableList<Appointment> appointments;

    public String getName() {
        return this.name;
    }
    public String getPassword() {
        return this.password;
    }
    public int getUserId() { return this.userId; }
    public ObservableList<Appointment> getAppointments(){ return appointments; }

    public void setAppointments(ObservableList<Appointment>appointments) { this.appointments = appointments; };

    public User(String name, String password, int id) {
        this.name = name;
        this.password = password;
        this.appointments = Database.createApptList(id);
        this.userId = id;
    }
}
