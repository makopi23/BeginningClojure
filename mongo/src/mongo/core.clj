(ns mongo.core)

(require '[monger.core :as mg]
         '[monger.collection :as mc]
         '[monger.operators :as mo])

(mg/connect!)
(mg/set-db! (mg/get-db "test"))
(mc/insert-and-return "documents" {:name "Taro" :age 30})
(for [obj (mc/find-maps "documents")]
  (println obj))
(mc/find-maps "documents" {:age 30})

(mc/find-one-as-map "documents" {:name "Taro"})

(mc/update "documents" {:name "Taro"} {:sex "male"})

(mc/remove "documents" {:name "Taro"})
