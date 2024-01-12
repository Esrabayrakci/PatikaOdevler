
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Eren", "3333", "TRH");
        Teacher t2 = new Teacher("Nazan","88888","FZK");
        Teacher t3= new Teacher("Feridun","44444","TRK");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.teacher = t1;
        Course fizik = new Course("Fizik","222","FZK");
        fizik.teacher = t2;
        Course turkce = new Course("Türkçe","333","TRK");
        turkce.teacher = t3;

        Student student = new Student("Büşra","1","2",tarih,fizik,turkce);


        student.adBUlkExamNote(55,55,55);
        student.adBUlkOralNote(100,100,100);
        student.calculusAverage();
        student.isPass();
        student.printNote();





    }
}