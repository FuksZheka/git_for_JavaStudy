package Exercism_java.ex_Booking_Up_for_beauty;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy H:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, formatter);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {

        int hour = appointmentDate.getHour();
        return hour >= 12 && hour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        String dayOfWeek = appointmentDate.getDayOfWeek()
                .getDisplayName(TextStyle.FULL, Locale.US);

        // Format month (March)
        String month = appointmentDate.getMonth()
                .getDisplayName(TextStyle.FULL, Locale.US);

        // Format day of month (29)
        int day = appointmentDate.getDayOfMonth();

        // Format year (2019)
        int year = appointmentDate.getYear();

        // Format time (3:00 PM)
        String time = appointmentDate.format(DateTimeFormatter.ofPattern("h:mm a"));

        return String.format("You have an appointment on %s, %s %d, %d, at %s.",
                dayOfWeek, month, day, year, time);
    }

    public LocalDate getAnniversaryDate() {
        int year = LocalDate.now().getYear();
        return LocalDate.of(year, 9, 15);
    }

    public static void main(String[] args) {
        AppointmentScheduler appointmentScheduler = new AppointmentScheduler();
        System.out.println(
                appointmentScheduler.hasPassed(LocalDateTime.of(1999, 12, 31, 9, 0, 0)));
    }
}
