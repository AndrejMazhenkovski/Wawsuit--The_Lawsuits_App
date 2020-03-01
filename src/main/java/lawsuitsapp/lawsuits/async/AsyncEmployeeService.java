package lawsuitsapp.lawsuits.async;

import lawsuitsapp.lawsuits.dataholder.DataHolder;
import lawsuitsapp.lawsuits.model.Document;
import lawsuitsapp.lawsuits.model.Employee;
import lawsuitsapp.lawsuits.model.exceptions.EmployeeNotFoundException;
import lawsuitsapp.lawsuits.service.EmployeeService;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AsyncEmployeeService {

    EmployeeService employeeService;
    DataHolder dataHolder;

    public AsyncEmployeeService(EmployeeService employeeService, DataHolder dataHolder){
        this.employeeService = employeeService;
        this.dataHolder = dataHolder;
    }

    public List<Employee> getAllEmployeesAsync(){
        return employeeService.getAllEmployees();
    }

    public Employee getEmployeeByIdAsync(int id) throws EmployeeNotFoundException {
        return employeeService.getEmployeeById(id);
    }

    public void addEmployeeAsync(Employee newEmployee){
        employeeService.addEmployee(newEmployee);
    }

    //helper:
    public void fillDataBaseAtStart(){
        dataHolder.fillDBAtStart();
    }


    public void editEmployeeAsync(int oldId, Employee editedEmployee){
        employeeService.editEmployee(oldId,editedEmployee);
    }




    // todo:


    public void deleteEmployeeAsync(Employee employee){

    }

    public void addDocumentToEmployeeAsync(Employee employee, Document docToAdd){

    }
}
