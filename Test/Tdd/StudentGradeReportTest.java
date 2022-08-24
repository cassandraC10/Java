package Tdd;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentGradeReportTest {
//    StudentGradeReport report;
//    @BeforeEach
//    public void
    @Test
    public void SumPerStudent(){
        int[][] grades = {{90, 20},
                          {40, 40, 20},
                          {10, 50, 70, 40}};
        StudentGradeReport report = new StudentGradeReport(grades);
        assertEquals(110, report.getSumForStudent( 0));
        assertEquals(100, report.getSumForStudent( 1));
    }
    @Test
    public void StudentAverage(){
        int[][] grades = {{4, 5, 6, 3},
                {40, 40, 20},
                {10, 50, 70}};
        StudentGradeReport report = new StudentGradeReport(grades);
        assertEquals(4.5, report.getAverage( 0));
    }
//@Test
//    public void StudentPosition(){
//    int[][] grades = {{4, 5, 6, 3},
//            {40, 40, 20},
//            {10, 50, 70}};
//    StudentGradeReport report = new StudentGradeReport(grades);
//    assertEquals(3, report.getPosition( 0));
//}
}
