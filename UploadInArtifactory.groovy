def build = Thread.currentThread().executable
println build.workspace.toString()

File file = new File(build.workspace.toString()+"FileUpload.rtf")
      
def lines = file.readLines()
     
lines.each { String line ->
  println line
}
