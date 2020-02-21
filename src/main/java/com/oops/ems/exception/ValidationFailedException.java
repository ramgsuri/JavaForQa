package com.oops.ems.exception;

public class ValidationFailedException extends Exception
{
    public ValidationFailedException(String message)
    {
        super(message);
    }
}