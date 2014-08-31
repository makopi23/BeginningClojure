;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.

(+)
(+ 1 2 3)
(def x 3)
(def y (+ x 1))

(defn hello-clojure []
  (println "Hello clojure!"))
(hello-clojure)

(defn sum-a-b-c [a b c]
  (+ a b c))
(sum-a-b-c 1 2 3)
(defn hoge []
  (println "hoge")
  (+ 1 2)
  (+ 3 4))
(hoge)
(defn switch-args
  ([] (println "no arg"))
  ([x] (println "x: " x))
  ([x y] (println "x: " x "y: " y)))
(switch-args)
(switch-args 3)
(switch-args 3 4)

(defn print-args [& args]
  (println args))
(print-args 1 2 3)
(print-args)
((fn [a b c] (* a b c)) 2 3 4)
(defn multiply [a b c]
  (* a b c))
(multiply 2 3 4)
(filter (fn [num] (even? num)) [1 2 3 4])
(filter (fn [num] (> num 2)) [1 2 3 4])
(def inc3 (fn [x] (+ x 3)))
(#(* %1 %2 %3) 2 3 6)
(filter #(even? %) [1 2 3 4])
(let [x 3
      y 4]
  (println x y))
*ns*
(in-ns 'new-ns)
*ns*
(ns abc.core)
(def cons-point [x y]
  {:x x :y y})
(ns abc.core
  (:require [clojure.edn :as edn]))




