package com.itgo.db.contacts.entities;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.itgo.db.contacts.dao.ContactsDaoFactory;
import com.itgo.db.contacts.filters.UserFilter;

public class UserTest
{
   @Test
   public void testCreate()
   {
      User user = new User();
      user.setName("Dhaval");
      user.setUsername("dsp");

      ContactsDaoFactory.getUserDao().store(user);
      assertTrue(user.getId() > 0);

      UserFilter filter = new UserFilter();
      filter.name = "Dhaval";

      List<User> loaded = ContactsDaoFactory.getUserDao().loadByFilter(filter);
      System.out.println(loaded);
   }
}
