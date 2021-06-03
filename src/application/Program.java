package application;

import java.text.ParseException;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TESTE 1: SELLER FINDBYID ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TESTE 2: SELLER FINDBYDEPARTMENT ===");
		List<Seller> listSellers = sellerDao.findByDepartment(new Department(4, null));
		for (Seller s : listSellers) {
			System.out.println(s);
		}
		
		System.out.println("\n=== TESTE 3: SELLER FINDALL ===");
		listSellers = sellerDao.findAll();
		for (Seller s : listSellers) {
			System.out.println(s);
		}
		
		

	}

}
