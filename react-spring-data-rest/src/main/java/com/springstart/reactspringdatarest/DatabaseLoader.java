package com.springstart.reactspringdatarest;

import com.springstart.reactspringdatarest.employee.Employee;
import com.springstart.reactspringdatarest.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.repository.save(
                new Employee("Frodo", "Baggins", "ring bearer")
        );
    }
}
