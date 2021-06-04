package application;

import java.text.ParseException;
import java.util.Date;
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
		
		System.out.println("\n=== TESTE 4: SELLER INSERT ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 3000.0, new Department(4, null));
		sellerDao.insert(newSeller);
		System.out.println("Inserted! Newid = " + newSeller.getId());
		
		System.out.println("\n=== TESTE 5: SELLER UPDATE ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed!");
	
		

	}

}
