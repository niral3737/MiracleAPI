package com.itgo.db.global.exceptions;

@SuppressWarnings("serial")
public class DaoException extends RuntimeException
{
   public DaoException(
         String message)
   {
      super(message);
   }
}
