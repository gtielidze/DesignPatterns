package transferobjectpattern


class StudentBO {
    val students: MutableList<StudentVO> = mutableListOf()
    init {
        val student1 = StudentVO("Robert", 0)
        val student2 = StudentVO("John", 1)
        students.add(student1)
        students.add(student2)
    }
    fun deleteStudent(student: StudentVO) {
        students.removeAt(student.rollNo)
        println("Student: Roll No ${student.rollNo}, Deleted from database")
    }
    fun getAllStudents() : MutableList<StudentVO> {
        return students
    }

    fun getStudent(rollNo: Int): StudentVO {
        return students[rollNo]
    }

    fun updateStudent(student: StudentVO) {
        students[student.rollNo].name = student.name
        println("Student: Roll No ${student.rollNo} updated in the database")

    }
}

