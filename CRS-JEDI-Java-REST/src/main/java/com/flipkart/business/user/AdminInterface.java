package com.flipkart.business.user;

import com.flipkart.bean.academics.Course;
import com.flipkart.exception.CourseNotFoundException;

import java.util.List;
import java.util.Map;

/**
 * @author JEDI-6-Flipkart-G1
 * Class to complete Card Operation
 */
public interface AdminInterface {


    /**
     * Method to approve Student for login
     *
     * @param studentId: student ID to approve
     */
    void approveStudent(String studentId);


    /**
     * Method to delete User from database
     *
     * @param deleteUserId: User ID to delete
     */

    void deleteUser(String deleteUserId);


    /**
     * Method to view pending students awaiting approval for login
     *
     * @return List of pending student approvals
     */

    List<String> viewPendingApprovals();


    /**
     * Method to view Course details in Catalog
     *
     * @param courseId
     * @return Map of course detail type and corresponding values
     */
    Map<String, String> fetchCourseDetails(String courseId);

    /**
     * Method to update course details in database
     *
     * @param courseId
     * @param courseName
     * @param courseFaculty
     */

    void updateCourseDetails(String courseId, String courseName, String courseFaculty);


    /**
     * Method to add a new course in catalog
     *
     * @param course
     * @throws CourseNotFoundException
     */
    void addCourse(Course course);


    /**
     * Method to generate grade card of student after professor uploads grades
     *
     * @param studentId
     */
    void generateGradeCard(String studentId);
}
