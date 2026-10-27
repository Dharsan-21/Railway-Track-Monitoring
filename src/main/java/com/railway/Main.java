
package com.railway;

import java.time.LocalDateTime;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        TrackAnalyzer analyzer = new TrackAnalyzer();

        List<Sensor> sensors = List.of(
            new Sensor("TR-001", 5, 30, 2),
            new Sensor("TR-002", 15, 40, 7),
            new Sensor("TR-003", 25, 48, 12),
            new Sensor("TR-004", 8, 34, 3)
        );

        System.out.println("======================================");
        System.out.println(" RAILWAY TRACK CONDITION MONITORING");
        System.out.println("======================================");
        System.out.println("Time: " + LocalDateTime.now());
        System.out.println();

        for (Sensor sensor : sensors) {
            String status = analyzer.analyze(sensor);

            System.out.printf(
                "Section: %s | Vibration: %.1f | Temperature: %.1f | Displacement: %.1f | Status: %s%n",
                sensor.getSectionId(),
                sensor.getVibration(),
                sensor.getTemperature(),
                sensor.getDisplacement(),
                status
            );
        }

        System.out.println();
        System.out.println("Monitoring completed.");
        System.out.println("NOTE: All sensor values are simulated.");
    }
}
