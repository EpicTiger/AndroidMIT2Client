package Entities;

import Politics247Generated.ThriftGender;

public class User
{
    private int UserId;
    private String Firstname;
    private String Lastnameprefix;
    private String Lastname;

    public ThriftGender getGender()
    {
        return Gender;
    }

    public void setGender(ThriftGender gender)
    {
        Gender = gender;
    }

    private ThriftGender Gender;
    private String Nationality;
    private int DateOfBirthYear;
    private int DateOfBirthMonth;
    private int DateOfBirthDay;
    private String PoliticalPreference;
    private String Town;

    public int getUserId()
    {
        return UserId;
    }

    public void setUserId(int userId)
    {
        UserId = userId;
    }

    public String getFirstname()
    {
        return Firstname;
    }

    public void setFirstname(String firstname)
    {
        Firstname = firstname;
    }

    public String getLastnameprefix()
    {
        return Lastnameprefix;
    }

    public void setLastnameprefix(String lastnameprefix)
    {
        Lastnameprefix = lastnameprefix;
    }

    public String getLastname()
    {
        return Lastname;
    }

    public void setLastname(String lastname)
    {
        Lastname = lastname;
    }

    public String getNationality()
    {
        return Nationality;
    }

    public void setNationality(String nationality)
    {
        Nationality = nationality;
    }

    public int getDateOfBirthYear()
    {
        return DateOfBirthYear;
    }

    public void setDateOfBirthYear(int dateOfBirthYear)
    {
        DateOfBirthYear = dateOfBirthYear;
    }

    public int getDateOfBirthMonth()
    {
        return DateOfBirthMonth;
    }

    public void setDateOfBirthMonth(int dateOfBirthMonth)
    {
        DateOfBirthMonth = dateOfBirthMonth;
    }

    public int getDateOfBirthDay()
    {
        return DateOfBirthDay;
    }

    public void setDateOfBirthDay(int dateOfBirthDay)
    {
        DateOfBirthDay = dateOfBirthDay;
    }

    public String getPoliticalPreference()
    {
        return PoliticalPreference;
    }

    public void setPoliticalPreference(String politicalPreference)
    {
        PoliticalPreference = politicalPreference;
    }

    public String getTown()
    {
        return Town;
    }

    public void setTown(String town)
    {
        Town = town;
    }
}

