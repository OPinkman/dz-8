import java.util.ArrayList;
import java.util.List;

public class Group {
    private Student leader;
    private List<Student> students = new ArrayList<>();
    private List<String> tasks = new ArrayList<>();

    public Group(Student student) {
        this.leader = student;
    }

    public void changeLeader(Student student) {
        this.leader = student;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    public void removeStudent(Student student) {
        students.remove(student);
    }
    public void renameStudent(Student student, String newName, String newSurName) {
        student.setName(newName);
        student.setSurname(newSurName);
    }

    public void addTask(String task){
        tasks.add(task);
    }


    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List getTasks() {
        return tasks;
    }

    public void setTasks(List tasks) {
        this.tasks = tasks;
    }
}

