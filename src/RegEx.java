import java.util.Scanner;

public class RegEx {

    Scanner input = new Scanner(System.in);
    public String firstName = "";
    public String lastName = "";
    public String email = "";
    public String age = "";

    public RegEx(String s, String rebecca, String chang, String s1)
    {
        this.firstName = evaluateFirstName(firstName);
        this.lastName = evaluateLastName(lastName);
        this.email = evaluateEmail(email);
        this.age = evaluateAge(age);
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

} // end of class