File file = new File("/opt/jenkins/workspace/UploadFileArtifact/FileUpload.rtf")
      
def lines = file.readLines()
     
lines.each { String line ->
  println line
}
