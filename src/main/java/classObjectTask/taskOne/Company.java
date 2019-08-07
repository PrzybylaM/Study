package classObjectTask.taskOne;

public class Company {
    public static void main(String[] args) {


        Employee employee1 = new Employee();
        employee1.companyName = "Nordan";
        employee1.name = "Adam";
        employee1.surname = "Kowalski";
        employee1.dateOfBorn = 1990;
        employee1.workExperience = 7;

        Employee employee2 = new Employee();
        employee2.companyName = "Nordan";
        employee2.name = "Janusz";
        employee2.surname = "Gzyk";
        employee2.dateOfBorn = 1987;
        employee2.workExperience = 10;

        Employee employee3 = new Employee();
        employee3.companyName = "Nordan";
        employee3.name = "Egon";
        employee3.surname = "Piwowar";
        employee3.dateOfBorn = 1985;
        employee3.workExperience = 14;

        String employeeInfo1 = "Firma: " + employee1.companyName + "\nDane pracownika: " + employee1.name + " " +
                employee1.surname + " " + employee1.dateOfBorn + "\nStaż pracy: " + employee1.workExperience;

        String employeeInfo2 = "Firma: " + employee2.companyName + "\nDane pracownika: " + employee2.name + " " +
                employee2.surname + " " + employee2.dateOfBorn + "\nStaż pracy: " + employee2.workExperience;

        String employeeInfo3 = "Firma: " + employee3.companyName + "\nDane pracownika: " + employee3.name + " " +
                employee3.surname + " " + employee3.dateOfBorn + "\nStaż pracy: " + employee3.workExperience;

        System.out.println(employeeInfo1);
        System.out.println(employeeInfo2);
        System.out.println(employeeInfo3);
    }
}
