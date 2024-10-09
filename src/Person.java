public abstract class Person {
    String FirstName;
    String LastName;
    int DepartmentCode;

    public Person(String FirstName, String LastName,int DepartmentCode){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DepartmentCode = DepartmentCode;
    }

    public String toString()
    {
        return this.FirstName + " " + this.LastName + " " + this.DepartmentCode;
    }
}
