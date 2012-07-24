(defproject lein-doc-pdf-test "1.0.0^S"
  :description "Lein plugin for PDF generation"
  :dependencies [
                   ; main clojure library
                   [org.clojure/clojure "1.2.1"]
  ]
  :doc-pdf {
    :changes {
        :input-files "CHANGES.textile"
        :output-file "changes.pdf"
        :style "style/changes.jar"
        :fonts-folder "fonts"
    }
  }
  :dev-dependencies [
                     [lein-doc-pdf "1.0.8"]
                     [lein-eclipse "1.0.0"]] ) 