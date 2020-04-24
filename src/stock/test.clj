(ns stock.test)

(defn print-message []
  (println "Welcome to paradise"))

(print-message)

(defn apply-discount [value]
  (* value 0.9))

(apply-discount 100)

(defn value-discounted
  "Return value discounted"
  [value]
  (* value (- 1 0.10)))

(value-discounted 150)

(class 90N)
(class 90M)

(defn value-discounted
  "Return value discounted 10%"
  [gross-amount]

  (if (> gross-amount 100)

    (let [discounted-rate (/ 10 100)
          discounted (* gross-amount discounted-rate)]
      (println "Processing..." discounted)
      (- gross-amount discounted))
    gross-amount))

(value-discounted 100)