import org.testcontainers.DockerClientFactory

println "StopSQLContainer"
try {
    containerId = "${containerId}"
    println("Stopping sql testcontainer ${containerId}")
    DockerClientFactory.instance().client().stopContainerCmd(containerId).exec()
} catch (Exception ex) {
    println("Exception stopping sql testcontainer")
    ex.printStackTrace()
}
