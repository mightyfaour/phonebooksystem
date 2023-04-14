package com.philipneo.phonebooksystem.service;

import com.philipneo.phonebooksystem.data.model.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> getAllContacts();
    Contact createContact(Contact contact);
    Contact getContactById(Long id);
    void deleteContactById(Long id);
}
