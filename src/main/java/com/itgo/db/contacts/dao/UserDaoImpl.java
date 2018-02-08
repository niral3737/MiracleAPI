package com.itgo.db.contacts.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.itgo.db.contacts.entities.User;
import com.itgo.db.contacts.filters.UserFilter;
import com.itgo.db.global.dao.GenericDaoImpl;

class UserDaoImpl extends GenericDaoImpl<User, UserFilter> implements UserDao
{
   private static UserDaoImpl instance;

   private UserDaoImpl()
   {
   }

   static UserDaoImpl getInstance()
   {
      if (instance == null)
         instance = new UserDaoImpl();
      return instance;
   }

   @Override
   protected List<Predicate> getFilterConditions(CriteriaQuery<User> query, Root<User> root, CriteriaBuilder builder,
         UserFilter filter)
   {
      List<Predicate> conditions = new ArrayList<>();

      if (filter.name != null)
         conditions.add(builder.equal(root.get("name"), filter.name));

      return conditions;
   }

}
