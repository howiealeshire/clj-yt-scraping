(defproject my-stuff "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "https://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "https://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-http "3.11.0"]
                 [meander/epsilon "0.0.588"]
                 [org.clojure/test.check "1.1.0"]
                 [cheshire "5.10.0"]
                 ]
  :main ^:skip-aot clj-yt-scrape.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
