import org.apache.maven.project.MavenProject
import org.testcontainers.containers.PostgreSQLContainer

println "Starting PostgreSQLContainer"
MavenProject project = project

def db = new PostgreSQLContainer("${dockerImage}")
db.start()

println "PostgreSQLContainer started with JDBC URL: " + db.getJdbcUrl()

// set jdbc url during compile time since container gets a random port assigned
project.properties.setProperty('db.url', db.getJdbcUrl())
project.properties.setProperty('db.username', db.getUsername())
project.properties.setProperty('db.password', db.getPassword())

// Store containerId to
project.properties.setProperty('testcontainer.containerId', db.getContainerId())
project.properties.setProperty('testcontainer.imageName', db.getDockerImageName())
