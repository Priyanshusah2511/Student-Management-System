public class Student {
    private String id;
    private String name;
    private int age;
    private String dept;
    private double cgpa;

    public Student(String id, String name, int age, String dept, double cgpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.cgpa = cgpa;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDept() { return dept; }
    public double getCgpa() { return cgpa; }

    @Override
    public String toString() {
        return id + "," + name + "," + age + "," + dept + "," + cgpa;
    }

    public static Student fromString(String line) {
        String[] parts = line.split(",");
        return new Student(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3], Double.parseDouble(parts[4]));
    }
}
