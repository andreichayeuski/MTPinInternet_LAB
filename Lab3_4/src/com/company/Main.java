package com.company;
import by.belstu.it.Chayeuski.Course.Course;
import by.belstu.it.Chayeuski.Dean.Dean;
import by.belstu.it.Chayeuski.Enum.Specialization;
import by.belstu.it.Chayeuski.Student.Student;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.xml.DOMConfigurator;

public class Main {
    static {
        new DOMConfigurator().doConfigure("log/log4j.xml",
                LogManager.getLoggerRepository());
    }

    private static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args) {
	try
    {
        LOG.info("Starting program_______________________");
        LOG.info("Create Dean(singleton)");
        Dean DVShiman = Dean.getInstance();
        LOG.info("Create first(Course) by FactoryMethod");
        Course students = DVShiman.FactoryMethod("All students");
        LOG.info("Create and add students to course");
        Student Andrei      = new Student("Andrei",2, Specialization.ITS, 8);
        Student Yaroslav    = new Student("Yaroslav",2, Specialization.ITS, 7.6);
        Student Dima        = new Student("Dmitriy",2, Specialization.ISaT, 8.2);
        Student Igor        = new Student("Igor",1, Specialization.ITS, 7);
        Student Vadim       = new Student("Vadim",1, Specialization.ITS, 6);
        students.AddStudent(Andrei);
        students.AddStudent(Yaroslav);
        students.AddStudent(Dima);
        students.AddStudent(Igor);
        students.AddStudent(Vadim);
        LOG.info("Counter of courses");
        DVShiman.CountCourses(students);

        Course second_course = DVShiman.FactoryMethod("Second course");
        DVShiman.CreateCourseByNumberOfCourse(students, second_course, 2);
        for (int i = 0; i < second_course.GetMyCourse().size(); i++) {
            System.out.println(i + ") " + second_course.GetStudByID(i).getName());
        }
        System.out.println();
        for (int i = 0; i < students.GetMyCourse().size(); i++) {
            System.out.println(i + ") " + students.GetStudByID(i).getName());
        }
        LOG.info("Sorting by name");
        DVShiman.SortByName(students);
        System.out.println();
        for (int i = 0; i < students.GetMyCourse().size(); i++) {
            System.out.println(i + ") " + students.GetStudByID(i).getName());
        }

        DVShiman.SortByMark(students);
        System.out.println();
        for (int i = 0; i < students.GetMyCourse().size(); i++) {
            System.out.println(i + ") " + students.GetStudByID(i).getName());
        }
        LOG.info("End Program___________");
    }
    catch (NullPointerException e) {
        System.out.println(e.getMessage());
    }
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e.getMessage());
    }
    }
}
