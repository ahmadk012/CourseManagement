package model.tutoring;

public abstract class User {

    private String userName;
    private String password;
    private String fullName;
    private String major;
    private int academicYear;

    public User(String userName, String password, String fullName, String major, int academicYear){
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.major = major;
        this.academicYear = academicYear;
    }

    public String getUserName(){return this.userName;}
    public String getPassword(){return this.password;}
    public String getfullName(){return this.fullName;}
    public String getmajor(){return this.major;}
    public int getAcademicYear(){return this.academicYear;}


}
