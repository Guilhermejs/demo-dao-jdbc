package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TESTE 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TESTE 2: seller findByDepartment ===");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for (Seller l : list) {
			System.out.println(l);
		}
		
		System.out.println("\n=== TESTE 3: seller findAll ===");
		List<Seller> list1 = sellerDao.findAll();
		for (Seller l : list1) {
			System.out.println(l);
		}
		
		System.out.println("\n=== TESTE 4: seller insert ===");
		Seller seller1 = new Seller(null, "Guilherme", "gui@gmail.com", new Date(), 2000.0, dep);
		sellerDao.insert(seller1);
		System.out.println("Inserted! New id = " + seller1.getId());
		
		

	}

}
