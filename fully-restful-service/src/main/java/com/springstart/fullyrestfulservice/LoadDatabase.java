package com.springstart.fullyrestfulservice;

import com.springstart.fullyrestfulservice.employee.Employee;
import com.springstart.fullyrestfulservice.employee.EmployeeRepository;
import com.springstart.fullyrestfulservice.order.Order;
import com.springstart.fullyrestfulservice.order.OrderRepository;
import com.springstart.fullyrestfulservice.order.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository, OrderRepository orderRepository) {
        return args -> {
            log.info("Preloading: {}", employeeRepository.save(new Employee("Bilbo Baggins", "burglar")));
            log.info("Preloading: {}", employeeRepository.save(new Employee("Frodo Baggins", "thief")));
            log.info("Preloading: {}", orderRepository.save(new Order("MacBook Pro", Status.COMPLETED)));
            log.info("Preloading: {}", orderRepository.save(new Order("iPhone", Status.IN_PROGRESS)));
        };
    }
}
