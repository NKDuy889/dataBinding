package service;

import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements IEmployeeService {
    static List<Employee> list = new ArrayList<>();

    @Override
    public void save(Employee o) {
        list.add(o);
    }

    @Override
    public List<Employee> findAll() {
        return list;
    }

}
