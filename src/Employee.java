public class Employee {

    // Attributes
    private int employeeId;
    private String name;
    private String department;
    private String email;
    private int leaveBalance;

    // Default constructor
    public Employee() {
        this.leaveBalance = 20; // default annual leave
    }

    // Parameterized constructor
    public Employee(int employeeId, String name, String department, String email) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.email = email;
        this.leaveBalance = 20;
    }

    // Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLeaveBalance() {
        return leaveBalance;
    }

    public void setLeaveBalance(int leaveBalance) {
        if (leaveBalance >= 0) {
            this.leaveBalance = leaveBalance;
        } else {
            System.out.println("Leave balance cannot be negative.");
        }
    }

    // Business logic
    public boolean applyLeave(int days) {
        if (days <= leaveBalance) {
            leaveBalance -= days;
            return true;
        }
        return false;
    }
}
