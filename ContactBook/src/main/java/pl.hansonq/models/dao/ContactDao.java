package pl.hansonq.models.dao;



import pl.hansonq.models.ContactModel;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by lukasz on 2017-09-06.
 */
public interface ContactDao {
    void addContact(ContactModel model);
    void removeContact(String number);

    ContactModel getContactByNumber(String number) ;
    List<ContactModel> getAllContacts();

}
