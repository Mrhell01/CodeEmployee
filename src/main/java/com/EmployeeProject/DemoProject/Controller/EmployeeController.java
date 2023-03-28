package com.EmployeeProject.DemoProject.Controller;

import com.EmployeeProject.DemoProject.Model.Employee;
import com.EmployeeProject.DemoProject.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // @Controller + @ResponseBody
//@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService eService;
//    @Value("${app.name}")
//    private String appName;
//
//    @Value("${app.version}")
//    private String appVersion;

//    @GetMapping("/version")
//    public String getAppDetails(){
//        return appName+ " - " + appVersion ;
//    }
//    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return eService.getEmployees();
    }
    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable Long id){
        return eService.getSingleEmployee(id);
    }

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee){
        return eService.saveEmployee(employee);
    }
    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
        employee.setId(id);
        return eService.updateEmployee(employee);
    }

    @DeleteMapping("/employees")
    public void deleteEmployee(@RequestParam("id") Long id) {
        eService.deleteEmployee(id);
    }

}
