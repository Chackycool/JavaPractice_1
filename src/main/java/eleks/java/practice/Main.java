package eleks.java.practice;

import eleks.java.practice.controller.AccountController;
import eleks.java.practice.controller.BankController;
import eleks.java.practice.dto.AccountRequestDto;
import eleks.java.practice.dto.BankRequestDto;
import eleks.java.practice.entity.AccountEntity;
import eleks.java.practice.repository.AccountRepositoryImpl;
import eleks.java.practice.repository.BankRepositoryImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankController bankController = new BankController();
        BankRequestDto bankRequestDto = new BankRequestDto();
        BankRepositoryImpl bankRepository = new BankRepositoryImpl();
        AccountController accountController = new AccountController();
        AccountRequestDto accountRequestDto = new AccountRequestDto();
        AccountRepositoryImpl accountRepository = new AccountRepositoryImpl();
        Scanner scanner = new Scanner(System.in);

        //TODO create unique 5 Banks
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter id:\n");
            bankRequestDto.setId(Integer.parseInt(scanner.next()));
            System.out.println("Enter name:\n");
            bankRequestDto.setName(scanner.next());
            System.out.println("Enter qnt:\n");
            bankRequestDto.setQnt(Integer.parseInt(scanner.next()));
            bankController.create(bankRequestDto);
        }

        //TODO Return list of banks
        System.out.println(bankController.getAllBanks());
        //TODO Get bank by id
        System.out.println("search by id");
        System.out.println(bankController.getBankById(scanner.nextInt()));
        //TODO Remove bank by id
        // System.out.println("delete by id");
       // bankController.deleteBankById(scanner.nextInt());
        //TODO Return list of banks
        System.out.println(bankController.getAllBanks());

        //TODO Create account

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter Account id:\n");
            accountRequestDto.setId(Integer.parseInt(scanner.next()));
            System.out.println("Enter Account name:\n");
            accountRequestDto.setName(scanner.next());
            System.out.println("Enter Account bank_id:\n");
            accountRequestDto.setBank_id(Integer.parseInt(scanner.next()));
            accountController.create(accountRequestDto);
        }
        System.out.println(accountController.getAllAccounts());
        //TODO Get Banks with accounts
        for (var j : bankController.getAllBanks()) {
            for (var i : accountController.getAllAccounts()) {
                if (i.getBank_id() == j.getId()) {
                    System.out.println("banks that have accounts");
                    System.out.println(j.toString());
                    System.out.println("bank accounts...");
                    System.out.println(i.toString());
                    break;
                }
            }

        }
    }
}