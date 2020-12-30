(ns clj-yt-scrape.yt-api.api-params)


(defn base-video-endpoint-params
  ([]
   {:part "snippet" :chart "mostPopular" }
   )
  ([id]
   {:part "snippet" :id id}
   )
  "https://developers.google.com/youtube/v3/docs/videos/list#parameters"
  )

(defn most-popular-vid-by-region-params
  [max-results region-code]
  {:maxResults max-results :part "snippet, contentDetails, statistics" :chart "mostPopular" :pageToken "CDIQAA" :regionCode region-code :key ["AIzaSyA5jSfrY1m1iCEbPR3zW1U3Eo_dg0ecf08"]})

(defn most-popular-channels-by-query-params
  [q]
  {:order "viewCount" :part "snippet" :type "channel" :pageToken "CDIQAA" :q q :key ["AIzaSyA5jSfrY1m1iCEbPR3zW1U3Eo_dg0ecf08"]})


(defn channel-from-channel-id-params
  [max-results id]
  {:maxResults max-results :part "snippet, contentDetails, statistics" :pageToken "CDIQAA" :id id :key ["AIzaSyA5jSfrY1m1iCEbPR3zW1U3Eo_dg0ecf08"]})

(defn most-popular-vids-by-category-params
  [max-results id]
  {:maxResults max-results :part "snippet, contentDetails, statistics" :chart "mostPopular" :pageToken "CDIQAA" :regionCode "US" :videoCategoryId id :key ["AIzaSyA5jSfrY1m1iCEbPR3zW1U3Eo_dg0ecf08"]})
