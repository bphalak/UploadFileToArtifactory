File file = new File("/home/FileUpload.rtf")
      
def lines = file.readLines()
     
lines.each { String line ->
  println line
}
