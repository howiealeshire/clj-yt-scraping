(ns clj-yt-scrape.yt-api.db-schemas)




(comment
  table_name_channels: str = 'channels'
  table_name_posts: str = 'instagram_post'
  table_name_insta_users: str = 'instagram_users'
  table_name_searched_insta_users: str = 'instagram_users_searched'
  table_name_videos: str = 'videos'
  table_name_words_used: str = 'words_to_use_in_search'
  table_name_country_codes: str = 'region'
  table_name_yt_api_keys: str = 'yt_api_keys'


  @dataclass(init=True, repr=True, eq=True, order=False, unsafe_hash=False, frozen=False)
  class YTVideo:
  video_id: str
  channel_id: str
  video_title: str
  description: str
  channel_title: str
  view_count: int
  has_been_exported: bool = False

  @dataclass(init=True, repr=True, eq=True, order=False, unsafe_hash=False, frozen=False)
  class SearchWord:
  word: str
  search_type: str
  platform: str
  has_been_used: bool

  @dataclass(init=True, repr=True, eq=True, order=False, unsafe_hash=False, frozen=False)
  class Region:
  region_code: str
  search_type: str
  platform: str
  has_been_used: bool


  @dataclass(init=True, repr=True, eq=True, order=False, unsafe_hash=False, frozen=False)
  class YtAPIKey:
  api_key: str
  used_today: bool = False

  class PageTokens:
  page_token: str
  date_used: str
  search_type: str
  query: str


  @dataclass(init=True, repr=True, eq=True, order=False, unsafe_hash=False, frozen=False)
  class YTChannel:
  channel_id: str
  title: str
  sub_count: int
  video_count: int
  view_count: int
  country: str = None
  has_been_exported: bool = False
  )



(def channel
  [
   {:db/ident :chan/id
    :db/valueType :db.type/string
    :db/unique :db.unique/identity
    :db/cardinality :db.cardinality/one
    }
   {:db/ident :chan/title
    :db/valueType :db.type/string
    :db/cardinality :db.cardinality/one
    }
   {:db/ident :chan/num-subs
    :db/valueType :db.type/bigint
    :db/cardinality :db.cardinality/one
    }
   {:db/ident :chan/num-videos
    :db/valueType :db.type/bigint
    :db/cardinality :db.cardinality/one
    }
   {:db/ident :chan/num-views
    :db/valueType :db.type/bigint
    :db/cardinality :db.cardinality/one
    }
   {:db/ident :chan/country
    :db/valueType :db.type/string
    :db/cardinality :db.cardinality/one
    }
   {:db/ident :chan/exported
    :db/valueType :db.type/boolean
    :db/cardinality :db.cardinality/one
    }
   ]
  )

(def video
  [
   {:db/ident :vid/id
    :db/valueType :db.type/string
    :db/unique :db.unique/identity
    :db/cardinality :db.cardinality/one
    }
   {:db/ident :vid/chan
    :db/valueType :db.type/ref
    :db/cardinality :db.cardinality/one
    }
   {:db/ident :vid/chan-id
    :db/valueType :db.type/string
    :db/cardinality :db.cardinality/one
    }
   {:db/ident :vid/title
    :db/valueType :db.type/string
    :db/cardinality :db.cardinality/one
    }
   {:db/ident :vid/description
    :db/valueType :db.type/string
    :db/cardinality :db.cardinality/one
    }
   {:db/ident :vid/chan-title
    :db/valueType :db.type/string
    :db/cardinality :db.cardinality/one
    }
   {:db/ident :vid/num-views
    :db/valueType :db.type/string
    :db/cardinality :db.cardinality/one
    }
   {:db/ident :vid/exported
    :db/valueType :db.type/boolean
    :db/cardinality :db.cardinality/one
    }
   ]
  )
