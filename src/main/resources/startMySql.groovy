import org.apache.maven.project.MavenProject
import org.testcontainers.containers.MySQLContainer

println "Starting MySQLContainer"
MavenProject project = project

def db = new MySQLContainer("${dockerImage}")
db.start()

println "MySQLContainer started with JDBC URL: " + db.getJdbcUrl()

// set jdbc url during compile time since container gets a random port assigned
project.properties.setProperty('mysql.db.url', db.getJdbcUrl())
project.properties.setProperty('mysql.db.username', db.getUsername())
project.properties.setProperty('mysql.db.password', db.getPassword())

// Store containerId to
project.properties.setProperty('mysql.testcontainer.containerId', db.getContainerId())
project.properties.setProperty('mysql.testcontainer.imageName', db.getDockerImageName())
