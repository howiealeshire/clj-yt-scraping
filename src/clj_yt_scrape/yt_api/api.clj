(ns clj-yt-scrape.yt-api.api
  (:require [clj-http.client :as client]))




(def search-request-base-url (str "https://www.googleapis.com/youtube/v3/search?"))
(def video-request-base-url (str "https://www.googleapis.com/youtube/v3/videos?"))
(def channel-request-base-url (str "https://www.googleapis.com/youtube/v3/channels?"))


(defn get-yt-api-url
  "Generate a valid url string to be used for a GET request"
  [template-url {:keys [key val] :as query-params}]
  (client/get template-url {:query-params query-params :as :json}))


(defn get-yt-api-url-and-paginate
  [url params]
  (loop [a 0
         acc []
         m (get-yt-api-url url params)]
    (if (= a 3)
      acc
      (recur (inc a)
             (conj acc m)
             (get-yt-api-url url (assoc params :pageToken  (:nextPageToken m)))))))