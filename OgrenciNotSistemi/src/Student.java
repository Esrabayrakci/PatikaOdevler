public class Student {
    // Sözlü notunun ortalamaya etkisi %20 dir;
    Course c1;
    Course c2;
    Course c3;
    Course o1;
    Course o2;
    Course o3;
    String name;
    String stuNo;
    String classes;
    double oralNote;
    double examNote;
    double oNoteC;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.00;
        this.isPass = false;
        this.oNoteC = 0.2;
        this.oralNote = 0.0;
        this.examNote = 0.0;
    }

    public void adBUlkExamNote(int n1, int n2, int n3) {
        if (c1.note >= 0 && c1.note <= 100) {
            c1.note = n1;
        }
        if (c2.note >= 0 && c2.note <= 100) {
            c2.note = n2;
        }
        if (c3.note >= 0 && c3.note <= 100) {
            c3.note = n3;
        }
    }

    public void adBUlkOralNote(int o1, int o2, int o3) {
        if (c1.oralNote >= 0 && c1.oralNote <= 100) {
            c1.oralNote = o1;
        }
        if (c2.oralNote >= 0 && c2.oralNote <= 100) {
            c2.oralNote = o2;
        }
        if (c3.oralNote >= 0 && c3.oralNote <= 100) {
            c3.oralNote = o3;
        }
    }

    public void calculusAverage() {
        this.oralNote = (c1.oralNote + c2.oralNote + c3.oralNote) * oNoteC;
        this.examNote = (c1.note + c2.note + c3.note) * (1 - oNoteC);
        this.average = (oralNote + examNote) / 3.0;
    }

    public void isPass() {
        if (average > 55) {
            isPass = true;
        } else isPass = false;
        if (isPass) {
            System.out.println("Tebrikler geçtiniz!");
        } else System.out.println("Maalesef kaldınız!");
    }


    public void printNote() {
        System.out.println(c1.name + " note:" + c1.note);
        System.out.println(c2.name + " note:" + c2.note);
        System.out.println(c3.name + " note:" + c3.note);
        System.out.println("Ortalamanız:" + this.average);
    }
}
