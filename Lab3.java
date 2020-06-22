/*
Write a Student class with two data fields and appropriate types and permissions
studentNamegrade

Write a 0 argument (default) constructor setting the data fields to David and 99.9 by default

Write appropriate accessors and mutators for both data fields

Write a StudentRunner class to test and display your Student

Run all of the accessors to print the data, then call all of the mutators and print the new data.
You do not need a Scanner (you can change the values to your name, and the grade you hope to get in the course.)
*/

public class Student {
    private String studentName;
    private Double studentGrade;

    public Student()
    {
        studentName="David";
        studentGrade=99.9;
    }
    public Student(String studentName)
    {
        this();
        this.studentName=studentName;
    }

    public Student(Double studentGrade)
    {
        this();
        this.studentGrade=studentGrade;
    }

    public Student(String studentName, Double studentGrade)
    {
        this.studentName=studentName;
        this.studentGrade=studentGrade;
    }

    public void setName(String studentName)
    {
        this.studentName=studentName;
    }
    public String getName()
    {
        return studentName;
    }

    public void setGrade(Double studentGrade)
    {
        this.studentGrade=studentGrade;
    }
    public Double getGrade()
    {
        return studentGrade;
    }
    
    public void getAssessment()
    {
        if(studentGrade<=49)
        {
            System.out.println(studentName +" fails with grade - F ");
        }
        else if(studentGrade>=50 && studentGrade<=59)
        {
            System.out.println(studentName +" passes with grade - D ");
        }
        else if(studentGrade>=60 && studentGrade<=69)
        {
            System.out.println(studentName +" passes with grade - C ");
        }
        else if(studentGrade>=70 && studentGrade<=79)
        {
            System.out.println(studentName +" passes with grade - B ");
        }
        else if(studentGrade>=80 && studentGrade<=100)
        {
            System.out.println(studentName +" passes with grade - A ");
        }

    }
}






class StudentRunner {

    public static void main(String[] args)
    {
        //  BY DEFAULT
        Student s1=new Student();
        System.out.println("NAME - "+s1.getName());
        System.out.println("MARKS - "+s1.getGrade());
        assessment(s1);
        System.out.println();

        // BY CONSTRUCTOR
        Student s2=new Student("JOHN",63.0);
        System.out.println("NAME - "+s2.getName());
        System.out.println("MARKS - "+s2.getGrade());
        assessment(s2);
        System.out.println();

        Student s3=new Student("BHARTI");
        System.out.println("NAME - "+s3.getName());
        System.out.println("MARKS - "+s3.getGrade());
        assessment(s3);
        System.out.println();

        Student s4=new Student(79.0);
        System.out.println("NAME - "+s4.getName());
        System.out.println("MARKS - "+s4.getGrade());
        assessment(s4);
        System.out.println();

        // BY FUNCTIONS
        Student s5=new Student();
        s5.setName("KANE");
        s5.setGrade(47.3);
        System.out.println("NAME - "+s5.getName());
        System.out.println("MARKS - "+s5.getGrade());
        assessment(s5);
        System.out.println();

        Student s6=new Student();
        s6.setName("EDGE");
        s6.setGrade(51.7);
        System.out.println("NAME - "+s6.getName());
        System.out.println("MARKS - "+s6.getGrade());
        assessment(s6);
        System.out.println();

    }
    
   public static void assessment(Student object)
    {

        object.getAssessment();

    }
}
