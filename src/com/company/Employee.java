package com.company;

public class Employee {

    public String getjob;
    private String name = "";
    private String emailaddress = "";
    private String company = "";
    private String jobtitle = "";
    private String startdate = "";
    private String enddate = "";
    private String jobdescription = "";

    public Employee() {
    }


    public Employee(String name , String email_address , String company , String job_title , String start_date , String end_date , String job_description) {
        this.name = name;
        this.emailaddress = emailaddress;
        this.company = company;
        this.jobtitle = jobtitle;
        this.startdate = startdate;
        this.enddate = enddate;
        this.jobdescription = jobdescription;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getJobdescription() {
        return jobdescription;
    }

    public void setJobdescription(String jobdescription) {
        this.jobdescription = jobdescription;
    }

   public String getDisplayText () {
        return " name:" + getName() +
               "\n emailaddress:" + getEmailaddress() +
             "\n  company:" + getCompany() +
               "\n jobtitle:" + getJobtitle() +
               "\n startdate:" + getStartdate() +
              "\n enddate:" + getEnddate() +
               "\n jobdescription:" + getJobdescription() +
                " ";
    }



  }





