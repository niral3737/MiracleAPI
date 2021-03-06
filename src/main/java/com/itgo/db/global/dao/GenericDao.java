package com.itgo.db.global.dao;

import java.util.List;

import com.itgo.db.global.entities.BaseObject;
import com.itgo.db.global.filters.BaseFilter;

// basic template for CRUD operations
public interface GenericDao<T extends BaseObject, F extends BaseFilter>
{
   void store(T obj);

   List<T> loadByFilter(F filter);

   void delete(long id);

   void deleteAll();

   List<T> loadAll();
}
