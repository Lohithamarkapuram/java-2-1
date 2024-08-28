public class Employee {
    private String name;
    private int empId;
    private String designation;
    private String companyName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        
        employee.setName("John Doe");
        employee.setEmpId(12345);
        employee.setDesignation("Software Engineer");
        employee.setCompanyName("Tech Solutions Inc.");

        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Emp ID: " + employee.getEmpId());
        System.out.println("Designation: " + employee.getDesignation());
        System.out.println("Company Name: " + employee.getCompanyName());
    }
}