(defproject simple-web "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main simple-web.core
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.6"]
                 [http-kit "2.1.16"]
                 [ring "1.2.1"]]
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler simple-web.handler/app}
)
