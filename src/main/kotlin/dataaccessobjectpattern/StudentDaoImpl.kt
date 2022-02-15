package dataaccessobjectpattern


class StudentDaoImpl: StudentDao {
    private var students: MutableList<Student> = ArrayList()

    init {
        val student1:Student = Student("Robert", 0)
        val student2 = Student("John", 1)
        students.add(student1)
        students.add(student2)
    }

    override fun getAllStudents(): List<Student> {
        return students
    }

    override fun getStudent(rollNo: Int): Student {
        return students[rollNo]
    }

    override fun updateStudent(student: Student) {
        students[student.rollNo].name = student.name
        println("Student: Roll No ${student.rollNo}, updated in the database")
    }

    override fun deleteStudent(student: Student) {
        students.removeAt(student.rollNo)
        println("Student: Roll No: ${student.rollNo}, deleted from database")
    }
}

