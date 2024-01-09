package zoom;

public class Student {
    private String name;
    private Integer age;
    private Integer grade;

    private String password;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }


    public void printStudent(){
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Grade: " + this.grade);
    }
    public void promoteStudent(){
        if(this.grade == null){
            this.grade = 0;
        } else{
            this.grade++;
        }
        this.printStudent();
    }

    public void setGrade(Integer grade){
        this.grade = grade;
    }
}
