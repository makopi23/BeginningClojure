(ns simple-web.core
   (:use [org.httpkit.server]
         [clojure.pprint]
         [compojure.core]))

(defn app [req]
  (pprint req)
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "hello HTTP Kit!"})

(defn -main []
  (run-server app {:port 18080}))

;; (-main)
