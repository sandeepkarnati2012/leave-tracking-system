public class LeaveTrackingApp {

    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "Sandeep", "Engineering", "sandeep@company.com");

        LeaveRequest leave1 = new LeaveRequest(
                1,
                emp1,
                "2026-01-10",
                "2026-01-14",
                5,
                "Vacation"
        );

        leave1.approve();

        System.out.println("Employee: " + emp1.getName());
        System.out.println("Leave Status: " + leave1.getStatus());
        System.out.println("Remaining Leave Balance: " + emp1.getLeaveBalance());
    }
}
