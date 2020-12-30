(ns clj-yt-scrape.yt-api.constructed-api-requests
  (:require [clj-yt-scrape.yt-api.api :refer :all]
            [clj-yt-scrape.yt-api.api-params :refer :all]
            [clojure.data :refer :all]
            [clj-http.client :as client]))





(defn get-most-popular-vids-by-region []
  (client/get video-request-base-url {:query-params (most-popular-vid-by-region-params 1 "US") :as :json}))

(defn get-most-popular-vids-by-category []
  (client/get video-request-base-url {:query-params (most-popular-vids-by-category-params 1 "UC_x5XG1OV2P6uZZ5FSM9Ttw")  :as :json}))

(defn get-most-popular-channels-by-query []
  (client/get search-request-base-url {:query-params (most-popular-channels-by-query-params "test")  :as :json}))

(defn get-channel-from-channel-id []
  (client/get channel-request-base-url {:query-params (channel-from-channel-id-params 1 "UC_x5XG1OV2P6uZZ5FSM9Ttw")  :as :json}))
