package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== TESTE 1: DEPARTMENT FINDBYID ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		
		System.out.println("\n=== TESTE 2: DEPARTMENT FINDALL ===");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TESTE 3: DEPARTMENT INSERT ===");
		Department newDepartment = new Department(null, "Games");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! Newid = " + newDepartment.getId());
		
		System.out.println("\n=== TESTE 4: DEPARTMENT UPDATE ===");
		department = departmentDao.findById(1);
		department.setName("Food");
		departmentDao.update(department);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TESTE 6: DEPARTMENT DELETE ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delte completed!");
		
		
		
		
		
		sc.close();

	}

}
