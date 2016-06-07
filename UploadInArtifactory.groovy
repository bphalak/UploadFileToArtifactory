import jenkins.*
import jenkins.model.*
import hudson.*
import hudson.model.*

def build = Thread.currentThread().executable
println build.workspace.toString()

File theDir = new File(build.workspace)
println theDir.exists()

File theDir1 = new File(build.workspace.toString()+"/FileUpload.rtf")
println theDir1.exists()

File file = new File(build.workspace.toString()+"/FileUpload.rtf")
      
def lines = file.readLines()
     
lines.each { String line ->
  println line
}
