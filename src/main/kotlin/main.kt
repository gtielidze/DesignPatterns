import MVCpattern.MVCPatternDemo
import abstractfactorypattern.FactoryProducer
import abstractfactorypattern.Shape
import adapterpattern.AudioPlayer
import bridgepattern.Circle
import bridgepattern.GreenCircle
import bridgepattern.RedCircle
import builderpattern.MealBuilder
import businessdelegatepattern.BusinessDelegate
import businessdelegatepattern.Client
import chainofresponsibilitypattern.AbstractLogger
import chainofresponsibilitypattern.ChainPatternDemo
import commandpattern.BayStock
import commandpattern.Broker
import commandpattern.SellStock
import commandpattern.Stock
import compositepattern.Employee
import dataaccessobjectpattern.StudentDao
import dataaccessobjectpattern.StudentDaoImpl
import decoratorpattern.RedShapeDecorator
import facadepattern.ShapeMaker
import factorypattern.ShapeFactory
import filterpattern.*
import flyweightpattern.FlyweightPatternDemo
import frontcontrollerpattern.FrontController
import interceptingfilterpattern.AuthenticationFilter
import interceptingfilterpattern.DebugFilter
import interceptingfilterpattern.FilterManager
import interceptingfilterpattern.Target
import interpreterpattern.Interpret
import iteratorpattern.NameRepository
import mediatorpattern.User
import mementopattern.CareTake
import mementopattern.Originator
import nullobjectpattern.CustomerFactory
import observerpattern.BinaryObserver
import observerpattern.HexObserver
import observerpattern.OctalObserver
import observerpattern.Subject
import prototypepattern.ShapeCache
import proxypattern.ProxyImage
import servicelocatorpattern.ServiceLocator
import singleton.SingleObject
import statepattern.Context
import statepattern.StartState
import statepattern.StopState
import strategypattern.OperationAdd
import strategypattern.OperationDivide
import strategypattern.OperationMultiply
import strategypattern.OperationSubtract
import templatepattern.Cricket
import templatepattern.Football
import templatepattern.Game
import transferobjectpattern.StudentBO
import visitorpattern.Computer
import visitorpattern.ComputerPartDisplayVisitor


fun main() {

    factoryPattern()
    abstractFactoryPattern()
    singletonPattern()
    builderPattern()
    prototypePattern()
    adapterPattern()
    bridgePattern()
    filterPattern()
    compositePattern()
    decoratorPattern()
    facadePattern()
    flyweightPattern()
    proxyPattern()
    chainOfResponsibility()
    commandPattern()
    interpreterPattern()
    iteratorPattern()
    mediatorPattern()
    mementoPattern()
    observerPattern()
    statePattern()
    nullPattern()
    strategyPattern()
    templatePattern()
    visitorPattern()
    mvcPattern()
    businessDelegatePattern()
    compositeEntityPattern()
    dataAccessObjectPattern()
    frontControllerPattern()
    interceptingFilterPattern()
    serviceLocatorPattern()
    transferObjectPattern()
}


fun factoryPattern() {
    val shapeFactory = ShapeFactory()

    val circle = shapeFactory.getShape("CIRCLE")
    circle?.draw()

    val rectangle = shapeFactory.getShape("RECTANGLE")
    rectangle?.draw()

    val square = shapeFactory.getShape("SQUARE")
    square?.draw()
}

fun abstractFactoryPattern() {
    val ordinaryShapeFactory = FactoryProducer.getFactory(false)
    val rectangle: Shape? = ordinaryShapeFactory.getShape("rectangle")
    rectangle?.draw()
    val square: Shape? = ordinaryShapeFactory.getShape("square")
    square?.draw()

    val roundedShapeFactory = FactoryProducer.getFactory(true)
    val roundedRectangle = roundedShapeFactory.getShape("roundedrectangle")
    roundedRectangle?.draw()
    val roundedSquare = roundedShapeFactory.getShape("roundedsquare")
    roundedSquare?.draw()

}

fun singletonPattern() {
    SingleObject.printName()
    SingleObject.name = "new name"
    SingleObject.printName()
}

fun builderPattern() {
    val mealBuilder = MealBuilder()
    val vegMeal = mealBuilder.prepareVegMeal()
    println("Veg Meal")
    vegMeal.showItems()
    println("Total Cost: " + vegMeal.cost)

    val nonVegMeal = mealBuilder.prepareNonVegMeal()
    println("\n\nNon-veg Meal")
    nonVegMeal.showItems()
    println("Total Cost: " + nonVegMeal.cost)
}

fun prototypePattern() {
    ShapeCache.loadCache()

    val clonedCircle = ShapeCache.getShape("1")
    println("Shape: " + clonedCircle.type)

    val clonedSquare = ShapeCache.getShape("2")
    println("Shape: " + clonedSquare.type)

    val clonedRectangle = ShapeCache.getShape("3")
    println("Shape: " + clonedRectangle.type)

}

fun adapterPattern() {
    val audioPlayer = AudioPlayer()
    audioPlayer.play("mp3", "we are a champions")
    audioPlayer.play("mp4", "wish you were here")
    audioPlayer.play("vlc", "deutschland")
    audioPlayer.play("avi", "9th symphony")
}


fun bridgePattern() {
    val redCircle = Circle(100, 100, 10, RedCircle())
    val greenCircle = Circle(100, 100, 10, GreenCircle())
    redCircle.draw()
    greenCircle.draw()
}

fun filterPattern() {
    val persons: MutableList<Person> = ArrayList()

    persons.add(Person("Robert", "Male", "Single"))
    persons.add(Person("John", "Male", "Married"))
    persons.add(Person("Laura", "Female", "Married"))
    persons.add(Person("Diana", "Female", "Single"))
    persons.add(Person("Mike", "Male", "Single"))
    persons.add(Person("Bobby", "Male", "Single"))

    val male: Criteria = CriteriaMale()
    val female: Criteria = CriteriaFemale()
    val single: Criteria = CriteriaSingle()
    val singleMale: Criteria = AndCriteria(single, male)
    val singleOrFemale: Criteria = OrCriteria(single, female)

    println("Males: ")
    PrintPersons.printPersons(male.meetCriteria(persons))

    println("\nFemales: ")
    PrintPersons.printPersons(female.meetCriteria(persons))

    println("\nSingle Males: ")
    PrintPersons.printPersons(singleMale.meetCriteria(persons))

    println("\nSingle Or Female")
    PrintPersons.printPersons(singleOrFemale.meetCriteria(persons))

}

fun compositePattern() {
    val CEO = Employee("John", "CEO", 30000)
    val headSales = Employee("Robert", "Head Sales", 20000)
    val headMarketing = Employee("Michel", "Head Marketing", 20000)
    val clerk = Employee("Laura", "Marketing", 10000)
    val clerk1 = Employee("Bob", "Marketing", 10000)
    val salesExecutive = Employee("Richard", "Sales", 10000)
    val salesExecutive1 = Employee("Rob", "Sales", 10000)

    CEO.add(headMarketing)
    CEO.add(headSales)

    headSales.add(salesExecutive)
    headSales.add(salesExecutive1)

    headMarketing.add(clerk)
    headMarketing.add(clerk1)

    println(CEO)
    for (headEmployee in CEO.getSubordinates()) {
        println(headEmployee)
        for (employee in headEmployee.getSubordinates()) {
            println(employee)
        }
    }

}


fun decoratorPattern() {
    val circle: decoratorpattern.Shape = decoratorpattern.Circle()
    val redCircle: decoratorpattern.Shape = RedShapeDecorator(decoratorpattern.Circle())
    val redRectangle: decoratorpattern.Shape = RedShapeDecorator(decoratorpattern.Rectangle())

    println("Circle with normal border")
    circle.draw()

    println("Circle or red border")
    redCircle.draw()

    println("Rectangle of red border")
    redRectangle.draw()

}

fun facadePattern() {
    val shapeMaker = ShapeMaker()

    shapeMaker.drawCircle()
    shapeMaker.drawRectangle()
    shapeMaker.drawSquare()
}

fun flyweightPattern() {
    val flyweightPatternDemo = FlyweightPatternDemo()
    flyweightPatternDemo.getObjects()
}

fun proxyPattern() {
    val image: proxypattern.Image = ProxyImage("test_10mb.jpg")
    image.display()
    println("")

    image.display()
}

fun chainOfResponsibility() {
    val loggerChain = ChainPatternDemo.getChainOfLoggers()
    loggerChain.logMessage(AbstractLogger.INFO, "This is information")
    loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level Information.")
    loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.")

}

fun commandPattern() {
    val abcStock = Stock()

    val bayStockOrder = BayStock(abcStock)
    val sellStockOrder = SellStock(abcStock)

    val broker = Broker()
    broker.takeOrder(bayStockOrder)
    broker.takeOrder(sellStockOrder)

    broker.placeOrder()

}

fun interpreterPattern() {
    val isMale = Interpret.getOrExpression()
    val isMarried = Interpret.getAndExpression()

    println("John is Male? ${isMale.interpret("John")}")
    println("Julie is a married women? ${isMarried.interpret("Married Julie")}")
}

fun iteratorPattern() {
    val namesRepository = NameRepository()
    val iter = namesRepository.getIterator()
    while (iter.hasNext()) {
        val name = iter.next()
        println("Name: $name")
    }
}

fun mediatorPattern() {
    val robert = User("Robert")
    val john = User("John")

    robert.sendMessage("Hi, John")
    john.sendMessage("Hello, Robert")
}

fun mementoPattern() {
    val originator = Originator()
    val careTaker = CareTake()

    originator.state = "State #1"
    originator.state = "State #2"
    careTaker.add(originator.saveStateToMemento())

    originator.state = "State #3"
    careTaker.add(originator.saveStateToMemento())

    originator.state = "State #4"
    println("Current State ${originator.state}")

    originator.getStateFromMemento(careTaker.getMementoFromList(0))
    println("First saved State ${originator.state}")
    originator.getStateFromMemento(careTaker.getMementoFromList(1))
    println("Second saved State ${originator.state}")


}

fun observerPattern() {
    val subject = Subject()

    val hexObserver = HexObserver(subject)
    val octalObserver = OctalObserver(subject)
    val binaryObserver = BinaryObserver(subject)

    println("First state change: 15")
    subject.state = 15
    println("Second state change: 10")
    subject.state = 10
}

fun statePattern() {
    val context = Context()

    val startState = StartState()
    startState.doAction(context)
    println(context.state.toString())

    println()

    val stopState = StopState()
    stopState.doAction(context)
    println(context.state.toString())
}

fun nullPattern() {
    val customer1 = CustomerFactory.getCustomer("Rob")
    val customer2 = CustomerFactory.getCustomer("Bob")
    val customer3 = CustomerFactory.getCustomer("Julie")
    val customer4 = CustomerFactory.getCustomer("Laure")
    println("Customers")
    println(customer1.name)
    println(customer2.name)
    println(customer3.name)
    println(customer4.name)
}

fun strategyPattern() {
    var context = strategypattern.Context(OperationAdd())
    println("10 + 5 = ${context.executeStrategy(10, 5)}")

    context = strategypattern.Context(OperationDivide())
    println("10 / 5 = ${context.executeStrategy(10, 5)}")

    context = strategypattern.Context(OperationMultiply())
    println("10 * 5 = ${context.executeStrategy(10, 5)}")

    context = strategypattern.Context(OperationSubtract())
    println("10 - 5 = ${context.executeStrategy(10, 5)}")


}

fun templatePattern() {
    var game: Game = Cricket()
    game.play()
    println()
    game = Football()
    game.play()
}

fun visitorPattern() {
    val computer = Computer()
    computer.accept(ComputerPartDisplayVisitor())
}

fun mvcPattern() {
    MVCPatternDemo.update()
}

fun businessDelegatePattern() {
    val businessDelegate = BusinessDelegate()
    businessDelegate.setServiceType("EJB")

    val client = Client(businessDelegate)
    client.doTask()

    businessDelegate.setServiceType("EJB")
    client.doTask()
}

fun compositeEntityPattern() {
    val client = compositeentitypattern.Client()
    client.setData("Test", "Data")
    client.printData()
    client.setData("Second Test", "DataOne")
    client.printData()

}

fun dataAccessObjectPattern() {

    val studentDao: StudentDao = StudentDaoImpl()
    for (student in studentDao.getAllStudents()) {
        println("Student: [RollNo: ${student.rollNo}, Name: ${student.name}]")
    }

    val student = studentDao.getAllStudents()[0]
    student.name = "Michel"
    studentDao.updateStudent(student)

    studentDao.getStudent(0)
    println("Student: [RollNo: ${student.rollNo}, Name: ${student.name}]")

}

fun frontControllerPattern() {
    val frontController = FrontController()
    frontController.dispatchRequest("Home")
    frontController.dispatchRequest("Student")

}

fun interceptingFilterPattern() {

    val filterManager = FilterManager(Target())
    filterManager.setFilter(AuthenticationFilter())
    filterManager.setFilter(DebugFilter())

    val client = interceptingfilterpattern.Client()
    client.setFilterManager(filterManager)
    client.sendRequest("HOME")
}

fun serviceLocatorPattern() {
    var service = ServiceLocator.getService("Service1")
    service.execute()
    service = ServiceLocator.getService("Service2")
    service.execute()
    service = ServiceLocator.getService("Service1")
    service.execute()
    service = ServiceLocator.getService("Service2")
    service.execute()
}

fun transferObjectPattern() {
    val studentBusinessObject = StudentBO()

    for (student in studentBusinessObject.getAllStudents()) {
        println("Student: [rolNo ${student.rollNo}, Name: ${student.name}]")
    }

    var student = studentBusinessObject.getAllStudents()[0]
    student.name = "Michael"
    studentBusinessObject.updateStudent(student)

    student = studentBusinessObject.getAllStudents()[0]
    println("Student: [rolNo ${student.rollNo}, Name: ${student.name}]")

}