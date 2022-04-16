package com.fileio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpPayrollService {
    private List<EmpPayrollData> empPayrollList;

    public EmpPayrollService() {}

    public EmpPayrollService(List<EmpPayrollData> empPayrollList) {
        this.empPayrollList = empPayrollList;
    }

    public static void main(String[] args) {
        ArrayList<EmpPayrollData> empPayrollList = new ArrayList<>();
        EmpPayrollService empPayrollService = new EmpPayrollService(empPayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        empPayrollService.readEmpPayrollData(consoleInputReader);
        empPayrollService.writeEmpPayrollData();
    }

    private void writeEmpPayrollData() {
        System.out.println("\nWriting Employee Payroll Roaster to Console\n" + empPayrollList);

    }

    private void readEmpPayrollData(Scanner consoleInputReader) {
        System.out.println("Enter Employee ID: ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee Name: ");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee Salary :");
        double salary = consoleInputReader.nextDouble();
        empPayrollList.add(new EmpPayrollData(id, name, salary));
    }
}
