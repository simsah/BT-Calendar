package com.google.api.services.samples.calendar.sync.controller.events;

import com.btmuzikevi.core.domain.course.CourseRegistration;
import org.springframework.context.ApplicationEvent;

public class CourseLessonGoogleCalendarNeedToBeUpdatedEvent extends ApplicationEvent {

    private CourseRegistration courseRegistration;

    public CourseLessonGoogleCalendarNeedToBeUpdatedEvent(CourseRegistration source) {
        super(source);
        courseRegistration = source;
    }

    public CourseRegistration getCourseRegistration() {
        return courseRegistration;
    }

    public void setCourseRegistration(CourseRegistration courseRegistration) {
        this.courseRegistration = courseRegistration;
    }
}

