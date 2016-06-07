File theDir = new File(envVars.get('WORKSPACE'))
println theDir.exists()

File file = new File("FileUpload.rtf")
      
def lines = file.readLines()
     
lines.each { String line ->
  println line
}
