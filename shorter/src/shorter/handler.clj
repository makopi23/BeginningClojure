(ns shorter.handler
  (:use compojure.core)
  (:require [shorter.models.links :as links]
            [compojure.handler :as handler]))

(use '[ring.util.response :only [redirect]])

(defn top [req]
  "<html><body><form method='post' action='/'>
   <input type='text' name='url'><input type='submit' value='Ok!'>
   </form></body></html>")

(defroutes app-routes
  (GET "/" [] top))

(defn add-link! [{{:keys [url]} :params :as req}]
  (str (links/add-link! url)))

(defn add-link! [req]
  (let [params (:params req)
        url (:url params)]
    (str (links/add-link! url))))

(defn fetch-link [{{:keys [key]} :params :as req}]
  (if-let [url (links/fetch-link key)]
    (redirect url)))

(defroutes app-routes
  (GET "/" [] top)
  (POST "/" [] add-link!)
  (GET "/:key" [] fetch-link))

(def app
  (handler/site app-routes))
