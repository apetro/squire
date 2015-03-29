(defproject squire "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Apache License, Version 2.0"
            :url "http://opensource.org/licenses/Apache-2.0"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot squire.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
