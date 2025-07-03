package Ex14_1;

public class tests {

	public static void main(String[] args) {
        // Create basic employees
        RegularEmployee e1 = new RegularEmployee("Alice", 6);             // eligible for bonus
        Technician t1 = new Technician("Bob", 7, 120);                    // eligible for bonus
        UnionMember u1 = new UnionMember("Charlie", 5, 3);               // not eligible
        Employee[] team = {e1, t1, u1};
        ProjectSupervisor ps1 = new ProjectSupervisor("Dina", 4, team); // not eligible

        // Create company and add employees
        Company company = new Company();
        company.addEmployee(e1);
        company.addEmployee(t1);
        company.addEmployee(u1);
        company.addEmployee(ps1);

        // Print employee details, vote score and salary
        System.out.println("-- Employees --");
        Employee[] emps = {e1, t1, u1, ps1};
        for (Employee e : emps) {
            System.out.println(e.toString());
            System.out.println("Vote score: " + e.getVoteScore());
            System.out.println("Salary: " + e.calculateSalary());
            System.out.println();
        }

        // Bonus eligibility tests
        System.out.println("-- Bonus Eligibility --");
        System.out.println("Alice eligible for bonus: " + company.isEligibleForBonus(e1)); // true
        System.out.println("Bob eligible for bonus: " + company.isEligibleForBonus(t1));   // true
        System.out.println("Charlie eligible for bonus: " + company.isEligibleForBonus(u1)); // false
        System.out.println("Dina eligible for bonus: " + company.isEligibleForBonus(ps1));   // false

        // Technician with less than 100 computers
        Technician t2 = new Technician("Eli", 6, 90); // not eligible for bonus
        company.addEmployee(t2);
        System.out.println("Eli eligible for bonus: " + company.isEligibleForBonus(t2)); // false

        // Technician with exactly 100 computers (should not get bonus)
        Technician t3 = new Technician("Lior", 10, 100);
        System.out.println("Lior salary: " + t3.calculateSalary()); // base + seniority + bonus

        // Rename company voting test
        Votable[] voters = {e1, t1, u1, ps1};
        System.out.println("Rename approved? " + company.isCompanyRenameAccepted(voters)); // true

        // Test adding more than 100 employees
        System.out.println("-- Adding employees until limit --");
        for (int i = 0; i < 101; i++) {
            boolean added = company.addEmployee(new RegularEmployee("Emp" + i, 1));
            if (!added) {
                System.out.println("Failed to add employee number: " + i);
                break;
            }
        }

        // Total company salary
        System.out.println("-- Total Salary --");
        System.out.println("Total monthly salary: " + company.getTotalMonthlySalary());
    }

}
