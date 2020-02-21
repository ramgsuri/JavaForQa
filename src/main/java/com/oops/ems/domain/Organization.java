package com.oops.ems.domain;

import com.oops.ems.exception.IllegalCallException;
import com.oops.ems.exception.NoVacancyException;
import com.oops.ems.exception.ValidationFailedException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Organization {

    private String   name;
    private String   address;
    private long     numberOfEmployees;
    private Employee e[];
    private long     numAppointed;
    private long     numVacant;
    private Date     dateOfEstablishment;

    public Organization() {

    }

    public Organization(String name, String address, long numEmployees, String date, String format) throws ValidationFailedException {
        this.setName(name);
        this.setAddress(address);
        this.setNumberOfEmployees(numEmployees);
        this.setDateOfEstablishment(date, format);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(long numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Employee[] getE() {
        return e;
    }

    public void setE(Employee[] e) {
        this.e = e;
    }

    public long getNumAppointed() {
        return numAppointed;
    }

    public void setNumAppointed(long numAppointed) {
        this.numAppointed = numAppointed;
    }

    public long getNumVacant() {
        return numVacant;
    }

    public void setNumVacant(long numVacant) {
        this.numVacant = numVacant;
    }

    public Date getDateOfEstablishment() {
        return dateOfEstablishment;
    }

    public void setDateOfEstablishment(Date dateOfEstablishment) {
        this.dateOfEstablishment = dateOfEstablishment;
    }

    private boolean validateNumEmployees(int numberOfEmployees) {
        if (numberOfEmployees <= 0) {
            System.out.println("A company must have more than 0 employees!");
            return false;
        }
        return true;
    }

    public void setEmployeeDetails(Employee emp) throws NoVacancyException, IllegalCallException {
        if (0 == this.numVacant) {
            System.out.println("Oopsie Daisy!");
            throw new NoVacancyException("No vacant spaces left as of now! Please apply again later...");
        } else if (null == this.e) {
            String msg = "First call the method `setNumEmployees` of this class to initialize the employee array!";
            throw new IllegalCallException(msg);
        } else {
            for (int i = 0; i < this.numAppointed; i++) {
                if (this.e[i].getId() == emp.getId()) {
                    String msg = "Employee with same ID exists!";
                    throw new IllegalArgumentException(msg);
                }
            }
        }
        this.numAppointed++;
        this.numVacant = this.numberOfEmployees - this.numAppointed;
        this.e[(int)numAppointed - 1] = emp;
    }

    public void setNumEmployees(int numEmployees) throws ValidationFailedException
    {
        if(!this.validateNumEmployees(numEmployees))
            throw new ValidationFailedException("Validation of parameter `numEmployees` failed!");
        this.numberOfEmployees = numEmployees;
        if(null == this.e)
        {
            this.e = new Employee[numEmployees];
            this.numAppointed = 0;
            this.numVacant = this.numberOfEmployees;
        }
        else
        {
            Employee newE[] = new Employee[(int)this.numberOfEmployees];
            if(this.numberOfEmployees <= this.numAppointed)
            {
                this.numberOfEmployees = this.e.length;
                throw new ValidationFailedException("New employee size can't be less than appointed emploees!");
            }
            else
            {
                for(int i=0;i<this.numAppointed;i++) newE[i] = e[i];
                this.e = newE;
                this.numVacant = this.numberOfEmployees - this.numAppointed;
                return;
            }
        }
    }

    public void setDateOfEstablishment(String date, String format) throws ValidationFailedException
    {
        try
        {
            this.dateOfEstablishment = new SimpleDateFormat(format).parse(date);
        }
        catch(Exception exp)
        {
            throw new ValidationFailedException("Date Validation falied! Check format and try again...");
        }
    }
}