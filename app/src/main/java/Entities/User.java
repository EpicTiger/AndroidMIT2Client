package Entities;

public class User
{
    private int UserId;
    private String Firstname;
    private String Lastnameprefix;
    private String Lastname;
    private String Gender;
    private String Nationality;
    private String DateOfBirth;
    private String PoliticalPreference;
    private String Town;

    public String getTown()
    {
        return Town;
    }

    public void setTown(String town)
    {
        Town = town;
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

    public String getGender()
    {
        return Gender;
    }

    public void setGender(String gender)
    {
        Gender = gender;
    }

    public String getNationality()
    {
        return Nationality;
    }

    public void setNationality(String nationality)
    {
        Nationality = nationality;
    }

    public String getDateOfBirth()
    {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth)
    {
        DateOfBirth = dateOfBirth;
    }

    public String getPoliticalPreference()
    {
        return PoliticalPreference;
    }

    public void setPoliticalPreference(String politicalPreference)
    {
        PoliticalPreference = politicalPreference;
    }

    public int getUserId()
    {
        return UserId;
    }

    public void setUserId(int userId)
    {
        UserId = userId;
    }
}

