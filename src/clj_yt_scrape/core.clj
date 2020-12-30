(ns clj-yt-scrape.core
  (:require [clj-http.client :as client]
            [clojure.test :as test]
            [clojure.test.check :as tc]
            [clojure.test.check.generators :as gen]
            [clojure.test.check.properties :as prop]
            [cheshire.core :refer :all]
            [com.gfredericks.test.chuck :as chuck]
            [com.gfredericks.test.chuck.generators :as gen']
            [com.gfredericks.test.chuck.properties :as prop']
            [clojure.test :refer :all])
  (:use clj-http.fake)
  )



;(client/get channel-request-base-url {:query-params {:part ["id"] :id ["UC_x5XG1OV2P6uZZ5FSM9Ttw"] :key ["AIzaSyA5jSfrY1m1iCEbPR3zW1U3Eo_dg0ecf08"]}})

(defn hello []
  (println "Hello world!"))

(defn -main []
  (hello))
