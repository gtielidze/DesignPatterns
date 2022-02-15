package MVCpattern

import java.lang.reflect.Modifier

object MVCPatternDemo {
    fun retrieveStudentFromDatabase(): Student {
        val student = Student()
        student.name = "Robert"
        student.rollNo = "10"
        return student
    }
    fun update() {
       val model = retrieveStudentFromDatabase()
       val view = StudentView()
       val controller = StudentController(model, view)
       controller.updateView()

       controller.setStudentName("john")
       controller.updateView()
    }
}