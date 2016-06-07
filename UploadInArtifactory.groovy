File file = new File("/home/UploadFileArtifact/FileUpload.rtf")
      
def lines = file.readLines()
     
lines.each { String line ->
  println line
}
