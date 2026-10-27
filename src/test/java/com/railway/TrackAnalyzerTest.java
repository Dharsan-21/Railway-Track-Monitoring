package com.railway;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrackAnalyzerTest {

    private final TrackAnalyzer analyzer = new TrackAnalyzer();

    @Test
    void testHealthyTrack() {
        Sensor sensor = new Sensor("TR-001", 5, 30, 2);
        assertEquals("HEALTHY", analyzer.analyze(sensor));
    }

    @Test
    void testWarningTrack() {
        Sensor sensor = new Sensor("TR-002", 15, 40, 7);
        assertEquals("WARNING", analyzer.analyze(sensor));
    }

    @Test
    void testCriticalTrack() {
        Sensor sensor = new Sensor("TR-003", 25, 48, 12);
        assertEquals("CRITICAL", analyzer.analyze(sensor));
    }

    @Test
    void testNegativeSensorValue() {
        Sensor sensor = new Sensor("TR-004", -5, 30, 2);
        assertThrows(
            IllegalArgumentException.class,
            () -> analyzer.analyze(sensor)
        );
    }

    @Test
    void testNullSensor() {
        assertThrows(
            IllegalArgumentException.class,
            () -> analyzer.analyze(null)
        );
    }
}