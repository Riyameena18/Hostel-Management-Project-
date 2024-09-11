package com.dto;

public class RoomDeallocationDetail {
	private String Studentname;
	private String mobileNo ;
    private String roomnumber;
    private String checkoutdate;
	
    
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
    public String getcheckoutdate() {
     	 return checkoutdate;
     	 }
      public void setcheckoutdate(String checkoutdate) {
     	 this.checkoutdate=checkoutdate;
      }

   

}
