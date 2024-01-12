public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int oralNote;

    Course(String name, String code, String prefix) {
        this.code = code;
        this.name = name;
        this.prefix = prefix;
        this.note = 0;
        this.oralNote = 0;

    }
    public void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else System.out.println("Öğretmen ve ders bölümleri uyuşmuyor");
    }
    public void printTeacherInfo(){
        this.teacher.print();
    }

}
