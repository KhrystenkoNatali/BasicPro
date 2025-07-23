package app;

import java.util.*;

public class AttendanceUtil {
    public static Map<Student, Integer> countAttendance(List<Student> students) {
        Map<Student, Integer> attendanceMap = new HashMap<>();

        for (Student student : students) {
            attendanceMap.put(student, attendanceMap.getOrDefault(student, 0) + 1);
        }

        return attendanceMap;
    }
}
