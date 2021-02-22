import java.util.Scanner;

public class RegEx {

    Scanner input = new Scanner(System.in);
    public String firstName = "";
    public String lastName = "";
    public String email = "";
    public String age = "";
    public String gender = "";
    public String salary = "";

    public RegEx(String firstName, String lastName, String email, String age, String gender, String salary)
    {
        this.firstName = evaluateFirstName(firstName);
        this.lastName = evaluateLastName(lastName);
        this.email = evaluateEmail(email);
        this.age = evaluateAge(age);
        this.gender = evaluateGender(gender);
        this.salary = evaluateSalary(salary);
    }
    public RegEx()
    {
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.age = "";
        this.gender = "";
        this.salary = "";
    }

    // FIRST NAME
    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = evaluateFirstName(firstName); }

    public String evaluateFirstName(String firstName)
    {
        if (!firstName.matches("[A-Z][a-zA-Z-]*"))
        {
            firstName = "incorrect format";
        }
        return firstName;
    }

    // LAST NAME
    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = evaluateLastName(lastName); }

    public String evaluateLastName(String lastName)
    {
        if (!lastName.matches("[A-Z][a-zA-Z-]*"))
        {
            lastName = "incorrect format";
        }
        return lastName;
    }

    // EMAIL
    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = evaluateEmail(email); }

    public String evaluateEmail(String email)
    {
        if (!email.matches(".*@[a-z]*[.][a-z]{2,3}"))
        {
            email = "incorrect format";
        }
        return email;
    }

    // AGE
    public String getAge() { return age; }

    public void setAge(String age) { this.age = evaluateAge(age); }

    public String evaluateAge(String age)
    {
        if (!age.matches("[0-9]+"))
        {
            age = "incorrect format";
        }
        return age;
    }

    // GENDER
    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = evaluateGender(gender); }

    public String evaluateGender(String gender)
    {
        if (!gender.matches("(male|female|nonbinary|Male|Female|NonBinary|Nonbinary)"))
        {
            gender = "incorrect format";
        }
        return gender;
    }

    // SALARY
    public String getSalary() { return salary; }

    public void setSalary(String salary) { this.salary = evaluateSalary(salary); }

    public String evaluateSalary(String salary)
    {
        if (!salary.matches(".*[$][0-9]*"))
        {
            salary = "incorrect format";
        }
        return salary;
    }

    public String toString()
    {
        String output = "first name: " + firstName;
        output += "\nlast name: " + lastName;
        output += "\nemail: " + email;
        output += "\nage: " + age;
        output += "\ngender: " + gender;
        output += "\nsalary: " + salary;
        return output;
    }//end toString

} // end of class