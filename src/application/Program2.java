package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TESTE 1: department findById ===");
		Department dep = depDao.findById(2);
		System.out.println(dep);
		
		System.out.println("\n=== TESTE 2: department findAll ===");
		List<Department> list1 = depDao.findAll();
		for (Department l : list1) {
			System.out.println(l);
		}
		
		System.out.println("\n=== TESTE 3: department insert ===");
		Department newDep = new Department(null, "Games");
		depDao.insert(newDep);
		System.out.println("Department inserted! New department id: " + newDep.getId());
		
		System.out.println("\n=== TESTE 4: department update ===");
		newDep = depDao.findById(1);
		newDep.setName("Sports");
		depDao.update(newDep);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TESTE 6: seller deleteById ===");
		depDao.deleteById(9);

	}

}
