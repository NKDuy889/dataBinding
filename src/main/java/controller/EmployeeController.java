package controller;

import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.EmployeeService;
import service.IEmployeeService;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private IEmployeeService employeeService = new EmployeeService();
    @GetMapping("")
    public ModelAndView view(){
        return new ModelAndView("home","list",employeeService.findAll());
    }
    @GetMapping("/create")
    public ModelAndView formCreate(){
        return new ModelAndView("create","em",new Employee());
    }
    @PostMapping()
    public ModelAndView create(@ModelAttribute("e") Employee e){
        List<Employee> list = employeeService.findAll();
        list.add(e);
        return new ModelAndView("redirect: home");
    }
}
