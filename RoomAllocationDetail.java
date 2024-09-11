package com.dto;

public class RoomAllocationDetail {
	private String enrollmentNo;
	private String Studentname;
	private String mobileNo ;
    private String roomnumber;
    private String checkindate;
	
    
   public String getEnrollmentNo() {
		return enrollmentNo;
	}
	public void setEnrollmentNo(String enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
	}
public String getStudentname() {
    return Studentname;
    }
    public void setStudentName(String studentname) {
   	 this.Studentname=studentname;
    }
    public String getmobileNo() {
      	 return mobileNo;
      	 }
       public void setmobileNo(String mobileNo) {
      	 this.mobileNo=mobileNo;
       }

       public String getroomnumber() {
   	 return roomnumber;
   	 }
    public void setroomnumber(String roomnumber) {
   	 this.roomnumber=roomnumber;
    }
    public String getcheckindate() {
     	 return checkindate;
     	 }
      public void setcheckindate(String checkindate) {
     	 this.checkindate=checkindate;
      }

   

}
