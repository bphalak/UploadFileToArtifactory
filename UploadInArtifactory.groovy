import jenkins.*
import jenkins.model.*
import hudson.*
import hudson.model.*

def build = Thread.currentThread().executable
println build.workspace.toString()
println System.getenv("PATH")

FileReader file = new FileReader("/FileUpload.txt")
      
def lines = file.readLine()
     
lines.each { String line ->
  println line
}
