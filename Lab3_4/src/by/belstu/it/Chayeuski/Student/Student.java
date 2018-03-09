package by.belstu.it.Chayeuski.Student;

import by.belstu.it.Chayeuski.Interfaces.Action;
import by.belstu.it.Chayeuski.Enum.Specialization;

public class Student implements Action {
    public Student(String pName, int pCourse, Specialization pSpecialization, double pMark) {
        this.name = pName;
        this.course = pCourse;
        this.specialization = pSpecialization;
        zch = new Zach(pMark);
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Zach zch;
    int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    Specialization specialization;

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {

        this.specialization = specialization;
    }

    @Override
    public void GoWalk() {
        System.out.println("Go walk");
    }

    @Override
    public void MissLesson() {
        System.out.println("Miss");
    }

    @Override
    public void PlayGames() {
        System.out.println("Play");
    }

    public class Zach {
        Zach(double pAver_mark) {
            aver_mark = pAver_mark;
        }

        double aver_mark;

        public void setAver_mark(double aver_mark) {
            this.aver_mark = aver_mark;
        }

        public double getAver_mark() {
            return aver_mark;
        }
    }
}