import org.apache.catalina.startup.Tomcat
import java.io.File

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val tomcat = Tomcat().apply {
                setPort(8080)
                addWebapp("/", File("src/main/myapp").absolutePath)
                connector
            }
            tomcat.start()

            tomcat.server.await()
        }
    }
}