File theDir = new File(envVars.get('WORKSPACE'))
println theDir.exists()

File file = new File("theDir+"\\FileUpload.rtf")
      
def lines = file.readLines()
     
lines.each { String line ->
  println line
}
