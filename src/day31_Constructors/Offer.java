package day31_Constructors;

public class Offer {

    public String location; // declaring variables as instances;
    public String companyName;
    public String jobTitle;
    public double salary;
    public boolean hasBenefit;
    public boolean hasPTO;
    public boolean isWFH;
    public boolean isFullTime;

    public void setInfo(String location, String companyName,
                 String jobTitle, double salary, boolean hasBenefit,
                 boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    } // this keyword is used to assign instance var


    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    } // we need toString method to be able to print;
    // if we dont use toString method we will get hashes;





}
