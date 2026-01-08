public class LeaveRequest {

    private int requestId;
    private Employee employee;
    private String startDate;
    private String endDate;
    private String status;
    private String reason;
    private int numberOfDays;

    // Constructor
    public LeaveRequest(int requestId, Employee employee, String startDate,
                        String endDate, int numberOfDays, String reason) {
        this.requestId = requestId;
        this.employee = employee;
        this.startDate = startDate;
        this.endDate = endDate;
        this.numberOfDays = numberOfDays;
        this.reason = reason;
        this.status = "Pending";
    }

    // Getters and Setters
    public int getRequestId() {
        return requestId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getStatus() {
        return status;
    }

    // Business logic
    public void approve() {
        if (employee.applyLeave(numberOfDays)) {
            status = "Approved";
        } else {
            status = "Denied";
        }
    }

    public void deny() {
        status = "Denied";
    }
}
