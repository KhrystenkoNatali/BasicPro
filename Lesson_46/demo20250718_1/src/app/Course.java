package app;

import java.util.Objects;

public class Course {
    private String title;
    private String teacher;

    public Course(String title, String teacher) {
        this.title = title;
        this.teacher = teacher;
    }

    public String getTitle() {
        return title;
    }

    public String getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (!Objects.equals(title, course.title)) return false;
        return Objects.equals(teacher, course.teacher);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (teacher != null ? teacher.hashCode() : 0);
        return result;
    }
}
