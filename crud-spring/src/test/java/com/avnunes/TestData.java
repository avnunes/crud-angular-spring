package com.avnunes;

import java.util.List;
import java.util.Set;

import com.avnunes.dto.CourseDTO;
import com.avnunes.dto.CourseRequestDTO;
import com.avnunes.dto.LessonDTO;
import com.avnunes.enums.Category;
import com.avnunes.enums.Status;
import com.avnunes.model.Course;
import com.avnunes.model.Lesson;

public class TestData {

    private static final String COURSE_NAME = "Spring";
    private static final String INVALID_COURSE_NAME = "Spr";
    private static final String LOREN_IPSUM = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc et quam nec diam tristique mollis eget quis urna. Sed dapibus lectus in arcu rutrum, non luctus sem finibus. Cras nisl neque, pellentesque et tortor id, dapibus auctor turpis.";

    private static final String LESSON_NAME = "Spring Intro";
    private static final String LESSON_YOUTUBE = "abcdefgh123";

    private TestData() {
    }

    public static Course createValidCourse() {
        Course course = new Course();
        course.setId(1L);
        course.setName(COURSE_NAME);
        course.setCategory(Category.BACK_END);
        course.setStatus(Status.ACTIVE);

        Lesson lesson = new Lesson();
        lesson.setName(LESSON_NAME);
        lesson.setYoutubeUrl(LESSON_YOUTUBE);
        lesson.setCourse(course);
        course.setLessons(Set.of(lesson));
        return course;
    }

    public static CourseDTO createValidCourseDTO() {
        return new CourseDTO(1L, COURSE_NAME, Category.BACK_END.getValue(), createLessonsDTO());
    }

    public static CourseRequestDTO createValidCourseRequest() {
        return new CourseRequestDTO(COURSE_NAME, Category.BACK_END.getValue(), createLessonsDTO());
    }

    private static List<LessonDTO> createLessonsDTO() {
        return List.of(new LessonDTO(1, LESSON_NAME, LESSON_YOUTUBE));
    }

    public static List<Course> createInvalidCourses() {
        final String validName = COURSE_NAME;
        final String empty = "";

        return List.of(
                buildCourse(null, null),
                buildCourse(null, Category.BACK_END),
                buildCourse(empty, Category.BACK_END),
                buildCourse(INVALID_COURSE_NAME, Category.BACK_END),
                buildCourse(LOREN_IPSUM, Category.BACK_END),
                buildCourse(validName, null),
                buildCourse(validName, Category.BACK_END));
    }

    private static Course buildCourse(String name, Category category) {
        Course course = new Course();
        course.setName(name);
        course.setCategory(category);
        return course;
    }

    public static List<CourseRequestDTO> createInvalidCoursesDTO() {
        final String validName = COURSE_NAME;
        final String validCategory = Category.BACK_END.getValue();
        final String empty = "";

        return List.of(
                new CourseRequestDTO(null, null, createLessonsDTO()),
                new CourseRequestDTO(validCategory, null, createLessonsDTO()),
                new CourseRequestDTO(validCategory, empty, createLessonsDTO()),
                new CourseRequestDTO(validCategory, INVALID_COURSE_NAME, createLessonsDTO()),
                new CourseRequestDTO(validCategory, LOREN_IPSUM, createLessonsDTO()),
                new CourseRequestDTO(null, validName, createLessonsDTO()),
                new CourseRequestDTO(empty, validName, createLessonsDTO()),
                new CourseRequestDTO(LOREN_IPSUM, validName, createLessonsDTO()),
                new CourseRequestDTO(validCategory, validName, createLessonsDTO()),
                new CourseRequestDTO(validCategory, validName, List.of()));
    }
}
