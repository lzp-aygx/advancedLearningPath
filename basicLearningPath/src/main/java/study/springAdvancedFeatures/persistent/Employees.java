package study.springAdvancedFeatures.persistent;

public class Employees {
  private Long no;
  private java.sql.Date dob;
  private String first_name;
  private String last_name;
  private String gender;
  private java.sql.Date hire_date;

  public Long getNo() {
    return no;
  }

  public void setNo(Long no) {
    this.no = no;
  }

  public java.sql.Date getDob() {
    return dob;
  }

  public void setDob(java.sql.Date dob) {
    this.dob = dob;
  }

  public String getFirst_name() {
    return first_name;
  }

  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }

  public String getLast_name() {
    return last_name;
  }

  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public java.sql.Date getHire_date() {
    return hire_date;
  }

  public void setHire_date(java.sql.Date hire_date) {
    this.hire_date = hire_date;
  }
}
