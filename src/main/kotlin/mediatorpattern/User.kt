package mediatorpattern

//class User(private var name: String) {
//
//
//    fun setName(name: String)  {
//        this.name = name
//    }
//
//    fun sendMessage(message: String) {
//        ChatRoom.showMessage(this, message)
//    }
//
//}

class User(var name: String) {

    fun sendMessage(message: String?) {
        ChatRoom.showMessage(this, message!!)
    }
}