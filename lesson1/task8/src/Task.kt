fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
){
    if (client != null && message != null) {
        val personalInfo: PersonalInfo? = client.personalInfo
        val email = personalInfo?.email
        email?.let { mailer.sendMessage(it, message) }
    }
}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}