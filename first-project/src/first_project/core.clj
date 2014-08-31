(ns first-project.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(require '[first-project.hoge :as hoge])
(hoge/inc100 23)

;(defn -main [& args]
;  (println "Hello, world! " args))

(defn parse-int [str]
  (Integer. str))

(defn -main [& args]
  (println "Sum:" (reduce + (map parse-int args))))

(ns first-project.core
  (:gen-class))
