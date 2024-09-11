package com.dto;

public class GatePassDetail {
	private String Studentname;
	private String mobileNo ;
	
    private String purpose;
    private String Depaturetime;
    private String returntime;
	
    
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
       

     
	public String getpurpose() {
   	 return purpose;
   	 }
    public void setpurpose(String purpose) {
   	 this.purpose=purpose;
    }
    public String getDepaturetime() {
     	 return Depaturetime;
     	 }
      public void setDepaturetime(String Depaturetime) {
     	 this.Depaturetime=Depaturetime;
      }
      public String getreturntime() {
      	 return returntime;
      	 }
       public void setreturntime(String returntime) {
      	 this.returntime=returntime;
       }
	
   
}
