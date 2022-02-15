package MVCpattern

class StudentController(var model: Student, val view: StudentView) {
    fun setStudentName(name: String) {
        this.model.name = name
    }

    fun getStudentName(): String? {
        return model.name
    }

    fun setStudentRollNo(rollNo: String) {
        model.rollNo = rollNo
    }

    fun getStudentRollNo(): String? {
        return model.rollNo
    }
    fun updateView() {
        view.printStudentDetails(model.name, model.rollNo)
    }
}

