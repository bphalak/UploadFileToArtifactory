def build = Thread.currentThread().executable
println build.workspace.toString()

File file = new File("FileUpload.rtf")
      
def lines = file.readLines()
     
lines.each { String line ->
  println line
}
