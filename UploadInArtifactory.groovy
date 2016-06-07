import jenkins.*
import jenkins.model.*
import hudson.*
import hudson.model.*

def build = Thread.currentThread().executable
println build.workspace.toString()

FileReader theDir = new FileReader(build.workspace.toString())
println theDir.exists()

File FileReader = new FileReader(build.workspace.toString()+"/FileUpload.txt")
println theDir1.exists()

File FileReader = new FileReader(build.workspace.toString()+"/FileUpload.txt")
      
def lines = file.readLine()
     
lines.each { String line ->
  println line
}
