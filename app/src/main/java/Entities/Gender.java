package Entities;

public enum Gender
{
    Male(0),
    Female(1);

    private final int gender;

    Gender(int gender)
    {
        this.gender = gender;
    }

    @Override
    public String toString()
    {
        return String.valueOf(gender);
    }
}
