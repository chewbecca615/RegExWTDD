import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class tests
{
    @Test
    public void initial()
    {
        RegEx regex = new RegEx("Rebecca", "Chang", "rchang615@gmail.com", "16", "female", "$200");
        String expected = "first name: Rebecca\nlast name: Chang\nemail: rchang615@gmail.com\nage: 16\ngender: female\nsalary: $200";
        assertEquals(expected, regex.toString());
    }

    @Test
    public void defaultConstructor()//will need to be changed as more variables are added
    {
        RegEx regex = new RegEx();
        String expected = "first name: \nlast name: \nemail: \nage: \ngender: \nsalary: ";
        assertEquals(expected, regex.toString());
    }

    // FIRST NAME TESTS
    @Test
    public void firstNameCorrect()
    {
        RegEx regex = new RegEx();
        regex.setFirstName("Rebecca");
        String expected = "Rebecca";
        assertEquals(expected, regex.getFirstName());
    }

    @Test
    public void firstNameFalseLC() // lowercase
    {
        RegEx regex = new RegEx();
        regex.setFirstName("rebecca");
        String expected = "incorrect format";
        assertEquals(expected, regex.getFirstName());
    }

    @Test
    public void firstNameFalseD() // dash
    {
        RegEx regex = new RegEx();
        regex.setFirstName("re-becca");
        String expected = "incorrect format";
        assertEquals(expected, regex.getFirstName());
    }

    @Test
    public void firstNameFalseFAL() // first and last
    {
        RegEx regex = new RegEx();
        regex.setFirstName("rebecca chang");
        String expected = "incorrect format";
        assertEquals(expected, regex.getFirstName());
    }

    @Test
    public void firstNameFalseN() // number
    {
        RegEx regex = new RegEx();
        regex.setFirstName("r3b3cc4");
        String expected = "incorrect format";
        assertEquals(expected, regex.getFirstName());
    }

    // LAST NAME TESTS
    @Test
    public void lastNameCorrect()
    {
        RegEx regex = new RegEx();
        regex.setLastName("Chang");
        String expected = "Chang";
        assertEquals(expected, regex.getLastName());
    }

    @Test
    public void lastNameFalseLC() // lowercase
    {
        RegEx regex = new RegEx();
        regex.setLastName("chang");
        String expected = "incorrect format";
        assertEquals(expected, regex.getLastName());
    }

    @Test
    public void lastNameFalseD() // dash
    {
        RegEx regex = new RegEx();
        regex.setLastName("chan-g");
        String expected = "incorrect format";
        assertEquals(expected, regex.getLastName());
    }

    @Test
    public void lastNameFalseFAL() // first and last
    {
        RegEx regex = new RegEx();
        regex.setLastName("rebecca chang");
        String expected = "incorrect format";
        assertEquals(expected, regex.getLastName());
    }

    @Test
    public void lastNameFalseN() // number
    {
        RegEx regex = new RegEx();
        regex.setLastName("ch4ng");
        String expected = "incorrect format";
        assertEquals(expected, regex.getLastName());
    }

    // EMAIL TESTS
    @Test
    public void emailCorrect()
    {
        RegEx regex = new RegEx();
        regex.setEmail("rchang615@gmail.com");
        String expected = "rchang615@gmail.com";
        assertEquals(expected, regex.getEmail());
    }

    @Test
    public void emailWrongNS() // no symbol
    {
        RegEx regex = new RegEx();
        regex.setEmail("rchang615gmail.com");
        String expected = "incorrect format";
        assertEquals(expected, regex.getEmail());
    }

    @Test
    public void emailWrongNC() // no dot and ending
    {
        RegEx regex = new RegEx();
        regex.setEmail("rchang615@gmail");
        String expected = "incorrect format";
        assertEquals(expected, regex.getEmail());
    }

    @Test
    public void emailWrongOS() // other symbol
    {
        RegEx regex = new RegEx();
        regex.setEmail("rchang615$gmail.com");
        String expected = "incorrect format";
        assertEquals(expected, regex.getEmail());
    }

    @Test
    public void emailWrongNSON() // no symbol or name
    {
        RegEx regex = new RegEx();
        regex.setEmail("gmail.com");
        String expected = "incorrect format";
        assertEquals(expected, regex.getEmail());
    }

    // AGE TESTS
    @Test
    public void ageCorrect() // no dot and ending
    {
        RegEx regex = new RegEx();
        regex.setAge("16");
        String expected = "16";
        assertEquals(expected, regex.getAge());
    }

    @Test
    public void ageWrongWW() // with a word
    {
        RegEx regex = new RegEx();
        regex.setAge("6teen");
        String expected = "incorrect format";
        assertEquals(expected, regex.getAge());
    }

    @Test
    public void ageWrongL() // letters
    {
        RegEx regex = new RegEx();
        regex.setAge("sixteen");
        String expected = "incorrect format";
        assertEquals(expected, regex.getAge());
    }

    @Test
    public void ageWrongWD() // with decimal
    {
        RegEx regex = new RegEx();
        regex.setAge("16.5");
        String expected = "incorrect format";
        assertEquals(expected, regex.getAge());
    }

    @Test
    public void ageWrongWS() // with symbol
    {
        RegEx regex = new RegEx();
        regex.setAge("*16");
        String expected = "incorrect format";
        assertEquals(expected, regex.getAge());
    }

    // GENDER TESTS
    @Test
    public void genderCorrect()
    {
        RegEx regex = new RegEx();
        regex.setGender("female");
        String expected = "female";
        assertEquals(expected, regex.getGender());
    }

    @Test
    public void genderWrongNA() // not available option
    {
        RegEx regex = new RegEx();
        regex.setGender("alien");
        String expected = "incorrect format";
        assertEquals(expected, regex.getGender());
    }

    @Test
    public void genderWrongD() // dash
    {
        RegEx regex = new RegEx();
        regex.setGender("fe-male");
        String expected = "incorrect format";
        assertEquals(expected, regex.getGender());
    }

    @Test
    public void genderWrongN() // numbers
    {
        RegEx regex = new RegEx();
        regex.setGender("f3m413");
        String expected = "incorrect format";
        assertEquals(expected, regex.getGender());
    }

    @Test
    public void genderWrongNA2() // not available option
    {
        RegEx regex = new RegEx();
        regex.setGender("no");
        String expected = "incorrect format";
        assertEquals(expected, regex.getGender());
    }

    // SALARY TESTS
    @Test
    public void salaryCorrect()
    {
        RegEx regex = new RegEx();
        regex.setSalary("$2000");
        String expected = "$2000";
        assertEquals(expected, regex.getSalary());
    }

    @Test
    public void salaryWrongNDS() // no dollar sign
    {
        RegEx regex = new RegEx();
        regex.setSalary("2000");
        String expected = "incorrect format";
        assertEquals(expected, regex.getSalary());
    }

    @Test
    public void salaryWrongL() // letters
    {
        RegEx regex = new RegEx();
        regex.setSalary("n/a");
        String expected = "incorrect format";
        assertEquals(expected, regex.getSalary());
    }

    @Test
    public void salaryWrongDS() // different symbol
    {
        RegEx regex = new RegEx();
        regex.setSalary("#2000");
        String expected = "incorrect format";
        assertEquals(expected, regex.getSalary());
    }

    @Test
    public void salaryWrongWL() // with letters
    {
        RegEx regex = new RegEx();
        regex.setSalary("$zero");
        String expected = "incorrect format";
        assertEquals(expected, regex.getSalary());
    }
}
