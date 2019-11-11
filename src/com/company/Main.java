
/*
   . create a class called Main
   . prompt the user
   . List out all the string files a user to enter
   . create declare boolean value and do with a  while loop
   . import the Scanner
*/
package com.company;



import java.util.EnumMap;
import java.util.Scanner;



  class Main {


      public static void main(String[] args) {
          Scanner Z = new Scanner( System.in );
          Employee employee = new Employee();


          //boolean Y;
          //  String PersonalInformation;
          String name;
          String emailaddress;
          //   String EXPERIANCE ;
          String company;
          String jobtitle;
          String startdate;
          String enddate;
          String jobdescription;
          // String d;

          boolean list = true;
          while (list) {
              System.out.println( "*********EMPLOYEE RESUME********** " );

              //System.out.println("Do you want to add a resume ?"  );
              System.out.println( "1.PERSONAL INFORMATION " );

              System.out.println( "please enter a name?" );
              name = Z.nextLine();
              employee.setName( name );

              System.out.println( "please enter an emailaddress" );
              emailaddress = Z.nextLine();
              employee.setEmailaddress( emailaddress );

            //  String input = Z.nextLine();
            //  if (input.equals( "Yes" )) {
//                  list = true;
//              } else {
//                  list = false;
            //  }

              System.out.println( "2.EXPERIANCE" );

              System.out.println( "please enter a company name" );
              company = Z.nextLine();
              employee.setCompany( company );

              System.out.println( "please enter a jobtitle" );
              jobtitle = Z.nextLine();
              employee.setJobtitle( jobtitle );
              System.out.println( "please enter a startdate" );
              startdate = Z.nextLine();
              employee.setStartdate( startdate );
              System.out.println( "please enter an enddate" );
              enddate = Z.nextLine();
              employee.setEnddate( enddate );
              System.out.println( "please enter a jobdescription" );
              jobdescription = Z.nextLine();
              employee.setJobdescription( jobdescription );

              // System.out.println( "Do you want to create employee list \n enter yes/ no ?" );

              System.out.println( "************* Resume ***************" );

              System.out.println( "Enter name: " + employee.getName() + "\n Enter emailaddress: " + employee.getEmailaddress() + "\n Enter company: " + employee.getCompany() + "\n  Enter jobtitle:" + employee.getJobtitle() +
                      "\n Enter start date:" + employee.getStartdate() + "\n  Enter end date :" + employee.getEnddate() + "\n Enter job description :" + employee.getJobdescription() );

              System.out.println( ".........." );
              // System.out.println( "Do you want to  add a resume? " );

              // if (input.equals("yes")) {
              // list=true;

              // }
              // else {
              // list=false;


              System.out.println( "Do you want to create a new resume ?" );
              String input2 = Z.nextLine();
              if (input2.equals( "yes" )) {
                  // System.out.println( "Do you want to create employee list ?" );
                  list = true;

              } else {
                  list = false;
              }


          }


      }

  }