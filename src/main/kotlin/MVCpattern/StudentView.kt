package MVCpattern

class StudentView {
    fun printStudentDetails(studentName: String?, studentRollNo: String?) {
        println("Student: ")
        println("Name: $studentName")
        println("Roll No: $studentRollNo")
    }
}