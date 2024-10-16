package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        SellerDao sellerDao = DaoFactory.createSellerDao();
//
//        System.out.println("=== TEST 1: seller findById ===");
//        Seller seller = sellerDao.findById(5);
//        System.out.println(seller);
//
//        System.out.println("\n=== TEST 2: seller findByDepartment ===");
//        Department department = new Department(2, null);
//        List<Seller> list = sellerDao.findByDepartment(department);
//        for (Seller s : list) {
//            System.out.println(s);
//        }
//
//        System.out.println("\n=== TEST 3: seller findAll ===");
//        list = sellerDao.findAll();
//        for (Seller s : list) {
//            System.out.println(s);
//        }
//
//        System.out.println("\n=== TEST 4: seller insert ===");
//        seller = new Seller(null, "Victor Andrade", "victor@gmail.com", new Date(), 10000.0, department);
//        sellerDao.insert(seller);
//        System.out.println("Inserted! New id = " + seller.getId());
//
//        System.out.println("\n=== TEST 5: seller update ===");
//        seller = sellerDao.findById(1);
//        seller.setName("Martha Waine");
//        sellerDao.update(seller);
//        System.out.println("Update completed");
//
//        System.out.println("\n=== TEST 6: seller delete ===");
//        System.out.println("Enter id for delete test: ");
//        int id = scanner.nextInt();
//        sellerDao.deleteById(id);
//        System.out.println("Delete completed");

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById");
        Department department = departmentDao.findById(1);
        System.out.println(department);

        System.out.println("\n=== TEST 2: department findAll");
        List<Department> departments = departmentDao.findAll();
        for (Department department1 : departments) {
            System.out.println(department1);
        }

        System.out.println("\n=== TEST 3: department insert");
        Department department2 = new Department(null, "Luiza");
        departmentDao.insert(department2);
        System.out.println("Done!");

        System.out.println("\n=== TEST 4: department update");

        System.out.println("\n=== TEST 5: department deleteById");
        departmentDao.deleteById(5);
        System.out.println("Done!");

        scanner.close();
    }
}
