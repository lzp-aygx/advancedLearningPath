package study.springAdvancedFeatures.persistent;

public class Roles {
  private Long id;
  private Long emp_no;
  private String role;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getEmp_no() {
    return emp_no;
  }

  public void setEmp_no(Long emp_no) {
    this.emp_no = emp_no;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }
}
