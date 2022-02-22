package model.tutoring;
import java.util.ArrayList;

public class Tutor extends User{

    private ArrayList<User> enrolledStudents = new ArrayList<User>();
    private ArrayList<User> requests = new ArrayList<User>();
    private ArrayList<String> courses = new ArrayList<String>();
    private int hourlyRate;
    private int studentsNb;

    public Tutor(String userName, String password, String fullName, String major, int academicYear, ArrayList<String> courses, int hourlyRate) {
        super(userName, password, fullName, major, academicYear);
        this.courses = courses;
        this.hourlyRate = hourlyRate;
    }

    //getters
    public ArrayList<User> getEnrolledStudents() {
        return enrolledStudents;
    }

    public ArrayList<User> getRequests() {
        return requests;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getStudentsNb() {
        return studentsNb;
    }

    public void setNewHourlyRate(int newRate){
        this.hourlyRate = newRate;
    }

    //add a user to list of students
    public void addStudent(User u){
        enrolledStudents.add(u);
    }

    public void removeStudent(User u){
        enrolledStudents.remove(u);
    }

    //check if the course is already being taught
    private boolean exists(String courseName){
        for(int i=0; i<courses.size(); i++){
            if(courses.get(i) == courseName) return true;
        }
        return false;
    }

    //add a course to the teaching materials
    public void addCourse(String newCourseName){
        if(exists(newCourseName)){
            System.out.println("Course already being taught");
        }
        else{
            courses.add(newCourseName);
        }
    }

    public void removeCourse(String course){
        if(exists(course)) courses.remove(course);
        else System.out.println("Course doesn't exist");
    }

    //return max hourly Income
    public int aprxIncome(){
        return enrolledStudents.size() * hourlyRate;
    }

    public void meetingDetails(String details){
        //add details to the db where all enrolled students can see
    }


}
