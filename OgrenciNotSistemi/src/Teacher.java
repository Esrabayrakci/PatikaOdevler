public class Teacher {
    String name;
    String mpno;
    String branch;

    public Teacher(String name, String mpno, String branch) {
        this.branch = branch;
        this.mpno = mpno;
        this.name = name;
    }

    public void print() {
        System.out.println("Name\t:" + this.name);
        System.out.println("Phone number\t:" + this.mpno);
        System.out.println("Branch\t:" + this.branch);
    }
}
