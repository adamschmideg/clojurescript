(defproject org.clojure/clojurescript "1.0.0-SNAPSHOT"
  :description "Compile Clojure to JavaScript"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [com.google.guava/guava "10.0"]
                 [goog-jar "1.0.0"]
                 [com.google.javascript/closure-compiler "r1459"]]
  :exclusions [com.googlecode.jarjar/jarjar
               junit/junit
               org.apache.ant/ant
               org.json/json]
  :source-path "src/clj"
  :resources-path "src/cljs")
