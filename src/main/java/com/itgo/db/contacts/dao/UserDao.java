package com.itgo.db.contacts.dao;

import com.itgo.db.contacts.entities.User;
import com.itgo.db.contacts.filters.UserFilter;
import com.itgo.db.global.dao.GenericDao;

public interface UserDao extends GenericDao<User, UserFilter>
{
}
