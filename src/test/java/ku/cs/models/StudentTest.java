package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    static Student s;
    // @BeforeAll
    // like constructor will call this before 0ne time
    // special bc. it is static

//    static void init() {
//        s = new Student("6xxxxxxxx", "StudentTest");
//    }

    @BeforeEach
    void init() {
        s = new Student("6xxxxxxxx", "StudentTest");
    }

    @Test
    @DisplayName("Test Add Score")
    void testAddScore(){
        s.addScore(45);
        assertEquals(45, s.getScore());
    }

    @Test
    void testCalculateGrade(){
        s.addScore(84);
        assertEquals("A", s.grade());
    }
}