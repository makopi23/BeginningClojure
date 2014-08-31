(def x 3)
(if (> x 44)
  (println "over zero")
  (do
    (println "under zero or equals zero1")
    (println "test")
    ))

(when (> x 0)
  (print "over zero")
  (print "x > 0"))

(defn multiple-of-3? [num]
  (cond
   (= (mod num 3) 0) true
   :else false))

(multiple-of-3? 5)
(multiple-of-3? 3)

(condp #(> %2 %1) x
           10 (println "> 10")
           5 (println "> 5")
           0 (println "> 0")
           (println "< 0"))


(cond
 (> x 2) (println "abc"))

(condp = x
  1 (println "1")
  2 (println "2")
  3 (println "3")
  :else (println "other"))

(for [x [1 2 3]]
  (* x 2))

(for [a (range 1 10)
      b (range 1 10)]
  (* a b))
(take 10 (for [x (range)
               :when (even? x)] x))

; (doall (for [x (range 10)] (println x))

(defn in-fizz-buzz [i]
  (cond (= (mod i 15) 0) "Fizz Buzz"
        (= (mod i 3) 0) "Fizz"
        (= (mod i 5) 0) "Buzz"
        :else i))

(in-fizz-buzz 10)

(defn fizz-buzz []
  (map #(in-fizz-buzz (inc %1))(range)))

(let [x [1 2 3 4 5]
      v1 (first x)
      v2 (first (rest x))
      v3 (first (rest  (rest x)))
      v4 (first x)
      v5 (first x)
      v6 (first x)]
  [v6 v5 v4 v3 v2 v1])

(take 30 (fizz-buzz))


