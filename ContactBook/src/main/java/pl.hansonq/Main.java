package pl.hansonq;

import com.sun.org.apache.xpath.internal.SourceTree;
import pl.hansonq.models.ContactModel;
import pl.hansonq.models.dao.ContactDao;
import pl.hansonq.models.dao.impl.ContactDaoImpl;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by lukasz on 2017-09-06.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response;
        ContactDao contactDao = new ContactDaoImpl();

        do {
            System.out.println("Wpisz: ");
            System.out.println("1 - aby dodać nowy kontakt");
            System.out.println("2 - aby usunąć kontakt");
            System.out.println("3 - aby wyświetlić wszystkie kontakty");
            System.out.println("4 - aby wyswietlic imie i nazwisko po numerze");

            System.out.print("Odpowiedź: ");
            response = scanner.nextLine();

            switch (response){
                case "1": {
                    ContactModel model = new ContactModel(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
                    contactDao.addContact(model);
                    break;
                }
                case "2": {
                    System.out.print("Podaj numer który chcesz usunąć: ");
                    contactDao.removeContact(scanner.nextLine());
                    break;
                }
                case "3": {
                    for (ContactModel contactModel : contactDao.getAllContacts()) {
                        System.out.println(contactModel.toString());
                    }
                    break;
                }
                case "4": {
                    System.out.print("Wpisz numer telefonu: ");
                    System.out.println(contactDao.getContactByNumber(scanner.nextLine()).toString());
                    break;
                }
            }

        }while (!response.equals("exit"));
    }
}
