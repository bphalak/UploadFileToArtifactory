File file = new File("/opt/jenkins/workspace/all_test_jobs/jenkins_test_jobs/UploadFileArtifact/FileUpload.rtf")
      
def lines = file.readLines()
     
lines.each { String line ->
  println line
}
