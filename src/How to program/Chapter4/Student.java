public class Student {

    private String name;
    private double average;

    //Constructor to intialize the instance variables
    public Student (String name , double average)
    {
        this.name = name;
        
        //Validate that the average <=100 and > 0
        if (average > 0.0)
        {
            if(average <= 100.0 )
            {
                this.average = average;
            }
        }
    }


    //Setname
    public void setName(String name)
    {
        this.name = name;
    }
    //Getname
    public String getName()
    {
        return name;
    }

    
    //set average
    public void setAverage (double average)
    {
        if (average > 0.0 )
        {
            if (average <=100.0)
            {
                this.average = average;
            }
        }
    }
    //Get average
    public double getAverage()
    {
        return average;
    }

    
    //Method to get the letter grade
    public String getLetterGrade()
    {
        String letterGrade = " ";
        if (average >= 90)
        {
            letterGrade = "A";
        }
        else if (average >=80)
        {
            letterGrade = "B";
        }
        else if (average >= 70)
        {
            letterGrade = "C";
        }
        else if (average >= 60)
        {
            letterGrade = "D";
        }
        else 
        {
            letterGrade = "F";
        }

        return letterGrade;
    }


    
}
