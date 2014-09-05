(ns shorter.models.links-db
  (:require [monger.core :as mg]
            [monger.collection :as mc]
            [monger.operators :as mo]))

(mg/connect!)
(mg/set-db! (mg/get-db "shorter"))

(defn add-link! [url]
  (let [new-id (new-id)
        document (mc/insert-and-return "links" {:url url})
        {id :_id} document]
    (str id)))

(defn fetch-link [id]
  (if-let [document (mc/find-one-as-map "links" {:_id id})]
    (:url document)))
