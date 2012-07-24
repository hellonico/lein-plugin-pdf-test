(defproject lein-doc-pdf-test "1.0.0"
  :description "Lein pdf generation test"
  :dev-dependencies [[lein-doc-pdf "1.0.10"]]
  :doc-pdf {
    :changes {
        :input-files "CHANGES.textile"
        ; The filename is automatically computed, or you can specifiy it here
        ; :output-file "changes.pdf"
        :style "style/changes.jar"
        ; you can also extract the content of the jar file and use the following:
        ; :style "style"
        ; :fonts-folder "fonts"
    }    
  }
 ) 