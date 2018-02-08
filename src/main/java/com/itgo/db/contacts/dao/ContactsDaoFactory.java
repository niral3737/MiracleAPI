package com.itgo.db.contacts.dao;

public class ContactsDaoFactory
{
   public static UserDao getUserDao()
   {
      return UserDaoImpl.getInstance();
   }
}
