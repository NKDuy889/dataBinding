package service;

import model.Employee;

import java.util.List;

public interface IService<T> {
    void save(T t);
    List<Employee> findAll();
}
