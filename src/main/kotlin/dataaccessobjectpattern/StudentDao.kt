package dataaccessobjectpattern

interface StudentDao {
    fun getAllStudents(): List<Student>
    fun getStudent(rollNo: Int): Student
    fun updateStudent(student: Student)
    fun deleteStudent(student: Student)
}

