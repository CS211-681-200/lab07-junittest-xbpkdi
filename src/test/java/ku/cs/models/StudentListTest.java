package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

//    @Test
//    void testFindStudentById() {
//        StudentList s = new StudentList();
//        s.addNewStudent("6610402132", "Bowornrat");
//        assertEquals(s.getStudents().get(0), s.findStudentById("6610402132"));
//    }

    @Test
    @DisplayName("ค้นหานักเรียนด้วย ID ที่มีอยู่")
    void testFindStudentByIdFound() {
        StudentList s = new StudentList();
        s.addNewStudent("6710451054", "Piyakorn");

        assertEquals("Piyakorn", s.findStudentById("6710451054").getName());
    }

    @Test
    @DisplayName("ค้นหานักเรียนด้วย ID ที่ไม่มีอยู่")
    void testFindStudentByIdNotFound() {
        StudentList s = new StudentList();
        s.addNewStudent("6710451054", "Piyakorn");

        assertEquals(null, s.findStudentById("1234567890"));
    }

    @Test
    @DisplayName("ให้คะแนนนักเรียนตาม ID")
    void testGiveScoreToId() {
        StudentList s = new StudentList();
        s.addNewStudent("6710451054", "Piyakorn");

        s.giveScoreToId("6710451054", 80);

        assertEquals(80, s.findStudentById("6710451054").getScore());
    }

}