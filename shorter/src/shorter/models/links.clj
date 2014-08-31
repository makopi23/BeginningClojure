(ns shorter.models.links
  (:use [clojure.string :only [join]]))

(defn char-range [[first-char end-char]]
  (map char (range (int first-char) (int end-char))))

(def key-characters (apply concat (map char-range [[\0 \9] [\a \z] [\A \Z]])))

(defn index->key [index]
  (loop [index index acc []]
    (if (zero? index)
      (-> acc reverse join)
      (recur (long (/ index (count key-characters)))
             (conj acc (nth key-characters
                            (mod index (count key-characters))))))))

(def links (ref {}))
(def x (ref 0))

(deref x)

@x

(dosync
 (alter x inc))

(defonce links (ref {}))
(defonce index (ref 0))

(defn add-link! [url]
  (dosync
   (let [new-index (alter index inc)
         new-key (index->key new-index)]
     (alter links assoc
            new-key url))))

(defn fetch-link [index]
  (get @links index))

(add-link! "http://www.yahoo.co.jp/")
(add-link! "http://www.google.co.jp/")

(fetch-link "1r")

(list @links)



