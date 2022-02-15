package mediatorpattern

import java.util.*

class ChatRoom {
    companion object {
        fun showMessage(user: User, message: String) {
            val date = Date().toString()
            println("$date  ${user.name}: $message")
        }
    }
}

